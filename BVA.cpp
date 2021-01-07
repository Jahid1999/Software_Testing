#include <bits/stdc++.h>

using namespace std;

int bvc, robust, worst;

/*
void BVC () 
{
	ofstream oFile;
	oFile.open("BVC.csv", ofstream::app);
	if(oFile.is_open())
	{
		oFile << "Tini atkiye uthlin" << endl;
		int i;
		cin >> i;
		cout << i << endl;
		oFile.close();
	}
	else
	{
		cout << "file khule nai" << endl;
	}
	return;
}
*/

/*
void processData( int i)
{
	cout << "Min value of parameter " << i+1 << ": ";
	cin >> mini;
	cout << "Max value of parameter " << i+1 << ": ";
	cin >> maxi;
	maxPlus = maxi + 1;
	maxMinus = maxi -1;
	minPlus = mini + 1;
	minMinus = mini -1;
	nominal = (int) ((maxi+mini)/2);
}
*/

int main (void)
{

	int numOfParameter;
	
	cout << "Enter number of parameters: ";
	cin >> numOfParameter;
	
	bvc = 4 * numOfParameter +1;
	robust =  6 * numOfParameter +1;
	worst = pow(5,numOfParameter);
	
	int maxi[numOfParameter], mini[numOfParameter], nominal[numOfParameter], maxMinArray[numOfParameter][4],
		bvcOut[bvc][numOfParameter+1], robustOut[robust][numOfParameter+1], worstOut[worst][numOfParameter+1] ;
	
	//cout << bvc << "\t" << robust << "\t" << worst << endl;
	
	for(int i=0; i<numOfParameter; i++)
	{
		cout << "Min & Max value of parameter " << i+1 << ": ";
		cin >> mini[i] >> maxi[i];
		
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

	int row_bvc = 1;
	
	for(int i=0; i<numOfParameter; i++)
	{
		
		for(int j=0; j<4; j++)
		{
			for(int k= 0 ; k<numOfParameter ; k++)
			{
				if(k==i)
				{
					cout << maxMinArray[k][j] << "\t";
				}
				
				else
				{
					cout << nominal[k] << "\t";
				}
			}	
		
			cout << endl;
		}
		
	}
	
	for(int i=0; i<numOfParameter; i++)
	{
		cout << nominal[i] << "\t";
	}
	
	cout << endl;
	
	
	

	return 0;
}
