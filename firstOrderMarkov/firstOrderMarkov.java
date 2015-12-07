package firstOrderMarkov;
import java.util.Scanner;



public class firstOrderMarkov 
{




public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter a DNA sequence.");
	String input = scanner.next();
	
	//initialize the row matrix
	String[][] initMatrix = new String[5][5];
	initMatrix[0][0] = "";
	initMatrix[0][1] = "A";
	initMatrix[0][2] = "G";	
	initMatrix[0][3] = "T";
	initMatrix[0][4] = "C";
	initMatrix[1][0] = "A";
	initMatrix[2][0] = "G";	
	initMatrix[3][0] = "T";
	initMatrix[4][0] = "C";
	
	//checking the input string for the given two char substring of DNA
	for(int i = 1; i < 5; i++)
	{
		for(int j = 1; j < 5; j++)
		{
			String toCheck = initMatrix[0][i] + initMatrix[j][0];
			System.out.println( "the toCheck is:" + toCheck);
			int count = 0;
			for(int m = 0; m < input.length() - 1; m++)
			{
				String sub = input.substring(m, m+2);
				System.out.println("substring:" + sub);
				if(sub.equals(toCheck))
				{
					count++;
				}
			}
			System.out.println(count);
			initMatrix[i][j] = "" + count;
		}
	
	}
	
	//print out the initial matrix
	int rows = 5;
	int cols = 5;
	
	for (int i=0; i<rows; i++)
	{
		for (int j=0;j<cols;j++) 
		{
			System.out.println( initMatrix[i][j]+" ");
		} 
		System.out.println();
	}

	
	//compute the row sums
	
	//compute the rowsum for A
	int toAdd = 0;
	for(int j = 1; j < 5; j++)
	{
		toAdd += Integer.parseInt(initMatrix[1][j]);
	}
	int rowSumA = toAdd;
	System.out.println("rowSumA =" +rowSumA);
	
	//compute the rowsum for G
	toAdd = 0;
	for(int j = 1; j < 5; j++)
	{
		toAdd += Integer.parseInt(initMatrix[2][j]);
	}
	int rowSumG = toAdd;
	System.out.println("rowSumG =" +rowSumG);
	
	//compute the rowsum for T
	toAdd = 0;
	for(int j = 1; j < 5; j++)
	{
		toAdd += Integer.parseInt(initMatrix[3][j]);
	}
	int rowSumT = toAdd;
	System.out.println( "rowSumT =" +rowSumT);
	
	//compute the rowsum for C
	toAdd = 0;
	for(int j = 1; j < 5; j++)
	{
		toAdd += Integer.parseInt(initMatrix[4][j]);
	}
	int rowSumC = toAdd;
	System.out.println("rowSumC =" + rowSumC);

	double[][] probMatrix = new double[4][4];
	
	//computing each row of the probability matrix
	
	//computing row for A
	for(int j = 0; j < 4; j++)
	{
		int num = Integer.parseInt(initMatrix[1][j+1]);
		System.out.println("This is the number from the initMatrix:" + num);
		double check = (double) num / (double) rowSumA;
		System.out.println("This  is the double to add: "+check);
		probMatrix[0][j] = check;
		System.out.println("probMatrix added this: " + probMatrix[0][j]);
	}
	
	//computing row for G
	for(int j = 0; j < 4; j++)
	{
		int num = Integer.parseInt(initMatrix[2][j+1]);
		System.out.println("This is the number from the initMatrix:" + num);
		double check = (double) num / (double) rowSumG;
		System.out.println("This  is the double to add: "+check);
		probMatrix[1][j] = check;
		System.out.println("probMatrix added this: " + probMatrix[1][j]);
	}
	
	//computing row for T
	for(int j = 0; j < 4; j++)
	{
		int num = Integer.parseInt(initMatrix[3][j+1]);
		System.out.println("This is the number from the initMatrix:" + num);
		double check = (double) num / (double) rowSumT;
		System.out.println("This  is the double to add: "+check);
		probMatrix[2][j] = check;
		System.out.println("probMatrix added this: " + probMatrix[2][j]);
	}
	
	//computing row for C
	for(int j = 0; j < 4; j++)
	{
		int num = Integer.parseInt(initMatrix[4][j+1]);
		System.out.println("This is the number from the initMatrix:" + num);
		double check = (double) num / (double) rowSumA;
		System.out.println("This  is the double to add: "+check);
		probMatrix[3][j] = check;
		System.out.println("probMatrix added this: " + probMatrix[3][j]);
	}
	

	//print the final probability matrix
	for (int i=0; i<4; i++)
	{
		System.out.println(initMatrix[i+1][0]);
		for (int j=0;j<4;j++) 
		{
			System.out.println( probMatrix[i][j]+" ");
		} 
		System.out.println();
	}

	//clean up
	scanner.close();
	
}




}