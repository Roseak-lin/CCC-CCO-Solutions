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
    int a,b,c,d,s,s1,d1 = 0, d2 = 0;
    sc(a);sc(b);sc(c);sc(d);sc(s);
    s1 = s;
    bool f = true;
    while (s1 > 0) {
        if (f) {
            if (s1 - a < 0) {
                d1 += s1;
                s1 -= a;
                continue;
            }
            d1 += a;
            s1 -= a;
            f = false;
        } else {
            if (s1 - b < 0) {
                d1 -= s1;
                s1 -= b;
                continue;
            }
            d1 -= b;
            s1 -= b;
            f = true;
        }
    }
    f = true, s1 = s;
    while (s1 > 0) {
        if (f) {
            if (s1 - c < 0) {
                d2 += s1;
                s1 -= c;
                continue;
            }
            d2 += c;
            s1 -= c;
            f = false;
        } else {
            if (s1 - d < 0) {
                d2 -= s1;
                s1 -= d;
                continue;
            }
            d2 -= d;
            s1 -= d;
            f = true;
        }
    }
    if (d1 > d2) cout << "Nikky" << endl;
    elif (d1 == d2) cout << "Tied" << endl; 
    else cout << "Byron" << endl;
    return 0;
}