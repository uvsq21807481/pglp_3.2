package fr.uvsq21807481;

public class Vendeur extends Employe {

  private int salaire;
  private int anciennete;
  private int commission;

  public Vendeur(final int commission) {
    super();
    this.commission = commission;
  }

  @Override
  public int salaire() {
    return super.salaire() + commission;
  }

  public int getCommission() {
    return this.commission;
  }
}
