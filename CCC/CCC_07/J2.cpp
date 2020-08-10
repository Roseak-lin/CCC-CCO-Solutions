#include<iostream>
#include<bits/stdc++.h>
#include<iomanip>
#include<algorithm>
#include<cstdio>
#include<cstring>
#include<queue>
#include<map>
#include<cassert>
#include<assert.h>
#include<cmath>
#include<random>
#include<vector>
#include<bitset>
#include<set>
#include<memory>
#include<numeric>
#include<functional>
#include<cstdlib>
#include<ctime>
#include<list>
#include<deque>
#include<stack>
#include<sstream>
#include<math.h>
#include <ctype.h>

#pragma GCC optimize("Ofast")
#pragma GCC optimize("unroll-loops")
#pragma GCC optimize("no-stack-protector")

typedef long long ll;

template <typename T> void sc(T &number) { bool negative = false; register int c; number = 0;  c = getchar(); if (c=='-') { negative = true;  c = getchar(); } for (; (c>47 && c<58); c=getchar()) number = number *10 + c - 48; if (negative) number *= -1; }

#define fi(x, y) for(int i = x; i < y; i++)
#define fj(x, y) for(int j = x; j < y; j++)
#define mp make_pair
#define MOD 1000000007
#define endl "\n"
#define print2dArr(a,r,c) cout << #a << ":\n"; for(int i = 0; i < r; i++) { for(int j = 0; j < c; j++) { cout << a[i][j] << " "; } cout << endl;}
#define pi 2 * asin(1.0)
#define elif else if
#define pii pair<int, int>
#define pq priority_queue

using namespace std;

struct point
{
    int x, y, d;
    point(int xx, int yy, int dd) {
        x = xx;
        y = yy;
        d = dd;
    }
};
/////////////////////////////////////////////////////////////////////////////////////////

int main() {
    string s;
    cin >> s;
    while (s != "TTYL") {
        if (s == "CU") cout << "see you" << endl;
        elif (s == ":-)") cout << "I'm happy" << endl;
        elif (s == ":-(") cout << "I'm unhappy" << endl;
        elif (s == ";-)") cout << "wink" << endl;
        elif (s == ":-P") cout << "stick out my tounge" << endl;
        elif (s == "(~.~)") cout << "sleepy" << endl;
        elif (s == "TA") cout << "totally awesome" << endl;
        elif (s == "CCC") cout << "Canadian Computing Competition" << endl;
        elif (s == "CUZ") cout << "because" << endl;
        elif (s == "TY") cout << "thank-you" << endl;
        elif (s == "YW") cout << "you're welcome" << endl;
        else cout << s << endl;
        cin >> s;        
    }
    cout << "talk to you later" << endl;
    return 0;
}