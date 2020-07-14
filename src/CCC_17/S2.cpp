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

int main() {
    cin.tie(0);cout.tie(0);
    ios::sync_with_stdio(0);
    int n;
    cin >> n;
    int arr[n];
    fi(0, n) {
        cin >> arr[i];
    }
    sort(arr, arr + n);
    int l[n % 2 == 0 ? n / 2 : (n / 2) + 1], r[n / 2];
    if (n % 2 == 0) {
        fi(0, n/2) {
            l[i] = arr[i];
            r[i] = arr[i + (n/2)];
        }
    } else {
        fi(0, n/2) {
            l[i] = arr[i];
            r[i] = arr[i + ((n/2) + 1)];
        }
        l[n/2] = arr[n/2];
    }
    // fi(0, n/2) {
    //     cout << l[i] << " " << r[i] << " ";
    // }
    reverse(l, n % 2 == 0 ? l + n/2 : l + n/2 + 1);
    
    fi(0, n/2) {
        cout << l[i] << " " << r[i] << " ";
    }
    if (n%2 != 0) {
        cout << l[n/2] << endl;
    } else {
        cout << endl;
    }
    return 0;
}