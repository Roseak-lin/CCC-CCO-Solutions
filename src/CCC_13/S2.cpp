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

int sum(deque<int> d) {
    int s = 0;
    for (int i = 0; i < d.size(); i++) {
        s += d.at(i);
    }
    return s;
}

/////////////////////////////////////////////////////////////////////////////////////////
int main() {
    int l, t, temp;
    sc(l);sc(t);
    deque<int> d;
    fi(0, t) {
        sc(temp);
        if (d.size() == 4) {
            d.pop_front();
        }
        d.push_back(temp);
        if (sum(d) > l) {
            cout << i << endl;
            exit(0);
        }
    }
    cout << t << endl;
    return 0;
}