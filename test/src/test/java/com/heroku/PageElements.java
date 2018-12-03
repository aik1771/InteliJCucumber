package com.heroku;

/**
 * Created by agolubev on 12/2/18.
 */


        import java.util.List;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebElement;
        import date.function.CheckAssertion;
        import date.function.DateFunction;
        import start.driver.DriverWrapper;

public class PageElements extends PageFunctions{

    private static By nameRegistrationPage= By.xpath("//input[@name='username']");
    private static By registerEmailField = By.xpath("//input[@name='email']");
    private static By registerPasswordField = By.xpath("//input[@name='password']");
    private static By emailField = By.xpath("//input[@id='email']");
    private static By passwordField = By.xpath("//input[@id='password']");
    private static By loginButton = By.xpath("//button[@type='submit']");
    private static By logOutButton = By.xpath("//a[contains(@href,'logout')]");
    private static By moveOverElement = By.xpath("//img[@class='img-circle']");
    private static By searchField = By.xpath("//input[@id='aa-search-input']");
    private static By dropDownText = By.cssSelector("a > span");
    private static By gigLabel = By.xpath("//div[@class='container section']");
    private static By gigImage = By.xpath("//div[@class='container section']//img");
    private static By registrationSameUserAllert = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    private static By emailAlert = By.cssSelector("[role] .form-group:nth-of-type(3)");
    private static By emailAlertExists = By.xpath("//*[contains(text(), '@')]");
    private static By pricingPost = By.xpath("//div[@class='container section']//h3");
    private static By textPost = By.xpath("//div[@class='container section']//h4");


    public void getNumOfPosts()
    {

        System.out.println("Found number of posts " +getPostCount(gigImage));
    }

    public void numberOfImagesReport()
    {
        System.out.println("Found number of posts with image " +postWithImage);
        System.out.println("Found number of posts without an image " +noImagePost);
    }

    public void getNumOfPostsBasedOnPrice()
    {

        System.out.println("Found number of posts with price " +postWithPrice);
        System.out.println("Found number of posts without a price " +postWithNoPrice);

    }

    public void getNumOfPostsBasedOnText()
    {

        System.out.println("Found number of posts with post " +postWithText);
        System.out.println("Found number of posts without a post " +postWithNoText);

    }



    public void findPricingOnThePost()
    {
        gigListPrice(pricingPost);
    }

    public void findTextOnThePost()
    {
        gigListText(textPost);
    }

    public void getPostImages()
    {
        gigImage(gigImage);
    }

    public static void findAvitar() throws InterruptedException
    {
        hoverOver(moveOverElement);
    }
    public static void clickOnAvitar() throws InterruptedException
    {
        Thread.sleep(1000);
        clickOn(moveOverElement);
    }

    public static void clickOnEmail() throws InterruptedException
    {
        Thread.sleep(1000);
        clickOn(loginButton);
    }

    public static void checkLogout() throws InterruptedException
    {
        Thread.sleep(1000);
        assertText(logOutButton,"Logout");
    }

    // Account with that email address already exists.
    public static void checkAlertForExistingUser() throws InterruptedException
    {
        Thread.sleep(1000);
        getMessage(registerEmailField);
        //errorPresent(emailAlertExists);
        // assertText(emailAlert,"Please");
    }

    public static void checkDropDownText() throws InterruptedException
    {
        Thread.sleep(1000);
        assertText(dropDownText,"Title: I will teach you IOS");
    }

    public static void clickOnPassword()throws InterruptedException
    {
        Thread.sleep(1000);
        clickOn(passwordField);
    }
    public static void clickOnRegistrationName() throws InterruptedException
    {
        Thread.sleep(1000);
        clickOn(nameRegistrationPage);
    }

    public static void clickOnRegistrationEmail() throws InterruptedException
    {
        Thread.sleep(1000);
        clickOn(registerEmailField);

    }
    public static void clickOnRegistrationPassword() throws InterruptedException
    {
        Thread.sleep(1000);
        clickOn(registerPasswordField);

    }

    public static void setOnRegistrationName(String text) throws InterruptedException
    {
        setValue(nameRegistrationPage,text);

    }

    public static void setOnRegistrationEmail(String text) throws InterruptedException
    {
        setValue(registerEmailField,DateFunction.getName());

    }
    public static void setOnRegistrationPassword(String text) throws InterruptedException
    {

        setValue(registerPasswordField,text);


    }

    public static void clickOnLogin()throws InterruptedException
    {
        Thread.sleep(1000);
        clickOn(passwordField);
    }

    public static void setEmail(String text) throws InterruptedException
    {

        setValue(emailField,text);


    }

    public static void clickOnSearch() throws InterruptedException
    {
        Thread.sleep(1000);
        clickOn(searchField);
    }

    public static void setSearch(String text) throws InterruptedException
    {

        setValue(searchField,text);
        Thread.sleep(5000);

    }


    public static void setPassword(String text) throws InterruptedException
    {

        setValue(passwordField,text);


    }

}

