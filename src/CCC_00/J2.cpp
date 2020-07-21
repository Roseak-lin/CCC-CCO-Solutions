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

bool rev(string n) {
    string s = "";
    for (int i = n.length() - 1; i > -1; i--) {
        if (n[i] != '1' && n[i] != '6' && n[i] != '9' && n[i] != '0' && n[i] != '8') {
            return false;
        } elif (n[i] == '1') {
            s += '1';
        } elif (n[i] == '6') {
            s += '9';
        } elif (n[i] == '9') {
            s += '6';
        } elif (n[i] == '8') {
            s += '8';
        } elif (n[i] == '0') {
            s += '0';
        }
    }
    if (n == s) return true;
    else return false;
}

int main() {
    int s,e;
    sc(s);sc(e);
    int count = 0;
    fi(s, e + 1) {
        if (rev(to_string(i)))
            count++;
    }
    printf("%d", count);
    return 0;
}