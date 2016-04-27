//U10416005ªL«Ø¦t
import java.util.Scanner;
public class TestPreciseNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two number to do precise add caculate");
		String a = input.nextLine();
		String b = input.nextLine();
		PreciseNumber og = new PreciseNumber();
		og.caculate(a,b);
	}
}