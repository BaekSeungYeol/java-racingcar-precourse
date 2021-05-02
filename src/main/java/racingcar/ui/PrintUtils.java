package racingcar.ui;

public class PrintUtils {

    public static void start() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");

    }

    public static void tryTime() {
        System.out.println("시도할 회수는 몇회인가요?");
    }


    public static void printWinners(String... winners) {
        for (int i = 0; i < winners.length; ++i) {
            System.out.print(winners[i] + " ");
        }
        System.out.println("가 최종 우승했습니다.");
    }
}
