package kiralynok;

import modell.Tabla;
import view.ViewGUI;

public class Kiralynok
{
    public static void main(String[] args)
    {
        Tabla tabla = new Tabla('#');
        tabla.elhelyez(8);
        new ViewGUI().megjelenit(tabla.getT(), tabla.uresSorokSzama(), tabla.uresOszlopokSzama());
        Tabla.fajlbaIr();
    }
}
