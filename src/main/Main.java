import dictionary.Trie;
import Util.*;
import cli.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Trie dictionary = new Trie();
        parseDictionary.load(dictionary);
        Scanner in = new Scanner(System.in);

        System.out.println("""
                Welcome to TrieDict!!
                Use the following commands: 
                -search + (word) : to look-up a word in the Dictionary
                -suggest + (word) : to get suggestion close to ur word
                -exit: to exit""");

        while(true){
            System.out.print("> ");
            String line = in.nextLine().trim().toLowerCase();
            var cmd = cliHandler.parse(line);
            if(cmd.command==CommandType.EXIT) break;
            switch (cmd.command){
                case INVALID: {
                    System.out.println("Invalid Arguments ");
                    continue;
                }
                case NO_ARGS: {
                    System.out.println("No parameters provided");
                    continue;
                }
                case SEARCH:{
                    var res = dictionary.search(cmd.word);
                    if(res!=null){
                        System.out.println(res.toString());
                        break;
                    }
                    else System.out.println("No such word found in dictionary: \nFinding Suggestions");
                }
                case SUGGEST: {
                    var sug = dictionary.suggest(cmd.word);
                    if(sug==null)
                        System.out.println("No suggestions found!");
                    else{
                        System.out.println("Suggestions " + sug);
                    }
                }
            }

        }

        System.out.println("""
                
                Thanks for using TrieDict.
                We await your next visit. 
                Stay tuned for more updates
                """);

    }
}

