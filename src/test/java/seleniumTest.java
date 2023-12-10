import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class seleniumTest {
    @Test
    void setup(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        // Set the path to your browser driver (e.g., chromedriver.exe)
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
        // Create a new instance of the Chrome driver
        WebDriver driver= new ChromeDriver(options);
        // Navigate to the registration page
        driver.get("https://demo.automationtesting.in/Register.html");
        // Fill in the registration form
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys('John');
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys('Das');
        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys('123 Main St');
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("john.doe@example.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");

    }
}
