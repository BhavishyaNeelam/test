package Mar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/drop.html");
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement drag=d.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop=d.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions actions=new Actions(d);
		//actions.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		actions.dragAndDrop(drag, drop).build().perform();

	}

}
