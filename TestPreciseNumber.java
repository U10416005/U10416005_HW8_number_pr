//U10416005ªL«Ø¦t
//import scanner
import java.util.Scanner;
public class TestPreciseNumber{
	//main method
	public static void main(String[] args){
		//create scanner
		Scanner input = new Scanner(System.in);
		//Enter the number choose the caculate action
		System.out.println("what caculate do you want to do,press the number,1 is plus,2 is subtract,3 is multiply,4 is divide,and nothing is none");
		String ch = input.nextLine();
		//Enter how precise do users want(in divide case)
		System.out.println("Enter how precise do you want(valid in divide caculate)");
		String pre = input.nextLine();
		//use while that can caculate for many times
		while(Integer.valueOf(ch)==1||Integer.valueOf(ch)==2||Integer.valueOf(ch)==3||Integer.valueOf(ch)==4){
			//plus case
			if (Integer.valueOf(ch)==1){
				System.out.println("Enter two number to do precise add caculate");
			}
			//subtract case
			else if(Integer.valueOf(ch)==2){
				System.out.println("Enter two number to do precise subtract caculate");
			}
			//multiply case
			else if(Integer.valueOf(ch)==3){
				System.out.println("Enter two number to do precise mutiply caculate");	
			}
			//divide case
			else if(Integer.valueOf(ch)==4){
				System.out.println("Enter two number to do precise divide caculate");
			}
			//Enter two numbers to caculate
			System.out.println("Enter first number");
			String a = input.nextLine();
			System.out.println("Enter second number");
			String b = input.nextLine();
			//invoke PrecisNumber
			PreciseNumber og = new PreciseNumber();
			og.caculate(ch,a,b,pre);
			//ask whether user want to caculate again
			System.out.println("If you want to caculate again,do the same rule:number 1 is plus,2 is subtract,3 is mutiply,4 is divide,and other is none");
			ch = input.nextLine();
		}
		System.out.println("You do not do the caculate,end the program");
	}
}