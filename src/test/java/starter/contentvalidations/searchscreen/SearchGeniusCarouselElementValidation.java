package starter.contentvalidations.searchscreen;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.uielementdefinitions.ElementsValidations;

public class SearchGeniusCarouselElementValidation implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ElementsValidations.searchDiscountMessageElement.resolveFor(actor).getText();

    }
    public static Question<String> value(){
        return new SearchGeniusCarouselElementValidation();
    }

}
