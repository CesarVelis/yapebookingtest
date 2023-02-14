package starter.actions.searchresults;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.uielementdefinitions.ClickElements;
import starter.uielementdefinitions.ElementsValidations;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SortClickAction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ClickElements.SortButtonClick),
                WaitUntil.the(ClickElements.StarsButtonClick, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.StarsButtonClick),
                WaitUntil.the(ClickElements.FilterButtonClick, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.FilterButtonClick),
                WaitUntil.the(ClickElements.FilterByAmountButtonClick, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.FilterByAmountButtonClick),
                Click.on(ClickElements.ShowResultButtonClick)

        );
    }
}
