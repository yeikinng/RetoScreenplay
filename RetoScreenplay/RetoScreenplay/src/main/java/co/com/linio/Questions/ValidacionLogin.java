package co.com.linio.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import co.com.linio.UserInterfaces.MensajeLoginPage;


public class ValidacionLogin implements Question{

    @Override
    public Boolean answeredBy(Actor actor) {
        return MensajeLoginPage.MSJ_LOGIN.resolveFor(actor).isVisible();
    }

    public static Question validar(){

        return new ValidacionLogin();
    }
}
