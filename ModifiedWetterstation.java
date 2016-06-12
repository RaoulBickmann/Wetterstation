import java.util.ArrayList;

/**
 * Created by Raoul on 12.06.2016.
 */
public class ModifiedWetterstation {

    public ObservableDaten daten;

    public ModifiedWetterstation() {
        daten = new ObservableDaten();
        messungSimulieren();
    }

    // wird aufgerufen, wenn neue Messwerte da sind
    public void messwerteGeaendert(){
        daten.messen();
    }

    // Simulation der Wetterdaten ...
    public void messungSimulieren(){
        Thread thread = new Thread(new Runnable(){
            public void run(){
                while (true){
                    daten.messen();
                    messwerteGeaendert();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        });
        thread.start();
    }


    public static void main(String [] arg){
        ModifiedWetterstation wetterstation = new ModifiedWetterstation();
        wetterstation.daten.addObserver(new BedingungenObserver());
        wetterstation.daten.addObserver(new AussichtenObserver());
        wetterstation.daten.addObserver(new TendenzObserver());

    }

}
