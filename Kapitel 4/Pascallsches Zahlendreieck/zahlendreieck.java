public class zahlendreieck
{
    public static void main(String[] args)
    {
        int[][] dreieck =
        {
            {0,0,1,0,0},
            {0,1,2,1,0},
            {0,1,3,3,1},
            {1,4,6,4,1}
        };
        
        System.out.println(dreieck[0][2]);
        System.out.print(dreieck[1][1]); System.out.print(dreieck[1][2]); System.out.println(dreieck[1][3]);
        System.out.print(dreieck[2][1]);System.out.print(dreieck[2][2]);System.out.print(dreieck[2][3]);System.out.println(dreieck[2][4]);
        System.out.print(dreieck[3][0]);System.out.print(dreieck[3][1]);System.out.print(dreieck[3][2]);System.out.print(dreieck[3][3]);System.out.println(dreieck[3][4]);
    }
}