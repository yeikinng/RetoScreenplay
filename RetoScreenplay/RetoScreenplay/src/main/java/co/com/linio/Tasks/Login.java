package co.com.linio.Tasks;

import co.com.linio.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static co.com.linio.UserInterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class Login implements Task {

    Datos datos = new Datos();


    // Este metodo siempre recibe a un actor
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(BTN_ACEPTAR, WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds());

        try {
            actor.attemptsTo(

                    WaitUntil.the(BTN_ACEPTAR, isVisible()),
                    Click.on(BTN_ACEPTAR),
                    Enter.theValue(datos.leerDatosExcel("DatosRScr.xlsx", "Login", 1, 0))
                            .into(TXT_CORREO),
                    Enter.theValue(datos.leerDatosExcel("DatosRScr.xlsx", "Login", 1, 1))
                            .into(TXT_CLAVE),
                    WaitUntil.the(BTN_INGRESAR, isVisible()),
                    Click.on(BTN_INGRESAR),
                    Click.on(BTN_MENU),
                    Click.on(BTN_CATEGORIA),
                    Click.on(BTN_SUBCATEGORIA),
                    Click.on(BTN_PRODUCTOUNO)



            );
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static Login informacion() {
        return instrumented(Login.class);
    }

}
