package Mar;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/selectable.html");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> dropdown=d.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		
		Actions actions=new Actions(d);
		/*actions.clickAndHold(dropdown.get(0));
		actions.clickAndHold(dropdown.get(1));
		actions.clickAndHold(dropdown.get(2));
		actions.build().perform();*/
		
		actions.keyDown(Keys.CONTROL).click(dropdown.get(0)).click(dropdown.get(1)).click(dropdown.get(2)).build().perform();
		
		
		

	}

}
