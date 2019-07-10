package Mar;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoCompletionExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/autoComplete.html");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.findElement(By.xpath("//*[@id=\"tags\"]")).sendKeys("s");
	
		List<WebElement> options = d.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		
		int size=options.size();
		for (WebElement webElement : options) {
			
			if(webElement.getText().equals("SOAP"))
			{
				System.out.println(webElement.getText());
				break;
			}
		}
			
		}
		

	}


