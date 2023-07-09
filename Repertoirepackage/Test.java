import Repertoirepackage.*;

public class Test {

    public static void main(String[] args) {

        Repertoire rep = new Repertoire("Répertoire 0");
        Repertoire rep1 = new Repertoire("Répertoire 1");
        Repertoire rep2 = new Repertoire("Répertoire 2");
        Repertoire rep3 = new Repertoire("Répertoire 3");

        Fichier fichier1 = new Fichier("Fichier 1");
        Fichier fichier2 = new Fichier("Fichier 2");
        Fichier fichier3 = new Fichier("Fichier 3");
        Fichier fichier4 = new Fichier("Fichier 4");

        rep.ajoutElement(rep1);
        rep.ajoutElement(rep3);

        rep1.ajoutElement(rep2);

        rep1.ajoutElement(fichier1);
        rep1.ajoutElement(fichier2);

        rep3.ajoutElement(fichier3);
        rep3.ajoutElement(fichier4);

        rep.afficherElement();

    }
}