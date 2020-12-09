import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleCheckbox {
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
		//========================================================
		WebElement checkBoxBicicleta = driver.findElement(By.xpath("/html/body/form/input[1]"));		
		//Verificar se o checkbox sendo mostrado
		if(checkBoxBicicleta.isDisplayed()) {
			System.out.println("O checkbox bicicleta está sendo mostrado");
		}else {
			System.out.println("O checkbox bicicleta não está sendo mostrado");
		}
		//Verificar se o checkbox está habilitado
		if(checkBoxBicicleta.isEnabled()){
			System.out.println("O checkbox bicicleta está habilitado");
		}else {
			System.out.println("O checkbox bicicleta não está sendo habilitado");
		}
		Thread.sleep(5000);
		//Verificar se o checkbox está selecionado
		if(checkBoxBicicleta.isSelected()){
			System.out.println("O checkbox bicicleta está selecionado");
		}else {
			System.out.println("O checkbox bicicleta não está selecionado");
			checkBoxBicicleta.click();
		}
		Thread.sleep(5000);
		//Verificar se o checkbox está selecionado
		if(checkBoxBicicleta.isSelected()){
			System.out.println("O checkbox bicicleta está selecionado");
			checkBoxBicicleta.click();
		}else {
			System.out.println("O checkbox bicicleta não está selecionado");
		}
	}
}
