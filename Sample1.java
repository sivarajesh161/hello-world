package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Sample1 {
	
	public static WebDriver driver;

	public static void main(String[] args) throws Exception
	{
		System.out.println("Hi How are you?");
		//C:\\Users\\Siva Rajesh\\Desktop\\msedgedriver.exe
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva Rajesh\\Desktop\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva Rajesh\\Desktop\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Siva Rajesh\\Desktop\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		//System.setProperty("webdriver.opera.driver","C:\\Users\\Siva Rajesh\\Desktop\\operadriver.exe");
		//WebDriver driver=new OperaDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Siva Rajesh\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
		driver.findElement(By.xpath("//*[@id=\'ybar-sbq\']")).sendKeys("warsaw people");
		driver.findElement(By.xpath("//*[@id=\'ybar-search\']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/ol/li[1]/div/div[1]/ul/li[2]/a")).click();
		String url =driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().fullscreen();
		Actions act = new Actions(driver);
		act
		.sendKeys(Keys.ESCAPE).build().perform();
		
		
		Thread.sleep(4000);
		driver.close();
		
		

	}

}
