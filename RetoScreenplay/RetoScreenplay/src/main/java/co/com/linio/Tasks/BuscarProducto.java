package co.com.linio.Tasks;

import co.com.linio.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static co.com.linio.UserInterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class BuscarProducto implements Task {

    Datos datos = new Datos();


    @Override
    public <T extends Actor> void performAs(T actor) {


        try {
            actor.attemptsTo(

                    Enter.theValue(datos.leerDatosExcel("DatosRScr.xlsx", "BuscarProd", 1, 0))
                            .into(TXT_BUSPRODUCTO),
                    Click.on(BTN_BUSCARPROD),
                    Click.on(BTN_PRODUCTODOS)


            );
        } catch (
                IOException e) {
            e.printStackTrace();

        }
    }

    public static BuscarProducto buscar() {
        return instrumented(BuscarProducto.class);
    }
}
