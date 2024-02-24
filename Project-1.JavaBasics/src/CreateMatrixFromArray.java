/* CONSEGNA:
 Scrivere un programma che contenga un metodo che stampi
 una matrice riempita con dei valori di un array dati in input
 */


import java.util.Arrays;

public class CreateMatrixFromArray {
    public static void main(String[] args) {
        int[] myElements = {1, 3, 3, 4, 5, 5, 7, 8, 8, 10, 11, 11}; //array di lunghezza arbitraria contenete gli elementi scelti della matrice, supposti integers
        int columns = 3; // numero di colonne scelte che dovrà avere la matrice

        createMatrix(myElements,columns);

    }

    public static void createMatrix(int[] myElements, int columns) {
        int rows = (myElements.length/columns);
        if (myElements.length % columns != 0 ) { // caso in cui la matrice non è fattibile
            System.out.println("Error:" + myElements.length + "are not enougth for creating a matrix" + rows + "x" + columns);
        } else {
            int[][] matrix = new int[rows][columns];
            int k=0;

            for (int i=0; i<rows; i++){
                for (int j=0; j<columns; j++){
                    matrix[i][j] = myElements[k];
                    k++;
                }
            }
            System.out.println("It's possibile a matrix "+ rows + "x" + columns+ " using elements " + Arrays.toString(myElements) + ':');
            System.out.println(Arrays.deepToString(matrix) );
        }
    }
}
