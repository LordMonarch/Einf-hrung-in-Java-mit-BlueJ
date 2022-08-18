/**
 * Die Klasse Professor definiert Attribute und Methode eines Professors der Hochschule 
 * 
 * @author      Florian 
 * @version     Kapitel 9
 */
public class Professor extends Mitarbeiter 
{ 
    /**
     * Der Fachbereich des Professors 
     */
    private String fachbereich = new String(); 
  
    /**
     * Setzt den Fachbereich 
     * @param String Der Fachbereich 
     */
    public void setFachbereich(String fachbereich)
    {
        this.fachbereich = fachbereich;
    }
    
    /**
     * Gibt den Fachbereich des Professors zurück
     * @return Fachbereich des Professors
     */
    public String getFachbereich()
    {
        return fachbereich;
    }
}
