import java.util.ArrayList;
import java.util.Collections;
/* This class defines storage
 * which is an object consisting of an String
 * for terms and Arrays for posting IDs.
 */
 public  class storage implements Comparable<storage>
    {
    	
    	//Instances of term as a string, postingID as an array of integers
	   	private String term;
    	private ArrayList<Integer> postingIDArray=new ArrayList<Integer>();
    	private int numberOfPostings;
    	
    	
    	//Get the number of postings for each term
    	public int getNumberOfPosting()
    		{
    		
    		return numberOfPostings;
    		}
    	
    	//Constructor for the object
    	public storage()
    		{
    		this.term=null;
    		this.postingIDArray=new ArrayList<Integer>();
    		Collections.sort(postingIDArray);
    		
    		}
    	//Getting the term from an storage object
    	public String getTerm()
    		{
    		return term;
    		}
    	//Getting list of postings from a storage object
    	public ArrayList<Integer> getPostings()
    		{
    		return postingIDArray;
    		}
    	//adding postings 
    	public void addPosting (int n)
    		{
    		this.postingIDArray.add(n);
    		numberOfPostings=postingIDArray.size();
    		}
    	//add term
    	public void addTerm (String newTerm)
    		{
    		this.term=newTerm;
    		}
    
    	public String toString()
    		{
    		return "This is a storage to store terms and their posting IDs in one objects"; 
    		}
    	
    	@Override
    	//This function is to sort the storage by the number of Postings.
		public int compareTo(storage secondone) {
			if (this.getNumberOfPosting()>secondone.getNumberOfPosting())
				{return +1;}
			else if(this.getNumberOfPosting()<secondone.getNumberOfPosting())
				{return -1;}
			else
				{return 0;}
		}
    }