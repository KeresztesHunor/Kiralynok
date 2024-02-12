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
    
    public void elhelyez(int n)
    {
        int mezokSzama = 64;
        int x = 0;
        while (n > 0 && x < t.length)
        {
            int y = 0;
            while (n > 0 && y < t[x].length)
            {
                if (Math.random() < (double)n / mezokSzama--)
                {
                    t[x][y] = 'K';
                    n--;
                }
                y++;
            }
            x++;
        }
    }
    
    public void fajlbaIr()
    {
        
    }
    
    public boolean uresOszlop(int oszlopIndex)
    {
        return ures(y -> t[oszlopIndex][y]);
    }
    
    public boolean uresSor(int sorIndex)
    {
        return ures(x -> t[x][sorIndex]);
    }
    
    private boolean ures(Cella cella)
    {
        int i = 0;
        while (i < t.length && cella.cellaErtek(i) == uresCella)
        {
            i++;
        }
        return i >= t.length;
    }
}
