package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://settings/");
		WebElement settings=driver.findElement(By.id("settings-ui"));
		WebElement shadow1=(WebElement)driver.executeScript("return arguments[0].shadowRoot", settings);
		
		WebElement leftMenu=shadow1.findElement(By.id("leftMenu"));
		WebElement shadow2=(WebElement)driver.executeScript("return arguments[0].shadowRoot", leftMenu);
		
		shadow2.findElement(By.id("appearance")).click();
		
		WebElement main=driver.findElement(By.id("main"));
		WebElement shadow3=(WebElement)driver.executeScript("return arguments[0].shadowRoot", main);
		
		WebElement basicPage=shadow3.findElement(By.className("cr-centered-card-container"));
		WebElement shadow4=(WebElement)driver.executeScript("return arguments[0].shadowRoot", basicPage);
		
		WebElement settingPage=shadow4.findElement(By.xpath("////settings-section[@section='appearance']"));
		WebElement shadow5=(WebElement)driver.executeScript("return arguments[0].shadowRoot", settingPage);
		
		WebElement settingPeoplePage=shadow5.findElement(By.id("settings-people-page"));
		WebElement shadow6=(WebElement)driver.executeScript("return arguments[0].shadowRoot", settingPeoplePage);
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement zoom=shadow2.findElement(By.id("zoomLevel"));
		js.executeScript("arguments[0].scrollIntoView();", zoom);
	
	}
}
