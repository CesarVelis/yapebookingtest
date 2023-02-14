package starter.actions.searchresults;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.uielementdefinitions.ClickElements;
import starter.uielementdefinitions.ElementsValidations;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HotelClickAction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ClickElements.hotelSecondChoiceClick),
                WaitUntil.the(ElementsValidations.selectedHotelOptionDescriptionElement, isVisible()).forNoMoreThan(10).seconds()

        );
    }
}
