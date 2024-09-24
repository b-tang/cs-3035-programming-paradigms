#include <stdio.h>

int main(void){

    // note the array declaration format is slightly different from Java
    int myInts[] = {0, 1, 2, 3, 4}; 

    // declare an int pointer called pi and set it to point to the beginning of the array
    // note that an array variable is a pointer to the beginning of the array
    int *pi = myInts;
    for (int counter = 0; counter < 5; counter++){
        /*
         * printf is also available in Java, but you may never have used it.
         * printf uses formatting codes like %p for pointer (addresses expressed in bytes in hexadecimal)
         * and %d for (decimal) int 
         */
        printf("Address %p: Value %d\n", pi, *pi);
        // incrementing a pointer changes it by the size of the type to which it points
        pi += 1;
    }

    // a)
    printf("a)\n");
    double myDoubles[] = {1.2, 33.3,22.331,1,62.0037}; 
    double * pi_double = myDoubles;
    for (int counter = 0; counter < 5; counter++) {
        printf("Address %p: Value: %f\n", pi_double, *pi_double);
        pi_double += 1;
    }

    // b)
    printf("b)\n");
    char myChars[] = {'J', 'o', 'h', 'n'}; 
    char * pi_char = myChars;
    for (int counter = 0; counter < 4; counter++) {
        printf("Address %p: Value: %c\n", pi_char, *pi_char);
        pi_char += 1;
    }

    // c)
    /*
     * We to know the size of int, double and char we can subtract the address of to consecutive pointers .
     * By that we will get the number of bits allocated for each data type.
     */
}