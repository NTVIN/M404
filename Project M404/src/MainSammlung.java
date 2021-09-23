/**
 * Diese Klasse wird verwendet, damit alles andere gespeiert werden kann.
 *
 * @author Assvin Shanmuganathan
 * @version 4
 * @since 03.05.2020
 */

public class MainSammlung {

    private Kategorie[] kategorien;
    private int anzKategorien;
    private final int MAX_KATEGORIEN = 200;

    public MainSammlung() {
        kategorien = new Kategorie[MAX_KATEGORIEN];
        anzKategorien = 0;
    }

    /**
     * Methode, damit eine Kategorie hinzugefügt wird.
     */
    public void addKategorie(Kategorie kategorie) {
        kategorien[anzKategorien] = kategorie;
        anzKategorien++;
    }

    /**
     * Die Ausgabe der Kategorien
     */
    public void showKategorien() {
        for (int a = 0; a < anzKategorien; a++) {
            System.out.println("<" + a + ">\t" + kategorien[a].getName());
        }
    }

    /**
     * Hier soll die Kategorie ausgewählt werden. Wenn nich die richtige Zahl eingegeben wird, soll eine Meldung kommen.
     */
    public Kategorie getKategorie(int zahl) {
        if (zahl > 0 || zahl <= anzKategorien) {
            return kategorien[zahl];
        } else {
            System.out.println("Das war eine flasche Eingabe. Bitte erneut eingeben: ");
            return null;
        }
    }
}
