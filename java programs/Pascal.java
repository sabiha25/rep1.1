import java.io.*;
import java.util.*;
class Pascal
{
public static long factorial(int n)
{
if(n<=1)
return
else
return(n*factorial(n-1));
}
public static void main(String args[])
{
int n=6;
for(i=0; i<n; i++)
{
System.out.println();
for(int j=0; j<=i; j++)
System.out.println(" "+factorial(i)/factorial(j)*factorail(i-j));
}}}