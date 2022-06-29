package repository;

import databaseTest.DataVotes;

public class VoteRepository {

    private final DataVotes dataVotes = DataVotes.getInstance();

    public boolean checkVote (String username) {
        return dataVotes.data.containsKey(username);
    }

    public void addVote (String username) {
        dataVotes.data.put(username, true);
    }

    public void removeVote (String username) {dataVotes.data.remove(username);}

}
