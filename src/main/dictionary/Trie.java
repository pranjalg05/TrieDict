package dictionary;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(Word word){
       var x = root;
       for(char c: word.getText().toCharArray()){
           int idx = c - 'a';
           if(x.children[idx]==null)
               x.children[idx] = new Node();
           x = x.children[idx];
       }
       x.word = word;
    }

    public Word search(String word){
        var x = root;
        for(char c: word.toCharArray()){
            int idx = c - 'a';
            if(x.children[idx]==null) return null;
            x  = x.children[idx];
        }
        return x.word;
    }

    public List<String> prefix(String word){
        var x = root;
        List<String> suggestions = new ArrayList<>();
        for(char c: word.toCharArray()){
            int idx = c - 'a';
            if(x.children[idx]==null) break;
            x = x.children[idx];
        }


        return null;
    }



}
