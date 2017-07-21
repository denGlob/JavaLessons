package lesson01.model;

public class Model {

    private static final String DEFAULT_VALUE = "default ";

    private String firstWord;
    private String secondWord;

    public Model() {
        firstWord = DEFAULT_VALUE;
        secondWord = DEFAULT_VALUE;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    public String formOutMessage() {
        return firstWord + " " + secondWord;
    }

    @Override
    public String toString() {
        return "Model{" +
                "firstWord='" + firstWord + '\'' +
                ", secondWord='" + secondWord + '\'' +
                '}';
    }
}
