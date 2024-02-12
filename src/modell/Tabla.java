package modell;

public class Tabla
{
    private final char[][] t;
    private final char uresCella;
    
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
        return uresSorokVagyOszlopokSzama(x -> uresOszlop(x));
    }
    
    public int uresSorokSzama()
    {
        return uresSorokVagyOszlopokSzama(y -> uresSor(y));
    }
    
    private int uresSorokVagyOszlopokSzama(OszlopVagySor oszlopVagySor)
    {
        int db = 0;
        for (int i = 0; i < 8; i++)
        {
            if (oszlopVagySor.ures(i))
            {
                db++;
            }
        }
        return db;
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
        return uresCella(y -> t[oszlopIndex][y]);
    }
    
    public boolean uresSor(int sorIndex)
    {
        return uresCella(x -> t[x][sorIndex]);
    }
    
    private boolean uresCella(Cella cella)
    {
        int i = 0;
        while (i < 8 && cella.cellaErtek(i) == uresCella)
        {
            i++;
        }
        return i >= 8;
    }
}
