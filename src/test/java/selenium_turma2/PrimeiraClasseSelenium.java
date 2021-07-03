package selenium_turma2;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimeiraClasseSelenium {
    static ChromeDriver driver = new ChromeDriver();

    private void fechaLi(){
        driver.findElement(By.xpath("//label[contains(text(),'Languages')]")).click(); //Recolhe para expandir a caixa de seleção
        System.out.println("Fechou a <li>");
    }

    @BeforeClass
    public static void beforeClass(){
        driver.get("http://demo.automationtesting.in/Register.html");
    }

    @Test
    public void exercicio01Selenium(){
        driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("Afrânio");
        driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("Junior");
        driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Rua Dona Brigida, 597");
        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("emaildetestes@teste.com");
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("1234567890");
    }
    @Test
    public void exercicio02Selenium(){
        driver.findElement(By.xpath("//*[@value='Male']")).click();
    }
    @Test
    public void exercicio03Selenium(){
        driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
    }
    @Test
    public void exercicio04Selenium(){    
        driver.findElement(By.id("msdd")).click();
        WebElement div = driver.findElement(By.id("msdd"));
        WebElement ul = div.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));
        List<WebElement> List = ul.findElements(By.tagName("li"));
        List.get(28).click();
        List.get(7).click();
        fechaLi();
        
    }
    /* Mais duas formas de selecionar um lista Ordenada <li>*/
    /* MODELO 1
    @Test
    public void exercicio04_CorrecaoSelenium() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='msdd']")).click(); //Clique para expandir a caixa de seleção
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		List<WebElement> elementsLanguages = driver.findElements(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));
		elementsLanguages.get(0).findElement(By.xpath("//a[contains(text(),'English')]")).click();
     }
	*/
    /* MODELO 2
	@Test
	public void exercicio04_2CorrecaoSelenium() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='msdd']")).click(); //Clique para expandir a caixa de seleção
		Thread.sleep(1000); //Espera Explicita de 1 segundo
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();// clicar em cima do texto English
		
	}
    */
    
    @Test
    public void exercicio04_FinalSelenium(){
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

        driver.findElement(By.id("submitbtn")).click();
    }
}
