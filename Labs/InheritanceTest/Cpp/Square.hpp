class Square : public virtual Quadrangle
{
private:
    string name = "I am a square";

private:
    string sideSize = "All sides are equal";

public:
    void printSSmall()
    {
        printMain();
        printCheck();
        cout << name << endl;
        cout << sideSize << endl
             << endl;
    }
};