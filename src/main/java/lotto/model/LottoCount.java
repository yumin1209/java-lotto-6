package lotto.model;

public class LottoCount {
    private static final int LOTTO_AMOUNT = 1000;
    private final int count;

    public LottoCount(int count) {
        this.count = count;
    }

    public int calculateLottoCount() {
        return count / LOTTO_AMOUNT;
    }
}
