package variousConcepts;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login2 {
	

		WebDriver driver;
		
		@BeforeClass
		public static void beforeClass() {
			System.out.println("Before class");
		}
		
		@AfterClass
		public static void afterClass() {
			System.out.println("After class");
		}

		@Before
		public void init() {
			System.out.println("Before");
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\firoo\\\\selenium2024\\\\crm\\\\driver\\\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.get("https://codefios.com/ebilling/login");
			driver.manage().window().maximize();
		}

		@After
		public void tearDown() throws InterruptedException {
			System.out.println("After");
			Thread.sleep(2000);
			driver.close();
		}

		@Test
		public void loginTest() {
			System.out.println("Test 1");
			driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.id("login_submit")).click();
		}
		

		@Test
		public void negLoginTest() {
			System.out.println("Test 2");
			driver.findElement(By.id("user_name")).sendKeys("demo@codefios.com");
			driver.findElement(By.id("password")).sendKeys("abc1232342");
			driver.findElement(By.id("login_submit")).click();
		}

	}


