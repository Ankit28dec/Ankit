import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("www.indigo.com");
		WebElement drop = driver.findElement(By.xpath(""));
		Select dropdown = new Select(drop);
		dropdown.selectByValue("Goa");
		dropdown.selectByIndex(0);
	}

}
