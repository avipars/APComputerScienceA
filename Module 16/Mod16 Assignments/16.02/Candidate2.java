
/**
 * Class that holds all of the data for the Candidates, and creates the candidate "object". 
 * V2 - now includes Replacing "algorithms".
 * 
 * @author Ricky Mutschlechner
 * @version 2/1/2011
 */
public class Candidate2
{
    private String name;
    private int numVotes;
    /**
     * Default constructor for the Candidate2.
     * @param String name, int numVotes - self explanatory
     */
    public Candidate2(String name, int numVotes){
        this.name = name;
        this.numVotes = numVotes;
    }

    /**
     * Method that returns the name of the Candidate2.
     * @returns String name - self explanatory
     */
    public String getName(){
        return name;
    }
    
    /**
     * Method that returns the number of Votes for the Candidate2.
     * @returns int numVotes - self explanatory
     */
    public int getVotes(){
        return numVotes;
    }
    
    /**
     * Method that returns the Name, followed by the number of votes.
     */
    public String toString(){
        return getName() + " received " + getVotes() + " votes.";
    }
    
    /**
     * Method that replaces the name of one Candidate2 with the name of another.
     * @param Candidate2 c - the candidate that you want to swap with.
     */
    public void replaceName(Candidate2 c){ //switch with a candidate
        System.out.println("Replacing " + name + " with " + c.getName());
        name = c.getName();
    }
    
    /**
     * Method that replaces the name of one Candidate2 with the name passed through the method
     * @param String n - the name that you want to change it to.
     */
    public void replaceName(String n){ //overloaded to set your own name to replace
        System.out.println("Replacing " + name + " with " + n);
        name = n;
    }
    
    /**
     * Method that replaces the votes of one Candidate2 with the votes of another.
     * @param Candidate2 c - the candidate that you want to swap with.
     */
    public void replaceVotes(Candidate2 c){ //switch with a candidate
        System.out.println("Replacing " + name + "'s votes with " + c.getName());
        numVotes = c.getVotes();
    }
    
     /**
     * Method that replaces the votes of one Candidate2 with a select amount of votes, passed in.
     * @param int v - the number of votes.
     */
    public void replaceVotes(int v){ //overloaded, change it to a certain number)
        System.out.println("Replacing " + name + "'s votes with " + v);
        numVotes = v;
    }
}
