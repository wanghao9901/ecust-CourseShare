char* getName(struct SuperStar *star)
{
    return star->name;
}
void setName(struct SuperStar *star,char *name)
{
    star->name=name;
	return; 
}
int getAge(struct SuperStar *star)
{		  
		  int young =makeUp(20);		  
		  return star->age-young;
}
 void setAge(struct SuperStar *star,int age)
{    
		  star->age=age;
		  return  ; 
} 
 
 int makeUp(int age) //��ױ������age��
 { 
    return age;
 }

