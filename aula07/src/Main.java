import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {
        //INFORMA O DIRETORIO DO MOTOR CHROME PARA O SELENIUM
        String userPath = System.getProperty("user.dir");
        String chromeDriverPath = userPath + "/libs/chromeDrive/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        //CRIA O OBJETO DO SELENIUM WEBDRIVER
        WebDriver driver = new ChromeDriver();

        //LOCALIZA O ARQUIVO HTML QUE SERÁ ABERTO NO NAVEGADOR
        driver.get("http://localhost:80/04_TC1/formulario.html");
        driver.manage().window().maximize();

        //SELECIONAR E ABRIR LINK
        WebElement primeiroLink = driver.findElement(By.linkText("Link para IFSP"));
        primeiroLink.click();

        WebElement segundoLink = driver.findElement(By.partialLinkText("Link para IFSP -"));
        segundoLink.click();

        //OBTENDO ELEMENTOS UTILIZANDO XPATH
        driver.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("John Wick");

        //driver.findElement(By.xpath("/html/body/form/label[1]")).clear();

    }
}
