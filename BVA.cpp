#include <bits/stdc++.h>

using namespace std;

int robust, worst;


void BVC(int numOfParameter, int *maxi, int *mini, int *nominal) 
{
	int bvc = 4 * numOfParameter +1;
	int maxMinArray[numOfParameter][4], bvcOut[bvc][numOfParameter+1];
	
	for(int i=0 ; i<numOfParameter ; i++)
	{
		nominal[i] = (int) ((maxi[i] + mini[i])/2);
		
		maxMinArray[i][0]= mini[i]; // min value
		maxMinArray[i][1]= mini[i] + 1; // mini value
		maxMinArray[i][2]= maxi[i] - 1 ; // max-1 value
		maxMinArray[i][3]= maxi[i]; // max value
	}
	
	for(int i=0; i<bvc; i++)
	{
		bvcOut[i][0] = i+1;
	}

	int row_bvc = 0;
	
	for(int i=0; i<numOfParameter; i++)
	{
		
		for(int j=0; j<4; j++)
		{
			for(int k= 0 ; k<numOfParameter ; k++)
			{
				if(k==i)
				{
					bvcOut[row_bvc][k+1]= maxMinArray[k][j];
					//cout << bvcOut[row_bvc][k+1] << "\t";
				}
				
				else
				{
					bvcOut[row_bvc][k+1]= nominal[k];
					//cout << bvcOut[row_bvc][k+1] << "\t";
				}
			}	
			//cout << endl;
			row_bvc = row_bvc + 1;
		}
		
	}
	
	for(int i=0; i<numOfParameter; i++)
	{
		bvcOut[row_bvc][i+1]= nominal[i];
		//cout << bvcOut[row_bvc][i+1] << "\t";
	}
	
	//cout << endl;

	ofstream oFile;
	oFile.open("BVC.csv", ofstream::app);
	if(oFile.is_open())
	{
		oFile << "Test Case ID,";
		
		for(int i=0; i<numOfParameter; i++)
		{
			oFile << "Parameter" << i+1 << ",";
		}
		oFile << "Expected Output" << endl;
		
		for(int i=0; i<bvc; i++)
		{
			for(int j=0; j<numOfParameter+1; j++)
			{
				oFile << bvcOut[i][j] << ",";
			}
			oFile << " "<< endl;
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
	
	robust =  6 * numOfParameter +1;
	worst = pow(5,numOfParameter);
	
	int maxi[numOfParameter], mini[numOfParameter], nominal[numOfParameter],
		 robustOut[robust][numOfParameter+1], worstOut[worst][numOfParameter+1] ;
	
	
	for(int i=0; i<numOfParameter; i++)
	{
		cout << "Min & Max value of parameter " << i+1 << ": ";
		cin >> mini[i] >> maxi[i];	
	}
	
	BVC(numOfParameter, maxi, mini, nominal);
	
	
	return 0;
}
