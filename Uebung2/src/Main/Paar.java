package Main;

public class Paar<E,Z> {
    private E e;
    private Z z;

    public Paar(E e, Z z) {
        this.e = e;
        this.z = z;
    }

    public E getE() {
        return e;
    }

    public Z getZ() {
        return z;
    }

    public E setE(E e) {
        E temp = this.e;
        this.e = e;
        return temp;
    }

    public Z setZ(Z z) {
        Z temp = this.z;
        this.z = z;
        return temp;
    }
    public void setbeide(E e, Z z) {
        this.e = e;
        this.z = z;
    }

    public boolean equals(Paar<E,Z> p) {
        return this.e.equals(p.getE()) && this.z.equals(p.getZ());
    }

    @Override
    public String toString() {
        return "(" + e.toString() + "," + z.toString() + ")";
    }
}

