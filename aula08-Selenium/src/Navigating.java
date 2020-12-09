import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigating {
	public static void main(String[] args) throws InterruptedException {
		//INFORMA O DIRETORIO DO MOTOR CHROME PARA O SELENIUM
		String userPath = System.getProperty("user.dir");
		String chromeDriverPath = userPath + "/lib/chromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		WebDriver driver = new ChromeDriver();
		String url = "http://localhost/04_TC1/Aula-08/01_Aula08_SeleniumWebDriver_Parte2.html";
		//O método get abre uma página de uma certa url.
		driver.get(url);
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/a[4]")).click();
		
		Thread.sleep(3000);
		
		//Ir para a página anterior
		driver.navigate().back();
		Thread.sleep(3000);
		
		//Ir para a próxima posterior novamente
		driver.navigate().forward();
		Thread.sleep(3000);

		//Atualizar a página (refresh)
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		//Navegar para a página do IFSP
		driver.navigate().to("http://www.ifsp.edu.br");
		
	}
}
