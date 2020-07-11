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
    cin.tie(NULL); cout.tie(NULL);
    int a, b;
    sc(a);sc(b);
    int c = 0;
    fi(1, a + 1) {
        fj(1, b + 1) {
            if (i + j == 10) {
                c++;
            }
        }
    }
    if (c != 1) {
        printf("There are %d ways to get the sum 10.", c);
    } else {
        printf("There is 1 way to get the sum 10.", c);
    }
    return 0;
}