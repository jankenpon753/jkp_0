#include <iostream>
using namespace std;
class Employee
{
public:
    int a;
    Employee()
    {
        cout << "Constructor Invoked" << endl;
    }
    ~Employee()
    {
        cout << "destr" << endl;
    };
};
int main(void)
{
    Employee e1;
    Employee e2;
    e1.a = 5;
    cout << e1.a << endl;
    return 0;
}