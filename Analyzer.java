import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
//This class handles an Input stream from a file and tokenizes it
//So that we can get instances of storage.
public class Analyzer 
	{
		private ArrayList<storage> library;
		
		public ArrayList<storage> getLibrary()
		{
			//Returning the String as Library including storage instances 
			//Having a String Term and ArrayList of PostIDs.
			return library;
		}
		
		public Analyzer(BufferedReader in)
		throws IOException
		{
        	
        	try {
        		//This part tokenizes the string
        		library=new ArrayList<storage>();
        		String Input = in.readLine(); 
        			while(Input!=null)
        			{
        		
        				StringTokenizer st = new StringTokenizer(Input," ,");
        				storage lines=new storage();
        				lines.addTerm(st.nextToken().trim());
            		while (st.hasMoreTokens())
            			{
            			lines.addPosting(Integer.parseInt(st.nextToken().trim()));
            			}
            		
            		library.add(lines);
            		Input = in.readLine();
            		
        			}
        			in.close();		
        	//Printing the constructed Result
        	System.out.print("Parsing was successful and the results are :\n");
        	for (int i=0;i<library.size();i++)
        	   {
        		storage tempStorage=library.get(i);
        		System.out.print("Term:"+tempStorage.getTerm()+"\n");
        		for (int j=0;j<tempStorage.getNumberOfPosting();j++)
        			{
        			System.out.print(tempStorage.getTerm()+" Appears in postingID : "+tempStorage.getPostings().get(j)+"\n");
        			}
        		
        	   }
        	
        	}
         catch (Exception e )
         	{
        	
        	 System.out.print("Couldnot Find the Files!");   				
         	}
        	
	}

	
}