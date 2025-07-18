package dictionary;

public class Word {

    private final String text;
    private final String meaning;
    private final String pos;

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

}
