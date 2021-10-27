package Question14;

import java.util.Arrays;

public class WordCount {
    private String sentence;

    public WordCount(String sentence) {
        this.sentence = sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public int word(){
        int counter = 0;

        String[] wordarr = this.sentence.split(" ");
        counter = wordarr.length;

        for (int i = 0; i < wordarr.length; i++) {
            if (wordarr[i].charAt(0) == 'A' || wordarr[i].charAt(0) == 'a') counter--;
        }

        return counter;
    }
}
