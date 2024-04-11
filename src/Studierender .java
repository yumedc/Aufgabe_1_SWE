class Studierender {
   
    String name; 
    int matrikelnummer;
    String studiengang;

    //Konstruktor, Übergabe Parameter bei Erstellung neues Studierenden-Objekts
    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public void frageStellen(Dozierender dozierender, String frage) {
        System.out.println(name + " fragt " + dozierender.getName() + ": " + frage);
    }
    public void sprechstundeAnfrageSenden(Dozierender dozierender, String grund) {
    // Implementierung der Anfrage-Logik
    }
}
