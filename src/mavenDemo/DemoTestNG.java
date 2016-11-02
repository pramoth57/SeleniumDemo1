package mavenDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DemoTestNG {

	public static void main(String[] args) throws InterruptedException {
         WebDriver h= new FirefoxDriver();//
		
		//HtmlUnitDriver h = new HtmlUnitDriver();
		h.get("http://www.google.com/");
		WebElement e = h.findElement(By.xpath("//span[text() = 'Tutorial']"));
		
		Actions a = new Actions(h);
		a.moveToElement(e).perform();
		
		System.out.println(" test Complete");
		
		Thread.sleep(5000);
		
		h.quit();
		

	}

}
