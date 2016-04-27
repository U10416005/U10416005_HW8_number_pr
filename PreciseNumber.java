//U10416005ªL«Ø¦t
import java.math.BigDecimal;

public class PreciseNumber{
	public PreciseNumber(){	
	}
	public void caculate(String c,String an,String bn){
		BigDecimal a = new BigDecimal(an);
		BigDecimal b = new BigDecimal(bn);
		if (Integer.valueOf(c)==1){
			System.out.println(a.add(b));
		}
		else if(Integer.valueOf(c)==2){
			System.out.println(a.subtract(b));
		}
		else if(Integer.valueOf(c)==3){
			System.out.println(a.multiply(b));
		}
		else{
			System.out.println("You do not do the caculate");
		}
	}
}