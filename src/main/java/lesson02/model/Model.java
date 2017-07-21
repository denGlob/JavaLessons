package lesson02.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by denglob on 7/21/17.
 */
public class Model {

    public static final int MAX_NUMBER = 100;
    public static final int MIN_NUMBER = 0;

    private int secretNumber;
    private int answer;

    private int maxNumber;
    private int minNumber;

    private List<Integer> statistics = new ArrayList<Integer>();

    public Model() {
        this.maxNumber = MAX_NUMBER;
        this.minNumber = MIN_NUMBER;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMinNumber() {
        return minNumber;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public List<Integer> getStatistics() {
        return statistics;
    }

    public void addToStatistics(int number) {
        statistics.add(number);
    }

    public void rand(int minNumber, int maxNumber) {
        this.secretNumber = minNumber + (int) (Math.random() * (maxNumber - minNumber + 1));
    }

    public boolean isInRange(int number, int minNumber, int maxNumber) {
        return (number >= minNumber && number <= maxNumber);
    }

    //Business logic

    public boolean isInStatistics(int number) {
        return statistics.contains(number);
    }

    public void changeMaxNumber(int inputNumber){
        if (inputNumber > secretNumber) {
            maxNumber = inputNumber;
        }
    }

    /**
     * Change minimum threshold of range if input number less than searchable number
     * */
    public void changeMinNumber(int inputNumber){
        if (inputNumber < secretNumber) {
            minNumber = inputNumber;
        }
    }

    @Override
    public String toString() {
        return "Model{" +
                "answer=" + answer +
                ", statistics=" + statistics +
                '}';
    }
}
