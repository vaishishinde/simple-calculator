import java.util.Scanner;
 
public class Program1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter two numbers");
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		System.out.println("===*** SIMPLE CALCULATOR ***===");
		System.out.println("1. For addition press 1\n2. for multiplication press 2\n3. For division press 3\n4. For subtraction press 4");
		System.out.println("Enter the operation you want to perform");
		 int op=scan.nextInt();
		 
		if(op==1)
		{
			double add=a+b;
			System.out.println("Addition of two numbers is : "+add);
		}
		else if(op==2) {
			double mul=a*b;
			System.out.println("multiplication of two number is : "+mul);
		}
		else if(op==3) {
			double div=a/b;
			System.out.println("Division of two number is : "+div);
		}
		else if(op==4) {
			double sub=a-b;
			System.out.println("Subtraction of two number is :"+sub);
		}
		
		else {
			System.out.println("invalid input");
		}
		
	}

}
