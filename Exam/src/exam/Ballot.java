package exam;

public class Ballot {

    Vote vote;
    Ballot nextVote;

    public Ballot(Vote vote) {
        this.vote = vote;
        this.nextVote = null;

    }

    ;

    public enum Vote {YES, NO, UNDECIDED}


}
