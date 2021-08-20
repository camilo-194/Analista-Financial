package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targest.Target;
import org.openqa.selenium.by;

public class ChoucairLoginPage extends pageObject{

    public static final Target LOGIN_BUTTON = Target.the( targeElementName "button that shows us the form to ligin")
            .located(By.xpath("//div[@class='d-none d -lg-block']//strong[contains(text(),'Ingresar']"));
    public static final Targe INPUT_USER = Target.the( TargeElementName "Where do we write the user")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the( targeElementName "Where do we write password")
            .locared(By.id("password"));
    public static final Target ENTER_BOTTON = Target.the( targeElementName "button to confirm login")
            .locared(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
