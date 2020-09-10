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

// #pragma GCC optimize ("Ofast")

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

int main() {
    int n;
    cin >> n;
    while (n--) {
        string s, w = "";
        cin >> s;
        fi(0, 10) {
            if (s[i] == '-') {
                s.erase(s.begin() + i);
                i--;
            } else {
                if (w.length() == 3 || w.length() == 7) {
                    w += '-';
                }
                if (isdigit(s[i])) {
                    w += s[i];
                } else {
                    if (s[i] <= 'C') w += '2';
                    elif (s[i] <= 'F') w += '3';
                    elif (s[i] <= 'I') w += '4';
                    elif (s[i] <= 'L') w += '5';
                    elif (s[i] <= 'O') w += '6';
                    elif (s[i] <= 'S') w += '7';
                    elif (s[i] <= 'V') w += '8';
                    else w += '9';
                }
            }
        }
        cout << w << endl;
    }
    return 0;
}