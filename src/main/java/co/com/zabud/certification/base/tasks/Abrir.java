package co.com.zabud.certification.base.tasks;

import co.com.zabud.certification.base.userinterface.HomeMentis;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir extends PageObject implements Task {

    public HomeMentis homeMentis;

    public static Abrir laPaginaDeMentis() {
        return Tasks.instrumented(Abrir.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homeMentis));
    }
}
