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

#pragma GCC optimize("Ofast")
#pragma GCC optimize("unroll-loops")
#pragma GCC optimize("no-stack-protector")

typedef long long ll;
typedef unsigned long long ull;

#define fi(x, y) for(int i = x; i < y; i++)
#define fj(x, y) for(int j = x; j < y; j++)
#define sc(n) scanf("%d", &n);
#define mp make_pair
#define MOD 1000000007
#define endl "\n"

using namespace std;
int main() {
    int fx, fy, ex, ey, m;
    sc(fx);sc(fy);sc(ex);sc(ey);sc(m);
    
    if (abs(fx-ex) + abs(fy - ey) > m) {
        printf("N");
        exit(0);
    }
    if ((m - abs(fx - ex) - abs(fy - ey)) % 2 == 0) {
        printf("Y");
        exit(0);
    } else {
        printf("N");
        exit(0);
    }
    
    return 0;
}