package exam;

public class Ballot {

    //Attributes
    public Vote voteData;
    public Ballot next;

    //Constructor
    Ballot(Vote vote) {
        this.voteData = vote;
        this.next = null;
    }


}
