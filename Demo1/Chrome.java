package Demo1;

import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();

		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		//Cancel popup
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		//Search 15promax
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys("iphone 15 pro max");
		
		//Click search
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//click on 15pro max
		driver.findElement(By.xpath("//div[@class='_4rR01T'][1]")).click();
		
		
		//Change focus from Parent window to child window
		
		Set<String> handles=driver.getWindowHandles();// parent,child,subchild
		Iterator it=handles.iterator();
	String parentid=	(String) it.next();
	String childid=	(String) it.next();
	
		
		
		driver.switchTo().window(childid);
		
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		
		
//		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//Add To Cart
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();

	
		// Scroll the webpage up and down
		
		WebElement PO=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollintoview();", PO);
		
		//click place order
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
		
		driver.findElement(By.xpath("//input[@maxlength='auto']")).sendKeys("7798222727");
		
		driver.findElement(By.xpath("//div[@class='_2YsvKq o8qAfl']")).click();
		
		
		
	}

}
