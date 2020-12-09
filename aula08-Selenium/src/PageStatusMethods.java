import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class PageStatusMethods {
	public static void main(String[] args) throws InterruptedException {
		//INFORMA O DIRETORIO DO MOTOR CHROME PARA O SELENIUM
		String userPath = System.getProperty("user.dir");
		String chromeDriverPath = userPath + "/lib/chromeDriver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);

		//CRIA O OBJETO DO SELENIUM WEBDRIVER
		WebDriver driver = new ChromeDriver();
		String url = "http://localhost/04_TC1/Aula-08/01_Aula08_SeleniumWebDriver_Parte2.html";

		//O método get abre uma página de uma certa url.
		driver.get(url);
		driver.manage().window().maximize();
		//O método getTitle retorna o título de uma página. Ou seja, retorna o conteúdo do elemeto <title>.
		String titulo = driver.getTitle();
		if(titulo.compareTo("Atividade de formulário")==0) {
			System.out.println("O título da página é: "+titulo);
		}else {
			System.out.println("Título não esperado.");
		}
		//O método getCurrentUrl retorna a url da página atual.
		String urlEsperada = "http://localhost/04_TC1/Aula-08/02_Aula08_SeleniumWebDriver_HandlingBrowsers_Parte3.html";
		driver.findElement(By.partialLinkText("Link para teste")).click();
		Thread.sleep(5000);
		String paginaAtual = driver.getCurrentUrl();
		if(paginaAtual.compareTo(urlEsperada)==0) {
			System.out.println("Foi para a página correta: "+urlEsperada);
		}else {
			System.out.println("Não foi para a página esperada!");
			System.out.println("Deveria ter ido para " + urlEsperada);
			System.out.println("Mas, foi para: " + paginaAtual);
		}
		//O método getPageSource retorna uma string contendo o código fonte da página atual
		String fonteDaPagina = driver.getPageSource();
		int tamDaPagina = fonteDaPagina.length();
		System.out.println("O tamanho da página é: " + tamDaPagina);

		driver.findElement(By.partialLinkText("Voltar")).click();

		Thread.sleep(2000);
		driver.quit();
		//O método quit() fecha todas as janelas abertas usando o WebDriver. Existe um outro método chamado close() que fecha somente a 
		//janela corrente aberta pelo WebDriver. Neste exemplo uma segunda página é aberta em outra aba. Caso o código execute driver.close(),
		//somente a primeira aba, que é a corrente será fechada. Caso o código execute driver.quit(), /todas as páginas serão fechadas.
		//driver.quit();//driver.close();
	}
}

