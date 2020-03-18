package libs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsWithOurElements {
    WebDriver webDriver;

    Logger logger = Logger.getLogger(getClass());
    WebDriverWait webDriverWait_10, webDriverWait_15;

    public ActionsWithOurElements(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait_10 = new WebDriverWait(webDriver, 10);
        webDriverWait_15 = new WebDriverWait(webDriver, 15);
    }


    public void enterTextInInput(WebElement webElement, String text) {
        try {
            webElement.clear();
            webElement.sendKeys(text);
            logger.info(text + " was inputted in to input");

        } catch (Exception e) {
            stopTestAndPrintMessage();

        }
    }

    public void clickOnElement(WebElement webElement) {
        try {
            webDriverWait_15.until((ExpectedConditions.visibilityOf(webElement)));
            webDriverWait_15.until(ExpectedConditions.elementToBeClickable(webElement));
            webElement.click();
            logger.info("Element was clicked");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

    public boolean isElementDisplayed(WebElement webElement) {
        try {
            boolean state = webElement.isDisplayed();
            logger.info("Is element displayed -> " + state);
            return state;
        } catch (Exception e) {
            logger.info("Is element displayed -> false");
            return false;
        }
    }

    private void stopTestAndPrintMessage() {
        logger.error("Can not work with element ");
        Assert.fail("Can not work with element ");
    }

    public void selectValueFromDropDownList(WebElement dropDown, String itemValue) {
        try {
            Select dropDownValue = new Select(dropDown);
            dropDownValue.selectByValue(itemValue);
            logger.info(itemValue + " was selected in Drop Down");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

    public void selectVisibleTextFromDropDownList(WebElement dropDown, String text) {

        try {
            Select dropDownValue = new Select(dropDown);
            dropDownValue.selectByVisibleText(text);
            logger.info(text + " was selected in Drop Down");
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

    public boolean isElementDisplayed(String locator) {
        try {
            return isElementDisplayed(webDriver.findElement(By.xpath(locator)));
        } catch (Exception e) {
            return false;
        }
    }

    public void clickOnElement(String xpath) {
        try {
            clickOnElement(webDriver.findElement(By.xpath(xpath)));
        } catch (Exception e) {
            stopTestAndPrintMessage();
        }
    }

    public void setStateToCheckBox(WebElement checkBox, String state) {
        boolean isStateCheck = state.toLowerCase().equals("check");
        boolean isStateUnCheck = state.toLowerCase().equals("uncheck");
        boolean isCheckBoxSelected = checkBox.isSelected();

        if (isStateCheck || isStateUnCheck) {
            if ((isStateCheck && isCheckBoxSelected) || (isStateUnCheck && !isCheckBoxSelected)) {
                logger.info("CheckBox is already in needed state");
            } else {
                clickOnElement(checkBox);
            }

        } else {
            logger.error("state should be only 'check' or 'uncheck'");
            stopTestAndPrintMessage();
        }
    }

    public String getElementValue(WebElement webElement) {
        try {
            String value;
            value = webElement.getText();
            return value;
        } catch (Exception e) {
            logger.error("state should be only 'check' or 'uncheck'");
            stopTestAndPrintMessage();
            return "Can't work with element";
        }
    }

    public boolean compareValues(String elementValue, String templateName) {
        try {
            boolean state = elementValue.equals(templateName);
            if (state == true) {
                logger.info("element are the same");
                return true;
            } else {
                logger.info("elements are different");
                return false;
            }
        } catch (Exception e) {
            logger.info("Can't work with element");
            return false;
        }
    }

    public void goBackInBrowser() {
        webDriver.navigate().back();
    }

    public void openLink(String link) {
        try {
            webDriver.get(link);
        } catch (Exception e) {
            Assert.fail("can not work with browser");
        }
    }

    public void waitUntilElementIsNotDisplayed(String locator) {
        webDriverWait_15.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }
}

