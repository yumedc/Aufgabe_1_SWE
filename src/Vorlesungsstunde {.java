class Vorlesungsstunde {
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

    public void showDetails() {
        System.out.println("Vorlesungsstunde:");
        System.out.println("Thema: " + thema);
        System.out.println("Datum: " + datum);
        System.out.println("Uhrzeit: " + uhrzeit);
        System.out.println("Raum: " + raum);
    }

    public static void main(String[] args) {
        Vorlesungsstunde vorlesungsstunde1 = new Vorlesungsstunde("Einführung in Python", "2024-04-15", "10:00", "Raum A101");
        vorlesungsstunde1.showDetails();
    }
}
