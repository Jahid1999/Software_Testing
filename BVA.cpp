#include <bits/stdc++.h>

using namespace std;

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


void Robust(int numOfParameter, int *maxi, int *mini, int *nominal) 
{
	int robust = 6 * numOfParameter +1;
	int maxMinArray[numOfParameter][6], robustOut[robust][numOfParameter+1];
	
	for(int i=0 ; i<numOfParameter ; i++)
	{
		nominal[i] = (int) ((maxi[i] + mini[i])/2);
		
		maxMinArray[i][0]= mini[i] -1; // min minus value
		maxMinArray[i][1]= mini[i]; // min value
		maxMinArray[i][2]= mini[i] + 1; // min plus value
		maxMinArray[i][3]= maxi[i] -1 ; // max minus value
		maxMinArray[i][4]= maxi[i] ; // max value
		maxMinArray[i][5]= maxi[i] +1; // max plus value
	}
	
	for(int i=0; i<robust; i++)
	{
		robustOut[i][0] = i+1;
	}

	int row_robust = 0;
	
	for(int i=0; i<numOfParameter; i++)
	{
		
		for(int j=0; j<6; j++)
		{
			for(int k= 0 ; k<numOfParameter ; k++)
			{
				if(k==i)
				{
					robustOut[row_robust][k+1]= maxMinArray[k][j];
					//cout << robustOut[row_robust][k+1] << "\t";
				}
				
				else
				{
					robustOut[row_robust][k+1]= nominal[k];
					//cout << robustOut[row_robust][k+1] << "\t";
				}
			}	
			//cout << endl;
			row_robust = row_robust + 1;
		}
		
	}
	
	for(int i=0; i<numOfParameter; i++)
	{
		robustOut[row_robust][i+1]= nominal[i];
		//cout << robustOut[row_robust][i+1] << "\t";
	}
	
	//cout << endl;

	ofstream oFile;
	oFile.open("Robust.csv", ofstream::app);
	if(oFile.is_open())
	{
		oFile << "Test Case ID,";
		
		for(int i=0; i<numOfParameter; i++)
		{
			oFile << "Parameter" << i+1 << ",";
		}
		oFile << "Expected Output" << endl;
		
		for(int i=0; i<robust; i++)
		{
			for(int j=0; j<numOfParameter+1; j++)
			{
				oFile << robustOut[i][j] << ",";
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

	int row_worst = 0;
	
	for(int i=0; i<numOfParameter; i++)
	{
		
		for(int j=0; j<5; j++)
		{
			for(int k=0; k<numOfParameter; k++)
			{
				worstOut[row_worst][k+1]= maxMinArray[k][j];
			}
			row_worst = row_worst + 1;
		}
		
	}
	

	ofstream oFile;
	oFile.open("Worst.csv", ofstream::app);
	if(oFile.is_open())
	{
		oFile << "Test Case ID,";
		
		for(int i=0; i<numOfParameter; i++)
		{
			oFile << "Parameter" << i+1 << ",";
		}
		oFile << "Expected Output" << endl;
		
		for(int i=0; i<worst; i++)
		{
			for(int j=0; j<numOfParameter+1; j++)
			{
				oFile << worstOut[i][j] << ",";
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
	
	int maxi[numOfParameter], mini[numOfParameter], nominal[numOfParameter];
	
	
	for(int i=0; i<numOfParameter; i++)
	{
		cout << "Min & Max value of parameter " << i+1 << ": ";
		cin >> mini[i] >> maxi[i];	
	}
	
	//BVC(numOfParameter, maxi, mini, nominal);
	//Robust(numOfParameter, maxi, mini, nominal);
	Worst(numOfParameter, maxi, mini, nominal);
	
	
	
	return 0;
}
