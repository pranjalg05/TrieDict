import cli.cliHandler;
import Trie.*;
import Util.parseDictionary;

public class Main {
    public static void main(String[] args) {

        Trie dictionary = new Trie();
        parseDictionary.loadDictionary(dictionary);


        if(args.length==0){
            cliHandler.printUsage();
        }

        cliHandler cli = new cliHandler(args);

        if(cli.hasUnknowns()){
            cli.printUnknowns();
            return;
        }



    }
}
