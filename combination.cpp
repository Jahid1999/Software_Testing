#include<bits/stdc++.h>

using namespace std;

int main(void)
{
	int n;
	cin >> n;
	
	int mini[n], maxi[n], nominal[n], maxMinArray[n][5];
	int num = pow(5,n);
	int out[num][n];
	
	for(int i=0 ; i<n ; i++)
	{
		cin >> mini[i] >> maxi[i];
		
		nominal[i] = (int) ((maxi[i] + mini[i])/2);
		
		maxMinArray[i][0]= mini[i]; // min value
		maxMinArray[i][1]= mini[i] + 1; // mini value
		maxMinArray[i][2]= nominal[i]; // nominal value
		maxMinArray[i][3]= maxi[i] - 1 ; // max-1 value
		maxMinArray[i][4]= maxi[i]; // max value
		
	}

	for(int i=0 ; i<n ; i++)
	{
		
		int numRow = 0;
		for(int j=0 ; j< (num/pow(5,n-i-1)) ; j++)
		{
				for(int k=0 ; k<pow(5,n-i-1) ; k++)
				{
					out[numRow][i]= maxMinArray[i][j%5];
					
					cout << out[numRow][i] << "\t";
					numRow = numRow + 1;
					
				}
				cout << endl << endl;
			
		}
		
	
		
	}
	
	for(int i=0; i< num; i++)
	{
		for(int j =0; j<n; j++){
			cout << out[i][j] << "\t";
		}
		cout << endl;
	}
	
	return 0;
}
