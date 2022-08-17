package co.com.linio.StepDefinitions;

import co.com.linio.Tasks.BuscarProducto;
import co.com.linio.UserInterfaces.LoginPage;
import co.com.linio.Questions.ValidacionLogin;
import co.com.linio.Tasks.Login;
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

public class LoginStepDefinition {

    @Managed (driver = "chrome")
    private WebDriver navegador;
    private Actor yeik = Actor.named("yeik");

    private LoginPage loginPage = new LoginPage();

    @Before
    public void configuracion(){
        yeik.can(BrowseTheWeb.with(navegador));
    }


    @Dado("el usuario se encuentre en la paqina de inicio de sesion")
    public void elUsuarioSeEncuentreEnLaPaqinaDeInicioDeSesion() {
        yeik.wasAbleTo(Open.browserOn(loginPage));

    }

    @Cuando("el ingrese las credenciales")
    public void elIngreseLasCredenciales() {
        yeik.attemptsTo(Login.informacion());
    }


    @Cuando("selecciones los productos")
    public void seleccioneLosProductos() {
        yeik.attemptsTo(BuscarProducto.buscar());
    }

    @Entonces("el usuario visualiza una ventana con el nombre del producto")
    public void elUsuarioVisualizaUnaVentanaConElNombreDelProducto() {
        yeik.should(seeThat("el actor puede ver",ValidacionLogin.validar(), Matchers.equalTo(true)));
    }



}
