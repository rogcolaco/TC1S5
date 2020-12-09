import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        //INFORMA O DIRETORIO DO MOTOR CHROME PARA O SELENIUM
        String userPath = System.getProperty("user.dir");
        String chromeDriverPath = userPath + "/lib/chromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        //CRIA O OBJETO DO SELENIUM WEBDRIVER
        WebDriver driver = new ChromeDriver();

        //LOCALIZA O ARQUIVO HTML QUE SERÁ ABERTO NO NAVEGADOR
        driver.get("http://localhost:80/04_TC1/Aula-08/01_Aula08_SeleniumWebDriver_Parte2.html");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        //Acessos de elementos usando: cssSelector, className e tagName.
        //Em className e tagName, caso mais de um elemento HTMl tenha
        //a mesma classe ou nome da tag, o objeto retornado é referente
        //ao primeiro encontrado no DOM.
        driver.findElement(By.cssSelector("input[name='nome']")).sendKeys("João");
        driver.findElement(By.className("inputTextFormulario")).sendKeys("da Silva");
        (driver.findElement(By.tagName("div")).findElement(By.className("inputTextFormulario"))).sendKeys("02/07/2020");


        //Acesso usando id:
        driver.findElement(By.id("telefone")).sendKeys("(16)99999-3553");
        //Para input type="color" é diferente... Devemos executar JavaScript:
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement colorElement = driver.findElement(By.id("selecionaCabelos"));
        js.executeScript("arguments[0].value='#505050'", colorElement);

        Thread.sleep(5000);

        driver.close();

    }

}
