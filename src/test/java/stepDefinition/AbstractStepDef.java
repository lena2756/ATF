package stepDefinition;
        import Page.HomePage;
        import Page.LoginPage;
        import Util.PropretyLoader;
        import lombok.Getter;
        import org.openqa.selenium.WebDriver;

public class AbstractStepDef {
    protected static WebDriver driver;
    public LoginPage loginPage= new LoginPage(driver);
    public HomePage homePage= new HomePage(driver);
    protected static String chromeDriver = PropretyLoader.loadProprety("chromeDriver");
    protected static String loginPageUrl = PropretyLoader.loadProprety("loginPageUrl");

    public static String excelFilePath = PropretyLoader.loadProprety("excelFilePath");
    public static String excelSheet = PropretyLoader.loadProprety("excelSheet");
    public static String autoItUploadFileSite = PropretyLoader.loadProprety("autoItUploadFileSite");
    public static String restAssureBaseURL = PropretyLoader.loadProprety("restAssureBaseURL");
}



