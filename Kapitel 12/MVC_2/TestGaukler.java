public class TestGaukler
{
    public static void main(String[] args)
    {
        Gaukler merlin = new Gaukler();
        Zuschauer zuschauer = new ZuschauerImpl();
        zuschauer.setGaukler(merlin);
        merlin.jongliere();
    }
}