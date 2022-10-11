package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public static WebDriver driver;
	public static Properties prop;

	public baseclass() throws IOException {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("./configs/config.properties");
			prop.load(ip);
			ip.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void initlization() {
		String BrowserName = prop.getProperty("Browser");
		if (BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();

			System.out.println("Chrome Opend...");

		} else {
			System.out.println("no browser....");
		}

		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("executing.............." + getClass());
	}
	public void TearDown() {
		driver.close();
		System.out.println("Chrome was closed successfully");
	}
}
