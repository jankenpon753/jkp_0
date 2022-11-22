#include <iostream>
#include <string.h>
using namespace std;

class Counter
{
private:
    int count;

public:
    Counter() {}
    Counter(int a) { count = a; }

    int get_count() { return count; }
    Counter operator+(Counter x)
    {
        Counter c;
        c.count = this->count + x.count;
        return (c);
    }
};
int main(void)
{
    Counter c1(2), c2(3), c3(1);
    c3 = c1 + c2;
    cout << "c3 = " << c3.get_count();
}
