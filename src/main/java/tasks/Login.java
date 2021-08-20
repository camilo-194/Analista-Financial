package tasks;

import userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String strUser;
    private String strPasswore;

    public Login(String strUser, String strPasswore) {
        this.strUser = strUser;
        this.strPasswore = strPasswore;
    }


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairLoginPage.INPUT_USER),
                Enter.theValue(strPasswore).into(ChoucairLoginPage.INPUT_PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BOTTON)
        );

    }
}
