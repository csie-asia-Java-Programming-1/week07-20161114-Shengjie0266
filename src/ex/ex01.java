package ex;
import java.util.Scanner;
/*
 * Date: 2016/11/14
 * Author: 105021040 �x�t��
 */
public class ex01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		double [] a=new double[n];
		double sum=0,t=0;
		for(int i=0;i<n;i++){
			a[i]=scn.nextDouble();
		}
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
		sum=sum/n;
		for(int i=0;i<n;i++){
			t=t+fun(a[i],sum);
		}
		System.out.println(t/n);
	}
	public static double fun(double a,double sum){
		a=(a-sum)*(a-sum);
		return a;
		}
}	
