package Test.test;
import Main.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.*;



class StapelMitArrayTest {

    @Test
    public void DoubleApplyToAllTest(){
        StapelMitArray<Integer> stack = new StapelMitArray<Integer>(5);
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        stack.insert(4);
        stack.insert(5);
        Funktion<Integer> doublefunction = x -> x*2;
        stack.applyToAll(doublefunction);
        assertEquals(10, stack.remove());
        assertEquals(8, stack.remove());
        assertEquals(6, stack.remove());
        assertEquals(4, stack.remove());
        assertEquals(2, stack.remove());
    }
    @Test
    public void QuadrupleApplyToAllTest(){
        StapelMitArray<Integer> stack = new StapelMitArray(5);
        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        stack.insert(4);
        stack.insert(5);
        Funktion<Integer> doublefunction = x -> x *4;
        stack.applyToAll(doublefunction);
        assertEquals(20, stack.remove());
        assertEquals(16, stack.remove());

        assertEquals(12, stack.remove());
        assertEquals(8, stack.remove());
        assertEquals(4, stack.remove());
    }
    @Test
    public void TestInsertAndRemoveInteger(){
        StapelMitArray<Integer> s = new StapelMitArray(3);
        s.insert(1);
        s.insert(2);
        s.insert(3);
        assertEquals(3,s.remove());
        assertEquals(2,s.remove());
        assertEquals(1,s.remove());

    }

    @Test
    public void TestInsertAndRemoveString(){
        StapelMitArray<String> s = new StapelMitArray(3);
        s.insert("1");
        s.insert("2");
        s.insert("3");
        assertEquals("3",s.remove());
        assertEquals("2",s.remove());
        assertEquals("1",s.remove());

    }
    @Test
    public void TestInsertAndRemoveBoolean(){
        StapelMitArray<Boolean> s = new StapelMitArray(3);
        s.insert(true);
        s.insert(false);
        s.insert(true);
        assertEquals(true,s.remove());
        assertEquals(false,s.remove());
        assertEquals(true,s.remove());

    }

    @Test
    public void TestInsertInFullStackInteger(){
        StapelMitArray<Integer> s = new StapelMitArray(0);
        assertThrows(IllegalStateException.class,()->{s.insert(1);});
    }

    @Test
    public void TestInsertInFullStackString(){
        StapelMitArray<String> s = new StapelMitArray(0);
        assertThrows(IllegalStateException.class,()->{s.insert("1");});
    }

    @Test
    public void TestInsertInFullStackBoolean(){
        StapelMitArray<Boolean> s = new StapelMitArray(0);
        assertThrows(IllegalStateException.class,()->{s.insert(true);});
    }

    @Test
    public void TestRemoveOnEmptyStackInteger(){
        StapelMitArray<Integer> s = new StapelMitArray(1);
        assertThrows(NoSuchElementException.class, ()-> {
            s.remove();
        });
    }
    @Test
    public void TestRemoveOnEmptyStackString(){
        StapelMitArray<String> s = new StapelMitArray(1);
        assertThrows(NoSuchElementException.class, ()-> {
            s.remove();
        });
    }
    @Test
    public void TestRemoveOnEmptyStackBoolean(){
        StapelMitArray<Boolean> s = new StapelMitArray(1);
        assertThrows(NoSuchElementException.class, ()-> {
            s.remove();
        });
    }
    @Test
    public void TestTopOnEmptyStackInteger(){
        StapelMitArray<Integer> s = new StapelMitArray(1);
        assertThrows(NoSuchElementException.class, ()-> {
            s.top();
        });
    }
    @Test
    public void TestTopOnEmptyStackString(){
        StapelMitArray<String> s = new StapelMitArray(1);
        assertThrows(NoSuchElementException.class, ()-> {
            s.top();
        });
    }
    @Test
    public void TestTopOnEmptyStackBoolean(){
        StapelMitArray<Boolean> s = new StapelMitArray(1);
        assertThrows(NoSuchElementException.class, ()-> {
            s.top();
        });
    }




}