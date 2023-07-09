package Repertoirepackage;

public class Repertoire {
    private String nom; //stocke nom du répertoire
    private Object[] elements; //stocke les éléments (répertoires ou fichiers)
    private int nbElements; //stocke le nombre d'éléments dans le répertoire

    public Repertoire(String nom) {
        this.nom = nom;
        this.elements = new Object[10]; // Par exemple, initialisation avec une taille de 10
        this.nbElements = 0;
    }

    public void ajoutElement(Object element) { //cette méthode ajoute un ou des (répertoire ou fichier) au répertoire courant 
        elements[nbElements] = element;
        nbElements++;
    }

    public void afficherElement() { //cette méthode affiche les éléments du répertoire courant en faisant appelle à une méthode récursive
        afficherElementRecursive(this, 0);
    }

    private void afficherElementRecursive(Repertoire repertoire, int profondeur) {
        String indent = "\u2502   ".repeat(profondeur);
        String pre = indent + "\u251C\u2500\u2500\u2500";
    
        System.out.println(pre + repertoire.nom);
    
        for (int i = 0; i < repertoire.nbElements; i++) {
            Object element = repertoire.elements[i];
            if (element instanceof Repertoire) {
                afficherElementRecursive((Repertoire) element, profondeur + 1);
            } else if (element instanceof Fichier) {
                System.out.println(indent + "\u2502   \u2514\u2500\u2500\u2500" + ((Fichier) element).getNom());
            }
        }
    }
}
