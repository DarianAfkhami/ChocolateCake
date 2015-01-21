package chocolatecake;

import java.util.Scanner;

public class tester
{

	public static void main(String[] args)
	{
		//create key and message
		String clearText, key;
		int numRows1, numCols1, 
			numRows2, numCols2, 
			numRows3, numCols3,
			numRows4, numCols4;
		Scanner scan = new Scanner(System.in);

		System.out.println("What is the encryption key: ");
		key = scan.nextLine();

			numRows1 = Integer.parseInt( key.substring(0, 1) );
			numCols1 = Integer.parseInt( key.substring(1, 2) );	
			numRows2 = Integer.parseInt( key.substring(2, 3) );	
			numCols2 = Integer.parseInt( key.substring(3, 4) );	
			numRows3 = Integer.parseInt( key.substring(4, 5) );	
			numCols3 = Integer.parseInt( key.substring(5, 6) );	
			numRows4 = Integer.parseInt( key.substring(6, 7) );	
			numCols4 = Integer.parseInt( key.substring(7, 8) );	
		System.out.println("what is the message to be encrypted: ");
		clearText = scan.nextLine();
		chocolatecake rc1 = new chocolatecake ();
		//encryption loop 1
		rc1.fillBlock(clearText, numRows1,numCols1);
		//loop 2 using encyptBlock string for fillBlock message
		rc1.fillBlock(rc1.encryptBlock(),numRows2,numCols2);
		//loop 3
		rc1.fillBlock(rc1.encryptBlock(),numRows3,numCols3);
		//loop 4
		rc1.fillBlock(rc1.encryptBlock(),numRows4,numCols4);
		rc1.encryptBlock();
	}

} 