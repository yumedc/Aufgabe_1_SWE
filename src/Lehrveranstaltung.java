import java.util.ArrayList;
import java.util.List;

class Lehrveranstaltung {
    private String titel;
    private List<String> dozierende;
    private List<String> studierende;
    private List<Vorlesungsstunde> vorlesungsstunden;
    private List<Praktikumsstunde> praktikumsstunden;

    public Lehrveranstaltung(String titel, List<String> dozierende) {
        this.titel = titel;
        this.dozierende = dozierende;
        this.studierende = new ArrayList<>();
        this.vorlesungsstunden = new ArrayList<>();
        this.praktikumsstunden = new ArrayList<>();
    }

    public void addStudierende(String studierendeName) {
        studierende.add(studierendeName);
    }

    public void removeStudierende(String studierendeName) {
        studierende.remove(studierendeName);
    }

    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        vorlesungsstunden.add(vorlesungsstunde);
    }

    public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        praktikumsstunden.add(praktikumsstunde);
    }

    public void showDetails() {
        System.out.println("Lehrveranstaltung: " + titel);
        System.out.println("Dozierende: " + String.join(", ", dozierende));
        System.out.println("Teilnehmende Studierende: " + String.join(", ", studierende));
        System.out.println("Anzahl der Vorlesungsstunden: " + vorlesungsstunden.size());
        System.out.println("Anzahl der Praktikumsstunden: " + praktikumsstunden.size());
    }

    public static void main(String[] args) {
        List<String> dozierendeListe = new ArrayList<>();
        dozierendeListe.add("Prof. Dr. Simon Nestler");
        dozierendeListe.add("Christopher Wittmann");

        Lehrveranstaltung lehrveranstaltung1 = new Lehrveranstaltung("Einführung in die Informatik", dozierendeListe);
        lehrveranstaltung1.addStudierende("Max Mustermann");
        lehrveranstaltung1.addVorlesungsstunde(new Vorlesungsstunde("Einführung in Python", "2024-04-15", "10:00", "Raum A101"));
        lehrveranstaltung1.showDetails();
    }
}
