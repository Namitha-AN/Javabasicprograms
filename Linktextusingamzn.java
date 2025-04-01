package usingselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktextusingamzn {
	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	WebElement amzn_link=driver.findElement(By.linkText("Customer Service"));
	amzn_link.click();
	//WebElement amzn_plink=driver.findElement(By.partialLinkText("Cust serv"));
	//amzn_plink.click();
	}
}
