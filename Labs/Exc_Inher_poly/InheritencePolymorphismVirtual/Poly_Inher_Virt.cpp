#include <bits/stdc++.h>
using namespace std;
class Shape // main base/parent class, also an abstract class
{
private:
    string name = "Shape";

protected:
    int position = 0;

public:
    int size = 10;
    virtual void prntInfo() = 0; // pure virtual funtion (declared = 0), no body in this class, body implemented in derived class
};
class Circle : public virtual Shape // 1st derived class from base(Shape), single level inheritence
// virtual is used to remove ambiguity in case of multiple inheritence, implemented later on
{
private:
    string name = "Circle";

public:
    int size = 15;
    void prntInfo()
    {
        cout << name << " " + position << " " << size << endl;
    }
};
class Rectangle : public virtual Shape // 2nd derived class from base(Shape), multilevel or hierarchical inheritence
{
private:
    string name = "Rectangle";

public:
    int size = 20;
    void prntInfo()
    {
        cout << name << " " << position << " " << size << endl;
    }
};
class HybridShape : public Circle, public Rectangle
{
private:
    string name = "Hybrid";

public:
    int size = 25;
    void prntInfo()
    {
        cout << name << " " << position << " " << size << endl;
    }
};
int main()
{
    Circle cr;
    Rectangle rc;
    cr.prntInfo();
    rc.prntInfo();
    HybridShape hb;
    hb.prntInfo();
}
