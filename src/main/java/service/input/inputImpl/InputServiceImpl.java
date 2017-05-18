package service.input.inputImpl;

import entity.GameData;
import entity.Round;
import service.input.InputService;

/**
 * Created by sugarFile on 17/5/18.
 */
public class InputServiceImpl implements InputService {

    @Override
    public GameData InputProcess(String inputStr) {
        GameData gameData = new GameData();
        String[] temp = inputStr.split("\\|\\|");
        String[] roundStr = temp[0].split("\\|");
        if (roundStr[roundStr.length-1].contains("X")){
            gameData.setLastIsStrike(true);
            gameData.setFirstPlus(charToInt(temp[1].charAt(0)));
            gameData.setSecondPlus(charToInt(temp[1].charAt(1)));
        }
        if (roundStr[roundStr.length-1].contains("/")){
            gameData.setLastIsSparse(true);
            gameData.setFirstPlus(charToInt(temp[1].charAt(0)));
        }
        for (int i = 0; i <roundStr.length ; i++) {
            Round round = new Round();
            gameData.getRounds()[i]=round;
            if (roundStr[i].contains("X")){
                round.setFirst(10);
                round.setStrike(true);
            }else if (roundStr[i].contains("/")){
                round.setFirst(Integer.valueOf(String.valueOf(roundStr[i].charAt(0))));
                round.setSecond(10-Integer.valueOf(String.valueOf(roundStr[i].charAt(0))));
                round.setSparse(true);
            }else {
                if (roundStr[i].charAt(0) == '-'){
                    round.setFirst(0);
                }else {
                    round.setFirst(Integer.valueOf(String.valueOf(roundStr[i].charAt(0))));
                }
                if (roundStr[i].charAt(1) == '-'){
                    round.setSecond(0);
                }else {
                    round.setSecond(Integer.valueOf(String.valueOf(roundStr[i].charAt(1))));
                }
            }
        }

        return gameData;
    }

    private int charToInt(char ch){
        if (ch == 'X'){
            return 10;
        } else if (ch == '-'){
            return 0;
        }else{
            return Integer.valueOf(String.valueOf(ch));
        }
    }
}
