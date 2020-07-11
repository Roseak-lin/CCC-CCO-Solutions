#include <bits/stdc++.h>
#include <algorithm> 
#include <array>
#include <iostream>
#include <vector>

using namespace std;

int main() {
    string s = "";
    string minS = "";
    int min = INT_MAX;
    while (s.compare("Waterloo") != 0) {
        int temp;
        cin >> s >> temp;
        if (temp < min) {
            min = temp;
            minS = s;
        }
    }
    cout << minS << endl;
    return 0;
}