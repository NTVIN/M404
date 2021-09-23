/**
 * Diese Klasse beinhaltet den Text, zu welchem die Einträge gehören.
 * Die sollten in die Kategorien gespeichert werden.
 *
 * @author Assvin Shanmuganathan
 * @version 1
 * @since 03.05.2020
 */

public class Theorie {
    private String text;

    /**
     * Konstruktor für eine Theorie
     */
    public Theorie(String text) {
        this.text = text;
    }

    /**
     * Setter für das Attribut "text"
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Getter für das Attribut "text"
     */
    public String getText() {
        return text;
    }
}
