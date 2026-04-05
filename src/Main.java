import org.stolen.patrones.creacionales.abstractFactory.fabricas.FabricaSistema;
import org.stolen.patrones.creacionales.abstractFactory.fabricas.MacFabrica;
import org.stolen.patrones.creacionales.abstractFactory.fabricas.WindowsFabrica;
import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarBotones;
import org.stolen.patrones.creacionales.abstractFactory.interfaces.EjecutarChecbox;

public class Main {
    public static void main(String[] args) {
        FabricaSistema fabrica;
        String sistema = "windows";
        if (sistema.equalsIgnoreCase("windows")) {
            fabrica = new WindowsFabrica();
        } else {
            fabrica = new MacFabrica();
        }
        EjecutarBotones boton = fabrica.ejecutarBotones();
        EjecutarChecbox checkbox = fabrica.ejecutarChecbox();

        boton.aceptarBoton();
        checkbox.seleeccionar();

    }
}