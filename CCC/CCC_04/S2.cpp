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
int worst[101];
int main() {
    int n, k;
    sc(n);sc(k);
    map<int, int> m;
    
    fi(1, n + 1) {
        m.insert(pii(i, 0));
        worst[i] = 1;
    }
    while (k--) {
        fi(1, n + 1) {
            int t;sc(t);
            m.find(i)->second += t;
        }
        int p = 0;
        set<pii, comp> s(m.begin(), m.end());
        int prev;
        for (auto it = s.begin(); it != s.end(); it++) {
            if (prev != it->second) {
                p++;
            }
            worst[it->first] = max(worst[it->first], p);
            prev = it->second;
        }
    }
    int prev = 0x3f;
    set<pii, comp> s(m.begin(), m.end());
    for (auto it = s.begin(); it != s.end(); it++) {
        if (it != s.begin() && it->second != prev) {
            break;
        }
        cout << "Yodeller " << it->first << " is the TopYodeller: score " << it->second << ", worst rank " << worst[it->first] << endl;
        prev = it->second;
    }
    return 0;
}