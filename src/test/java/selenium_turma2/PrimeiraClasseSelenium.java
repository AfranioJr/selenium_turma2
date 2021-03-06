package selenium_turma2;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimeiraClasseSelenium {
    @Test
    public void testelogin(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Register.html");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("Afrânio");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("Junior");
        
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Rua Dona Brigida, 597");
        driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys("emaildetestes@teste.com");
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("(11) 98765-4321");
        
        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']//label[2]/input")).click();
        
        driver.findElement(By.id("checkbox2")).click();
        
        driver.findElement(By.id("msdd")).click();
        WebElement div = driver.findElement(By.id("msdd"));
        WebElement ul = div.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));
        List<WebElement> List = ul.findElements(By.tagName("li"));
        List.get(28).click();
        List.get(7).click();
        
        Select optionSkills = new Select(driver.findElement(By.id("Skills")));
        optionSkills.selectByVisibleText("Android");

        Select optionCountries = new Select(driver.findElement(By.id("countries")));
        optionCountries.selectByVisibleText("Brazil");

        driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span")).click();
        WebElement spanElement = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div/span/span[1]/span"));
        WebElement ulCountries = spanElement.findElement(By.xpath("/html/body/span/span/span[2]/ul"));
        List<WebElement> ListCountries = ulCountries.findElements(By.tagName("li"));
        ListCountries.get(6).click();

        Select optionYear = new Select(driver.findElement(By.id("yearbox")));
        optionYear.selectByVisibleText("1983");

        Select optionMoth = new Select(driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select")));
        optionMoth.selectByVisibleText("November");

        Select optionDay = new Select(driver.findElement(By.id("daybox")));
        optionDay.selectByVisibleText("9");

        driver.findElement(By.id("firstpassword")).sendKeys("Ps6%4#2!");
        driver.findElement(By.id("secondpassword")).sendKeys("Ps6%4#2!");

        //driver.findElement(By.id("Button1")).click();
    }
}
