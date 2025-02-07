public class Main 
{
    public static void main(String[] args) 
    {
        Forme2D c = new Cercle(6);
        Forme2D ca = new Carre(7);
        System.out.println("Surface du cercle: " + c.surface());
        System.out.println("Perimetre du cercle: " + c.perimetre());
        c.dessiner();
        System.out.println("Surface du carre: " + ca.surface());
        System.out.println("Perimetre du carre: " + ca.perimetre());
        ca.dessiner();
    }
}