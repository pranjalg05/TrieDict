package Util;

import Trie.Trie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class parseDictionary {

    public static void loadDictionary(Trie trie){
        try {
            String data = Files.readString(Paths.get("src/resources/dictionary.json"));
            data = data.trim().substring(1, data.length()-1);
            String[] blocks = data.split("\\},\\{");

        } catch (IOException e) {
            System.out.println("Error Loading Dictionary: " + e.getMessage());
        }

    }

}
