package Main;

import java.util.NoSuchElementException;

public class StapelMitArray<T> implements Stapel<T>{

    private final T[] array;
    public int topIndex;

    public StapelMitArray(int size){
        array = (T[]) new Object[size];
        topIndex = -1;

    }
    @Override
    public boolean isEmpty() {
        if(topIndex == -1){
            return true;

        }
        else{
            return false;
        }
    }

    @Override
    public int size() {
        return topIndex + 1;
    }

    @Override
    public int capacity() {
        return array.length;
    }


    public void insert(T element) throws IllegalStateException {
        if (size() == capacity()) {
            throw new IllegalStateException();
        }
        topIndex++;
        array[topIndex] = element;
    }


    @Override
    public T remove() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T element = array[topIndex];
        topIndex--;
        return element;
    }

    @Override
    public T top() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return array[topIndex];
    }

    public void applyToAll(Funktion f) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (T) f.auswerten(array[i]);
        }
    }





}
