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
void scan(int &number) { bool negative = false; register int c; number = 0;  c = getchar(); if (c=='-') { negative = true;  c = getchar(); } for (; (c>47 && c<58); c=getchar()) number = number *10 + c - 48; if (negative) number *= -1; } 

bool visited[10000001];
vector<int> v[1000001];
int main() {
    int n, m, k, add = 0, broken = 0;
    scan(n);scan(m);scan(k);

    fi(0, m) {
        int a, b;
        scan(a);scan(b);
        v[a].push_back(b);
        v[b].push_back(a);
    }
    queue<pii> q;
    fi(1, n + 1) {
        int nodes = 1;
        if (visited[i]) {
            continue;
        }
        visited[i] = true;
        for (int x : v[i]) {
            if (nodes == k && !visited[x]) {
                broken++;
            } elif (visited[x]) {
                continue;
            } else {
                q.push(mp(x, i));
                visited[x] = true;
                nodes++;
            }
        }

        while (!q.empty()) {
            pii p = q.front();
            q.pop();
            if (nodes == k) {
                for (int  x : v[p.first]) {
                    if (x != p.second && !visited[x]) {
                        broken++;
                    }
                }
            } else {
                for (int x : v[p.first]) {
                    if (!visited[x]) {
                        if (nodes == k) {
                            broken++;
                        } else {
                            q.push(mp(x, p.first));
                            visited[x] = true;
                            nodes++;
                        }
                    }
                }
            }
        }
         if (nodes == k) {
            add += k;
        }
    }
   
    printf("%d %d", add, broken);
    return 0;
}