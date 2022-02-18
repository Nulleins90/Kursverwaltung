package Kursverwaltung;

import java.util.ArrayList;

public class Teilnehmer {

  private int id;
  private String name;
  private String vorname;
  private String geschlecht;
  private ArrayList listeKurse;

  public Teilnehmer(int id, String vorname, String name) {
    this.id = id;
    this.vorname = vorname;
    this.name = name;
    this.listeKurse = new ArrayList();
  }

  public double getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  public String getGeschlecht() {
    return geschlecht;
  }

  public void setGeschlecht(String geschlecht) {
    switch (geschlecht) {
      case "m":
        this.geschlecht = "männlich";
        break;
      case "f":
        this.geschlecht = "weiblich";
        break;
      default:
        break;
    }
  }

  public ArrayList getListeKurse() {
    return listeKurse;
  }

  @Override
  public String toString() {
    return (
      "Teilnehmer [id=" +
      id +
      ", name=" +
      name +
      ", vorname=" +
      vorname +
      "]"
    );
  }
}
