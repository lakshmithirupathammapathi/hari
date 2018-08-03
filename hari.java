import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	static float sumofAP(float a,float d,int n)
	{
	float sum=0;
	for(int i=0;i<n;i++)
	{
		sum=sum+a;
		a=a+d;
	}
	return sum;

	}
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=3;
		float a=3.f;
		float d=2.f;
		System.out.println(sumofAP(a ,d ,n));
	}
		
	}
