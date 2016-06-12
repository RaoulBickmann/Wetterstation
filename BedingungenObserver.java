import java.util.Observable;
import java.util.Observer;

/**
 * Created by Raoul on 12.06.2016.
 */
public class BedingungenObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        ObservableDaten daten = (ObservableDaten) o;
        System.out.println("aktuell: "
                + daten.getTemperatur() + " C "
                + daten.getFeuchtigkeit() + "% "
                + daten.getDruck() + " hPa ");


    }
}