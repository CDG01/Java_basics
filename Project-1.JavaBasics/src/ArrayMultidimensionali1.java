/* CONSEGNA:
 Scrivere un programma che contenga un metodo che permette di inizializzare
 una matrice riempita con dei valori a vostro piacimento e restituisca la somma
 degli elementi sulla prima riga
 */

/*
 lo risolvo parametrizzando "i valori a piacimento" e le dimensioni della matrice
 */


import java.util.Arrays;

public class ArrayMultidimensionali1 {
    public static void main(String[] args) {
        int[] myElements = {1, 3, 3, 4, 5, 5, 7, 8, 8, 10, 11, 11}; //array di lunghezza arbitraria contenete gli elementi scelti della matrice, supposti integers
        int columns = 3; // numero di colonne scelte che dovrà avere la matrice

        createMatrixAndSumFirtRowElements(myElements,columns);
    }


    public static void createMatrixAndSumFirtRowElements(int[] myElements, int columns) {
        int rows = (myElements.length/columns);
        if (myElements.length % columns != 0 ) { // caso in cui la matrice non è fattibile
            System.out.println("Error:" + myElements.length + "are not enougth for creating a matrix" + rows + "x" + columns);
        } else {
            // inizializzo la matrice (richiesto esplicitamente dalla consegna) e calcolo la somma della prima riga
            int[][] matrix = new int[rows][columns];
            int k=0;

            int sumFirstRowElemnts = 0;
            for (int i=0; i<rows; i++){
                for (int j=0; j<columns; j++){
                    matrix[i][j] = myElements[k];

                    if (i==0) {
                        sumFirstRowElemnts += myElements[k];
                    }

                    k++;
                }
            }

            System.out.println("It's possibile a matrix "+ rows + "x" + columns+ " using elements" + Arrays.toString(myElements) +":");
            System.out.println(Arrays.deepToString(matrix) );
            System.out.println("The sum of the elements on the first row is " + sumFirstRowElemnts);
        }
    }
}


