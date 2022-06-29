package service;

import repository.VoteRepository;

public class VoteService {

    private final VoteRepository voteRepository = new VoteRepository();


    public boolean checkVote (String username) {
        return voteRepository.checkVote(username);
    }

    public void addVote (String username) {
        voteRepository.addVote(username);
    }

    public void removeVote (String username)  {
        voteRepository.removeVote (username);
    }
}
