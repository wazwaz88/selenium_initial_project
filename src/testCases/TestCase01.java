package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase01 {
    public static void main(String[] args) {


        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement contactUs = driver.findElement(By.xpath("//nav[@class='x-el x-el-nav c1-1 c1-2 c1-4n c1-4o c1-b c1-c c1-d c1-e c1-f c1-g']/ul/li[3]"));

        contactUs.click();



        WebElement logo = driver.findElement(By.xpath("//img[@class='x-el x-el-img c1-1 c1-2 c1-14 c1-7n c1-10 c1-11 c1-1s c1-1t c1-40 c1-7s c1-2x c1-2y c1-2z c1-30 c1-3w c1-7t c1-7u c1-2m c1-4t c1-2o c1-4u c1-7r c1-b c1-c c1-7v c1-7w c1-7x c1-7y c1-7z c1-80 c1-81 c1-82 c1-83 c1-84 c1-85 c1-86 c1-87 c1-88 c1-d c1-89 c1-8a c1-8b c1-e c1-f c1-g']"));

        WebElement heading = driver.findElement(By.xpath("//h2[@class='x-el x-el-h2 c1-1 c1-2 c1-1p c1-1q c1-8e c1-32 c1-4p c1-5n c1-1t c1-8f c1-4 c1-37 c1-14 c1-1u c1-b c1-1c c1-8g c1-1v c1-8h c1-8i c1-8j c1-8k']"));

        System.out.println(logo.isDisplayed() ? "Validation Passed" : "Validation failed");
        System.out.println(heading.isDisplayed() && heading.getText().equals("High quality comfy pillows and accessories for travel, office and home.") ? "Validation Passed" : "Validation failed");

        Driver.quitDriver();




    }
}
