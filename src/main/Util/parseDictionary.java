package Util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dictionary.Trie;
import dictionary.Word;

import java.io.InputStream;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class parseDictionary {

    public static void load(Trie trie){
        ObjectMapper mapper = new ObjectMapper();
        try {
            InputStream in = parseDictionary.class.getResourceAsStream("/dictionary.json");
            List<Word> list = mapper.readValue(in, new TypeReference<List<Word>>() {});
            for(Word word: list){
                trie.insert(word);
            }
        } catch (IOException e) {
            System.out.println("Error in parsing Dictionary " + e.getMessage());
            return;
        }
    }


}
