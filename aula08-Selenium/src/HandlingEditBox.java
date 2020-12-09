import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingEditBox {
	public static void main(String[] args) throws InterruptedException {
		//INFORMA O DIRETORIO DO MOTOR CHROME PARA O SELENIUM
		String userPath = System.getProperty("user.dir");
		String chromeDriverPath = userPath + "/lib/chromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);


		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/04_TC1/Aula-08/01_Aula08_SeleniumWebDriver_Parte2.html");
		driver.manage().window().maximize();		
		WebElement nome = driver.findElement(By.name("nome"));		
		//Verificar se o nome é mostrado
		if(nome.isDisplayed()) {
			System.out.println("O nome está sendo mostrado");
		}else {
			System.out.println("O nome não está sendo mostrado");
		}
		//Verificar se o nome está enabled
		if(nome.isEnabled()) {
			System.out.println("O nome está habilitado");
		}else {
			System.out.println("O nome não está habilitado");
		}
		Thread.sleep(5000);
		//Entrar com o nome
		if(nome.isEnabled()) {
			nome.sendKeys("João");
			System.out.println("O nome foi preenchido.");
		}else {
			System.out.println("não foi possível preencher o campo nome");
		}
		//Obter o valor do input text nome
		String valorInputText = nome.getAttribute("value");
		System.out.println("O valor do input text é: " + valorInputText);
		
		//Limpar o valor do input text nome
		Thread.sleep(5000);
		if(nome.isEnabled()) {
			nome.clear();
		}
		
		//Verificar como o valor do input text nome ficou após limpá-lo
		valorInputText = nome.getAttribute("value");
		System.out.println("O valor do input text é: " + valorInputText);
	}
}
