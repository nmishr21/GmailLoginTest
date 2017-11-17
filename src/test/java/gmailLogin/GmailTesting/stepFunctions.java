package gmailLogin.GmailTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class stepFunctions {
	public static WebDriver driver;    
	public void userOnGmailPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromDriver\\chromedriver.exe"); 
		 driver = new ChromeDriver();  
		//driver.manage().window().maximize();
		driver.get("https://www.google.com/accounts/ServiceLoginAuth?continue=http://gmail.google.com/gmail&service=mail&Email=XXXXXXX&Passwd=YYYYYYY");
		System.out.println("user is on gmail page");
	}

	public void enterUserName() {
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("gtest4961@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click(); 
		System.out.println("user has entered username"); 
	} 

	public void enterPassword() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys("omsai1234");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		System.out.println("user has entered password"); 
	}

	public void userhasloggedIntoHisAccount() {
		WebElement element = 	new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='gb_Za gb_dc']")));
		boolean status = element.isDisplayed();
		System.out.println("user is on gmail page");
	}

	public void clickedOnComposeButton() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='T-I J-J5-Ji T-I-KE L3']"))).click();
		System.out.println("user has clicked on compose button");
	}

	public void userHasComposedAmail() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='vO']"))).sendKeys("neha.mishra1325@gmail.com");
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='subjectbox']"))).sendKeys("just for test");
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='Am Al editable LW-avf']"))).sendKeys("Hi , the test is working");
		System.out.println("User has composed and successfully sent a mail");
	}

	public void ClickedOnSentButton() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']"))).click();
		System.out.println("");
	}

	public void LogoutButtonVisibility(){
		driver.findElement(By.xpath("//span[@class='gb_bb gbii']")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id='gb_71']"));
		boolean status = element.isDisplayed();
		System.out.println("User has successfully logged out of gmail");

	}

	public void ClickedOnLogoutButton(){
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		System.out.println("User has successfully logged out of gmail");
}
	
	
	public void userHasWrongPasswordEntered() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys("n1234");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		System.out.println("user has entered wrong password"); 
	}
 
	public void MessageDisplayedForWrongPassword() {
	WebElement element = 	new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Wrong password. Try again.')]")));
		boolean status = element.isDisplayed();
		System.out.println("wrong Password Entered message displayed");
		driver.quit(); 
	}
}