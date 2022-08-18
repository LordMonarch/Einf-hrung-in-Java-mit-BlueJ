public class zahlendreieck2
{
    public static void main(String[] args)
    {
        int[][] dreieck = new int[5][5];
        
        dreieck[0][2] = 1;
        dreieck[1][1] = 1;
        dreieck[1][2] = 2;
        dreieck[1][3] = 1;
        dreieck[2][1] = 1;
        dreieck[2][2] = 3;
        dreieck[2][3] = 3;
        dreieck[2][4] = 1;
        dreieck[3][0] = 1;
        dreieck[3][1] = 4;
        dreieck[3][2] = 6;
        dreieck[3][3] = 4;
        dreieck[3][4] = 1;
        
          System.out.println(dreieck[0][2]);
        System.out.print(dreieck[1][1]); System.out.print(dreieck[1][2]); System.out.println(dreieck[1][3]);
        System.out.print(dreieck[2][1]);System.out.print(dreieck[2][2]);System.out.print(dreieck[2][3]);System.out.println(dreieck[2][4]);
        System.out.print(dreieck[3][0]);System.out.print(dreieck[3][1]);System.out.print(dreieck[3][2]);System.out.print(dreieck[3][3]);System.out.println(dreieck[3][4]);
        
    }
}