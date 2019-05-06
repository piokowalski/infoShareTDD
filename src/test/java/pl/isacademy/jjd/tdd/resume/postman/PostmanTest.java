package pl.isacademy.jjd.tdd.resume.postman;

import org.assertj.core.api.AssertionsForInterfaceTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

class PostmanTest {

    private PostOffice postOffice;

    private Postman sut = new Postman();

    @Test
    @DisplayName("empty bag")
    void shouldHaveNoLetterWhenEmptyPostBag() {
        // given
        sut.setPostBag(Collections.emptySet());

        // when
        Optional<Letter> nextLetter = sut.findNextLetter(Optional.empty());

        // then
        assertThat(nextLetter).isEmpty();
    }

    @Test
    @DisplayName("one letter")
    void shouldTakeTheLetterWhenPostBagHasOnlyOne() {
        // given
        Letter singleLetter = new Letter();
        sut.setPostBag(Stream.of(singleLetter)
                .collect(Collectors.toSet()));

        AssertionsForInterfaceTypes.assertThat(sut.getPostBag()).hasSize(1);
        AssertionsForInterfaceTypes.assertThat(sut.getPostBag()).containsExactly(singleLetter);

        // when
        Optional<Letter> nextLetter = sut.findNextLetter(Optional.empty());

        // then
        assertThat(nextLetter).isNotEmpty();
        assertThat(nextLetter.get()).isEqualTo(singleLetter);

    }

    @Test
    @DisplayName("last letter")
    void shouldPostBagBeEmptyWhenLastLetterHasBeenTaken() {
        // given
        Set<Letter> postBag = Stream.of(
                createTestLetter(Envelope.C5))
                .collect(Collectors.toSet());
        sut.setPostBag(postBag);

        // when
        sut.findNextLetter(Optional.empty());

        // then
        AssertionsForInterfaceTypes.assertThat(sut.getPostBag()).isEmpty();
    }

    @Test
    @DisplayName("begin new day")
    void shouldTakeLettersFromPostOfficeOnceADayStart() {
        // given
        Set<Letter> fakePostBag = generateFakePostBag();

        // when
        // TODO implement

        // then
        fail("Not yet implemented");

    }

    private Set<Letter> generateFakePostBag() {
        return Stream.of(
                createTestLetter(Envelope.A5),
                createTestLetter(Envelope.C5)
        ).collect(Collectors.toSet());
    }

    private Letter createTestLetter(Envelope envelope) {
        return new Letter(
                generateTestAddress("Sender"),
                generateTestAddress("Receiver"), envelope);
    }

    private Address generateTestAddress(String direction) {
        return new Address("test" + direction + "City", "test" + direction + "Street", "15", "5");
    }
}