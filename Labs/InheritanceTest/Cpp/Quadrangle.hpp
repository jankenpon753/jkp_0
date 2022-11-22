using namespace std;
class Quadrangle : public GeoShape
{
private:
    string name = "Quadrangles";

protected:
    string largestAngle = "110";

protected:
    string totalSides = "There's four sides";

public:
    void printCheck()
    {
        cout << name << endl;
        cout << largestAngle << endl;

        cout << totalSides << endl;
        cout << centre << endl
             << endl;
    }
};