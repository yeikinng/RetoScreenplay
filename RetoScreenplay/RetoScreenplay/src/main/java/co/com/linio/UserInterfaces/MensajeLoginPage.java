package co.com.linio.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MensajeLoginPage {

        public static final Target MSJ_LOGIN = Target.the("mensaje de validacion de login")
                .located(By.xpath("//h1/span[@itemprop='name'][@class='product-name']"));


}
