
public class BallottingUnit {
    public Candidate candidate1;
    public Candidate candidate2;
    public Candidate candidate3;
    public Candidate candidate4;
    public Candidate winner;
    
    
    
    public BallottingUnit(String cand1, String cand2, String cand3, String cand4)
    {
        this.candidate1 = new Candidate(cand1);
        this.candidate2 = new Candidate(cand2);
        this.candidate3 = new Candidate(cand3);
        this.candidate4 = new Candidate(cand4);
        this.winner = new Candidate("");  
}


    
    public void castVote(int vote)
    {
        if (vote == 1)
            candidate1.incrementVoteCount();
        else if (vote == 2)
            candidate2.incrementVoteCount();
        else if (vote == 3)
            candidate3.incrementVoteCount();
        else if (vote == 4)
            candidate4.incrementVoteCount();
    }
    
    


    private void compareWinner(Candidate candidate)
    {
        int winningVote = 0;
        if(candidate1.getNumberOfVotes() > winningVote)
            winningVote = candidate1.getNumberOfVotes();
 
        if(candidate2.getNumberOfVotes() >= winningVote)
            winningVote = candidate2.getNumberOfVotes();

        if(candidate3.getNumberOfVotes() >= winningVote)
            winningVote = candidate3.getNumberOfVotes();

        if(candidate4.getNumberOfVotes() >= winningVote)
            winningVote = candidate4.getNumberOfVotes();
 
        if(winner.getNumberOfVotes() != winningVote)
            winner = candidate;

    }

    

    private void findWinner()
    {
        compareWinner(candidate1);
        compareWinner(candidate2);
        compareWinner(candidate3);
        compareWinner(candidate4);
        System.out.println("Winner of the election is " + winner.name + " " + "with" + " "
                + winner.votes + "\n" );
    }

    
    


public void reportResults()
{
	findWinner();
}



    
    
    
}
