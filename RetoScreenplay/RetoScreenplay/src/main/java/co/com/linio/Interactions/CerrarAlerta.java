package co.com.linio.Interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


public class CerrarAlerta implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {

        BrowseTheWeb.as(actor).getAlert().accept();

    }
    public static CerrarAlerta cerrar (){
        return new CerrarAlerta();
    }

}
