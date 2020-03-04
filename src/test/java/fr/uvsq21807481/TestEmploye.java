package uvsq21807481;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestEmploye {

    @Test
    public void testCreationEmploye(){
        Employe e = new Employe();
        assertEquals(1500, e.salaire());
    }

    @Test
    public void testAnciennete(){
        Employe e = new Employe();
        e.ancien();
        assertEquals(1, e.getAnciennete());
    }

    @Test
    public void testSalaire(){
        Employe e = new Employe();
        e.ancien();
        assertEquals(1520, e.salaire());
    }
}
