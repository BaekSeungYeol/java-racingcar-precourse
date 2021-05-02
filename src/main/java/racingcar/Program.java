package racingcar;

import racingcar.model.Arena;
import racingcar.model.Cars;
import racingcar.ui.FastScanner;
import racingcar.ui.PrintUtils;

public class Program {

    private static final FastScanner fs = FastScanner.of();

    public static void main(String[] args) {
        PrintUtils.start();
        Cars cars = new Cars(fs.next());

        PrintUtils.tryTime();
        int times = fs.nextInt();

        Arena arena = new Arena(times, cars);
        arena.play();

    }
}
