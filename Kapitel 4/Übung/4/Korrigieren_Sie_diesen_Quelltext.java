
public class Korrigieren_Sie_diesen_Quelltext
{
  static public void main(String[] args){
      String text = "Hallo ";
      String _name = "Leser";
      
      int kapitel = 4;
      text += _name + "!\n" + "Sie haben sich ";
      text += "" + "entschieden, \'Java\' zu lernen";
      text += "\nSie sind bei Kapitel " + kapitel;
      text = text + "\n\nViel Spaß noch!";
      System.out.println(text);
    }
}
