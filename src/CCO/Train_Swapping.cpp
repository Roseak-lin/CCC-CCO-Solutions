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

int main() {
    cin.tie(NULL); cout.tie(NULL); ios::sync_with_stdio(0);
    int n;
    sc(n);
    
    fi(0,n) {
        int t;
        sc(t);
        int arr[t] = {0};
        fj(0,t) {
            sc(arr[j]);
        }

        int swaps = 0;
        fj(0,t) {
            for (int x = 0; x < t - 1; x++) {
                
                if (arr[x] > arr[x + 1]) {
                    swaps++;
                    int temp = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = temp;
                }
            }
        }
        printf("Optimal train swapping takes %d swaps.\n", swaps);
    }
        
    return 0;
}