package co.com.linio.UserInterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeRegistroPage {

    public static final Target MSJ_REGISTRO = Target.the("mensaje de validacion registro")
            .located(By.xpath("//label[@class='form-label required'][@for='cmr_points_form_modal_phoneNumber']"));

}
