import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass extends BaseClass
{
	
	BaseClass b = new BaseClass();
	Operations op = new Operations();

	@BeforeClass
	public void beforeClass()
	{
		b.getDriver("Chrome");
		b.launch("url");
	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		String temp = op.getTemp();
		if(Integer.parseInt(temp)<19)
		{
			b.click("buyMostbtn_xpath");
		}
		else
		{
			b.click("buySunscrnsbtn_xpath");
		}
		String header = driver.findElement(By.xpath("//h2")).getText();
		if(header.equalsIgnoreCase("Moisturizers"))
		{
			b.click("Almondlowest_xpath");
//			b.click("AloeLowest");
		}
		else
		{
			b.click("SPF30Lowest_xpath");
		}
		Thread.sleep(5000);
		//b.click("CartBtn_xpath");
		b.click("Card_xpath");
		Thread.sleep(5000);
		driver.switchTo().frame("stripe_checkout_app");
		b.type("email_xpath","ishshahrocks@gmail.com");
		b.type("cardnum_xpath","4242424242424242");
		b.type("month_xpath","03/23");
		b.type("cvv_xpath","600");
		b.type("zip_xpath","452001");
		b.click("submitBtn_xpath");
		
	}
	
	

}
