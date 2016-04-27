//U10416005ªL«Ø¦t
import java.util.Scanner;
public class TestPreciseNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("what caculate do you want to do,press the number,1 is plus,2 is subtract,3 is multiply,and nothing is none");
		String ch = input.nextLine();
		while(Integer.valueOf(ch)==1||Integer.valueOf(ch)==2||Integer.valueOf(ch)==3){
			if (Integer.valueOf(ch)==1){
				System.out.println("Enter two number to do precise add caculate");
			}
			else if(Integer.valueOf(ch)==2){
				System.out.println("Enter two number to do precise subtract caculate");
			}
			else if(Integer.valueOf(ch)==3){
				System.out.println("Enter two number to do precise mutiply caculate");	
			}
			System.out.println("Enter first number");
			String a = input.nextLine();
			System.out.println("Enter second number");
			String b = input.nextLine();
			PreciseNumber og = new PreciseNumber();
			og.caculate(ch,a,b);
			System.out.println("If you want to caculate again,do the same rule:number 1 is plus,2 is subtract,three is mutiply,and other is none");
			ch = input.nextLine();
		}
		System.out.println("You do not do the caculate,end the program");
	}
}