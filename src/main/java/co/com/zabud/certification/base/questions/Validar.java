package co.com.zabud.certification.base.questions;

import co.com.zabud.certification.base.model.DatosLogin;
import co.com.zabud.certification.base.userinterface.PageLoginMentis;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import java.util.List;

public class Validar implements Question<Boolean> {

    private final List<DatosLogin> datosLogins;

    private Validar(List<DatosLogin> datosLogin) {
        this.datosLogins = datosLogin;
    }

    public static Validar accesoALapagina(List<DatosLogin> dataUsers) {
        return new Validar(dataUsers);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String ComparaOkey = Text.of(PageLoginMentis.VALIDACION_LOGIN).viewedBy(actor).asString().trim();

        if (datosLogins.get(0).getValidacion().equals(ComparaOkey)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
