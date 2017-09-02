import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
int a=400;
if((a%4)==0)
{
if((a%100)==0)
{
if((a%400)==0)
{
System.out.println("leap year");
}
}
}
else
{
System.out.println("not leap year");
}
}
}