package co.com.zabud.certification.base.tasks;

import co.com.zabud.certification.base.model.DatosLogin;
import static co.com.zabud.certification.base.userinterface.PageLoginMentis.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.util.List;

public class Ingresar implements Task {

    private final List<DatosLogin>datosFormulario;

    public Ingresar(List<DatosLogin>datosFormulario){
        super();
        this.datosFormulario=datosFormulario;
    }
    public static Ingresar elUsuarioYCredencial(List<DatosLogin> datosFormulario) {
        return Tasks.instrumented(Ingresar.class,datosFormulario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datosFormulario.get(0).getUsername()).into(USERNAME),
                Enter.theValue(datosFormulario.get(0).getPassword()).into(PASSWORD),
                Click.on(SING_IN));
    }
}
