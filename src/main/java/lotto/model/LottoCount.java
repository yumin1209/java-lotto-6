package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class LottoCount {
    private static final int LOTTO_AMOUNT = 1000;
    private final int count;

    public LottoCount(int amount) {
        this.count = amount / LOTTO_AMOUNT;
    }

    public int calculateLottoCount() {
        return count / LOTTO_AMOUNT ;
    }
}
