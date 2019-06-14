import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NotePad_1_Test {

    WebDriver driver;

    @Before
    public void openBrowser() {
        System.out.println("Initializing test...");


        driver = new ChromeDriver();
    }

    @Test
    public void calculatorTest() {

        driver.get("https://anotepad.com");
    }


    @After
    public void closeBrowser() {

        driver.quit();

    }



}
