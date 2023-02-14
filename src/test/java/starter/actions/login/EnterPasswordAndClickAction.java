package starter.actions.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.uielementdefinitions.ClickElements;
import starter.uielementdefinitions.InputElements;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EnterPasswordAndClickAction implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of("Testyape.2023").into(InputElements.password),
                Click.on(ClickElements.SignInClick),
                WaitUntil.the(ClickElements.StartSearchingClick, isVisible()).forNoMoreThan(10).seconds()


        );

    }
}
