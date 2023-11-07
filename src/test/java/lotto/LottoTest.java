package lotto;

import lotto.model.Lotto;
import lotto.model.LottoCount;
import lotto.model.LottoTicket;
import lotto.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("1000으로 나누어 떨어지지 않는 금액일때 예외 발생")
    @Test
    void LottoCountTest() {
        int userMoney = 1234;
        assertThatThrownBy(() -> new LottoCount(userMoney)).isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("구매 갯수만큼 티켓이 발행되는지")
    @Test
    void createLottoTickets() {
        int userMoney = 10000;
        LottoTicket lottoTicket = new LottoTicket(userMoney);

        List<List<Integer>> lottoTickets = lottoTicket.createLottoTickets();

        assertEquals(lottoTickets.size(), 10);
    }

    @DisplayName("로또 번호 중복 예외 발생하는지")
    @Test
    void 로또_번호_중복_예외발생(){
        assertThatThrownBy(() -> Lotto.validateBonusNumber(List.of(1,2,3,4,5,6),6))
                .isInstanceOf(IllegalArgumentException.class);
    }
}