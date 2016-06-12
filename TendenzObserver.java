import java.util.Observable;
import java.util.Observer;

/**
 * Created by Raoul on 12.06.2016.
 */
public class TendenzObserver implements Observer {

    private int lastTemp;
    private int lastFeucht;
    private int lastDruck;

    @Override
    public void update(Observable o, Object arg) {
        ObservableDaten daten = (ObservableDaten) o;
        int temp = daten.getTemperatur();
        int feucht = daten.getFeuchtigkeit();
        int druck = daten.getDruck();

        System.out.print("Tendenz: ");

        if (temp >= lastTemp){
            System.out.print("Temp + ");
        }
        else {
            System.out.print("Temp - ");
        }

        if (feucht >= lastFeucht){
            System.out.print("Feucht + ");
        }
        else {
            System.out.print("Feucht - ");
        }

        if (druck >= lastDruck){
            System.out.println("Druck + ");
        }
        else {
            System.out.println("Druck - ");
        }

        lastTemp = temp;
        lastFeucht = feucht;
        lastDruck = druck;
    }
}