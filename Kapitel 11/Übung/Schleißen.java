
/**
 * Beschreiben Sie hier die Klasse Schleißen.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

import javax.swing.*;
import java.awt.event.*;

public class Schleißen extends WindowAdapter
{
  
 
  public void windowClosing()
   {
       System.out.println("Aufräumen");
   }
}
