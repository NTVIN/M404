import java.lang.reflect.Array;

/**
 * Diese Klasse wird verwendet, um die Kategorie, sowie die Einträge zu verwalten.
 *
 * @author Assvin Shanmuganathan
 * @version 3
 * @since 03.05.2020
 */

public class Kategorie {

    private String name;
    private int anzEintrag;
    private final int MAX_EINTRAEGE = 200;
    private Theorie[] eintraege;

    /**
     * Kategorie werden hier auf 0 gesetzt.
     */
    public Kategorie(String name) {
        this.name = name;
        eintraege = new Theorie[MAX_EINTRAEGE];
        anzEintrag = 0;
    }

    /**
     * Hier wird ein Eintrag hinzugefügt.
     */
    public void addEintrag(Theorie eintrag) {
        eintraege[anzEintrag] = eintrag;
        anzEintrag++;
    }

    /**
     * Getter für das Attribut name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter für das Attribut name
     */
    public void setName(String name) {
        this.name = name;

    }

    /**
     * Hier werden die Einträge angezeigt.-->Array
     */

    public void showEintrag() {
        if (anzEintrag < 1) {
            System.out.println("Es gibt keinen Theorien.");
        } else {
            for (int b = 0; b < anzEintrag; b++) {
                System.out.println("<" + b + ">\t" + eintraege[b].getText());
            }
        }
    }
}
