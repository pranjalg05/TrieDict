import cli.cliHandler;
import Util.parseDictionary;
import dictionary.Trie;

public class Main {
    public static void main(String[] args) {

        Trie trie = new Trie();
        var Dictionary = parseDictionary.load(trie);


        if (args.length == 0) {
            cliHandler.printUsage();
        }

        var cli = cliHandler.parse(args);

        if(!cli.unknowns.isEmpty()){
            System.out.println("Unknown arguements: " + cli.unknowns);
            return;
        }




        switch (cli.command){
            case HELP -> cliHandler.printUsage();
            case INVALID -> System.out.println("Invalid arguements! use \"--help\"");
            case SEARCH -> System.out.println("search");
            case SUGGEST -> System.out.println("suggest");
        }


    }


}

