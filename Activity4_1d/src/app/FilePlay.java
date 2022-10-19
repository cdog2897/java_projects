package app;

import java.io.*;

public class FilePlay {

	public static void main(String[] args) 
	{
		try
		{
			copyFile("InUsers.txt", "OutUsers.txt");
			System.out.println("File copied sucessfully");
		}
		catch(FileNotFoundException e )
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	private static void copyFile(String inFile, String outFile) throws FileNotFoundException, IOException
	{
		BufferedReader in = null;
		BufferedWriter out = null;
		
		in = new BufferedReader(new FileReader(inFile));
		out = new BufferedWriter(new FileWriter(outFile));

		String line;
		while ((line = in.readLine()) != null) 
		{
			String tokens[] = line.split("\\|");
			out.write(String.format("Name is %s %s of age %s\n", tokens[0], tokens[1], tokens[2]));
		}
		out.close();
	}

}
