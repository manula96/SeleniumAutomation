import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args){
// invoking browser
        System.setProperty("webdriver.chrome.driver","D:\\Projects\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");



    }
}
