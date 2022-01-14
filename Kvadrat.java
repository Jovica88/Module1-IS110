
public class Kvadrat 
{
    public int lengde;
    public int bredde;

    public Kvadrat()
    {
        lengde = 5;
        bredde = 10;
    }
public int areal() {
    return lengde*bredde;
    
}
public int omkrets(int lengde, int bredde){
    return 2*lengde+2*bredde;
}
   
}
