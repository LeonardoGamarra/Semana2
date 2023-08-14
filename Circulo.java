public class Circulo
{
    private double x;
    private double y;
    private double r;
    public Circulo(double x, double y, double r)
    {
        this.x = validInput(x);
        this.y = validInput(y);
        this.r = validInput(r);
    }
    public void setLocation(double x, double y)
    {
        this.x = validInput(x);
        this.y = validInput(y);
    }
    public double getArea()
    {
        return (3.14 * Math.pow(r, 2));
    }
    public double getPerimeter()
    {
        return (2 * 3.14 * r);
    }
    public static double validInput(double n)
    {
        if (n >= 0)
            return n;
        else
            return 0;
    }
}