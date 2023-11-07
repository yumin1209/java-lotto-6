package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String amountInput() {
        System.out.println("구입금액을 입력해 주세요.");
        return Console.readLine();
    }
    public static int inputToInt(String input){
        return Integer.parseInt(input);
    }
}
