public class Urlaubs
{
    private String  ort;
    private int     preis;
    private boolean all;
    

    public Urlaubs(String newOrt, int newPreis, boolean newAll)
    {
        setOrt(newOrt);
        setPreis(newPreis);
        setAll(newAll);   
    }
        
    public void setOrt(String newOrt)
    {
        ort = newOrt;
    }
    
    public void setPreis(int newPreis)
    {
        preis = newPreis;
    }
    
    public void setAll(boolean newAll)
    {
        all = newAll;
    }
        
    public String getOrt()
    {
        return ort;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public boolean getAll()
    {
        return all;
    }
    
    public void printUrlaubs()
    {
        System.out.println("Der Ort ist " + ort + " , es kostet " + preis + " Euro und der AllInklusive ist: " + all);
    }
}