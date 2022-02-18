package Kursverwaltung;

import java.util.ArrayList;
import java.util.Iterator;

public class VerwaltungsFeature {

  public static VerwaltungsFeature verwaltungsFeature;

  private VerwaltungsFeature() {}

  public static VerwaltungsFeature activateVerwaltungsFeature() {
    if (verwaltungsFeature == null) {
      verwaltungsFeature = new VerwaltungsFeature();
    }
    return verwaltungsFeature;
  }

  public void addKurse(ArrayList listeKurse, Kurse kurs) {
    listeKurse.add(kurs);
  }

  public void addKurse(ArrayList listeKurse, ArrayList kurse) {
    Iterator itr = kurse.iterator();
    while (itr.hasNext()) {
      Object temp = itr.next();
      if (temp instanceof Kurse) {
        listeKurse.add(temp);
      }
    }
  }

  public void deleteKurse(ArrayList listeKurse, int pos) {
    listeKurse.remove(pos);
  }

  public void addTeilnehmer(ArrayList listeTeilnehmer, Teilnehmer teilnehmer) {
    listeTeilnehmer.add(teilnehmer);
  }

  public void deleteTeilnehmer(ArrayList listeTeilnehmer, int pos) {
    listeTeilnehmer.remove(pos);
  }

  public void binAktiv() {
      System.out.println("Bin hochgefahren!");
  }


}
