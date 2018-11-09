package exercise3;

public class Rectangle extends ConvexPolygon {
	protected Point upperLeft;
	protected Point lowerRight;
	public Rectangle(Point upperLeft, Point lowerRight){
		super(new Point[]{upperLeft,
			new Point(lowerRight.getX(), upperLeft.getY()),
			lowerRight,
			new Point(upperLeft.getX(), lowerRight.getY())});
		//décortiquons la ligne au dessus :
		//super : appeller la méthode de construction de la classe mère (ici ConvexPolygon donc)
		//il faut ABSOLUMENT que çà soit le premier élément de la fonction !
		//puis il faut faire passer un tableau de points à ce constructeur (pour rappel on cosntruit un polygone sur base de ses sommets)
		//ce que je fais ici en construisant direct le tableau dans l'argument de la fonction
		//car super doit toujours être la premièer ligne !
		//aussi il faut faire ce super car il faut remplri les attributs private de la classe parent
		//+comme pas de constructeur par défaut, il faut ceci !
		this.upperLeft=upperLeft;
		this.lowerRight=lowerRight;
	}

}
