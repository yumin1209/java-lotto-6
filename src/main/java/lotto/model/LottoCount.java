package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoCount {
    private static final int LOTTO_MIN_AMOUNT = 1000;
    private final int count;

    public LottoCount(int amount) {
        validateAmount(amount);
        this.count = amount;
    }

    public int calculateLottoCount() {
        return count / LOTTO_MIN_AMOUNT ;
    }

    private void validateAmount(int amount) {
        validateNumber(amount);
        validateDivisible(amount);
    }

    private static int validateNumber(int amount) {
        try {
            return amount;
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("[ERROR] 금액은 숫자만 가능합니다.");
        }
    }

    private void validateDivisible(int amount) {
        if (amount % LOTTO_MIN_AMOUNT != 0) {
            throw new IllegalArgumentException("[ERROR] 금액은 1000원 단위로만 구매 가능합니다.");
        }
    }
}
