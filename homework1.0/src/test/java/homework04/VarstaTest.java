package homework04;

import homework04.treeSet.Persoana;
import homework04.treeSet.Varsta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VarstaTest {

    @Test
    void compare_and_equal() {
        Persoana p1 = new Persoana("Ana", 22);
        Persoana p2 = new Persoana("Anca", 22);
        Varsta v = new Varsta();
        v.compare(p1, p2);
        assertEquals(22,22);
    }

    @Test
    void compare_and_higher() {
        Persoana p1 = new Persoana("Ana", 22);
        Persoana p2 = new Persoana("Anca", 24);
        Varsta v = new Varsta();
        v.compare(p1, p2);
        assertEquals(1,v.compare(p2, p1));
    }

    @Test
    void compare_and_lower() {
        Persoana p1 = new Persoana("Ana", 24);
        Persoana p2 = new Persoana("Anca", 22);
        Varsta v = new Varsta();
        v.compare(p1, p2);
        assertEquals(1,v.compare(p1, p2));
    }

    @Test
    void compare_and_null() {
        Persoana p1 = new Persoana("Ana", 24);
        Persoana p2 = new Persoana("Anca", 22);
        Varsta v = new Varsta();
        v.compare(p1, p2);
        assertNull(null);
    }

}