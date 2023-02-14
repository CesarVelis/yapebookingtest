package starter.actions.searchform;

import net.serenitybdd.screenplay.Actor;

public class WaitAction {
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(5000); // 5000 milliseconds = 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
