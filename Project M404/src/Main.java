import org.w3c.dom.ls.LSOutput;

/**
 * Diese Klasse wird verwendet, damit die benutzereingaben ausgeführt werden.
 *
 * @author Assvin Shanmuganathan
 * @version 10
 * @since 03.05.2020
 */

public class Main {
    MainSammlung mainSammlung;
    Einleser einleser;

    /**
     * Konstruktor für Main
     * Die
     */
    public Main() {
        mainSammlung = new MainSammlung();
        einleser = new Einleser();
        probe();

    }

    /**
     * starts the execution
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Main program = new Main();
        program.run();

    }

    /**
     * Das Menü der Benutzeroberfläche
     */
    char menue = ' ';

    private void run() {
        System.out.println("Willkommen bei der Theorie-Uebersicht\n");
        welcome();
        home();


    }


    private void home() {
        Einleser einleser = new Einleser();

        einleser.oneLine();
        this.menue = einleser.readChar();
        einleser.oneLine();
        if (menue == 'a') {
            auswahlShowEintrag();
        } else if (menue == 'b') {
            auswahlEintagErstellen();
        } else if (menue == 'c') {
            auswahlKategorieErstellen();
        } else if (menue == 'd') {
            auswahlLoeschen();
        } else if (menue == 'z') {
            System.out.println("Das Programm wird beendet.\n" +
                    "Achten Sie auf Ihr Fahrzeug, denn 90% der Unfälle sind Sie schuld \uD83D\uDE0A\n");
        } else {
            System.out.println("Das war eine falsche Eingabe. Bitte erneut eingeben:");
        }

    }

    /**
     * Die Begrüssung von Terminal
     */
    private void welcome() {
        String anzeige = "Was moechten Sie machen?\n";
        anzeige += "Tippe:\n";
        anzeige += "«a» Anzeigen der Theorie-Eintraege\n";
        anzeige += "«b» Erstellen eines Theorie-Eintrags\n";
        anzeige += "«c» Erstellen einer neuen Kategorie\n";
        anzeige += "«d» Loeschen einer Theorie\n";
        anzeige += "«z» Dieses Programm beenden";
        System.out.println(anzeige);
    }

    /**
     * Die Navigatiion mit dem Ziel, die Einträge anzuzeigen.
     */
    private void auswahlShowEintrag() {


        System.out.println("Bitte Waehlen Sie eine Kategorie aus:");
        mainSammlung.showKategorien();
        Kategorie kategorie = mainSammlung.getKategorie(einleser.readInt());

        System.out.println("Sie haben " + kategorie.getName() + " gewählt. Hier sind alle verfügbaren Eintraege: \n");
        kategorie.showEintrag();
        einleser.oneLine();
        System.out.println("<h> um ins Hauptmenue zu gelangen.");
        System.out.println("<z> um das Programm zu beenden.");
        einleser.oneLine();
        String test = " ";

        test = einleser.readString();
        if (test.equals("h")) {
            einleser.oneLine();
            welcome();
            home();

        } else if (test.equals("z")) {
            einleser.oneLine();
            System.out.println("Das Programm wird beendet.\n" +
                    "Achten Sie auf Ihr Fahrzeug, denn 90% der Unfälle sind Sie schuld \uD83D\uDE0A\n");
        } else {
            System.out.println("Das war eine falsche Eingabe. Bitte erneut eingeben:");
        }


    }

    /**
     * Hier wird ein Eintrag erstellt und gespeichert. Danach kann man zurück zum Menü, oder das Programm verlassen.
     */
    private void auswahlEintagErstellen() {


        System.out.println("Bitte Waehlen Sie eine Kategorie aus:");
        mainSammlung.showKategorien();
        Kategorie kategorie = mainSammlung.getKategorie(einleser.readInt());
        System.out.println("Sie haben " + kategorie.getName() + " gewählt. Geben Sie ihren Eintrag ein: ");
        einleser.oneLine();
        String text = einleser.readString();
        kategorie.addEintrag(new Theorie(text));
        einleser.oneLine();

        System.out.println("Der Eintrag wurde hinzugefuegt\n");

        System.out.println("<h> um ins Hauptmenue zu gelangen.");
        System.out.println("<z> um das Programm zu beenden.");
        einleser.oneLine();

        String test = " ";

        test = einleser.readString();
        if (test.equals("h")) {
            einleser.oneLine();
            welcome();
            home();

        } else if (test.equals("z")) {
            einleser.oneLine();
            System.out.println("Das Programm wird beendet.\n" +
                    "Achten Sie auf Ihr Fahrzeug, denn 90% der Unfälle sind Sie schuld \uD83D\uDE0A\n");
        } else {
            System.out.println("Das war eine falsche Eingabe. Bitte erneut eingeben:");
        }

    }

