package Kursverwaltung;

import java.util.ArrayList;

public class Kurse {

  private String thema;
  private String raum;
  private String dozenten;
  private ArrayList listeTeilnehmer;

  public Kurse(String thema, String raum, String dozenten) {
    this.thema = thema;
    this.raum = raum;
    this.dozenten = dozenten;
    this.listeTeilnehmer = new ArrayList();
  }

  @Override
  public String toString() {
    return (
      "Kurse [dozenten=" +
      dozenten +
      ", raum=" +
      raum +
      ", thema=" +
      thema +
      "]"
    );
  }

  public String getThema() {
    return thema;
  }

  public void setThema(String thema) {
    this.thema = thema;
  }

  public String getRaum() {
    return raum;
  }

  public void setRaum(String raum) {
    this.raum = raum;
  }

  public String getDozenten() {
    return dozenten;
  }

  public void setDozenten(String dozenten) {
    this.dozenten = dozenten;
  }

  public ArrayList getListeTeilnehmer() {
    return listeTeilnehmer;
  }
}
