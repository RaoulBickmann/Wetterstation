import java.util.Observable;

/**
 * Created by Raoul on 12.06.2016.
 */
public class ObservableDaten extends Observable {

    private int temperatur = 18;
    private int feuchtigkeit = 75;
    private int druck = 1023;

    public void messen(){
        temperatur += Math.round(Math.random() * 4 - 2);
        feuchtigkeit += Math.round(Math.random() * 4 - 2);
        feuchtigkeit = Math.min(100, feuchtigkeit);
        druck += Math.round(Math.random()*4 - 2);
        setChanged();
        notifyObservers();
    }

    public int getTemperatur() {
        return temperatur;
    }

    public int getFeuchtigkeit() {
        return feuchtigkeit;
    }

    public int getDruck() {
        return druck;
    }

}
