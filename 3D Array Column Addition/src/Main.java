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

        // Calculate and print row sums
        int[] rowSums = new int[3];
        int[] colSums = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSums[i] += ticTac[i][j];  // Sum each row
                colSums[j] += ticTac[i][j];  // Sum each column
            }
        }

        // Print the grid with row sums
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ticTac[i][j] + "\t"); // Print grid value
            }
            System.out.println("= " + rowSums[i]);  // Print row sum
        }

        // Print separator for column sums
        System.out.println("=   =   =");

        // Print the column sums
        for (int j = 0; j < 3; j++) {
            System.out.print(colSums[j] + "\t");  // Print column sum
        }
    }
}