import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS) /* Yeniden kullanılmasını sağlamak için */
public class BaseTest {

    protected WebDriver driver;
    CeHomePage ceHomePage;


    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://ce.yildiz.edu.tr/");

        driver.manage().window().maximize();
        ceHomePage = new CeHomePage(driver);
        System.out.println("Test initiated");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
