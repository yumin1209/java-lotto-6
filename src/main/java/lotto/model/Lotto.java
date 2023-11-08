package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        isSixNumber(numbers);
        isNotDuplicate(numbers);
        Collections.sort(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public int countMatch(Lotto winningLotto) {
        return (int) numbers.stream().
                filter(winningLotto::containNumber).
                count();
    }

    public boolean containNumber(int number) {
        return numbers.contains(number);
    }

    private void isSixNumber(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 6개의 숫자를 입력해 주세요.");
        }
    }
    private void isNotDuplicate(List<Integer> numbers) {
        if (numbers.stream().distinct().count() != numbers.size()) {
            throw new IllegalArgumentException("[ERROR] 중복된 숫자를 입력하셨습니다.");
        }
    }

    public static void validateBonusNumber(List<Integer> numbers, int bonusNumber){
        if(numbers.contains(bonusNumber)){
            throw new IllegalArgumentException("[ERROR] 중복된 숫자를 입력하셨습니다.");
        }
    }

}
