package MouseHover;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		WebElement mainmenu=driver.findElement(By.xpath("//span[text()='Electronics']"));
		WebElement submenu=driver.findElement(By.xpath("//span[text()='DSLR']"));
		
		Actions mousehover = new Actions(driver);
		mousehover.moveToElement(mainmenu).build().perform();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(submenu));
		mousehover.click(submenu).build().perform();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("input[@type='checkbox']"));
		System.out.println(checkbox.size());
	}

}
