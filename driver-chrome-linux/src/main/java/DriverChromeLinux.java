import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChromeLinux {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        ChromeDriver chrome = new ChromeDriver();
        chrome.get("https://www.google.com/");
        chrome.quit();
    }
}
