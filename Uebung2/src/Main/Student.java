package Main;

public class Student extends Person{

    int mn;
    public Student(String vorname, String name, int mn) {
        super(vorname, name);
        this.mn = mn;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.mn;
    }
}
