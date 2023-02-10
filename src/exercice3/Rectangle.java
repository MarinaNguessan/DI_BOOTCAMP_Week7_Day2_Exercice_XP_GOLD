package exercice3;

public class Rectangle {
	
	private int longeur;
    private int largeur;

    public Rectangle(int longeur, int largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(10,20);
        System.out.println(rectangle1);
    }

	}


