package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ParticipantsTest {

    @Test
    @DisplayName("중복된 참가자들은 존재할 경우 예외가 발생한다.")
    void validateNotDuplicateName() {
        assertThatThrownBy(() -> new Participants(List.of("pobi", "pobi")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("중복된 참가자들은 존재할 수 없습니다.");
    }

    @Test
    @DisplayName("참가자의 수가 2명 미만일 경우 예외가 발생한다.")
    void moreThanOneParticipants() {
        assertThatThrownBy(() -> new Participants(List.of("pobi")))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("참가자가 2명 미만인 경우는 존재할 수 없습니다.");
    }

    @Test
    @DisplayName("이름을 통해서 참가자의 처음 위치를 가져온다.")
    void getParticipantPositionByName() {
        Participants participants = new Participants(List.of("pobi", "bop"));
        Assertions.assertThat(participants.getPositionByName(new Name("pobi")))
                .isEqualTo(new Position(0));
    }
}
