#include <iostream>
#include <cmath>
#include <cstdio>
using namespace std;


class excersise
{
    int stdID;
    public:
        excersise(int&);
        int sendExcerNo(int&, int&, int&);
        int sendIDfactor();
        int veridnum(int &,int &,int &);
        ~excersise();


};

excersise::excersise(int &id)
{
    stdID = id;
}





excersise::~excersise(){}

int excersise::sendExcerNo(int &c,int &s, int &maxExer)
{
    int ex = (11*c+9*s+stdID)%maxExer;
    return ex;
}



int excersise::veridnum(int &c, int &s, int &pm)
{
    int vid = (11*c+9*s+stdID);
    if(pm==1) vid = abs(vid%60)+1+60;
    else vid = abs(vid%60)+1-60;
    if (vid == 0 ) vid = 60;
    return abs(vid);
}


int sendExcerNo(int &d)
{
    int c=1,s=1,maxExer=50;
    int ex = (11*c+9*s+d)%maxExer;
    if ( ex == 0 ) ex = 50;
    return ex;
}


int elseverinum(int &c, int &s, int &st)
{
    int pm;
    if(st<61) pm = 1;
    else pm = -1;
    int vid = (11*c+9*s+st);
    if(pm==1) vid = abs(vid%60)+1+60;
    else vid = abs(vid%60)+1-60;
    if (vid == 0 ) vid = 60;
    return abs(vid);
}


void SameEx(int &c,int &s, int &maxExer, int &st)
{
    int ex = (11*c+9*s+st)%maxExer;
    int i;
    for(i=1;i<=122;i++){
       if(i==st) continue;
       if(ex==((11*c+9*s+i)%maxExer))
         cout<<i<<" ";
    }
}


int main()
{
    int c,s,id,maxEX,pm,i;
    char buffer;
    cout << "ENTER STUDENT ID's LAST 3 DIGITS: " <<endl;
    cin >> id;
    if(id>0 && id<61) pm=1;
    else pm=-1;
    excersise e(id);
    cout << "ENTER CHAPTER NO: "<<endl;
    cin >> c;
    cout << "ENTER SECTION NO: " <<endl;
    cin >> s;
    cout << "ENTER MAX NUMBER OF EXCERSISE IN " << c <<"." << s <<endl;
    cin >> maxEX;
    cout << endl;
    cout << "YOU HAVE TO DO NUMBER " << e.sendExcerNo(c,s,maxEX) << " OF EXERCISE " << c <<"." << s <<endl;
    cout << "YOUR VERIFICATION STUDENT ID IS: " << e.veridnum(c,s,pm) <<endl;
    for(i=1;i<=120;i++){
        if( elseverinum(c,s,i) == id )
            cout << "YOU WILL BE VERIFYING THE ASSIGNMENT OF STUDENT ID " << i << endl;
    }
    cout<<"STUDENTS WITH SAME EXERCISE NUMBER: ";
    SameEx(c,s,maxEX,id);

    return 0;

}
