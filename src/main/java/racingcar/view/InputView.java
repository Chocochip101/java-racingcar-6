package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.InputSeparator;

public class InputView {
    private static final String START_COMMAND = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

    public static String[] startGameCommand() {
        System.out.println(START_COMMAND);
        return InputSeparator.separateInputToNames(Console.readLine());
    }
}
