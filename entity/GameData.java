package main.java.entity;

/**
 * Created by sugarFile on 17/5/18.
 */
public class GameData {
    private Round[] rounds = new Round[10];
    private boolean lastIsStrike = false;
    private boolean lastIsSparse = false;
    private int firstPlus;
    private int secondPlus;
    private int sumScore;

    public int getSumScore() {
        return sumScore;
    }

    public void setSumScore(int sumScore) {
        this.sumScore = sumScore;
    }

    public int getFirstPlus() {
        return firstPlus;
    }

    public void setFirstPlus(int firstPlus) {
        this.firstPlus = firstPlus;
    }

    public int getSecondPlus() {
        return secondPlus;
    }

    public void setSecondPlus(int secondPlus) {
        this.secondPlus = secondPlus;
    }

    public boolean isLastIsStrike() {
        return lastIsStrike;
    }

    public void setLastIsStrike(boolean lastIsStrike) {
        this.lastIsStrike = lastIsStrike;
    }

    public boolean isLastIsSparse() {
        return lastIsSparse;
    }

    public void setLastIsSparse(boolean lastIsSparse) {
        this.lastIsSparse = lastIsSparse;
    }

    public Round[] getRounds() {
        return rounds;
    }

    public void setRounds(Round[] rounds) {
        this.rounds = rounds;
    }



}
