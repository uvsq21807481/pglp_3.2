package fr.uvsq21807481;

public class Manager extends Employe {

  private int tailleEquipe;

  public Manager(int equipe) {
    super();
    this.tailleEquipe = equipe;
  }

  @Override
  public int salaire() {
    return super.salaire() + 100 * tailleEquipe;
  }

  public int getTailleEquipe() {
    return this.tailleEquipe;
  }
}
