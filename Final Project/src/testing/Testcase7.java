package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase7 {

	WebDriver driver;
	JavascriptExecutor jse;

	public void invokeBrowser() {
	try {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\laksh\\Desktop\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

	driver.get("http://localhost:3000/Home");
	contact();
	} catch (Exception e) {

	e.printStackTrace();
	}
	}
	public void contact() {
	try {
		Thread.sleep(2000);
		driver.findElement(By.linkText("Contact")).click();
		jse =(JavascriptExecutor)driver;// Code for scrolling the page down
		jse.executeScript("scroll(0,1000)");
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Lakshman1");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("lakshman@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[name='msg']")).sendKeys("worst coffee ever");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	} catch (Exception e) {

	e.printStackTrace();
	}

	}
	public static void main(String[] args) {

	Testcase7 t1=new Testcase7();
	t1.invokeBrowser();

	}

	}
