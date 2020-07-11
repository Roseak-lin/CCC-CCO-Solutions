#include <bits/stdc++.h>
#include <algorithm>
#include <array>
#include <iostream>
#include <vector>
#include <string>
#include <queue>
#include <math.h>
#include <deque>
#include <cmath>

#pragma GCC optimize("Ofast")

typedef long long ll;

#define fi(x, y) for(int i = x; i < y; i++)
#define fj(x, y) for(int j = x; j < y; j++)
#define sc(n) scanf("%d", &n);
#define mp make_pair

using namespace std;

bool prime(int n) {
    int t = sqrt(n);
    fi(2,t + 1) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    cin.tie(NULL); cout.tie(NULL); ios::sync_with_stdio(0);
    int n;
    sc(n);
    
    fi (0,n) {
        int num;
        sc(num);
        num *= 2;
        fj(2, num + 1) {
            if (prime(j) && prime(num - j)) {
                printf("%d %d\n", num-j,j);
                break;
            }
        }
        
    }
    return 0;
}