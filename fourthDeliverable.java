import java.util.Scanner;
import java.util.*;

public class fourthDeliverable
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int[] xVar = new int[5];
		
		
		int byTwo = 0;
		intWrapper byOne = new intWrapper();
		intWrapper yVar = new intWrapper();
		
		boolean isSame;
		;
		
		int i = 0;
		
		String string1, string2 ;
		System.out.println("byOne.getValue() equals " + byOne.getValue() );
		System.out.println("enter an integer to increment by one" );
		byOne.setValue(  scanner.nextInt());
		scanner.nextLine();
		System.out.println("byOne.getValue() equals " + byOne.getValue() );
		incrementOne(byOne) ;
		System.out.println("byOne.getValue() equals " + byOne.getValue() );
		System.out.println("enter a number to increment by two" );
		byTwo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("byTwo equals " + byTwo );
		byTwo=incrementTwo(byTwo) ;
		System.out.println("byTwo equals " + byTwo );
		xVar[1-1]=1;
		xVar[2-1]=2;
		xVar[3-1]=3;
		xVar[4-1]=4;
		xVar[5-1]=5;
		i=1;
		System.out.println("Array X from 1 through 5" );
		while(i<=5){
			System.out.println(xVar[i-1] );
			i=i+1;
		}
		
		System.out.println("Enter a scalar to multiply x by:" );
		yVar.setValue(  scanner.nextInt());
		scanner.nextLine();
		scalarmult(xVar, yVar) ;
		
		i=1;
		while(i<=5){
			System.out.println(xVar[i-1] );
			i=i+1;
		}
		
		System.out.println("Enter a value to find the absolute value of" );
		i = scanner.nextInt();
		scanner.nextLine();
		i=Math.abs(i);
		System.out.println(i );
		System.out.println("enter a string of twenty characters or less" );
		string1 = scanner.nextLine();
		System.out.println("enter a second string of twenty characters or less" );
		string2 = scanner.nextLine();
		isSame= string1.equals(string2);
		
		if (isSame) 
		{
			System.out.println("The strings are identical" );
		}
		else
		{
			System.out.println("The strings are different" );
		}
		
	}
	
	static void scalarmult(int [] xVar, intWrapper yVar){
		
	for(int i = 0; i < xVar.length; i++)
	{	xVar[i] = xVar[i]*yVar.getValue();
	}
	}
	
	static void incrementOne(intWrapper byOne){
		
		byOne.setValue(byOne.getValue()+1);
	}
	
	static int incrementTwo(int byTwo){
	
	int returnVariable;
	
	returnVariable=byTwo+2;
	return returnVariable;
}

}
