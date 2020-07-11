#include <bits/stdc++.h>
#include <algorithm>
#include <array>
#include <iostream>
#include <vector>
#include <string>
#include <queue>
#include <math.h>
#include <deque>

#pragma GCC optimize("Ofast")

typedef long long ll;

#define fi(x, y) for(int i = x; i < y; i++)
#define fj(x, y) for(int j = x; j < y; j++)
#define sc(n) scanf("%d", &n);
#define mp make_pair

using namespace std;

int main() {
    cin.tie(NULL); cout.tie(NULL); ios::sync_with_stdio(0);
    vector<int> v[27];
    string s;
    cin >> s;
    vector <pair<int,int>> p;
    while (s != "**") {
        int a = s[0] - 64, b = s[1] - 64;
        v[a].push_back(b);
        v[b].push_back(a);
        cin >> s;
    }
    int count = 0;
    for (int i = 1; i < 27; i++) {
        for (int k : v[i]) {
            bool flag = false;
            queue<int> q;
            for (int j : v[1]) {
                if (j == k && i == 1) {
                    continue;
                }
                q.push(j);
            }
            bool visited[27] = {false};
            while (!q.empty()) {
                int n = q.front();
                q.pop();
                if (visited[2]){
                    flag = true;
                    break;
                }
                if (visited[n]) {
                    continue;
                }
                visited[n] = true;
                for (int j : v[n]) {
                    if (j == k && n == i) {
                        continue;
                    }
                    q.push(j);
                }
            }
            if (!flag && !(std::count(p.begin(), p.end(), mp(i,k))) && !(std::count(p.begin(), p.end(), mp(k,i)))) {
                cout << (char)(i+64) << (char)(k+64) << endl;
                count++;
                p.push_back(mp(i,k));
            }
        }
    }
    printf("There are %d disconnecting roads.\n", count);
    return 0;
}