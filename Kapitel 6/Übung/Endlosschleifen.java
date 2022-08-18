
/**
 * Beschreiben Sie hier die Klasse Endlosschleifen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Endlosschleifen
{
    public static void main(String[] args){
    int i = 0;
    while(true)
    {
        i++;
        if(i > 20)
        break;
        System.out.println("while ... " + i);
    }
    
    i = 0;
    do 
    {
        i++;
        if (i > 20)
        break;
        System.out.println("do - while ... " + i);
    }
    while(true);
    
    for (i = 0; true; i++)
    {
        if (i > 20)
        break;
        System.out.println("for ... " + i);
    }
    
}
}
