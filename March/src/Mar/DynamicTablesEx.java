package Mar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablesEx {

	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "D:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/table.html");
        WebElement progress = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
        
        String text=progress.getText();
        System.out.println(text);
        
        List<WebElement> allProgress=driver.findElements(By.xpath("//td[2]"));
        List<Integer> smallValues=new ArrayList<Integer>();
        for (WebElement webElement : allProgress) {
			String values=webElement.getText().replace("%", "");
			smallValues.add(Integer.parseInt(values));				
		}
        int smallest=Collections.min(smallValues);
        System.out.println(smallest);
        
        String s=Integer.toString(smallest)+"%";
        
        String finalXpath="//td[normalize-space()="+"\""+s+"\""+"]"+"//following::td[1]";
        System.out.println(finalXpath);
        
        WebElement click=driver.findElement(By.xpath(finalXpath));
        click.click();


	}

}
