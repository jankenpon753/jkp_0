class Triangle : public GeoShape
{
private:
    string name = "Triangle";

protected:
    string largestAngle = "120";

protected:
    string totalSides = "There's three sides";

public:
    void printCheck()
    {
        printMain();
        cout << name << endl;
        cout << largestAngle << endl;
        cout << totalSides << endl;
        cout << centre << endl
             << endl;
    }
};