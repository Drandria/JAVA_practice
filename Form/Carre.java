public class Carre extends Forme2D 
{
    private double cote;
    
    public Carre(double cote)
    {
        this.cote = cote;
    }

    public double surface()
    {
        return cote * cote;
    }

    public double perimetre()
    {
        return 4 * cote;
    }

    public void dessiner()
    {
        System.out.println("Dessiner un carre");
    }
}
