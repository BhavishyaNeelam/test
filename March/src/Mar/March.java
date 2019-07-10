package Mar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;




public class March {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

		WebDriver d=new ChromeDriver();
		
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		/*d.get("https://www.toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		System.out.println("Title is :"+d.getTitle());
		
		Select sel = new Select(d.findElement(By.xpath("//*[@id=\"continents\"]")));
		sel.selectByVisibleText("Asia");
		
		Alert a=d.switchTo().alert();
		System.out.println("Text is "+a.getText());
		a.accept();*/
		
		/*d.get("https://www.toolsqa.com/selenium-webdriver/handling-multiple-browsers-in-selenium-webdriver/");
		String current = d.getWindowHandle();
		d.findElement(By.xpath("//*[@id=\"post-24495\"]/div[1]/div/div[2]/div/div/div[1]/div/p[1]/em[4]/strong/a")).click();
		d.manage().window().maximize();
		
		String childwindow = null;
		
		Set<String>s1 = d.getWindowHandles();
		Iterator<String>i1=s1.iterator();
		
		while(i1.hasNext())
		{
			childwindow = i1.next();
		}
				d.switchTo().window(childwindow);
		System.out.println("child window title is "+d.getTitle());
		
		d.switchTo().window(current);*/
		/*d.get("https://www.toolsqa.com/automation-practice-form/");
		d.manage().window().maximize();
		
		TakesScreenshot t = ((T-+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++akesScreenshot)d);
		File f=t.getScreenshotAs(OutputType.FILE);
		File f1=new File("D:\\screenshot\\Myfirstscreenshot.jpg");
		FileUtils.copyFile(f, f1);*/
 
		d.get("http://www.leafground.com/pages/Dropdown.html");
		
		Select d1=new Select(d.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select")));
		List<WebElement> li=d1.getOptions();
		int size=li.size();
		
		for(int i=0;i<size;i++)
		{
			 String value = li.get(i).getText();
			System.out.println(value);
		}
		
		
		System.out.println(size);
		
		
		File f = new File("D:\\excel.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		XSSFRow r;
		
		
		int h=sh.getLastRowNum();
		for(int i=0;i<=h;i++)
		{
			r=sh.getRow(i);
			int d11=r.getLastCellNum();
			for(int j=i;j<d11;j++)
{
				XSSFCell c = r.getCell(j);
				c.setCellType(Cell.CELL_TYPE_STRING);
				d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(c.getStringCellValue());
				d.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(c.getStringCellValue());			
				
				
}
			
		}
		
	}

}
