//U10416005�L�ئt
import java.math.BigDecimal;

public class PreciseNumber{
	public PreciseNumber(){	
	}
	public void caculate(String an,String bn){
		BigDecimal a = new BigDecimal(an);
		BigDecimal b = new BigDecimal(bn);
		System.out.println(a.add(b));
	}
}