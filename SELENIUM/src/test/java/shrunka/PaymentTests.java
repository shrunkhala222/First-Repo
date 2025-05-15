package shrunka;

import org.testng.annotations.Test;

public class PaymentTests {
	@Test (priority=1, groups={"smoke", "regression"})
	void PaymentinRupees()
	{
		System.out.println("This is payment in rupees..");
	}
	@Test (priority=2, groups={"smoke", "regression"})
	
	void PaymentinDollars()
	{
		System.out.println("This is payment in dollars...");
	}

}
