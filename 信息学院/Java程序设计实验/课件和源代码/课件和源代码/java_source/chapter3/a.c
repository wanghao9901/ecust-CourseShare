

#include "malloc.h"
#include "stdio.h"
void m(){
    char *name=NULL;
	char *p=NULL;
	int *age=0; // int *age=NULL;
	name=(char*)malloc(10*sizeof(char));
	age=(int*)malloc( sizeof(age));

	scanf("%s",name); //puts(name);	//name="11111";  
	*age=30; 
	p="dfdf";

    printf("��ַ��%d    %d\n ",age,*age);
    printf("name: %s\n",name);
    printf("%s\n",p);
	free(name);
}
void main(){
	 m();
}