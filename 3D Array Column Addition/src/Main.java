public class Main
{
    public static void main(String[] args)
    {
        int ticTac[][] = new int[3][3];

        int counter = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ticTac[i][j] = counter;
                counter++;
            }
        }

        
        int[] rowSums = new int[3];
        int[] colSums = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSums[i] += ticTac[i][j];  
                colSums[j] += ticTac[i][j];  
            }
        }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ticTac[i][j] + "    "); 
            }
            System.out.println("=   " + rowSums[i]);  
        }

        
        System.out.println("=    =    =");

        
        for (int j = 0; j < 3; j++) {
            System.out.print(colSums[j] + "   ");  
        }
    }
}
