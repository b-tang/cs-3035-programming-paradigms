#include <stdio.h>
#include <math.h>
#include "PythTriples.h"

struct PythTriples triples[3];

void inputTwoSides(double sideA, double sideB, int rowIndex)
{
    triples[rowIndex].sideA = sideA;
    triples[rowIndex].sideB = sideB;
    triples[rowIndex].hyp = sqrt(pow(sideA, 2) + pow(sideB, 2));
    
}

void inputOneSideAndHyp(double sideA, double hyp, int rowIndex)
{
    triples[rowIndex].sideA = sideA;
    triples[rowIndex].hyp = hyp;
    triples[rowIndex].sideB = sqrt(pow(hyp, 2) - pow(sideA, 2));
    
}

void triplePythagorean(int rowIndex) 
{
    printf("PythTripleWithC [sideA= %.3f, sideB= %.3f, hyp= %.3f]\n", triples[rowIndex].sideA, triples[rowIndex].sideB, triples[rowIndex].hyp);
}

int main()
{
    inputOneSideAndHyp(3, 5, 0);
    inputOneSideAndHyp(1, sqrt(2), 1);
    inputTwoSides(2, 3, 2);
    for (int i = 0; i <= 2; i++) {
        triplePythagorean(i);
    }
    return 0;
}

// void triplePythagorean()
// {
//     for (int i = 0; i < 3; i++)
//     {
//         printf("PythTripleWithC [");
//         for (int j = 0; j < 3; j++)
//         {
//             if (j == 0)
//             {
//                 printf("sideA = ");
//             }
//             if (j == 1)
//             {
//                 printf(", sideB = ");
//             }
//             if (j == 2)
//             {
//                 printf(", hyp = ");
//             }
//             printf("%5.3f", triples[i]);
//         }
//         printf("]");
//         printf("\n");
//     }
// }