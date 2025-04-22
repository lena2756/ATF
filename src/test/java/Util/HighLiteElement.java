package Util;

import Page.AbstactPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import stepDefinition.AbstractStepDef;

public class HighLiteElement extends AbstractStepDef {
    public static void highLightElement(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style','background:black; border: 3px solid red;');", element);
    }
}
