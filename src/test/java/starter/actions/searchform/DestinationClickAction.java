package starter.actions.searchform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import starter.uielementdefinitions.ClickElements;
import starter.uielementdefinitions.InputElements;

public class DestinationClickAction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ClickElements.DestinationClick),
                SendKeys.of("Cusco").into(InputElements.destination)

        );
    }
}
