package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbreFechaNavegador {

	public static void main(String[] args) {
		//INFORMA O DIRETORIO DO MOTOR CHROME PARA O SELENIUM
		String userPath = System.getProperty("user.dir");
		String chromeDriverPath = userPath + "/lib/chromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		
		//CRIA O OBJETO DO SELENIUM WEBDRIVER
		WebDriver driver = new ChromeDriver();
		
		//ENVIA INSTRUCOES DO SELENIUM PARA O CHROME
		//driver.get("https://scl.ifsp.edu.br");
		//driver.quit();
		
		//Exemplo-2
		driver.get("http://localhost:80/04_TC1/formulario.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("nome")).sendKeys("Rogério Colaço");
		driver.findElement(By.name("sobrenome")).sendKeys("da Silva");
		
		driver.findElement(By.id("dtNascimento")).sendKeys("14/06/1985");
		driver.findElement(By.id("telefone")).sendKeys("(16)3638-1014");

	}

}
