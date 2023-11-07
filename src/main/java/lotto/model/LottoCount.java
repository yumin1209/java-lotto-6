package lotto.model;

public class LottoCount {
    private final int count;

    public LottoCount(int amount) {
        validateAmount(amount);
        this.count = amount;
    }

    private void validateAmount(int amount) {
        validateNumber(amount);
        validateDivisible(amount);
    }

    private static int validateNumber(int amount) {
        try {
            return amount;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 금액은 숫자만 가능합니다.");
        }
    }

    private void validateDivisible(int amount) {
        if (amount % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 금액은 1000원 단위로만 구매 가능합니다.");
        }
    }

}
