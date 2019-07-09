
public class TongDuongCheo {
    public static void main(String[] args) {
        double matrix[][] = new double[3][3];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = Math.floor(Math.random() * 15);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        double Tog = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                Tog += matrix[row][row];
            }
        }
        System.out.println("Tong la :" +Tog);
    }
}