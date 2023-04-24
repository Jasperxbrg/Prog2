package Main;

public class Main {
    public static void main(String[] args) {
        StapelMitArray<Integer> s = new StapelMitArray<Integer>(4);
        s.insert(3);
        s.insert(4);
        System.out.print("\n__________________________\n");
        System.out.print("\n__________________________\n");
        System.out.print(s.top());
        System.out.print("\n__________________________\n");
        s.remove();
        System.out.print(s.top());
        System.out.print("\n__________________________\n");


    }
}