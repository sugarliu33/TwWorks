import entity.GameData;
import service.compute.ComputeService;
import service.compute.computeImpl.ComputeServiceImpl;
import service.input.InputService;
import service.input.inputImpl.InputServiceImpl;
import service.output.outputImpl.OutputServiceImpl;

/**
 * Created by sugarFile on 17/5/17.
 */

public class BowlingGame {


    public int getBowlingScore(String input) {
        InputService inputService = new InputServiceImpl();
        GameData gameData = inputService.InputProcess(input);
        ComputeService computeService = new ComputeServiceImpl();
        gameData = computeService.computeScore(gameData);
        OutputServiceImpl outputService = new OutputServiceImpl();
        return outputService.outputProcess(gameData);
    }

}
