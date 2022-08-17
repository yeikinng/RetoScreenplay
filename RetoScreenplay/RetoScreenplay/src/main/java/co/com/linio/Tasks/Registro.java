package co.com.linio.Tasks;

import co.com.linio.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import java.io.IOException;

import static co.com.linio.UserInterfaces.RegistroPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class Registro implements Task {

    Datos datos = new Datos();


    // Este metodo siempre recibe a un actor
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(BTN_ACEPTARR, WebElementStateMatchers.isClickable()).forNoMoreThan(20).seconds());

        try {
            actor.attemptsTo(

                    WaitUntil.the(BTN_ACEPTARR, isVisible()),
                    Click.on(BTN_ACEPTARR),
                    Click.on(HRF_CREARCUENTA),
                    Enter.theValue(datos.leerDatosExcel("DatosRScr.xlsx","Registro",2,0))
                            .into(TXT_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel("DatosRScr.xlsx","Registro",2,1))
                            .into(TXT_APELLIDO),
                    Enter.theValue(datos.leerDatosExcel("DatosRScr.xlsx","Registro",2,2))
                            .into(TXT_CORREO),
                    Enter.theValue(datos.leerDatosExcel("DatosRScr.xlsx","Registro",2,3))
                            .into(TXT_CLAVE),
                    Enter.theValue(datos.leerDatosExcel("DatosRScr.xlsx","Registro",2,4))
                            .into(TXT_CEDULA),
                    Click.on(CHK_TERMINOS),
                    Click.on(CHK_TDATOS),
                    WaitUntil.the(BTN_COMPLETARREG, isVisible()),
                    Click.on(BTN_COMPLETARREG)


            );
        } catch (IOException e){
            e.printStackTrace();

        }
    }

    public static Registro datosR(){
        return instrumented(Registro.class);
    }
}


