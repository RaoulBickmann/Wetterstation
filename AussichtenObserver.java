import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * Created by Raoul on 12.06.2016.
 */
public class AussichtenObserver implements Observer {
    private String vorhersage;

    @Override
    public void update(Observable o, Object arg) {
        ObservableDaten daten = (ObservableDaten) o;
        berechneVorhersage(daten);
        System.out.println("Die weiteren Aussichten: " + vorhersage);
    }

    private String[] texte = {
            "regnerisch", "trüb", "neblig", "stürmisch", "wechselhaft bewölkt",
            "sonnig", "heiter", "frostig"
    };

    private void berechneVorhersage(ObservableDaten daten){
        Random random = new Random();
        int index1 = random.nextInt(texte.length);
        int index2 = random.nextInt(texte.length);
        while(index2 == index1){
            index2 = random.nextInt(texte.length);
        }
        vorhersage = texte[index1] + " und " + texte[index2];
    }

}
