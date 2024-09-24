#include <stdio.h>
#include <math.h>

double triples[3][3];
double sideA, sideB, hyp;

void inputTwoSides(double sideA, double sideB, int rowIndex)
{
    triples[rowIndex][0] = sideA;
    triples[rowIndex][1] = sqrt(pow(sideA, 2) + pow(sideB, 2));
    triples[rowIndex][2] = sideB;
}

void inputOneSideAndHyp(double sideA, double hyp, int rowIndex)
{
    triples[rowIndex][0] = sideA;
    triples[rowIndex][1] = sqrt(pow(hyp, 2) - pow(sideA, 2));
    triples[rowIndex][2] = hyp;
}

void triplePythagorean()
{
    for (int i = 0; i < 3; i++)
    {
        printf("PythTripleWithC [");
        for (int j = 0; j < 3; j++)
        {
            if (j == 0)
            {
                printf("sideA = ");
            }
            if (j == 1)
            {
                printf(", sideB = ");
            }
            if (j == 2)
            {
                printf(", hyp = ");
            }
            printf("%5.3f", triples[i][j]);
        }
        printf("]");
        printf("\n");
    }
}

int main()
{
    inputOneSideAndHyp(3, 5, 0);
    inputOneSideAndHyp(1, sqrt(2), 1);
    inputTwoSides(2, 3, 2);
    triplePythagorean();
    return 0;
}