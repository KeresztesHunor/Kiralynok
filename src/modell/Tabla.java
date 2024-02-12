package modell;

public class Tabla
{
    private char[][] t;
    private char uresCella;
    
    public Tabla(char uresCella)
    {
        this.uresCella = uresCella;
        t = new char[8][8];
        for (int x = 0; x < t.length; x++)
        {
            for (int y = 0; y < t[x].length; y++)
            {
                t[x][y] = uresCella;
            }
        }
    }
    
    public int uresOszlopokSzama()
    {
        return 0;
    }
    
    public int uresSorokSzama()
    {
        return 0;
    }
    
    public void elhelyez()
    {
        
    }
    
    public void fajlbaIr()
    {
        
    }
    
    public void megjelenit()
    {
        
    }
}
