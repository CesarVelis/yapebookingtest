package starter.actions.searchform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.uielementdefinitions.ClickElements;
import starter.uielementdefinitions.ElementsValidations;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchClickAction  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ClickElements.SearchButtonClick),
                WaitUntil.the(ElementsValidations.selectedHotelOptionElement, isVisible()).forNoMoreThan(10).seconds()

        );
    }
}
