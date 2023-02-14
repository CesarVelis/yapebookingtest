package starter.contentvalidations.resultscreen;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.uielementdefinitions.ElementsValidations;

public class SelectedHotelAmountElement implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ElementsValidations.selectedHotelAmountElement.resolveFor(actor).getText();

    }
    public static Question<String> value(){
        return new SelectedHotelAmountElement();
    }

}
