package starter.contentvalidations.welcomepopup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.uielementdefinitions.ElementsValidations;

public class WelcomeMessageValidation implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ElementsValidations.messageElement.resolveFor(actor).getText();

    }
    public static Question<String> value(){
        return new WelcomeMessageValidation();
    }

}
