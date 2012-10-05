import java.util.ArrayList;

//This class handles the calculating the Intersect of two Lists of Integers .
public class Intersect 
{
	private ArrayList<Integer> results;
	public  Intersect(ArrayList<Integer> first,ArrayList<Integer> second)
	
	{
	results=new ArrayList<Integer>();
	
	//Intersection of two list of Postings	
		for (int i=0;i<first.size();i++)
		{
			for(int j=0;j<second.size();j++)
			{
				if (first.get(i).intValue()<second.get(j).intValue())
					{break;}
				else if(first.get(i).intValue()==second.get(j).intValue())
				{
					results.add(first.get(i).intValue());
					break;
				}
				
			}
		}
			
	
	}

//Returning Intersect of two postingIDs list.		
public ArrayList<Integer> getResults()
	{
	return results;
	}
	
	
}
