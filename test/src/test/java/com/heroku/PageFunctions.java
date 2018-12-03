package com.heroku;

/**
 * Created by agolubev on 12/2/18.
 */
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import start.driver.DriverWrapper;

public class PageFunctions {
    static int noImagePost;
    static int postWithImage;
    static int postWithNoPrice;
    static int postWithPrice;
    static int postWithoutPrice;
    static int postWithNoText;
    static int postWithText;

    public static void clickOn(By locator) throws InterruptedException {
        Thread.sleep(2000);
        DriverWrapper.getDriver().findElement(locator).click();
        Thread.sleep(3000);

    }

    public static boolean errorPresent(By locator) throws InterruptedException {
        boolean text;
        Thread.sleep(2000);
        text = DriverWrapper.getDriver().findElement(locator).isDisplayed();

        Thread.sleep(3000);

        return text;

    }

    public static void getMessage(By locator) throws InterruptedException
    {
        DriverWrapper.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        WebElement email = DriverWrapper.getDriver().findElement(locator);
        String foundError = email.getAttribute("required");

        System.out.println("Error message is " + foundError);

    }


    public static void hoverOver(By locator) throws InterruptedException
    {

        Thread.sleep(1000);
        WebElement loginAvitar = DriverWrapper.getDriver().findElement(locator);
        Actions builder = new Actions(DriverWrapper.getDriver());
        builder.moveToElement(loginAvitar).build().perform();
    }
    public static void assertText(By locator, String text) throws InterruptedException {
        String textElement = DriverWrapper.getDriver().findElement(locator).getText();
        Thread.sleep(2000);
        Assert.assertEquals(textElement,text);


    }

    public static void gigListPrice(By locator)
    {
        String regex = "\\s++$";
        List<WebElement> elementsRoot = DriverWrapper.getDriver().findElements(locator);

        for(int i = 0; i < elementsRoot.size(); ++i) {
            String checkbox = elementsRoot.get(i).getText();

            checkbox.replaceAll(regex,"");

            if(checkbox.equals("$"))
            {
                postWithNoPrice+=1;
            }

            if (checkbox.contains("$") && checkbox.length() >1 )
            {
                postWithPrice+=1;
            }



        }
    }

    public static void gigListText(By locator)
    {
        String regex = "\\s++$";
        List<WebElement> elementsRoot = DriverWrapper.getDriver().findElements(locator);

        for(int i = 0; i < elementsRoot.size(); ++i) {
            String checkbox = elementsRoot.get(i).getText();



            if (checkbox.length()!=0)
            {
                postWithText+=1;
            }

            else
            {
                postWithNoText+=1;
            }



        }
    }

    public int getPostCount(By locator)
    {
        List<WebElement> elementsRoot = DriverWrapper.getDriver().findElements(locator);
        int count=elementsRoot.size();


        return count;
    }

    public static void gigImage(By locator)
    {
        List<WebElement> elementsRoot = DriverWrapper.getDriver().findElements(locator);


        for(int i = 0; i < elementsRoot.size(); ++i) {
            String checkbox = elementsRoot.get(i).getAttribute("src");
            if (!checkbox.equals(null))
            {
                postWithImage+=1;
            }
            else
            {

                noImagePost+=1;
            }



        }


        //System.out.println(checkbox);
    }

    public static void setValue(By locator, String text) throws InterruptedException {
        DriverWrapper.getDriver().findElement(locator).sendKeys(text);
        Thread.sleep(2000);


    }




}
