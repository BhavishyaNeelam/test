package Mar;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.get("http://www.leafground.com/pages/download.html");
			d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			d.findElement(By.linkText("Download xls")).click();
			
			//C:\Users\Bhavishya_Neelam\Downloads
			
			File fileLocation = new File("C:\\Users\\Bhavishya_Neelam\\Downloads");
			File[] totalFiles = fileLocation.listFiles();
			
			int len=totalFiles.length;
			System.out.println(len);
			
		 for (File file : totalFiles) {
			if(file.getName().equals("download.xls"))
			{
				System.out.println("file found");
				break;
			}
		}
	}

}
