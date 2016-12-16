
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

//import org.junit.After;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test1 {
  private static WebDriver driver;
  private static String baseUrl;

  @BeforeClass
  public static void setUp() throws Exception {
	String pathToGeckoDriver = Paths.get("geckodriver.exe").toAbsolutePath().toString();
	System.setProperty("webdriver.gecko.driver", pathToGeckoDriver); 
    driver = new FirefoxDriver();
    baseUrl = "https://www.facebook.com";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test1() throws Exception {
	driver.get(baseUrl + "/");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("gfhgfhfh");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("ghgfh");
    driver.findElement(By.id("loginbutton")).click();  
    TimeUnit.SECONDS.sleep(3);
  }
  
  @Test
  public void test2() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("aigulka095@gmail.com");
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("underwater");
    driver.findElement(By.id("loginbutton")).click(); 
    TimeUnit.SECONDS.sleep(3);
  }
  
  @Test
  public void test3() throws Exception {
    driver.findElement(By.id("q")).clear();
    driver.findElement(By.id("q")).sendKeys("Айгуль Нугманова"); 
    driver.findElement(By.id("q")).click();   
    TimeUnit.SECONDS.sleep(3);
  }
  @Test
  public void test4() throws Exception {   
    driver.findElement(By.id("userNavigationLabel")).click(); 
    driver.findElement(By.id("show_me_how_logout_1")).submit(); 
    TimeUnit.SECONDS.sleep(3);
  }
/*
  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }*/
}