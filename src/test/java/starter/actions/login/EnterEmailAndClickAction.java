package starter.actions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.uielementdefinitions.ClickElements;
import starter.uielementdefinitions.InputElements;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterEmailAndClickAction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("testyape@gmail.com").into(InputElements.email),
                Click.on(ClickElements.ContinueClick),
                WaitUntil.the(InputElements.password, isVisible()).forNoMoreThan(10).seconds()


        );

    }
}
