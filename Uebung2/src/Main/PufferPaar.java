package Main;

public class PufferPaar {
    public static void main(String[] args) {
        Puffer<Paar<Student,String>> servicePoint;
        Puffer<Paar<Boxer,Boxer>> boxEvent;

        servicePoint = new SchlangeMitArray<Paar<Student, String>>(4);
        boxEvent = new StapelMitArray<Paar<Boxer, Boxer>>(3);
        servicePoint.insert(new Paar<Student, String>(new Student("Hans", "Muster", 12345), "Adresse für Abgabe der Hausarbeit"));
        servicePoint.insert(new Paar<Student, String>(new Student("Peter", "Muster", 12346), "Wo ist Janracer"));
        servicePoint.insert(new Paar<Student, String>(new Student("Jan", "Racer", 12347), "Kann ich kostenlos Bücher ausleihen"));
        servicePoint.insert(new Paar<Student, String>(new Student("Peter", "Pan", 12348), "Adresse für Abgabe der Hausarbeit"));

        boxEvent.insert(new Paar<Boxer, Boxer>(new Boxer("Hans", "Muster", 12345), new Boxer("Peter", "Muster", 12346)));
        boxEvent.insert(new Paar<Boxer, Boxer>(new Boxer("Jan", "Racer", 12347), new Boxer("Peter", "Pan", 12348)));
        boxEvent.insert(new Paar<Boxer, Boxer>(new Boxer("Hans", "Muster", 12345), new Boxer("Peter", "Pan", 12348)));

        for (int i = 0; i < servicePoint.capacity(); i++) {
            System.out.print(servicePoint.remove().toString() + "\n");
        }
        for (int i = 0; i < boxEvent.capacity(); i++) {
            System.out.print(boxEvent.remove().toString() + "\n");

        }
    }
}
