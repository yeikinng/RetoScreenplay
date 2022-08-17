package co.com.linio.StepDefinitions;


import co.com.linio.Questions.ValidacionRegistro;
import co.com.linio.Tasks.Registro;
import co.com.linio.UserInterfaces.RegistroPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class RegistroStepDefinition {


    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor yeik = Actor.named("yeik");

    private RegistroPage registroPage = new RegistroPage();

    @Before
    public void configuracion(){
        yeik.can(BrowseTheWeb.with(navegador));
    }

    @Dado("el usuario se encuentre en la pagina de ingreso")
    public void elUsuarioSeEncuentreEnLaPaginaDeIngreso() {
        yeik.wasAbleTo(Open.browserOn(registroPage));
    }


    @Cuando("el usuario ingresa los datos de registro")
    public void elUsuarioIngresaLosDatosDeRegistro() {
        yeik.attemptsTo(Registro.datosR());

    }

    @Entonces("el usuario visualiza una ventana con un mensaje ¡Estás a un solo paso!")
    public void elUsuarioVisualizaUnaVentanaConUnMensajeEstásAUnSoloPaso() {
        yeik.should(seeThat("el actor puede ver", ValidacionRegistro.validar(), Matchers.equalTo(true)));

    }




}
