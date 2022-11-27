package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


import static org.testng.Assert.assertEquals;

public class LoginPage {

    public static WebDriver driver= null;
    By usernameField = By.name("username");
    By usernameField1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]");
    By passwordField = By.cssSelector("input[placeholder='Password']");
    By loginButton = By.cssSelector("button[type='submit']");
    By invalidLoginErrMessage =By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
    By sidebarMenu = By.cssSelector(".oxd-icon.bi-chevron-left");
    By profileDropdownMenu= By.cssSelector(" .oxd-icon.bi-caret-down-fill.oxd-userdropdown-icon");
    By logoutButton= By.xpath("//a[normalize-space()='Logout'] ");
    By  dashboard = By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module");

    By loginHeaderAfterLogout = By.xpath("//h5[normalize-space()='Login']");
    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }




    public void ClearUserNameInUserNameField(){
        driver.findElement(usernameField).clear();
        System.out.println("UserName Text Field Successfully Cleared");

    }
    public void EnterUserNameInUserNameField(String text){
        driver.findElement(usernameField1).sendKeys(text);
        System.out.println("UserName Successfully Entered");
    }
    public void ClearPasswordInPasswordField(){
        driver.findElement(passwordField).clear();
        System.out.println("passwordField Field Successfully Cleared");
    }
    public void EnterPasswordInUserPasswordField(String text) {
        driver.findElement(passwordField).sendKeys(text);
        System.out.println("Password Successfully Entered");
    }
    public void VerifyLoginButtonIsPresent(){
        if( driver.findElement(loginButton).isDisplayed())
        {
            System.out.println("Loginbutton is Present");
        }else{
            System.out.println("LoginButton is Absent");
        }
    }


    public void assertErrorMessageIsDisplayedInvalidLogin(){

        driver.findElement(invalidLoginErrMessage).isDisplayed(); // capture alert message

    }
    public void ClickOnLoginButton(){
        driver.findElement(loginButton).click();
        System.out.println("Login Button Clicked On");
    }
    public void clickOnSidebar(){
        driver.findElement(sidebarMenu).click();
        System.out.println("Sidebar successfully clicked"); // Print Alert Message

    }

    public void clickOnProfileDropDownMenu(){
        driver.findElement(profileDropdownMenu).click();
        System.out.println("ProfileDropdown menu successfully clicked"); // Print Alert Message

    }

    public void clickOnLogoutButton(){
        driver.findElement(logoutButton).click();
        System.out.println("Logout is successful"); // Print Alert Message

    }

    public void verifyDashboardIsDisplayedAfterValidLogin(){

        if( driver.findElement(dashboard).isDisplayed())
        {
            System.out.println("AssertionError is Present");
        }else{
            System.out.println("AssertionError is Absent");
        }


    }
    public void assertUserIsLoggedOut(){
        driver.findElement(loginHeaderAfterLogout).isDisplayed();
        System.out.println("User is redirected to login Page"); // P

    }



    public void WaitforPageToLoad(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

}





