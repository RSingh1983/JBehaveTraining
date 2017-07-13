package net.serenitybdd.demo.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageObject{
    private WebDriver driver;

    public void openUrl(){
        driver = getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
    }

    public String getTitle(){
        driver = getDriver();
        return driver.getTitle();
    }

    public void enterSearchBox(String product){
        WebElement element = driver.findElement(By.id("search_query_top"));
        element.sendKeys(product);
    }

    public void clickSearchButton(){
        WebElement element = driver.findElement(By.name("submit_search"));
        element.click();
    }

    public void closeBrowser(){
        driver.close();
    }
}
