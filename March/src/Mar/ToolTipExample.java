package Mar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/tooltip.html");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement name=d.findElement(By.xpath("//*[@id=\"age\"]"));
		String tooltiptext=name.getAttribute("title");
		System.out.println(tooltiptext);

	}

}
