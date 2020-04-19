import org.openqa.selenium.By;

public class Operations extends BaseClass
{
	
	public String getTemp()
	{
		String temp = driver.findElement(By.xpath("//span[@id='temperature']")).getText();
		System.out.println(temp);
//		temp = temp.substring(0,2);
		temp=temp.replaceAll("\\W","");
		temp=temp.replaceAll("[a-zA-Z]","");
//		System.out.println(temp.length());
		temp.trim();
		temp=temp.replaceAll("\\s", "");
		//System.out.println(temp.substring(0, temp.length() - 2));
		return temp;
	}
	
	public void getPrice()
	{
		System.out.println(driver.findElement(By.xpath("//p[contains(.,'Aloe')]")).getAttribute("price"));
	}

}
