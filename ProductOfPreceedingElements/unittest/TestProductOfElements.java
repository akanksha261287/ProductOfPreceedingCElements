import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

import com.nasdaq.preceedingelementproduct.service.CalculateSumAndProduct;

public class TestProductOfElements {

	CalculateSumAndProduct calculateSumAndProduct=new CalculateSumAndProduct();
	
	@Test
	public void testSampleQuestion() {
		int n=5;
		int C=2;
		BigInteger sumAndProductResult=calculateSumAndProduct.sumOfProduct(n ,C );
		System.out.println(String.format("Product for N=%s with preceeding C=%s is = %s", n,C,sumAndProductResult));
		
		Assert.assertEquals(new BigInteger("21"), sumAndProductResult);
	}
	
	@Test
	public void testForFirstTwoDigit() {
		int n=1;
		int C=2;
		BigInteger sumAndProductResult=calculateSumAndProduct.sumOfProduct(n ,C );
		System.out.println(String.format("Product for N=%s with preceeding C=%s is = %s", n,C,sumAndProductResult));
		
		Assert.assertEquals(new BigInteger("0"), sumAndProductResult);
	}
	
	@Test
	public void testForSameNumber() {
		int n=2;
		int C=2;
		BigInteger sumAndProductResult=calculateSumAndProduct.sumOfProduct(n ,C );
		System.out.println(String.format("Product for N=%s with preceeding C=%s is = %s", n,C,sumAndProductResult));
		
		Assert.assertEquals(new BigInteger("1"), sumAndProductResult);
	}
	
	@Test
	public void testFirstQuestion() {
		int n=100;
		int C=10;
		BigInteger sumAndProductResult=calculateSumAndProduct.sumOfProduct(n ,C );
		System.out.println(String.format("Product for N=%s with preceeding C=%s is = %s", n,C,sumAndProductResult));
		
		Assert.assertEquals(new BigInteger("513946235090696089113"), sumAndProductResult);
	}
	
	@Test
	public void testSecondQuestion() {
		int n=1000000;
		int C=200;
		BigInteger sumAndProductResult=calculateSumAndProduct.sumOfProduct(n ,C );
		String productResultToString=sumAndProductResult.toString();
		if(productResultToString.length()>10)
			{
				productResultToString=productResultToString.substring(0, 10);
				sumAndProductResult=new BigInteger(productResultToString);
			}
		System.out.println(String.format("Product for N=%s with preceeding C=%s is = %s", n,C,sumAndProductResult));
		Assert.assertEquals(new BigInteger("4876116127"), sumAndProductResult);
		
	}
	
	@Test
	public void testThirdQuestion() {
		int n=10000000;
		int C=200;
		BigInteger sumAndProductResult=calculateSumAndProduct.sumOfProduct(n ,C );
		String productResultToString=sumAndProductResult.toString();

		System.out.println(String.format("Product for N=%s with preceeding C=%s is = %s", n,C,sumAndProductResult));
		Assert.assertEquals(new BigInteger("4965134354679533496037881013376993495326668075591058237136571301893210462205554397485458346046871671505174439119052140684795292838002680817249872641810505022565646638501039823038087919825349087113742948276465958869014967937153009210507042653716784759406474104990132600417105699346249818245755170362338348636410963027827958602070627387387637371190762453203234910722583738301147187545738499186086808411573466616788800167478444160611896941115756386401263607724175954897296230111254170395832649078031305432684837549286511287513574995486157592129647794709296457789666816805939020835876231439734345195356613226292736601057252788793340087965681999600919951527921880580234222469555649540092694498969983753938049487437771201728517703996638944517846137268050426436282189834138205226532085483911718434654756952817534777640280814947651060146651299881889217963639209611671695442939612539749915699157913249428040206172015483236632698134073138935119383343794326305309860897407987886600354288364735929660649168061998586803893138655069902283116623876321475035243649404761859567097902346495695672921268362120419292110422033441680592957056243275324335198064397994236486335706230743134619517131774420703026054371085153913199131486227686956956972511119245356278412202507872703355209589492729811695302586711987553305249239651512572366681039681828531503350406935346875126989972541107994804323593105039052556442336528920420940313"), sumAndProductResult);
		
	}
	
	

}
