package co.com.zabud.certification.base.stepDefinitions;

import co.com.zabud.certification.base.tasks.Ingresar;
import co.com.zabud.certification.base.model.DatosLogin;
import co.com.zabud.certification.base.questions.Validar;
import co.com.zabud.certification.base.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinitionsMentis {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que el (.*) abre la pagina Web de Mentis$")
    public void queElUsuarioAbreLaPaginaWebDeMentis(String usuario){
        theActorCalled(usuario).wasAbleTo(
                Abrir.laPaginaDeMentis());
    }

    @Cuando("^se ingresan las credenciales correctas$")
    public void seIngresanLasCredencialesCorrectas(List<DatosLogin>data){
        theActorInTheSpotlight().attemptsTo(
                Ingresar.elUsuarioYCredencial(data));
    }

    @Entonces("^se valida que tenga acceso a la pagina$")
    public void seValidaQueTengaAccesoALaPagina(List<DatosLogin>data){
        theActorInTheSpotlight().should(seeThat(
                Validar.accesoALapagina(data)));
    }
}
