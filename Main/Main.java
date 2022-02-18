package Main;

import java.util.ArrayList;

import Kursverwaltung.*;

public class Main {

  public static void main(String[] args) {
    VerwaltungsFeature feature = VerwaltungsFeature.activateVerwaltungsFeature();
    Kursverwaltung verwaltung = Kursverwaltung.createKursverwaltung();
    Kurse deutsch = new Kurse("Deutsch", "4b", "Herr Deutschlehrer");
    Kurse english = new Kurse("English", "2a", "Mr. Beans");
    Teilnehmer hans = new Teilnehmer(01, "Hans", "Wurst");
    Teilnehmer peter = new Teilnehmer(02, "Peter", "Radieschen");
    Teilnehmer max = new Teilnehmer(03, "Max", "Mustermann");
    feature.addKurse(hans.getListeKurse(), deutsch);
    feature.addKurse(hans.getListeKurse(), english);
    // System.out.println(hans.getListeKurse());
    // feature.addTeilnehmer(deutsch.getListeTeilnehmer(), hans);
    // System.out.println(deutsch.getListeTeilnehmer());
    
    feature.addTeilnehmer(verwaltung.getListeTeilnehmer(), hans);
    feature.addTeilnehmer(verwaltung.getListeTeilnehmer(), peter);
    feature.addTeilnehmer(verwaltung.getListeTeilnehmer(), max);

    System.out.println(verwaltung.getListeTeilnehmer());

    verwaltung.sucheTeilnehmer(03);
  }
}