    /**
     * Hier wird eine Kategorie erstellt.
     * Danach kann man zurück zum Menü, oder das Programm verlassen.
     */
    private void auswahlKategorieErstellen() {
        System.out.println("Geben Sie ihre neue Kategorie ein: ");
        einleser.oneLine();
        String neuKat = einleser.readString();
        einleser.oneLine();
        Kategorie neueKategorie = new Kategorie(neuKat);
        mainSammlung.addKategorie(neueKategorie);
        System.out.println("Die Kategorie: " + neueKategorie.getName() + " wurde hinzugefuegt.\n");

        System.out.println("<h> um ins Hauptmenue zu gelangen.");
        System.out.println("<z> um das Programm zu beenden.");
        einleser.oneLine();

        String test = " ";

        test = einleser.readString();
        if (test.equals("h")) {
            einleser.oneLine();
            welcome();
            home();

        } else if (test.equals("z")) {
            einleser.oneLine();
            System.out.println("Das Programm wird beendet.\n" +
                    "Achten Sie auf Ihr Fahrzeug, denn 90% der Unfälle sind Sie schuld \uD83D\uDE0A\n");
        } else {
            System.out.println("Das war eine falsche Eingabe. Bitte erneut eingeben:");
        }

    }

    /**
     * Hier wird ein Eintrag gelöscht.
     * Danach kann man zurück zum Menü, oder das Programm verlassen.
     */
    private void auswahlLoeschen() {
        System.out.println("Diese Funktion gibt es zur Zeit noch nicht. Aufgrund Zeitmangel und eines" +
                "grossen Prolems konnte die Auwahl nicht geschrieben werden.\n");
        System.out.println("<h> um ins Hauptmenue zu gelangen.");
        System.out.println("<z> um das Programm zu beenden.");
        einleser.oneLine();

        String test = " ";

        test = einleser.readString();
        if (test.equals("h")) {
            einleser.oneLine();
            welcome();
            home();

        } else if (test.equals("z")) {
            einleser.oneLine();
            System.out.println("Das Programm wird beendet.\n" +
                    "Achten Sie auf Ihr Fahrzeug, denn 90% der Unfälle sind Sie schuld \uD83D\uDE0A\n");
        } else {
            System.out.println("Das war eine falsche Eingabe. Bitte erneut eingeben:");
        }


    }

    /**
     * Eine Probe, damit ich sehe, ob das Programm funktioniert.
     */
    private void probe() {
        Kategorie k1 = new Kategorie("Geschwindigkeit");
        k1.addEintrag(new Theorie("Landstrassen können mit 80 km/h befahren werden"));
        k1.addEintrag(new Theorie("Autobahn hat eine Limit von 120 km/h"));
        k1.addEintrag(new Theorie("Innerortsstrassen 50km/h !"));

        Kategorie k2 = new Kategorie("Vortritt");
        k2.addEintrag(new Theorie("Rechtsvortritt"));
        k2.addEintrag(new Theorie("Hauptstrasse/Nebenstrasse"));
        k2.addEintrag(new Theorie("Schilder"));

        Kategorie k3 = new Kategorie("Schilder");
        k3.addEintrag(new Theorie("Stop"));
        k3.addEintrag(new Theorie("Autobahn"));
        k3.addEintrag(new Theorie("Hauptstrasse"));

        Kategorie k4 = new Kategorie("Fahrzeug");
        k4.addEintrag(new Theorie("Öl"));
        k4.addEintrag(new Theorie("Reifen"));
        k4.addEintrag(new Theorie("Temperatur"));


        mainSammlung.addKategorie(k1);
        mainSammlung.addKategorie(k2);
        mainSammlung.addKategorie(k3);
        mainSammlung.addKategorie(k4);


    }


}
