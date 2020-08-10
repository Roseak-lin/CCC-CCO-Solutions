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
    double d, e, w, c1 = 0, c2 = 0;
    sc(d);sc(e);sc(w);
    if (d - 100 > 0) {
        c1 += 0.25 * (d - 100);
    }
    c1 += 0.15 * e;
    c1 += 0.20 * w;

    if (d - 250 > 0) {
        c2 += 0.45 * (d - 250);
    }
    c2 += 0.35 * e;
    c2 += 0.25 * w;

    printf("Plan A costs %.2f\nPlan B costs %.2f\n", c1, c2);
    if (c1 == c2) {
        cout << "Plan A and B are the same price." << endl;
    } else {
        printf("Plan %c is cheapest.", c1 < c2 ? 'A':'B');
    }
    return 0;
}