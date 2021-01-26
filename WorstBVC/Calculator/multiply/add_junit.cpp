#include<iostream>
#include<fstream>
using namespace std;


//right function for testing grades
int multiply(int a, int b) {
		return a*b;
	}

bool openFile(string fileName,ofstream &ofile){
	ofile.open(fileName);
	if(!ofile.is_open()) {
		cout<<"problem"<<endl;
		return false;
	};
	return true;
}
bool readFile(string fileName,ifstream &ifile){
	ifile.open(fileName);
	if(!ifile.is_open()) {
		cout<<"problem in reading"<<endl;
		return false;
	};
	return true;
}

int main(){
	ifstream ifile;
	ofstream ofile,ofileresult;
	
	char ch;
	string s;
	int id,a,b,c;
	if(readFile("worst.csv",ifile) && openFile("methods.java",ofile) && openFile("worst_data.csv",ofileresult)){
	//cout<<id<<" calling"<<endl; 
	
		while(ifile>>id>>ch>>a>>ch>>b>>ch){
			ofile<<"@Test\n";
			ofile<<"public void multiplyWorstCase"<<id<<" () {"<<endl;
			ofile<<"\tCaculator cal = new Caculator();"<<endl;
			ofile<<"\tint result = cal.multiply("<<a<<","<<b<<");"<<endl;
			ofile<<"\tint expected = "<<multiply(a,b)<<";"<<endl;
			ofile<<"\tassertEquals(expected,result);"<<endl;
			ofile<<"}"<<endl;
			
			ofileresult<<id<<","<<a<<","<<b<<","<<multiply(a,b)<<","<<multiply(a,b)<<","<<"Success"<<endl;
			
		}
	}
	
	
}
