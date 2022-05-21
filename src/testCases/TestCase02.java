package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase02 {
    public static void main(String[] args) {

        /*
        Given user navigates to “https://comfyelite.com/”
When user clicks on “CONTACT US” link in the header
Then user should be navigated to “CONTACT US” page
And user should be able to see heading1 as "Connect With Us"
And user should be able to see “Facebook” icon and hyperlink reference for it should be “https://www.facebook.com/103179127717601”
And user should be able to see “Instagram” icon and hyperlink reference for it should be “https://www.instagram.com/comfyelite”

         */
        WebDriver driver = Driver.getDriver();

        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//nav[@class='x-el x-el-nav c1-1 c1-2 c1-4n c1-4o c1-b c1-c c1-d c1-e c1-f c1-g']/ul/li[3]"));


        contactUs.click();

        WebElement connectWithUs = driver.findElement(By.xpath("//span[@class='x-el x-el-span c1-37 c1-t c1-36 c1-8r c1-7g c1-66 c1-8s c1-8t c1-l c1-8u c1-8v c1-8w c1-8x c1-8y c1-8z c1-90 c1-91 c1-92 c1-o c1-93 c1-94 c1-95 c1-96 c1-97 c1-98 c1-99 c1-67 c1-68 c1-69 c1-6a']"));

        WebElement facebookLink = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/103179127717601']"));
        WebElement instagram = driver.findElement(By.xpath("//a[@href='https://www.instagram.com/comfyelite']"));

        System.out.println(connectWithUs.isDisplayed() && connectWithUs.getText().equals("Connect With Us") ? "Validation Passed" : "Validation failed");

        System.out.println(facebookLink.isDisplayed() && facebookLink.isEnabled() ? "Facebook link validation PASSED" : "Facebook link validation FAILED");

        System.out.println(instagram.isDisplayed() && instagram.isEnabled() ? "Facebook link validation PASSED" : "Facebook link validation FAILED");


        Driver.quitDriver();


    }
}
