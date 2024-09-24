#ifndef PythTriples_h
#define PythTriples_h

struct PythTriples {
    double sideA, sideB, hyp;
};

void inputOneSideAndHyp(double, double, int);
void inputTwoSides(double, double, int);
void triplePythagorean(int);

#endif