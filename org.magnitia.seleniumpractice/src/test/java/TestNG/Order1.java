package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Order1 {

	@Test
	public void m1() {
		System.out.println("m1");
	}
	@AfterClass
public void sample() {
	System.out.println("sample");
}
	@BeforeClass
public void shrunkhla() {
	System.out.println("shrunkhla");
}
	@Test
public void m2() {
	System.out.println("m2");
}
}
