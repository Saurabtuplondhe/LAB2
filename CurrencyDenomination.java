import java.util.Scanner;

public class CurrencyDenomination {
	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of denominations");
		int s= sc.nextInt();
		int a[] = new int[s];
		System.out.println("Enter the denominatioins");
		for(int i=0;i<s;i++) {
			a[i] = sc.nextInt();
		}
		for(int i=0;i<s;i++) {
			for(int j = 1; j<(s-i);j++) {
				if(a[j-1]<a[j]) {
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println("How much amount do you want to pay");
		int pay = sc.nextInt();
		int i=0, j=0, q,r,t;
		int b[] = new int[s];
		int c[] = new int[s];
		int pay1 = pay;
		while(i<s) {
			temp = a[i];
			q=pay1/temp;
			r=pay1%temp;
			if(q!=0) {
				t=temp*q;
				pay1=pay1-t;
				b[j]=temp;
				c[j]=q;
				j++;
				if(pay1 == 0) {
					System.out.println("Your payment approach in order to give minimum number of notes is : ");
					for(int d=0;d<j;d++) {
						System.out.println(b[d]+":"+c[d]);
					}
					break;
				}
			}else if(q==0) {
				if(r!=0) {
					if(i!=a.length) {
						
					}else {
						System.out.println("Not Enough Denominations for correct output");
						break;
					}
				}else if(r==0) {
					break;
				}
			}
			i++;
		}
		sc.close();	
	}
}

