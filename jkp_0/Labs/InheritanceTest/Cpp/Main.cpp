#include <bits/stdc++.h>
#include "GeoShape.hpp"
#include "Quadrangle.hpp"
#include "Triangle.hpp"
#include "Square.hpp"
#include "Rectangle.hpp"
#include "SmallSqr.hpp"
using namespace std;
int main()
{
    Triangle tri1;
    Rectangle rect1;
    Square sqr1;
    SmallSqr smlsq;
    tri1.printCheck();
    rect1.printSmall();
    sqr1.printCheck();
    smlsq.smallPrint();
}