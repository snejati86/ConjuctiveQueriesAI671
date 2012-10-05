import java.util.ArrayList;

/* This class handles our data structures of string and postingIDs 
 * Uses the Optimized Algorithm for Conjunctive Queries on
 * Data structures called Storage consisting of Terms and PostingIDs
 */
public class IntersectAlgorithm 

{
	
	//Instance variables to store Results and terms
	private ArrayList<Integer> results;
	private ArrayList<storage> terms;
	
	public IntersectAlgorithm (ArrayList<storage> Library)
	{
		//Get the first one and remove it from the results
			    this.results=Library.get(0).getPostings();
				Library.remove(0);
				this.terms=Library;
				while (!(terms.isEmpty()&&Library.isEmpty()))
				{
		//Pass it to Simple Algorithm for Intersect.
					Intersect Inti=new Intersect(results,terms.get(0).getPostings());
					terms.remove(0);
					results=Inti.getResults();
		//Update the result of intersections.			
				}
							
	}
	
	public ArrayList<Integer> getresults()
	{
		return results;
	}
}