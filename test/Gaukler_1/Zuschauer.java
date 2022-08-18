/**
 * Definiert das Interface Zuschauer
 * 
 * @author      Florian 
 * @version     Kapitel 10
 */

public interface Zuschauer 
{
    /**
     * Methode wird aufgerufen, wenn der Gaukler eine Aktion beendet hat. 
     * @param aktion Die gerade beendetet Aktion
     */
    void update(Object aktion);
}