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
vector<pair<int,int>> p[1000001];
int visited[1001][1001] = {0};
int main() {
    int n, m;
    sc(n);sc(m);
    int arr[n][m] = {0};
    fi(0, n) {
        fj(0, m) {
            sc(arr[i][j]);
            p[arr[i][j]].push_back(mp(i, j));
        }
    }

    queue <pair<int, int>> q;
    q.push(mp(n - 1, m - 1));
    while (!q.empty()) {
        int n1 = q.front().first, n2 = q.front().second;
        q.pop();
        if (n1 == 0 && n2 == 0) {
            cout << "yes" << endl;
            exit(0);
        }

        for (pair<int, int> x : p[(n1 + 1) * (n2 + 1)]) {
            // cout << x.first << " " << x.second << " " << (n1 + 1) * (n2 + 1) << " " << visited[x.first][x.second] << endl;
            if (!visited[x.first][x.second]) 
            q.push(mp(x.first, x.second)), visited[x.first][x.second] = true;
        }
    }
    cout << "no" << endl;
    return 0;
}