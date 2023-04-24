package Main;

import java.util.NoSuchElementException;

public interface Puffer<T> {
    boolean isEmpty();
    int size();
    int capacity();
    void insert(T element) throws IllegalStateException;
    T remove() throws NoSuchElementException;

}


