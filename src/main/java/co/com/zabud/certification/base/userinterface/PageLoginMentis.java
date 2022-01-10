package co.com.zabud.certification.base.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PageLoginMentis extends PageObject {

    public static final Target USERNAME = Target.the("").located(By.xpath("/html/body/div[1]/div[2]/div[1]/form/input[1]"));
    public static final Target PASSWORD = Target.the("").located(By.xpath("/html/body/div[1]/div[2]/div[1]/form/input[2]"));
    public static final Target SING_IN = Target.the("").located(By.xpath("/html/body/div[1]/div[2]/div[1]/form/button"));
    public static final Target VALIDACION_LOGIN = Target.the("").located(By.xpath("//*[@id=\"bootstrap-admin-template\"]"));
    public static final Target LOG_OUT = Target.the("").located(By.xpath("/html/body/div[1]/div[1]/nav/div/div[1]/div[3]/a/i\n"));
}
