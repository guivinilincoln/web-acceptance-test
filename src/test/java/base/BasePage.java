package base;

/**Classe base para implementação nas classes de page.
* @author Guilherme Martins
*/

import org.openqa.selenium.WebDriver;

import driver.Setup;
import driver.Wait;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
