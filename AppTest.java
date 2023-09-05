package selenideTestExamples;
 
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;
 
public class AppTest {

	@Test(description = "Example test")
	public void firstClass() throws MalformedURLException, InterruptedException {
		// DesktopOptions option = new DesktopOptions();
		 
		// option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		 
		// WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		 
		// Thread.sleep(2000);
		 
		// driver.findElement(By.name("Seven")).click();
		 
		// driver.findElement(By.name("Plus")).click();
		 
		// driver.findElement(By.name("Eight")).click();
		 
		// driver.findElement(By.name("Equals")).click();
		 
		// Thread.sleep(2000);
		 
		// String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		 
		// System.out.println("Result after addition is: " +output);
		// driver.findElementById("Close").click();
		// try {
		// 	driver.quit();
		// } catch (WebDriverException e) {
		// 	System.out.println("Driver has been closed");
		// }
	}
	
	@Test(description = "Example test 2")
	public void secondClass() throws MalformedURLException, InterruptedException {
		DesktopOptions option = new DesktopOptions();
		 
		option.setApplicationPath("F:\\Programs\\Notepad++\\notepad++.exe");
		 
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		 
		Thread.sleep(5000);
		 if(!driver.findElement(By.className("Scintilla")).isDisplayed()) {
		driver.findElement(By.name("Notepad++ - 1 running window")).click();
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.className("Scintilla")).sendKeys("example text");
//		
//		driver.findElement(By.name("Plus")).click();
//		 
//		driver.findElement(By.name("Eight")).click();
//		 
//		driver.findElement(By.name("Equals")).click();
//		 
		Thread.sleep(5000);
//		 
//		String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
//		 
//		System.out.println("Result after addition is: " +output);
		driver.findElementById("Close").click();
		try {
			driver.quit();
		} catch (WebDriverException e) {
			System.out.println("Driver has been closed");
		}
	}
 
}