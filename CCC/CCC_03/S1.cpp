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
    int n, curr = 1;
    while (cin >> n) {
        curr += n;
        if (n == 0) {
            cout << "You Quit!" << endl;
            exit(0);
        }
        if (curr == 99) {
            curr = 77;
        }
        if (curr == 90) {
            curr = 48;
        }
        if (curr == 54) {
            curr = 19;
        }
        if (curr == 9) {
            curr = 34;
        }
        if (curr == 67) {
            curr = 86;
        }
        if (curr == 40) {
            curr = 64;
        }
        if (curr > 100) {
            curr -= n;
        }
        printf("You are now on square %d\n", curr);
        if (curr == 100) {
            printf("You Win!\n");
            exit(0);
        }

    }
    return 0;
}