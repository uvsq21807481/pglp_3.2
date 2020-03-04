package fr.uvsq21807481;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {

  @Test
  public void testCreationManage() {
    Manager m = new Manager(8);
    assertEquals(8, m.getTailleEquipe());
  }

  @Test
  public void testSalaire() {
    Manager m = new Manager(10);
    assertEquals(2500, m.salaire());
  }
}
