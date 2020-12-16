package driver;

/**Classe para fazer a escolha do tipo de browser, essa classe poderá ser utilizada posteriormente para testes customizados, 
* onde o browser possa impactar na execução .
* @author Guilherme Martins
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public class Setup {
	
	
	
    public static WebDriver driver;

    @Before
    public void setWebDriver() throws Exception {

        String browser = "chrome";
                
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("['start-maximized']");
                driver = new ChromeDriver(chromeOptions);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }
}
