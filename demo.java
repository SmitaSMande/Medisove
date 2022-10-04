package medisolve;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://medisolve.co.in/login");
	
		driver.findElement(By.name("user_name")).sendKeys("9970945898");
		driver.findElement(By.name("user_password")).sendKeys("medisolve@123");
		driver.findElement(By.xpath("//span[.='Login']")).click();
	
		
		
		

	}

}
