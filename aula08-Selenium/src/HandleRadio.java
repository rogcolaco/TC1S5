import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleRadio {
	public static void main(String[] args) throws InterruptedException {
		//INFORMA O DIRETORIO DO MOTOR CHROME PARA O SELENIUM
		String userPath = System.getProperty("user.dir");
		String chromeDriverPath = userPath + "/lib/chromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		WebDriver driver = new ChromeDriver();
		String url = "http://localhost/04_TC1/Aula-08/04_Aula09_SeleniumWebDriver_HandlingCheckboxRadio.html";
		//O método get abre uma página de uma certa url.
		driver.get(url);
		driver.manage().window().maximize();
		WebElement radioCBuilder = driver.findElement(By.xpath("//*[@id=\"cbuilder\"]"));
		//Verificar se o radio button sendo mostrado
		if(radioCBuilder.isDisplayed()) {
			System.out.println("O radio button CBuilder está sendo mostrado");
		}else {
			System.out.println("O radio button CBuilder não está sendo mostrado");
		}		
		//Verificar se o radio button está habilitado
		if(radioCBuilder.isEnabled()){
			System.out.println("O radio button CBuilder está habilitado");
		}else {
			System.out.println("O radio button CBuilder não está sendo habilitado");
		}		
		//Verificar se o radio button está selecionado
		if(radioCBuilder.isSelected()){
			System.out.println("O radio button CBuilder está selecionado");
		}else {
			System.out.println("O radio button CBuilder não está selecionado");
		}		
		Thread.sleep(5000);
		radioCBuilder.click();
		//Verificar se o radio button está selecionado
		if(radioCBuilder.isSelected()){
			System.out.println("O radio button CBuilder está selecionado");
		}else {
			System.out.println("O radio button CBuilder não está selecionado");
		}

		Thread.sleep(2000);

		driver.quit();
	}
}
