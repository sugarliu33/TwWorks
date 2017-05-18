package main.java.entity;

/**
 * Created by sugarFile on 17/5/18.
 */
public class Round {
    private int first;
    private int second;
    private int score;
    private boolean isStrike;
    private boolean isSparse;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean isStrike() {
        return isStrike;
    }

    public void setStrike(boolean strike) {
        isStrike = strike;
    }

    public boolean isSparse() {
        return isSparse;
    }

    public void setSparse(boolean sparse) {
        isSparse = sparse;
    }
}
