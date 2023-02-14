package starter.contentvalidations.loginscreen;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.uielementdefinitions.ElementsValidations;

public class SingInWithEmailValidation implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ElementsValidations.firstPageSingInWithEmailElement.resolveFor(actor).getText();

    }
    public static Question<String> value(){
        return new SingInWithEmailValidation();
    }

}
