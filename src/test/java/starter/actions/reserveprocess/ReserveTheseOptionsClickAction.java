package starter.actions.reserveprocess;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import starter.uielementdefinitions.ClickElements;

public class ReserveTheseOptionsClickAction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ClickElements.reserveTheseOptionClick)
        );
    }
}
