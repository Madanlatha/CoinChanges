package coinChange;

import java.util.Scanner;

public class Coins {
	public static int coinschanges(int arr[],int n,int amount) {
		int count=0;
		int sum=0;
		int i=n-1;
		while(sum!=amount && i>=0 ) {
			if(sum+arr[i]<=amount) {
				sum=sum+arr[i];
				count++;
			}
			else {
				i--;
			}
		}
		
		
	
	if(sum==amount) {
		return count;
	}
	else {
		return -1;
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int amount=sc.nextInt();
		int value=coinschanges(arr,n,amount);
		System.out.println(value);
	}

}
