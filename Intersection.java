import java.io.*;
/*Main class handles inputting two files "dictpost1.txt" and "dictpost2.txt" and handing them to
 * Analyzer for turning the input files into data structures for algorithm.
 */
public class Intersection 
{
    
	public static void main(String[] args) throws IOException
	{
		try {System.out.print("The program will be looking for dictpost1 and dictpost2, if not found throws exception\n");
		File srcFile = new File("dictpost1.txt"); 
		File srcFile2= new File("dictpost2.txt");
		
		BufferedReader in1 = new BufferedReader(new FileReader(srcFile)); 
		BufferedReader in2 = new BufferedReader(new FileReader(srcFile2)); 
		//Analyzing and getting the results for the first file.
		Analyzer first=new Analyzer(in1);
		IntersectAlgorithm algo=new IntersectAlgorithm(first.getLibrary());
		//Analyzing and getting the results for the second file.
		Analyzer second=new Analyzer(in2);
		IntersectAlgorithm algo2=new IntersectAlgorithm(second.getLibrary());
		//Printing the results.
		System.out.print("The Intersect of Postings for the first file is "+algo.getresults()+"\n");
		System.out.print("The Intersect of Postings for the second file is "+algo2.getresults()+"\n");
		//Intersect of two files if necessary.
		Intersect overall=new Intersect(algo.getresults(),algo2.getresults());
		System.out.print("The Intersect of these two is "+overall.getResults()+"\n");
		}
		
		//Exception handling
		catch (IOException e)
		{
			System.out.print("There was a problem with: "+e.getMessage());
		}
	}
}


