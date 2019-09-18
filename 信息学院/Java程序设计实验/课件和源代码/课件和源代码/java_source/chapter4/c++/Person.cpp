 
#include <string>
#include <iostream>
using namespace std;
class Person
{ 
	//以下内容为属性部分
    public:
		string name;//姓名
	    string Id; //身份证 

	private:
		int   age;  //年龄 ：私有属性
    
	//以下部分为方法部分
	public:
		Person(){	}
	    Person(string name,string Id, int age){	
	       this->name=name; this->Id=Id;  this->age=age;
	    } 
	    void setName(string name){ this->name=name;}
	    string getName(){return name;}

	    void setId(string Id){ this->Id=Id;}
	    string getId(){return Id;} 
	   
		void setAge(int age){ this->age=age;}
	    int getAge(){return age;} 

	    string toString(){return "Person类";}

};

int main(int argc, char *argv[])
{
	Person p;
	cout<<p.toString();
	 
	return 0;
}
