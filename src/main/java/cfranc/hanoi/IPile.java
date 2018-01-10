package cfranc.hanoi;

public interface IPile<T> {
	  boolean empiler(T o) ; //Ajoute un nouvel élément en haut de pile
	  T depiler() ; //Retire l'élément au sommet de la pile
	  T sommet() ; //Retourne l'élément situé au sommet, sans le retirer
	  boolean estVide() ; //Teste si la pile est vide
	  boolean estPleine() ; //Teste si la pile est pleine
	  int taille() ; //Retourne le nombre d'éléments se trouvant dans la pile
	  int diam(); //Retourne le diametre de l'élément situé au sommet
}
