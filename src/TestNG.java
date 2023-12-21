import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class TestNG {
	 public WebDriver driver;
  @Test(groups= {"demo1"})
  public void f() throws Exception {
	  System.out.println("@test in alplhabetical order 'f' priority z)");
	  //WebDriverWait wait = new WebDriverWait(driver, 10);
	  //this.driver=driver;
	System.setProperty("webdriver.opera.driver","C:\\Users\\Siva Rajesh\\Desktop\\operadriver.exe");
			WebDriver driver1=new OperaDriver();
	//System.setProperty("webdriver.gecko.driver","C:\\Users\\Siva Rajesh\\Desktop\\geckodriver.exe");
			//WebDriver driver=new FirefoxDriver();
	//System.setProperty("webdriver.edge.driver", "C:\\Users\\Siva Rajesh\\Desktop\\msedgedriver.exe");
			//WebDriver driver = new EdgeDriver();
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Siva Rajesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
	  //ChromeOptions chromeOptions= new ChromeOptions();
	  //hromeOptions.setBinary("C:\\Users\\Siva Rajesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	  //ChromeDriver driver = new ChromeDriver(chromeOptions);
	  //ChromeOptions chromeOptions= new ChromeOptions();
	  ///chromeOptions.setBinary("C:\\Program Files (x86)\\Google\\Chrome Beta\\Application\\chrome.exe");
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\Siva Rajesh\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	  //ChromeDriver driver = new ChromeDriver(chromeOptions);
			WebDriverWait wait = new WebDriverWait(driver1, 20);
		
		//driver.manage().window().maximize();
		driver1.get("https://www.yahoo.com/");
		driver1.findElement(By.xpath("//*[@id=\'ybar-sbq\']")).sendKeys("warsaw people");
		driver1.findElement(By.xpath("//*[@id=\'ybar-search\']")).click();
		Thread.sleep(4000);
		driver1.findElement(By.xpath("/html/body/div[1]/div[2]/div/ol/li[1]/div/div[1]/ul/li[2]/a")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//Thread.sleep(4000);
		//wait.until(ExpectedConditions.urlContains("polish+people"));
	
		String url =driver1.getCurrentUrl();
		System.out.println(url);
		driver1.manage().window().fullscreen();
		Actions act = new Actions(driver1);
		
		act.sendKeys(Keys.ESCAPE).build().perform();
		driver1.close();
		
		
		
		
		
		
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is executed before method");
	  }

  @AfterMethod
  public void afterMethod() {
	  //driver.close();
	  System.out.println("this is executed after method");
  }
  @Test(groups= {"demo"})
  public void a() {
	  System.out.println("this test belong to goruop exclude 'demo' test name 'a' ");
  }
  @Test(groups= {"demo1"})
  public void b()
 
  {
	  System.out.println("this test belong to goruop  include 'demo1' test name 'b' ");
  }

}
