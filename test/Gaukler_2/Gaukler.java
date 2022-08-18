
/**
 * Modelliert einen Gaukler - in dieser Version werden die Java-eigenen Klassen verwendet
 * Die Dokumentation entnehmen Sie bitte dem Buch
 * 
 * @author      Florian 
 * @version     Kapitel 10
 */

import java.util.Observable;

public class Gaukler extends Observable
{ 
	public void jonglieren()
	{
		System.out.println("Ich habe jongliert");
		setChanged();
		notifyObservers();
	}
}