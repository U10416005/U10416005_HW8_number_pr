//U10416005ªL«Ø¦t
//import BigDecimal
import java.math.BigDecimal;

public class PreciseNumber{
	//no-arg constructor
	public PreciseNumber(){	
	}
	//method for caculate
	public void caculate(String c,String an,String bn,String pre){
		BigDecimal a = new BigDecimal(an);
		BigDecimal b = new BigDecimal(bn);
		//plus case
		if (Integer.valueOf(c)==1){
			System.out.println(a.add(b));
		}
		//subtract case
		else if(Integer.valueOf(c)==2){
			System.out.println(a.subtract(b));
		}
		//multiply case
		else if(Integer.valueOf(c)==3){
			System.out.println(a.multiply(b));
		}
		//divide case
		else if(Integer.valueOf(c)==4){
			System.out.println(a.divide(b,Integer.valueOf(pre),BigDecimal.ROUND_HALF_UP));
		}
		//none case
		else{
			System.out.println("You do not do the caculate");
		}
	}
}