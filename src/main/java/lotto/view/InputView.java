package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static List<Integer> winningNumbers;

    public static int amountInput() {
        System.out.println("구입금액을 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }

    public static List<Integer> winningNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");
        return numberList(Console.readLine());
    }

    public static int inputBonusNumber(){
        System.out.println("보너스 번호를 입력해 주세요.");
        return Integer.parseInt(Console.readLine());
    }

    public static List<Integer> numberList(String winningNumber){
        String[] result = winningNumber.split(",");
        winningNumbers = new ArrayList<>();
        for (int i = 0; i < result.length; i++) {
            winningNumbers.add(inputToInt(result[i]));
        }
        return winningNumbers;
    }

    private static int inputToInt(String input){
        try {
            return Integer.parseInt(input);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("[ERROR] 숫자만 입력해 주세요.");
        }
    }
}
