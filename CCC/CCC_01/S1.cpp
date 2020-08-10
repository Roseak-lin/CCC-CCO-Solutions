// note spacing does not matter

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

int main() {
    char c, curr;
    int score = 0, in = 0, total = 0;
    vector<char> club, diamond, heart, spade;
    cin >> curr;
    while (in != 13) {
        cin >> c;
        if (c == 'C' || c == 'D' || c == 'H' || c == 'S') {
            curr = c;
            continue;
        }
        if (curr == 'C') {
            club.push_back(c);
        } elif (curr == 'D') {
            diamond.push_back(c);
        } elif (curr == 'H') {
            heart.push_back(c);
        } elif (curr == 'S') {
            spade.push_back(c);
        }
        in++;
    }
    cout << "Cards Dealt           Points" << endl;
    cout << "Clubs" << " ";
    for (char card : club) {
        cout << card << " ";
         if (card == 'A') {
            score += 4;
         } elif (card == 'K') {
             score += 3;
         } elif (card == 'Q') {
             score += 2;
         } elif (card == 'J') {
             score += 1;
         }
    }
    if (club.size() == 0) {
        score += 3;
    } elif (club.size() == 1) {
        score += 2;
    } elif (club.size() == 2) {
        score += 1;
    }
    cout << "        " << score << endl;
    total += score;
    score = 0;

    cout << "Diamonds" << " ";
    for (char card : diamond) {
        cout << card << " ";
         if (card == 'A') {
            score += 4;
         } elif (card == 'K') {
             score += 3;
         } elif (card == 'Q') {
             score += 2;
         } elif (card == 'J') {
             score += 1;
         }
    }
    if (diamond.size() == 0) {
        score += 3;
    } elif (diamond.size() == 1) {
        score += 2;
    } elif (diamond.size() == 2) {
        score += 1;
    }
    cout << "        " << score << endl;
    total += score;
    score = 0;

    cout << "Hearts" << " ";
    for (char card : heart) {
        cout << card << " ";
         if (card == 'A') {
            score += 4;
         } elif (card == 'K') {
             score += 3;
         } elif (card == 'Q') {
             score += 2;
         } elif (card == 'J') {
             score += 1;
         }
    }
    if (heart.size() == 0) {
        score += 3;
    } elif (heart.size() == 1) {
        score += 2;
    } elif (heart.size() == 2) {
        score += 1;
    }
    cout << "        " << score << endl;
    total += score;
    score = 0;

    cout << "Spades" << " ";
    for (char card : spade) {
        cout << card << " ";
         if (card == 'A') {
            score += 4;
         } elif (card == 'K') {
             score += 3;
         } elif (card == 'Q') {
             score += 2;
         } elif (card == 'J') {
             score += 1;
         }
    }
    if (spade.size() == 0) {
        score += 3;
    } elif (spade.size() == 1) {
        score += 2;
    } elif (spade.size() == 2) {
        score += 1;
    }
    cout << "        " << score << endl;
    total += score;
    
    cout << " \tTotal  " << total << endl;
    return 0;
}