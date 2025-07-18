package dictionary;

import java.util.ArrayList;
import java.util.List;

public class Trie {

    Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String word){
       var x = root;
       for(char c: word.toCharArray()){
           int idx = c - 'a';
           if(x.children[idx]==null)
               x.children[idx] = new Node();
           x = x.children[idx];
       }
       x.eow = true;
    }

    public boolean search(String word){
        var x = root;
        for(char c: word.toCharArray()){
            int idx = c - 'a';
            if(x.children[idx]==null) return false;
            x  = x.children[idx];
        }
        return x.eow;
    }

    public List<String> prefix(String word){
        var x = root;
        List<String> suggestions = new ArrayList<>();
        for(char c: word.toCharArray()){
            int idx = c - 'a';
            if(x.children[idx]==null) break;
            x = x.children[idx];
        }



    }



}
