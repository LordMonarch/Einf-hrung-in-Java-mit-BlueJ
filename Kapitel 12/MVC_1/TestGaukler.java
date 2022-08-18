
/**
 * Beschreiben Sie hier die Klasse TestGaukler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class TestGaukler
{
  public static void main(String[] args)
  {
      Gaukler merlin = new Gaukler();
      Zuschauer zuschauer = new ZuschauerImpl();
      merlin.addZuschauer(zuschauer);
      merlin.jongliere();
  }
}
