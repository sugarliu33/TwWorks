package service.output.outputImpl;

import entity.GameData;
import service.output.OutputService;

/**
 * Created by sugarFile on 17/5/18.
 */
public class OutputServiceImpl implements OutputService {
    @Override
    public int outputProcess(GameData gameData) {
        return gameData.getSumScore();
    }
}
