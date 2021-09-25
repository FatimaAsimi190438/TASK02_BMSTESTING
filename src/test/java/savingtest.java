import org.junit.Test;

import BMS.saving;

import org.junit.Before;
import org.junit.Assert;
public class savingtest {
	private saving savingundertest;
	@Before
	public void setUp()  {
		savingundertest = new saving();
	}

	@Test
	public void calzakattest() {
		int bal = 100000;
		double expectedres= 2500;
		double result= savingundertest.calculatezakat(bal);
		Assert.assertEquals(expectedres,result, 0.0);
	}
	@Test
	public void calinterettest() {
		int bal =100000;
		double m=  0.3 ;
		double expectedres= 300;
		@SuppressWarnings("static-access")
		double result = savingundertest.calculateinterest(bal, m);
		Assert.assertEquals(expectedres, result, 0.0);
		
		
	}
}
	