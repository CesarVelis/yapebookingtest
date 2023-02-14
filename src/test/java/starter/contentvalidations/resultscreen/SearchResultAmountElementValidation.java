package starter.contentvalidations.resultscreen;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import starter.uielementdefinitions.ElementsValidations;

public class SearchResultAmountElementValidation implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return ElementsValidations.searchResultAmountElement.resolveFor(actor).getText();

    }
    public static Question<String> value(){
        return new SearchResultAmountElementValidation();
    }

}
