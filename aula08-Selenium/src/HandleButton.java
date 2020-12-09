import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleButton {

	public static void main(String[] args) {
		//INFORMA O DIRETORIO DO MOTOR CHROME PARA O SELENIUM
		String userPath = System.getProperty("user.dir");
		String chromeDriverPath = userPath + "/lib/chromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);


		WebDriver driver = new ChromeDriver();
		
	
		String url = "http://localhost/04_TC1/Aula-08/01_Aula08_SeleniumWebDriver_Parte2.html";
		//O método get abre uma página de uma certa url.
		driver.get(url);
		driver.manage().window().maximize();
		WebElement submitBtn = driver.findElement(By.name("btnSubmit"));
		
		//Verificar se o botão submit está sendo mostrado
		if(submitBtn.isDisplayed()) {
			System.out.println("O botão está sendo mostrado");
		}else {
			System.out.println("O botão não está sendo mostrado");
		}
		
		//Verificar se o botão submit está habilitado
		if(submitBtn.isEnabled()){
			System.out.println("O botão está habilitado");
			submitBtn.click();
		}else {
			System.out.println("O botão não está sendo habilitado");
		}

	}

}

