package fr.uvsq21807481;

public class Manager extends Employe {

  private int tailleEquipe;

  public Manager(final int teamSize) {
    super();
    this.tailleEquipe = teamSize;
  }

  @Override
  public int salaire() {
    return super.salaire() + 100 * tailleEquipe;
  }

  public int getTailleEquipe() {
    return this.tailleEquipe;
  }
}
