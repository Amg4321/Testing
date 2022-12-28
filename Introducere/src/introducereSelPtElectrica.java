import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class introducereSelPtElectrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking browser
		//chromedriver.exe--> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\georg\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://myelectrica.ro/index.php?pagina=login ");	
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.className("myelectrica_utilizator")).sendKeys("mail@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"myelectrica_pass\"]")).sendKeys("porumbel");
		driver.findElement(By.id("myelectrica_login_btn")).click();
		
		driver.close(); 
		
	}

}
