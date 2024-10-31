/**
 * This class is designed to use non OOP techniques in a single class
 * 
 * @author Brian Tang, 400478452, CS 3035 - 01
 */
package pythex;

public class ImpPythTripEx {

    // Variables
    public static double sideA, sideB;
    public static double hyp;

    // 2D Array
    public static double [][] triples = new double [3][3];

    // Solves the hyp of a triangle, stores to array row accordingly of rowIndex
    public static void inputTwoSides(double sideA, double sideB, int rowIndex) {
        triples [rowIndex][0] = sideA;
        triples [rowIndex][1] = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
        triples [rowIndex][2] = sideB;
    }

    // Solves one side of a triangle, stores to array row accordingly of rowIndex
    public static void inputOneSideAndHyp(double sideA, double hyp, int rowIndex) {
        triples [rowIndex][0] = sideA;
        triples [rowIndex][1] = Math.sqrt(Math.pow (hyp, 2) - Math.pow (sideA, 2));
        triples [rowIndex][2] = hyp;
    }

    // Prints Triple Pyth Array
    public static void triplePythagorean() {
        for (int i=0; i<3; i++) {
            System.out.print("PythTriple [");
            for (int j = 0; j < 3; j++) {
                if (j == 0) {
                    System.out.print("sideA = ");
                } else if (j == 1) {
                    System.out.print(", sideB = ");
                } else if (j == 2) {
                    System.out.print(", hyp = ");
                }
                System.out.print(String.format("%5.3f", triples [i][j]) + "");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {

        // Tests all three methods with default values
        inputOneSideAndHyp(3, 5, 0);
        inputOneSideAndHyp(1, Math.sqrt(2), 1);
        inputTwoSides(2, 3, 2);

        // Prints the Array
        triplePythagorean();
    }
}
