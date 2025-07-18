package Util;

import dictionary.Trie;
import dictionary.Word;

import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class parseDictionary {

    public static List<Word> load(Trie trie){
        var list = new ArrayList<Word>();
        try {
            String data = Files.readString(Paths.get("src/resources/dictionary.json"));
            data = data.trim().substring(1, data.length()-1);
            String[] blocks = data.split("\\},\\{");
            for(String block: blocks){
                String[] lines = block.split(",", 3);
                list.add(
                        new Word(
                                lines[0].trim().replaceAll("\"", "").split(":", 2)[1],
                                lines[1].trim().replaceAll("\"", "").split(":", 2)[1],
                                lines[2].trim().replaceAll("\"", "").split(":", 2)[1]
                        )
                );
            }

        } catch (IOException e) {
            System.out.println("Error Loading Dictionary: " + e.getMessage());
            return Collections.emptyList();
        }
        for(Word word: list){
            trie.insert(word.getText());
        }
        return list;
    }


}
