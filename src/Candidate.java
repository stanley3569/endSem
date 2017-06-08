
public class Candidate {

	String name;
	//int id;
	int votes;
	
	public Candidate(String name) 
	{
		//this.id=id;
		this.name=name;
		votes=0;
	}
	
/*	public int getId()
	{
		return id;
	}
*/	
	
	public String getName()
	{
		return name;
	}
	

    public void incrementVoteCount()
    {
        votes++;
    }
    

    public int getNumberOfVotes()
    {
        return votes;
    }

	
	
}
