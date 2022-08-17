package co.com.linio.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.linio.com.co/account/login")

public class LoginPage extends PageObject {

        public static final Target BTN_ACEPTAR = Target.the("aceptar alerta").located(By.xpath("//button[@class='align-right primary slidedown-button'][@id='onesignal-slidedown-allow-button']"));
        public static final Target TXT_CORREO = Target.the("ingresar el correo").located(By.name("login_form[email]"));
        public static final Target TXT_CLAVE = Target.the("ingresar clave").located(By.name("login_form[password]"));
        public static final Target BTN_INGRESAR = Target.the("ingresar ").located(By.xpath("//button[@type='submit'][@class='btn btn-security col-12']"));
        public static final Target BTN_MENU = Target.the("ingresar al menu ").located(By.xpath("//div[@class='icon icon-hamburger']"));
        public static final Target BTN_CATEGORIA = Target.the("seleccionar categoria ").located(By.xpath("//a[@title='Computación'][@href='/c/computacion']"));
        public static final Target BTN_SUBCATEGORIA = Target.the("seleccionar subcategoria ").located(By.xpath("//img[@src='//i.linio.com/cms/552239bc-dde4-11ec-8f94-027f398325d6.jpeg']"));
        public static final Target BTN_PRODUCTOUNO = Target.the("seleccionar producto ").located(By.xpath("//img[@src='//i.linio.com/p/7a98bb722504f93c96d0086f1f650de1-catalog.jpg']"));
        public static final Target TXT_BUSPRODUCTO = Target.the("ingresar producto ").located(By.xpath("//div/input[@id='input-mobile-search']"));
        public static final Target BTN_BUSCARPROD = Target.the("buscar producto ").located(By.xpath("//button[@class='btn btn-primary btn-search'][@type='submit']"));
        public static final Target BTN_PRODUCTODOS = Target.the("seleccionar producto dos ").located(By.xpath("//img[@src='//i.linio.com/p/ba8b448362011f98760e94af59d710f4-catalog.jpg']"));



}
