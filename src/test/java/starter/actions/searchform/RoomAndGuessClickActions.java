package starter.actions.searchform;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.uielementdefinitions.ClickElements;
import starter.uielementdefinitions.ElementsValidations;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RoomAndGuessClickActions implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ClickElements.QuantityGuessClick),
                WaitUntil.the(ElementsValidations.addChildrenAgeElement, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.AddChildrenClick),
                WaitUntil.the(ElementsValidations.childrenAgeElement, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.ChildrenAgeClick),
                WaitUntil.the(ClickElements.ChildrenAgeClick, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.ChildrenAgeClick),
                WaitUntil.the(ClickElements.ChildrenAgeClick, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.ChildrenAgeClick),
                WaitUntil.the(ClickElements.ChildrenAgeClick, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.ChildrenAgeClick),
                WaitUntil.the(ClickElements.ChildrenAgeClick, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.ChildrenAgeClick),
                WaitUntil.the(ClickElements.ChildrenAgeClick, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.ChildrenAgeClick),
                WaitUntil.the(ElementsValidations.okButtonElement, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.OkClick),
                WaitUntil.the(ElementsValidations.applyButtonElement, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(ClickElements.ApplyClick)
        );
    }
}
