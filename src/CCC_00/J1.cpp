// Very sketchy implementation

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

#define fi(x, y) for(int i = x; i < y; i++)
#define fj(x, y) for(int j = x; j < y; j++)
#define sc(n) scanf("%d", &n);
#define mp make_pair
#define MOD 1000000007
#define endl "\n"
#define print2dArr(a,r,c) cout<<#a<<":\n";for(int i = 0; i < r; i++){for(int j = 0; j < c; j++){cout<<a[i][j]<<" ";}cout<<endl;}
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
    int s, d, n = 1;
    sc(s);sc(d);
    cout << "Sun Mon Tue Wed Thr Fri Sat" << endl;
    fi (0, s - 1) {
        cout << "    ";
    }
    cout << "  " << n;
    n++;
    fi(s, 7) {
        cout << "   " << n;
        n++;
    }
    cout << endl;
    while (n <= d) {
        if (n < 10) {
            if (9 - n == s || (n == 9 && s == 7)) {
                cout << "  " << n;
            } elif (n - 7 == 8 - s) {
                cout << "   " << n  << endl;
            } else {
                cout << "   " << n;
            }
        } else {
            if (n - 7  * (int) (n / 7) == 9 - s || (s == 1 && (n - 1) % 7 == 0) || (s == 2 && n % 7 == 0)) {
                cout << " " << n;
            } elif (n - (int)(n / 7)  * 7 == 8 - s || (s == 1 && n % 7 == 0)) {
                cout << "  " << n << endl;
            } else {
                cout << "  " << n;
            }
        }
        n++;
    }
    if ((n - 1 - (8 - s)) % 7 != 0) cout <<  endl;
    return 0;
}