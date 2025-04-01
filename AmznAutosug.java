package usingselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmznAutosug {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//input)[5]"));
		e1.sendKeys("Sandals");
		Thread.sleep(5000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div/div"));
		int count=e2.size();
		System.out.println(count);
		e2.get(count-9).click();
		}

}
