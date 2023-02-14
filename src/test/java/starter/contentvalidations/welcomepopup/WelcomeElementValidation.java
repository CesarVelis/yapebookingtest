package starter.contentvalidations.welcomepopup;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.uielementdefinitions.ElementsValidations;

public class WelcomeElementValidation implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ElementsValidations.welcomeElement.resolveFor(actor).getText();

    }
    public static Question<String> value(){
        return new WelcomeElementValidation();
    }

}
