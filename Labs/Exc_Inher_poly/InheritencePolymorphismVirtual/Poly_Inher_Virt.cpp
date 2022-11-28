#include <bits/stdc++.h>
using namespace std;
class Shape
{
private:
    string name = "Shape";

protected:
    int position = 0;

public:
    int size = 10;
    virtual void prntInfo() = 0;
};

class Circle : public Shape
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

class Rectangle : public Shape
{
private:
    string name = "Rectangle";

public:
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
}
