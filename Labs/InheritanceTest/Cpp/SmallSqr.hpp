class SmallSqr : public Rectangle, public Square
{
public:
    void smallPrint()
    {
        cout << endl
             << "multiple" << endl;
        printCheck();
        printSmall();
        printSSmall();
    }
};