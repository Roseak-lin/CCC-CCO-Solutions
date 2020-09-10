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
    int x, y;
    point(int xx, int yy) {
        x = xx;
        y = yy;
    }
};
/////////////////////////////////////////////////////////////////////////////////////////

int arr[11];
int op, d;
bool poss[7][5000001] = {false};
void solve(int sum, int moves) {
    if (sum > 5000000 || moves > op || poss[moves][sum]) {
        return;
    }
    poss[moves][sum] = true;
    for (int i = 0; i < d; i++) {
        solve(sum + arr[i], moves + 1);
        solve(sum * arr[i], moves + 1);
    }
}
int main() {
    // cco 2012 p1
    // ios_base::sync_with_stdio(false), cin.tie(0), cout.tie(0);
    
    sc(op);sc(d);
    fi(0, d) {
        sc(arr[i]);
    }
    fi(0, d) {
        solve(arr[i], 0);
    }
    int v;
    sc(v);
    int t;
    while (v--) {
        sc(t);
        cout << (poss[op][t] ? "Y" : "N") << endl;
    }
    return 0;
}