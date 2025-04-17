package Page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
@Getter
public class AbstactPage {
    protected static WebDriver driver;
    public AbstactPage(WebDriver driver) {
        AbstactPage.driver=driver;
        PageFactory.initElements(driver, this);
    }
}
