package co.com.linio.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.linio.com.co/account/login")


public class RegistroPage extends PageObject {


    public static final Target BTN_ACEPTARR = Target.the("aceptar alerta").located(By.xpath("//button[@class='align-right primary slidedown-button'][@id='onesignal-slidedown-allow-button']"));
    public static final Target HRF_CREARCUENTA = Target.the("presionar sesion").located(By.xpath("//a[@href='#register-form']"));
    public static final Target TXT_NOMBRE = Target.the("ingresar Nombre").located(By.name("registration[firstName]"));
    public static final Target TXT_APELLIDO = Target.the("ingresar Apellido").located(By.name("registration[lastName]"));
    public static final Target TXT_CORREO = Target.the("ingresar Correo").located(By.name("registration[email]"));
    public static final Target TXT_CLAVE = Target.the("ingresar Clave").located(By.name("registration[password]"));
    public static final Target TXT_CEDULA = Target.the("ingresar Cedula").located(By.name("registration[nationalRegistrationNumber]"));
    public static final Target CHK_TERMINOS = Target.the("marcar terminos y condiciones").located(By.xpath("//label[@for='registration_acceptTerms'][@class='form-label col-sm-12']"));
    public static final Target CHK_TDATOS = Target.the("marcar tratamiento de datos").located(By.xpath("//form/div/label[@for='registration_cmrPointsAcceptedSubscription'][@class='form-label col-sm-12']"));
    public static final Target BTN_COMPLETARREG = Target.the("Continuar Registro").located(By.xpath("//form[@name='registration']/button[@type='submit'][@class='btn btn-security col-12']"));
    public static final Target TXT_CELULAR = Target.the("ingresar Celular").located(By.name("cmr_points_form_modal[phoneNumber]"));
    public static final Target BTN_ACEPTAR = Target.the("Continuar Registro").located(By.xpath("//button[@id='submit-button']"));

}
