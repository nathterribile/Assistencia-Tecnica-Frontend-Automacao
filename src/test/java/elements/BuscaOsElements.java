package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class BuscaOsElements extends BasePage {

    @FindBy(xpath = "/html/body/main/section[2]/form/div[1]/input")
    public static WebElement inputBusca;
    
    @FindBy(xpath = "/html/body/main/section[2]/form/div[1]/button")
    public static WebElement botaoBusca;

    @FindBy(xpath = "/html/body/main/section[1]/form/div/div[1]/input")
    public static WebElement inputProprietario;
    
    @FindBy(xpath = "/html/body/main/section[1]/form/div/div[2]/select")
    public static WebElement selectEquipamto;
    
    @FindBy(xpath = "/html/body/main/section[1]/form/div/div[3]/input")
    public static WebElement inputDataEntrada;
    
    @FindBy(xpath = "/html/body/main/section[1]/form/div/div[4]/textarea")
    public static WebElement textareaDefeito;
    
    @FindBy(xpath = "/html/body/main/section[1]/form/div/div[5]/input")
    public static WebElement inputDataEntrega;
    
    @FindBy(xpath = "/html/body/main/section[1]/form/div/div[6]/select")
    public static WebElement selectStatus;
    
    @FindBy(xpath = "/html/body/main/section[1]/form/div/div[7]/textarea")
    public static WebElement textareaObs;
    
    @FindBy(xpath = "/html/body/main/section[1]/form/div/div[8]/div[1]/button")
    public static WebElement botaoCadastroEquipamto;

    @FindBy(xpath = "/html/body/main/section[2]/div/table/tbody/tr/td[2]")
    public static WebElement colunaProprietario;
    
    @FindBy(xpath = "/html/body/main/section[2]/div/table/tbody/tr/td[3]")
    public static WebElement colunaEquipamento;
    
    @FindBy(xpath = "/html/body/main/section[2]/div/table/tbody/tr/td[4]")
    public static WebElement colunaDataEntrada;
    
    @FindBy(xpath = "/html/body/main/section[2]/div/table/tbody/tr/td[5]")
    public static WebElement colunaDefeito;
    
    @FindBy(xpath = "/html/body/main/section[2]/div/table/tbody/tr/td[6]")
    public static WebElement colunaDataEntrega;
    
    @FindBy(xpath = "/html/body/main/section[2]/div/table/tbody/tr/td[7]")
    public static WebElement colunaStatus;
    
    @FindBy(xpath = "/html/body/main/section[2]/div/table/tbody/tr/td[8]")
    public static WebElement colunaObs;

    @FindBy(xpath = "/html/body/main/section[2]/div/table/tbody/tr/td[9]")
    public static WebElement colunaSistema;



}
