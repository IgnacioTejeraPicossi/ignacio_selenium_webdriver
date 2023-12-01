package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    private WebDriver driver;
    public void setUp(){
        System.setProperty("web-driver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
    }
    public static void main(String []args){
        BaseTests test = new BaseTests();
        test.setUp();
    }


}
