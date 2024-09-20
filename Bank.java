package machineTest.que3;

import java.util.Scanner;

public class Bank {

	
	public static void deposite() throws CustomeException {
		Scanner s=new Scanner(System.in);
		System.out.println("enter amount =");
		double amount=s.nextInt();
		
		if(amount<0)
		{
			throw new CustomeException("amount is negative");
		}
	}
	public static void main(String[] args) throws CustomeException {
		deposite();
	}
}
