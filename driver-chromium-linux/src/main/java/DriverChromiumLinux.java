import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverChromiumLinux {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

        ChromeOptions chromiumOptions = new ChromeOptions();
        chromiumOptions.setBinary("/opt/chrome-linux/chrome");

        WebDriver chromium = new ChromeDriver(chromiumOptions);
        chromium.get("https://www.google.com/");
        chromium.quit();
    }
}
