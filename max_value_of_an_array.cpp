#include <iostream>
using namespace std;

int getMAXValue(int arr[], int len) {
  int lv = arr[0];
  for (int i = 1; i < len; i++) {
    if (arr[i] > lv) {
      lv = arr[i];
    }
  }
  return lv;
}

int main() {
  int arr[] = {6, 5, 3, 2, 7, 11, -3};
  
  int len = sizeof(arr) / sizeof(arr[0]);
  
  int maxVal = getMAXValue(arr, len);
  cout << "Max value: " << maxVal << endl;

  return 0;
}