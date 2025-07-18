package cli;

import java.util.HashSet;
import java.util.Set;

public class cliHandler {

    private final HashSet<String> unknowns = new HashSet<>();


    private static final Set<String> VALID_ARGS = Set.of("--search", "--suggest", "--help");

    public cliHandler(String[] args){
        parse(args);
    }

    private void parse(String[] args){
        for (int i = 0; i < args.length; i++) {
            var arg = args[i];

            if(!arg.startsWith("--")) continue;

            if(!VALID_ARGS.contains(arg)){
                unknowns.add(arg);
            }

            switch(arg){
                case "--search":{

                }
                case "--suggest":{

                }
                case "--help":{
                    printUsage();
                }
            }
        }
    }

    public boolean hasUnknowns(){
        return unknowns.isEmpty();
    }

    public void printUnknowns(){
        System.out.println("Unknown Arguements: " + unknowns);
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
