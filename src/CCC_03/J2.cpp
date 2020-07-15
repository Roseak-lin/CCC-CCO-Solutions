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
    int n, temp;
    while (cin >> n) {
        if (n == 0) {
            break;
        }
        if ((int)sqrt(n) * (int)sqrt(n) == n) {
            cout << "Minimum perimeter is " << (int)sqrt(n) * 4 << " with dimensions " << (int) sqrt(n) << " x " << (int)sqrt(n) << endl;
            continue;
        }
        for (int i = (int)sqrt(n); i > 0; i--) {
            if (n % i == 0) {
                temp = i;
                break;
            }
        }
        cout << "Minimum perimeter is " << 2 * n/temp + 2 * temp << " with dimensions " << n/temp << " x " << temp << endl;
    }
    return 0;
}