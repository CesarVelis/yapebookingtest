package starter.contentvalidations.resultscreen;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.uielementdefinitions.ElementsValidations;

public class FinalAmountElementValidation implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ElementsValidations.selectedFinalAmountElement.resolveFor(actor).getText();

    }
    public static Question<String> value(){
        return new FinalAmountElementValidation();
    }

}
