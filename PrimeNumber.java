package asssignment1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int a= 13;
boolean f= false;
for(int i=2;i<=a/2;++i)
{
	if(a%i==0)
	{
		f=true;
		break;
	}
}
if(!f)

	System.out.println("prime number is " +a);
	

else

	System.out.println("non prime number is " +a);

	

}}
