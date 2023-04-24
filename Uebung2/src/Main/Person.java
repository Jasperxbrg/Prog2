package Main;

public abstract class Person {
    String vorname;
    String name;

            
    public Person(String vorname,String name){
        this.vorname = vorname;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getname() {
        return name;
    }

    @Override
    public String toString() {
        return vorname + ", " + name;
    }
}
