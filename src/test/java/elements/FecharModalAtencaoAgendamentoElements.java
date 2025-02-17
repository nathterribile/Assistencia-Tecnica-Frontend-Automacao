package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class FecharModalAtencaoAgendamentoElements extends BasePage {

@FindBy(xpath = "/html/body/main/div[2]/div[4]/div/div/div[1]/button")
public static WebElement botaoFecharModal;

@FindBy(xpath = "/html/body/main/div[1]/div/h2")
public static WebElement texto;


}
