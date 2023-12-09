package Demo1;

import java.time.Duration;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		//Enter IRCTC WebPage
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//Scroll to hotels
		WebElement PO=driver.findElement(By.xpath("//span[@class='allcircle circletwo']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollintoview();", PO);
		
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
//		
//		//Change Focus From PAge1To Page 2
//		Set<String> handles=driver.getWindowHandles();
//		Iterator it= handles.iterator();
//	String parentid=(String)it.next();
//		
		
	}

}
