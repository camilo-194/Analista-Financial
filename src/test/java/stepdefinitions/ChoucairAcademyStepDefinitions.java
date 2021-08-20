package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.AcademyChoucairData;
import net.serenitybdd.screenplay.GiveWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.Login;
import tasks.OpenUp;
import tasks.Search;

import java.util.List;

import static questions.Answer.toThe;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage () {onStage.setTheSatage(new OnlineCast());}

    @Given("^than yeisson wnats to learn automation at the academy Choucair$")
    public void thanYeissonWnatsToLearnAutomationAtTheAcademyChoucair(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled( requieredActor "Yeisson").wasAbleTo(OpenUp.thePage(), Login.
                onThePage(academyChoucairData.get(0).getStrUser(),academyChoucairData.get(0).getStrPassword()));

    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAdemyPlatform(List<AcademyChoucairData> academyChoucairData) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Buscar.the(academyChoucairData.get(0).getStrCourse()));

    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia(List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotLight().should(GiveWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getStrCourse())));
    }
}