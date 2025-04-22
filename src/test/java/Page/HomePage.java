package Page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends AbstactPage {

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashboardSign;

    @FindBy(xpath = "(//span[@class='oxd-userdropdown-tab'])[1]")
    private WebElement userMeniu;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logOutButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

}
