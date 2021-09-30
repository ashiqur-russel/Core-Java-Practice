package exam;

public class voteList {

    Ballot front;

    /**
     * List Constructor.
     * Initializes front with 'null'
     */

    public voteList() {
        front = null;
    }

    /**
     * adds a new Ballot to the votes list.
     * This uses an addFront method, Ballots are always added at the front of the list.
     *
     * @param data the vote data for the new Ballot (see enum Vote)
     */

    public void add(Vote data) {
        Ballot newBallot = new Ballot(data);
        newBallot.next = front;
        front = newBallot;
    }

    /**
     * Imports data from an Array of Votes and returns them as a sorted VoteList.
     * Order: Yes-Votes, No-Votes, Undecided-Votes.
     *
     * @param toImport an Array of Votes (see enum Vote)
     * @return newList, a VoteList
     */
    public voteList importVotes(Vote[] toImport) {
        //first creates a new VoteList which will be returned at the end
        voteList newList = new voteList();

        //Three for-loops - each loops through the complete toImport Array
        //Since we use an addFront method, we first have to add all the UNDECIDED Votes
        for (int i = 0; i < toImport.length; i++) {
            if (toImport[i].equals(Vote.UNDECIDED)) {
                newList.add(toImport[i]);
            }
        }
        //Then the NO Votes
        for (int i = 0; i < toImport.length; i++) {
            if (toImport[i].equals(Vote.NO)) {
                newList.add(toImport[i]);
            }
        }
        //And last the YES Votes, to keep the order that was asked for in the task
        for (int i = 0; i < toImport.length; i++) {
            if (toImport[i].equals(Vote.YES)) {
                newList.add(toImport[i]);
            }
        }
        return newList;
    }



}
