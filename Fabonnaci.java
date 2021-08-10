package asssignment1.day1;

public class Fabonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstNum=0, secNum=1,sum,i,count=8;
System.out.println(firstNum+" "+secNum);
for(i=2;i<count;++i)
{
	sum=firstNum+secNum;
	System.out.println(" "+sum);
	firstNum = secNum;
	secNum=sum;
}

	}

}
