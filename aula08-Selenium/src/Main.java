import org.openqa.selenium.WebDriver;
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

    }

}
