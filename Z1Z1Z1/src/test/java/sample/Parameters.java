package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {

	@Test
	public void m1() {

		String BROWSER = System.getProperty("browser");
		String url = System.getProperty("url");

		System.out.println(BROWSER);
		System.out.println(url);

		WebDriver driver = null ;
		if (BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		driver.get(url);

	}
}

//BENGALI
