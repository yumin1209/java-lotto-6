package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("[ERROR] 금액은 숫자만 가능합니다.");
        }
    }

    private void validateDivisible(int amount) {
        if (amount % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 금액은 1000원 단위로만 구매 가능합니다.");
        }
    }

    @DisplayName("구매 갯수만큼 티켓이 발행되는지")
    @Test
    void createLottoTickets() {
        int userMoney = 10000;
        LottoTicket lottoTicket = new LottoTicket(userMoney);

        List<List<Integer>> lottoTickets = lottoTicket.createLottoTickets();

        assertEquals(lottoTickets.size(), 10);
    }
}
