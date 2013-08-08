
/**
 * Class that holds all of the data for the Candidates, and creates the candidate "object".
 * 
 * @author Ricky Mutschlechner
 * @version 2/1/2011
 */
public class Candidate
{
    private String name;
    private int numVotes;

    public Candidate(String name, int numVotes){
        this.name = name;
        this.numVotes = numVotes;
    }

    public String getName(){
        return name;
    }
    
    public int getVotes(){
        return numVotes;
    }
    
    public String toString(){
        return getName() + " received " + getVotes() + " votes.";
    }
}
