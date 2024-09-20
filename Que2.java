package machineTest;

import java.util.Scanner;

public class Que2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter number=");
		int num=s.nextInt();
		boolean check=false;
		System.out.println("factors of "+num+":");
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
				check=true;
				
			}
		}
		if(check==false)
		{

			System.out.println("None");
		}
		

	}

}
