package questions;
import net.serenitybdd.screenplay.Question;
import userinterface.SearchCoursePage;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe(String question){
        return new Answer(question);
    }
    @Override
    public Boolean answerBy(Actor actor){
        Boolean result;
        String nameCourse = Text.of(SearchCoursePage.NAME_COURSE).viewedBy(actor).asString();
        if (question.equals(nameCourse)){
            result = true;
        }else {
            result = false;
    }
}
