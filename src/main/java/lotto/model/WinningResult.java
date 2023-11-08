package lotto.model;

public class WinningResult {
    private final Lotto lotto;
    private final int bonus;

    public WinningResult(Lotto lotto, int bonus) {
        this.lotto = lotto;
        this.bonus = bonus;
    }

    public Ranking match(Lotto playerNumber) {
        int countOfMatch = playerNumber.countMatch(lotto);
        boolean bonusCheck = playerNumber.containNumber(bonus);
        return Ranking.valueOf(countOfMatch, bonusCheck);
    }
}
