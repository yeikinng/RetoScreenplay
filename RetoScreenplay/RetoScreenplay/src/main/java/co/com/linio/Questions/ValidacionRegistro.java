package co.com.linio.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import co.com.linio.UserInterfaces.MensajeRegistroPage;

public class ValidacionRegistro implements Question{


    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeRegistroPage.MSJ_REGISTRO.resolveFor(actor).isVisible();
    }

    public static Question validar(){

        return new ValidacionRegistro();
    }

}
