import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Invoking browser
		//chromedriver.exe--> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\georg\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://www.instagram.com/ ");	
		System.out.println(driver.getCurrentUrl());
		driver.close(); 
	}
}
