/* CONSEGNA:
Scrivere un programma che contenga un metodo che permette di inizializzare una matrice
e di scambiare le sue righe e le sue colonne stampandola a video.
*/


import java.util.Arrays;

public class ArrayMultidimensionali2 {
    public static void main(String[] args) {

        // valori arbitrari
        int[] myElements = {1, 3, 3, 4, 5, 5, 7, 8, 8, 10, 11, 11}; //array contenete gli elementi scelti da inserire nella matrice, supposti integers
        int columns = 3; // numero di colonne scelte che dovrà avere la matrice


        // controllo fattibilità matrice
        int rows = (myElements.length/columns);
        if (myElements.length % columns != 0 ) { // caso in cui la matrice non è fattibile
            System.out.println("Error:" + myElements.length + "are not enougth for creating a matrix" + rows + "x" + columns);
        } else {
            System.out.println("It's possibile a matrix "+ rows + "x" + columns+ " using elements" + Arrays.toString(myElements) +":");
            System.out.println("Matrix "+ Arrays.deepToString(createMatrix(myElements,columns)));
            System.out.println("Matrix "+ Arrays.deepToString(createTrasposedMatrix(createMatrix(myElements,columns))));

        }
    }

    public static int[][] createMatrix(int[] myElements, int columns) {
        int rows = (myElements.length/columns);
        int[][] matrix = new int[rows][columns];
        int k=0;

        for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                matrix[i][j] = myElements[k];
                k++;
            }
        }
        return matrix;
    }

    public static int[][] createTrasposedMatrix(int[][] matrix) {
        int[][] trasposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                trasposedMatrix[j][i] = matrix[i][j];
            }
        }
        return trasposedMatrix;
    }
}