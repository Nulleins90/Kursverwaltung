package Kursverwaltung;

import java.util.Iterator;
import java.util.ArrayList;

public class Kursverwaltung{
    private static Kursverwaltung kursverwaltung;
    private ArrayList listeKurse;
    private ArrayList listeTeilnehmer;

    private Kursverwaltung() {
        this.listeKurse = new ArrayList();
        this.listeTeilnehmer = new ArrayList();
    }

    public static Kursverwaltung createKursverwaltung() {
		if(kursverwaltung==null) {
			kursverwaltung=new Kursverwaltung();
		}
		return kursverwaltung;
	}

    public void sucheTeilnehmer(int id) {
        Iterator it=listeTeilnehmer.iterator();
		
		while(it.hasNext()) {
			Object temp=it.next();
			if(temp instanceof Teilnehmer) {
                Teilnehmer temp2 = (Teilnehmer) temp;
				if(temp2.getId() == id) {
                    System.out.println(temp);
                }
			}
		}
    }

    public ArrayList getListeKurse() {
        return listeKurse;
    }

    public void setListeKurse(ArrayList listeKurse) {
        this.listeKurse = listeKurse;
    }

    public ArrayList getListeTeilnehmer() {
        return listeTeilnehmer;
    }

    public void setListeTeilnehmer(ArrayList listeTeilnehmer) {
        this.listeTeilnehmer = listeTeilnehmer;
    }

    
}
