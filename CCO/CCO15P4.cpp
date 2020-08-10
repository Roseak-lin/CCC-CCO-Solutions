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
#define print2dArr(a,r,c) cout<<#a<<":\n";for(int i = 0; i < r; i++){for(int j = 0; j < c; j++){cout<<grid[i][j]<<" ";}cout<<endl;}
#define pi 2 * asin(1.0)

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
int n, m;
char grid[2001][2001];

void dfs(int y, int x) {
    if (grid[y][x] == 'N') {
        for (int i = y - 1; i >= 0; i--) {
            if (grid[i][x] != '.') {
                dfs(i, x);
            }
        }
    printf("(%d,%d)\n", y, x);
    } else if (grid[y][x] == 'S') {
        for (int i = y + 1; i < n; i++) {
            if (grid[i][x] != '.') {
                dfs(i, x);
            }
        }
    printf("(%d,%d)\n", y, x);
    } else if (grid[y][x] == 'W') {
        for (int i = x - 1; i >= 0; i--) {
          if (grid[y][i] != '.') {
            dfs(y, i);
        }
    }
    printf("(%d,%d)\n", y, x);
    } else if (grid[y][x] == 'E') {
        for (int i = x + 1; i < m; i++) {
            if (grid[y][i] != '.') {
                dfs(y, i);
            }
        }
    printf("(%d,%d)\n", y, x);
  }
  grid[y][x] = '.';
}

int main() {
    sc(n);sc(m);
    for (int i = 0; i < n; i++) {
        cin >> grid[i];
    }
    fi (0, n) {
        fj(0, m) {
            if (grid[i][j] != '.') {
                dfs(i, j);
            }
        }
    }
}