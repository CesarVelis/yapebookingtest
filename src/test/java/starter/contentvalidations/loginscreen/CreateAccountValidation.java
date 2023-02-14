package starter.contentvalidations.loginscreen;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.uielementdefinitions.ElementsValidations;

public class CreateAccountValidation implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ElementsValidations.firstPageCreateAccountElement.resolveFor(actor).getText();

    }
    public static Question<String> value(){
        return new CreateAccountValidation();
    }

}
