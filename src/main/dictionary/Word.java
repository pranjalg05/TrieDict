package dictionary;

public class Word {

    private  String text;
    private  String meaning;
    private  String pos;

    public Word() {}

    public Word(String text, String meaning, String pos) {
        this.text = text;
        this.meaning = meaning;
        this.pos = pos;
    }

    public String getText() {
        return text;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getPos() {
        return pos;
    }

    public String toString(){
        var str = "(" + this.getPos() + ") " + this.getMeaning();
        return str;
    }

}
