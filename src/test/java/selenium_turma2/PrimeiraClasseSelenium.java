package selenium_turma2;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

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
    }
}
