#include <bits/stdc++.h>

using namespace std;

void Worst(int numOfParameter, int *maxi, int *mini, int *nominal) 
{
	int worst = pow(5,numOfParameter);
	int maxMinArray[numOfParameter][5], worstOut[worst][numOfParameter+1];
	
	for(int i=0 ; i<numOfParameter ; i++)
	{
		nominal[i] = (int) ((maxi[i] + mini[i])/2);
		
		maxMinArray[i][0]= mini[i]; // min value
		maxMinArray[i][1]= mini[i] + 1; // mini value
		maxMinArray[i][2]= maxi[i] - 1 ; // max-1 value
		maxMinArray[i][3]= maxi[i]; // max value
		maxMinArray[i][4]= nominal[i]; // nominal value
	}
	
	for(int i=0; i<worst; i++)
	{
		worstOut[i][0] = i+1;
	}

	
	for(int i=0 ; i<numOfParameter ; i++)
	{
		
		int row_worst = 0;
		for(int j=0 ; j<(worst/pow(5,numOfParameter-i-1)) ; j++)
		{
			for(int k=0 ; k<pow(5,numOfParameter-i-1) ; k++)
			{
				worstOut[row_worst][i+1]= maxMinArray[i][j%5];
					
				//cout << worstOut[row_worst][i] << "\t";
				row_worst = row_worst + 1;
					
			}
			//cout << endl << endl;		
		}	
	}
	

	ofstream oFile;
	oFile.open("worst.csv", ofstream::app);
	if(oFile.is_open())
	{
		
		for(int i=0; i<worst; i++)
		{
			for(int j=0; j<numOfParameter+1; j++)
			{
				oFile << worstOut[i][j] << ",";
			}
			oFile << endl;
		}
		
		oFile.close();
	}
	else
	{
		cout << "Couldn't open output file" << endl;
	}
	
	
	
	return;
}


int main (void)
{

	int numOfParameter;
	
	cout << "Enter number of parameters: ";
	cin >> numOfParameter;
	
	int maxi[numOfParameter], mini[numOfParameter], nominal[numOfParameter];
	
	
	for(int i=0; i<numOfParameter; i++)
	{
		cout << "Min & Max value of parameter " << i+1 << ": ";
		cin >> mini[i] >> maxi[i];	
	}

	Worst(numOfParameter, maxi, mini, nominal);
	
	
	
	return 0;
}
