package cli;

import java.util.*;

public class cliHandler {

    private static Set<String> VALID_ARGS = Set.of("--search", "--help", "--suggest");

    public static cliResult parse(String[] args){
        HashSet<String> unknowns = new HashSet<>();

        for (int i = 0; i < args.length; i++) {
            var arg = args[i];

            if(!arg.startsWith("--")) continue;

            if (!VALID_ARGS.contains(arg)) {
                unknowns.add(arg);
                continue;
            }

            switch (arg){
                case "--search":
                    return new cliResult(CommandType.SEARCH, unknowns,
                            (i+1<args.length)? args[i+1]:null
                            );
                case "--suggest":
                    return new cliResult(CommandType.SUGGEST, unknowns,
                            (i+1<args.length)? args[i+1]:null
                    );
                case "--help":
                    return new cliResult(CommandType.HELP, unknowns, null);
            }

            return new cliResult(CommandType.INVALID, unknowns, null);
        }
    }

    public static void printUsage(){

        System.out.println("""
    TrieDict - Offline Dictionary CLI

    Usage:
      java -jar TrieDict.jar [options]

    Options:
      --search <word>     Look up the meaning of a word
      --suggest <prefix>  Show suggestions for a prefix
      --help              Show this help message
""");
    }

}
