package asssignment1.day1;

public class AmstrongNumber {

	public static void main(String[] args) {
		
	int a=153, b, r, res=0;
	b=a;
	while(b!=0)
	{
		r=b%10;
		res+=Math.pow(r, 3);
		b/=10;
		
	}
if(res==a)
	System.out.println(a+ " is armstrong ");
else
	System.out.println(a+ " not a armstrong ");
	}

}
