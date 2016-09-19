// Data Structures
// Stephen Gordon
// Code provided by Micheal Assaf (professor), edited for notes

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main 
{

	public static void main(String[] args) 
	{

	BufferedReader br = null;

	try 
	{

		String line;

		br = new BufferedReader(new FileReader("C:/Users/stego/Desktop/Folders/School/Fall 2016/Data Structures/Given Code/Session 2/Modified/test.csv"));

		while ((line = br.readLine()) != null) 
		{
		   System.out.println(line);

		   StringTokenizer stringTokenizer = new StringTokenizer(line, "|");
		   // Tokenizes "line", using "|" as a separator.
		   while (stringTokenizer.hasMoreElements()) 
		   {

		    Integer id = Integer.parseInt(stringTokenizer.nextElement().toString());
		    Double price = Double.parseDouble(stringTokenizer.nextElement().toString());
		    // Original test.csv had a String here, not a Double value.
		    // Potential error if user has $ in input, could fix with switch to String
		    String username = stringTokenizer.nextElement().toString();
		    
		    //Builds String.
			StringBuilder sb = new StringBuilder();
			sb.append("\nUID : " + id);
			sb.append("\nPRICE : " + "$" + price);
			sb.append("\nSAMAccountNAME : " + username);
			sb.append("\n*******************\n");

			System.out.println(sb.toString());
		   }
		}

		System.out.println("Done");

	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	} 
	finally 
	{
		try 
		{
			if (br != null)
				br.close();

		} catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}

	}
}