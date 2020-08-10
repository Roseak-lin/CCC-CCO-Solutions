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
    int box[n][3];
    fi(0,n) {
        int a,b,c;
        sc(a);sc(b);sc(c);
        box[i][0] = a;
        box[i][1] = b;
        box[i][2] = c;
        sort(box[i], box[i] + 3);
    }
    int c;
    sc(c);
    fi(0,c) {
        int arr[3];
        sc(arr[0]);sc(arr[1]);sc(arr[2]);
        sort(arr, arr + 3);
        int mx = INT_MAX, my = INT_MAX, mz = INT_MAX, ma = INT_MAX;
        bool flag = false;
        fj(0,n) {
            if (box[j][0] >= arr[0] && box[j][1] >= arr[1] && box[j][2] >= arr[2] && box[j][0] * box[j][1] * box[j][2] <= ma) {
                mx = box[j][0];
                my = box[j][1];
                mz = box[j][2];
                ma = box[j][0] * box[j][1] * box[j][2];
                flag = true;
            }
        }
        if (!flag) {
            printf("Item does not fit.\n");
        } else {
            printf("%d\n", mx*my*mz);
        }
    }
    return 0;
}