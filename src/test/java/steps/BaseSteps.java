package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import pages.BasePage;
import utils.GlobalDriver;

public class BaseSteps {

    protected static WebDriver driver;


    @BeforeAll
    public static void setup(){
        GlobalDriver.set();
        driver = GlobalDriver.get();
    }

    @Before("@modalAtencaoAgendamento or @modalLogin")
    public static void acessoOnboarding(){
        String OnboardingUrl = "http://localhost:1200/";
        BasePage.openBrowser(OnboardingUrl);
    }

    @Before("@fecharModalAtencaoAgendamento or @acessoPaginaAgendamento")
    public static void modalAtencaoAgendamento(){
        String OnboardingUrl = "http://localhost:1200/";
        BasePage.openBrowser(OnboardingUrl);
        BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div[1]/button")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div[2]/p")));
    }


    @Before("@campoEquipamentoPaginaAgendamento or @campoMarcaPaginaAgendamento")
    public static void acessoPaginaAgendamento(){
        GlobalDriver.set();
        driver = GlobalDriver.get();
        String OnboardingUrl = "http://localhost:1200/";
        BasePage.openBrowser(OnboardingUrl);
        BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div/button")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div[2]/p")));
        BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div[2]/div/button")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/main/section/h2")));
    }

    @Before("@modalConfirmacaoAgendamento")
    public static void preenchimentoPaginaAgendamento(){
        GlobalDriver.set();
        driver = GlobalDriver.get();
        String OnboardingUrl = "http://localhost:1200/";
        BasePage.openBrowser(OnboardingUrl);
        BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div/button")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div[2]/p")));
        BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div[2]/div/button")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/main/section/h2")));
        BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[1]/input")).sendKeys("Fulano Beltrano");
        BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[2]/select")).sendKeys("smartphone");
        BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[5]/input")).sendKeys("21022025");
        BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[6]/textarea")).sendKeys("Tela trincada");
    }

    @Before("@modalConfirmacaoAgendamentoRetornoOnboarding")
    public static void acessoModalConfirmacaoAgendamento() throws InterruptedException{
        GlobalDriver.set();
        driver = GlobalDriver.get();
        String OnboardingUrl = "http://localhost:1200/";
        BasePage.openBrowser(OnboardingUrl);
        BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div/button")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div[2]/p")));
        BasePage.driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div/div/div[2]/div/button")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/main/section/h2")));
        BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[1]/input")).sendKeys("Fulano Beltrano");        
        BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[2]/select")).sendKeys("smartphone");      
        BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[5]/input")).sendKeys("21022025");
        BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[6]/textarea")).sendKeys("Tela trincada");
        BasePage.moveToElement(BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[7]/button")));
        BasePage.driver.findElement(By.xpath("/html/body/main/section/form/div/div[7]/button")).click();
       }

    
    @Before("@acessoFuncionario")
    public static void acessoModalLogin(){
        String OnboardingUrl = "http://localhost:1200/";
        BasePage.openBrowser(OnboardingUrl);
        BasePage.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
    }

    @Before("@cadastroOs or @buscaOs")
    public static void acessoPaginaOS(){
        String OnboardingUrl = "http://localhost:1200/";
        BasePage.openBrowser(OnboardingUrl);
        BasePage.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input")));
        BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input")).sendKeys("Fulano13");        
        BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/input")).sendKeys("Fulan2025");
        BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[3]/button")).click();
    }

    @Before("@pedidoAlteracaoCadastroOs")
    public static void pedidoAlteracaoCadastroOS() throws InterruptedException{
        String OnboardingUrl = "http://localhost:1200/";
        BasePage.openBrowser(OnboardingUrl);
        BasePage.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input")));
        BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input")).sendKeys("Fulano13");        
        BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/input")).sendKeys("Fulan2025");
        BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[3]/button")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[1]/input")));
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[1]/input")).sendKeys("Fulano Beltrano");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[2]/select")).sendKeys("Microondas");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[3]/input")).sendKeys("17022025");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[4]/textarea")).sendKeys("Prato parou de rodar");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[5]/input")).sendKeys("18022025");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[6]/select")).sendKeys("Aguardando orçamento");
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[7]/textarea")).sendKeys("");
        BasePage.moveToElement(BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[8]/div[1]/button")));
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[8]/div[1]/button")).click();         
        
    }

    @Before("@envioAlteracaoCadastroOs")
    public static void envioAlteracaoCadastroOS() throws InterruptedException{
        String OnboardingUrl = "http://localhost:1200/";
        BasePage.openBrowser(OnboardingUrl);
        BasePage.driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a")).click();
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input")));
        BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[1]/input")).sendKeys("Fulano13");        
        BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[2]/input")).sendKeys("Fulan2025");
        BasePage.driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[3]/button")).click();
        TimeUnit.SECONDS.sleep(5);
        BasePage.waitVisibilityOf(BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[1]/input")));
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[1]/input")).sendKeys("Fulano Beltrano");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[2]/select")).sendKeys("Microondas");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[3]/input")).sendKeys("17022025");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[4]/textarea")).sendKeys("Prato parou de rodar");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[5]/input")).sendKeys("18022025");                
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[6]/select")).sendKeys("Aguardando orçamento");
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[7]/textarea")).sendKeys("");
        BasePage.moveToElement(BasePage.driver.findElement(By.xpath("/html/body/main/section[2]/div/table/thead/tr")));
        BasePage.driver.findElement(By.xpath("/html/body/main/section[1]/form/div/div[8]/div[1]/button")).click();
        TimeUnit.SECONDS.sleep(5);
        BasePage.moveToElement(BasePage.driver.findElement(By.xpath("/html/body/main/section[2]/div/table/tbody/tr/td[9]/a")));
        BasePage.driver.findElement(By.xpath("/html/body/main/section[2]/div/table/tbody/tr/td[9]/a")).click();
        TimeUnit.SECONDS.sleep(5);
        
    }


    @After
    public static void finish(){
        GlobalDriver.close();
    }

    
    @AfterStep
    public static void afterStep(Scenario scenario){
        scenario.attach(BasePage.getByteScreenshot(driver), "image/png", "image");   
    }
}

