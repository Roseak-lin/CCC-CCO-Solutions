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

typedef long long ll;

template <typename T> void sc(T &number) { bool negative = false; register int c; number = 0;  c = getchar(); if (c=='-') { negative = true;  c = getchar(); } for (; (c>47 && c<58); c=getchar()) number = number *10 + c - 48; if (negative) number *= -1; }

#pragma GCC optimize ("Ofast")

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
#define tie cin.tie(0);cout.tie(0);ios_base::sync_with_stdio(false);

using namespace std;

struct point
{
    int x, y, d;
    point(int xx, int yy, int dd) {
        y = xx;
        x = yy;
        d = dd;
    }
};
// sorting maps by second element
struct comp {
    template <typename T>
    bool operator()(const T &l, const T &r) const { 
        if (l.second == r.second) { 
            return l < r; 
        } 
        return l.second > r.second; 
    } 
}; 

/////////////////////////////////////////////////////////////////////////////////////////
int main() {
    int p, g, r, o, c, mm = 0x3f, count = 0;
    sc(p);sc(g);sc(r);sc(o);sc(c);
    for (int i = 0; i <= c / p; i++) {
        for (int j = 0; j <= c / g; j++) {
            for (int x = 0; x <= c / r; x++) {
                for (int k = 0; k <= c / o; k++) {
                    if (p * i + g * j + r * x + o * k == c) {
                        printf("# of PINK is %d # of GREEN is %d # of RED is %d # of ORANGE is %d\n", i, j, x, k);
                        mm = min(mm, i + j + k + x);
                        count++;
                    }
                }
            }
        }
    }
    printf("Total combinations is %d.\n", count);
    printf("Minimum number of tickets to print is %d.", mm);
    return 0;
}