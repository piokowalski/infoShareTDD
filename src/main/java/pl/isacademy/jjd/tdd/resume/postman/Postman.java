package pl.isacademy.jjd.tdd.resume.postman;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;

public class Postman {

    private Set<Letter> postBag = Collections.emptySet();

    private PostOffice postOffice = new PostOffice();

    void beginNewDay() {
        postBag = postOffice.preparePostBag();
    }

    Optional<Letter> findNextLetter(Optional<Letter> lastLetter) {
        if(postBag.isEmpty()) {
            return Optional.empty();
        }
        Letter nextLetter = postBag.iterator().next();
        postBag.remove(nextLetter);
        return Optional.ofNullable(nextLetter);
    }

    public Set<Letter> getPostBag() {
        return this.postBag;
    }

    public PostOffice getPostOffice() {
        return this.postOffice;
    }

    void setPostBag(Set<Letter> postBag) {
        this.postBag = postBag;
    }

    public void setPostOffice(PostOffice postOffice) {
        this.postOffice = postOffice;
    }
}