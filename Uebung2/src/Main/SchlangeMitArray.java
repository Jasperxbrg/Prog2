package Main;

import java.util.NoSuchElementException;

public class SchlangeMitArray<T> implements Schlange<T> {
    private final T[] array;
    private int startIndex;
    private int endIndex;

    public SchlangeMitArray(int maxGroesse) {
        array = (T[]) new Object[maxGroesse];

        startIndex = 0;
        endIndex = 0;
    }

    @Override
    public boolean isEmpty() {
        return startIndex == endIndex;
    }

    @Override
    public int size() {
        return endIndex - startIndex;
    }

    @Override
    public int capacity() {
        return array.length;
    }




    public void insert(T element) throws IllegalStateException {
        if (size() == capacity()) {
            throw new IllegalStateException();
        }
        array[endIndex] = element;
        endIndex++;
    }


    public T remove() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T element = array[startIndex];
        startIndex++;
        return element;
    }


    public T front() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return array[startIndex];
    }
}
