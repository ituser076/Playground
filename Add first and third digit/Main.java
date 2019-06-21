#include<stdio.h>
int main()
{
  //Type your code here
  int a,m,n,sum;
  scanf("%d",&a);
  m=a/100;
  n=a%10;
  sum=m+n;
  printf("%d",sum);
  return 0;
}