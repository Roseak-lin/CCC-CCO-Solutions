#include <iostream>

using namespace std;

int main()
{
    string word;
    cin >> word;
    bool c = true;
    
    for (int i = 0; i < word.length(); i++) {
        if (word.at(i) == ('I')|| word.at(i) ==  'O' ||  word.at(i) ==  'S' || word.at(i) ==  'H' || word.at(i) ==  'Z' || word.at(i) ==  'X' || word.at(i) ==  'N') {
            continue;
        }
        c = false;
        break;
    }
    
    if (c) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }

    return 0;
}