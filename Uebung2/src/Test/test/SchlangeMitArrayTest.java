package Test.test;

import Main.*;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;


class SchlangeMitArrayTest {

    @Test
    public void InsertAndRemoveTestInteger(){
        SchlangeMitArray<Integer> queue = new SchlangeMitArray<Integer>(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        assertEquals(1, queue.remove());
        assertEquals(2, queue.remove());
        assertEquals(3, queue.remove());
        assertEquals(4, queue.remove());
        assertEquals(5, queue.remove());
    }
    @Test
    public void InsertAndRemoveTestString(){
        SchlangeMitArray<String> queue = new SchlangeMitArray<String>(5);
        queue.insert("1");
        queue.insert("2");
        queue.insert("3");
        queue.insert("4");
        queue.insert("5");
        assertEquals("1", queue.remove());
        assertEquals("2", queue.remove());
        assertEquals("3", queue.remove());
        assertEquals("4", queue.remove());
        assertEquals("5", queue.remove());
    }
    @Test
    public void InsertAndRemoveTestBoolean(){
        SchlangeMitArray<Boolean> queue = new SchlangeMitArray<Boolean>(5);
        queue.insert(true);
        queue.insert(false);
        queue.insert(true);
        queue.insert(false);
        queue.insert(true);
        assertEquals(true, queue.remove());
        assertEquals(false, queue.remove());
        assertEquals(true, queue.remove());
        assertEquals(false, queue.remove());
        assertEquals(true, queue.remove());
    }

    @Test
    public void InsertInFullQueueTestInteger(){
        SchlangeMitArray<Integer> queue = new SchlangeMitArray<Integer>(0);
        assertThrows(IllegalStateException.class,()->{queue.insert(1);});
    }

    @Test
    public void InsertInFullQueueTestString(){
        SchlangeMitArray<String> queue = new SchlangeMitArray<String>(0);
        assertThrows(IllegalStateException.class,()->{queue.insert("1");});
    }

    @Test
    public void InsertInFullQueueTestBoolean(){
        SchlangeMitArray<Boolean> queue = new SchlangeMitArray<Boolean>(0);
        assertThrows(IllegalStateException.class,()->{queue.insert(true);});
    }



    @Test
    public void RemoveFromEmptyQueueTestInteger(){
        SchlangeMitArray<Integer> queue = new SchlangeMitArray(0);
        assertThrows(NoSuchElementException.class,()->{queue.remove();});
    }

    @Test
    public void RemoveFromEmptyQueueTestString(){
        SchlangeMitArray<String> queue = new SchlangeMitArray(0);
        assertThrows(NoSuchElementException.class,()->{queue.remove();});
    }

    @Test public void RemoveFromEmptyQueueTestBoolean(){
        SchlangeMitArray<Boolean> queue = new SchlangeMitArray(0);
        assertThrows(NoSuchElementException.class,()->{queue.remove();});
    }

    @Test
    public void FrontFromEmptyQueueTestInteger(){
        SchlangeMitArray<Integer> queue = new SchlangeMitArray(0);
        assertThrows(NoSuchElementException.class,()->{queue.front();});
    }

    @Test
    public void FrontFromEmptyQueueTestString(){
        SchlangeMitArray<String> queue = new SchlangeMitArray(0);
        assertThrows(NoSuchElementException.class,()->{queue.front();});
    }
    @Test
    public  void FrontFromEmptyQueueTestBoolean(){
        SchlangeMitArray<Boolean> queue = new SchlangeMitArray(0);
        assertThrows(NoSuchElementException.class,()->{queue.front();});
    }



}