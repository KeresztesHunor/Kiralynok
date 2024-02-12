package modell;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tabla
{
    private final char[][] t;
    private final char uresCella;
    
    public Tabla(char uresCella)
    {
        this.uresCella = uresCella;
        t = new char[8][8];
        for (int y = 0; y < t.length; y++)
        {
            for (int x = 0; x < t[y].length; x++)
            {
                t[x][y] = uresCella;
            }
        }
    }
    
    public char[][] getT()
    {
        return t;
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
    
    public static void fajlbaIr()
    {
        List<String> sorok = new ArrayList<>();
        for (int i = 0; i < 64; i++)
        {
            Tabla tabla = new Tabla('*');
            tabla.elhelyez(i + 1);
            char[][] t = tabla.getT();
            String sor = "";
            for (int ii = 0; ii < t.length; ii++)
            {
                for (int iii = 0; iii < t[ii].length; iii++)
                {
                    sor += t[ii][iii];
                }
                sor += "\n";
            }
            sorok.add(sor);
        }
        Path path = Path.of("tablak64.txt");
        try
        {
            if (Files.exists(path))
            {
                Files.delete(path);
            }
            Files.write(path, sorok);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Tabla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean uresOszlop(int oszlopIndex)
    {
        return uresCella(x -> t[x][oszlopIndex]);
    }
    
    public boolean uresSor(int sorIndex)
    {
        return uresCella(y -> t[sorIndex][y]);
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
