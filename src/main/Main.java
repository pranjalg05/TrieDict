import dictionary.Trie;
import Util.*;

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
            if(line.equals("exit")) break;
            if(line.startsWith("search")){
                var result = dictionary.search(line.substring(7).trim());
                System.out.println(result==null?"NULL":result.toString());
            }
        }

        System.out.println("""
                
                Thanks for using TrieDict.
                We await your next visit. 
                Stay tuned for more updates
                """);

    }
}

