package dictionary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<String> suggest(String word){
        List<String> suggestions = new ArrayList<>();
        var x = root;
        for(char c: word.toCharArray()){
            int i = c - 'a';
            if(x.children[i]==null) return null;
            x = x.children[i];
        }

        Queue<Node> q = new LinkedList<>();
        q.add(x);
        while(!q.isEmpty()&&suggestions.size()<3){
            var n = q.poll();
            if(n.word!=null)
                suggestions.add(n.word.getText());
            for(Node child: n.children){
                if(child!=null)
                    q.add(child);
            }
        }
        return suggestions;

    }



}
