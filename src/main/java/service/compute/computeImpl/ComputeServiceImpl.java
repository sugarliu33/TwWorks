package service.compute.computeImpl;

import entity.GameData;
import entity.Round;
import service.compute.ComputeService;

public class ComputeServiceImpl implements ComputeService{
    @Override
    public GameData computeScore(GameData gameData) {
        Round[] round = gameData.getRounds();
        processPre8Round(round);
        process9thRound(gameData, round);
        process10thRound(gameData, round[9]);
        processSumScore(gameData, round);
        return gameData;
    }

    private void processSumScore(GameData gameData, Round[] round) {
        int sumScore = 0;
        for (int i = 0; i <10 ; i++) {
            sumScore += round[i].getScore();
        }
        gameData.setSumScore(sumScore);
    }

    private void processPre8Round(Round[] round) {
        for (int i = 0; i < 8; i++) {
            if (round[i].isStrike()){
                if (round[i+1].isStrike()){
                    round[i].setScore(20+round[i+2].getFirst());
                }else{
                    round[i].setScore(10 + round[i+1].getFirst() + round[i+1].getSecond());
                }
            }else if (round[i].isSparse()){
                round[i].setScore(10 + round[i+1].getFirst());
            }else {
                round[i].setScore(round[i].getFirst() + round[i].getSecond());
            }
        }
    }

    private void process9thRound(GameData gameData, Round[] round) {
        if (round[8].isStrike()){
            if (round[9].isStrike()){
                round[8].setScore(20+gameData.getFirstPlus());
            }else{
                round[8].setScore(10 + round[9].getFirst() + round[9].getSecond());
            }
        }else if (round[8].isSparse()){
            round[8].setScore(10 + round[9].getFirst());
        }else {
            round[8].setScore(round[8].getFirst() + round[8].getSecond());
        }
    }

    private void process10thRound(GameData gameData, Round round) {
        if (round.isStrike()){
            round.setScore(10 + gameData.getFirstPlus() + gameData.getSecondPlus());
        }else if (round.isSparse()){
            round.setScore(10 + gameData.getFirstPlus());
        }else {
            round.setScore(round.getFirst() + round.getSecond());
        }
    }

}
