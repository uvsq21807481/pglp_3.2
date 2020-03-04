package fr.uvsq21807481;

public class Employe {

  private int salaire;
  private int anciennete;

  public Employe() {
    this.salaire = 1500;
    this.anciennete = 0;
  }

  public void ancien() {
    this.anciennete++;
  }

  public int salaire() {
    return salaire + 20 * anciennete;
  }

  public int getAnciennete() {
    return this.anciennete;
  }
}
