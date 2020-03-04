package fr.uvsq21807481;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestVendeur {

    @Test
    public void testCreationVendeur(){
        Vendeur v = new Vendeur(400);
        assertEquals(400, v.getCommission());
    }

    @Test
    public void testSalaire(){
        Vendeur v = new Vendeur(500);
        assertEquals(2000, v.salaire());
    }
}
