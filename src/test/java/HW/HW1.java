package HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW1 {
    public static void main(String[] args) {

        //HW1:
        //Open Chrome browser
        //Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
        //fill in the complete form

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        WebElement firstName= driver.findElement(By.cssSelector("input[data-bv-field='first_name']"));
        firstName.sendKeys("Sarah");

        WebElement lastName= driver.findElement(By.cssSelector("input[data-bv-field='last_name']"));
        lastName.sendKeys("Mahyoub");

        WebElement email= driver.findElement(By.cssSelector("input[data-bv-field='email']"));
        email.sendKeys("sarah@email.com");

        WebElement phoneNumber= driver.findElement(By.cssSelector("input[data-bv-field='phone']"));
        phoneNumber.sendKeys("222-222-3333");

        WebElement address= driver.findElement(By.cssSelector("input[data-bv-field='address']"));
        address.sendKeys("2222 Syntax st");

        WebElement city= driver.findElement(By.cssSelector("input[data-bv-field='city']"));
        city.sendKeys("Selenium");

        WebElement state= driver.findElement(By.cssSelector("select[data-bv-field='state']"));
        city.sendKeys("Virginia");

        WebElement hosting= driver.findElement(By.cssSelector("input[value='no']"));
        hosting.click();

        WebElement projectDisc= driver.findElement(By.cssSelector("textarea[data-bv-field='comment']"));
        projectDisc.sendKeys("Automation testing");

    }


}
