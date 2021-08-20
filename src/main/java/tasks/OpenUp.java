package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.ChoucairAcademyPage;

public class OpenUp implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static Object thePage() {
        return Task.instrumented(OpenUp.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsYo(Open.browserOn(choucairAcademyPage));
    }
}
