class Rectangle : public virtual Quadrangle
{
private:
    string name = "I am a rectangle";

private:
    string sideSize = "Each two sides are equal";

public:
    void printSmall()
    {
        printMain();
        printCheck();
        cout << name << endl;
        cout << sideSize << endl
             << endl;
    }
};