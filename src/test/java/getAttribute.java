import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        //        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("Akarshit");

        String ActVal = driver.findElement(By.name("email")).getAttribute("value");

        if(ActVal.equals("Akarshit")){
            System.out.println("Passed");
        }
        else{
            System.out.println("failed");
        }
    }
}