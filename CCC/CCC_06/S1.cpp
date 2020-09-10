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

#pragma GCC optimize ("Ofast")

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
#define tie cin.tie(0);cout.tie(0);ios_base::sync_with_stdio(false);

using namespace std;

struct point
{
    int x, y, d;
    point(int xx, int yy, int dd) {
        y = xx;
        x = yy;
        d = dd;
    }
};
// sorting maps by second element
struct comp {
    template <typename T>
    bool operator()(const T &l, const T &r) const { 
        if (l.second == r.second) { 
            return l < r; 
        }
        return l.second > r.second; 
    }
};

/////////////////////////////////////////////////////////////////////////////////////////
bool arr[2][5];
int main() {
    tie;
    string a, b;
    cin >> a >> b;
    fi(0, 5) {
        if (a[i * 2 + 1] >= 'a' && a[i * 2 + 1] <= 'z' && b[i * 2 + 1] >= 'a' && b[i * 2 + 1] <= 'z') {
            arr[1][i] = true;
        } else {
            arr[1][i] = false;
        }
        if ((a[i * 2] >= 'A' && a[i * 2] <= 'E') || (b[i * 2] >= 'A' && b[i * 2] <= 'E')) {
            arr[0][i] = true;
        } else {
            arr[0][i] = false;
        }
    }
    
    int n;
    cin >> n;
    while (n--) {
        string s;
        bool flag = true;
        cin >> s;
        fi(0, 5) {
            if (s[i] >= 'A' && s[i] <= 'Z') {
                if (!arr[0][i]) {
                    flag = false;
                    cout << "Not their baby!" << endl;
                    break;
                }
            } else {
                if (!arr[1][i]) {
                    flag = false;
                    cout << "Not their baby!" << endl;
                    break;
                }
            }
        }
        if (flag) {
            cout << "Possible baby." << endl;
        }
    }
    return 0;
}