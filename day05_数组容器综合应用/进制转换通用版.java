//进制转换通用
//现在要求显示为正向的数字
//可以先把字符存放在字符数组中，然后逆向遍历数组或者直接将字符逆向存放数组。
//toString方法可以将字符数组转化为字符串
//去除多余的0

class demo
{
	public static void main(String[] args)
	{
		int num =60;
		System.out.println(toHex(num));
		System.out.println(toOctal(num));
	}
	
	//转十六
	public static String toHex(int num)
	{
		return  trans(num,4,15);
	}
	//转八
	public static String toOctal(int num)
	{
		return  trans(num,3,7);
	}
	
	//转二
	public static String toBinary(int num)
	{
		return  trans(num,1,1);
	}
	
	public static String trans(int num,int offset,int base)	
	{
		//建立一个表格
		char[] chs={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		char[] arr= new char[8];
		int index=arr.length;
		while(num!=0)
		{
			int tem=num & base;	
			arr[--index]=chs[tem];
			num=num >>> offset;
		}
		return toString(arr,index);
	}
	
	public static String toString(char[] arr,int index)   
	{
		String str="";
		for(int i=index;i<arr.length;i++)
		{	
			str=str+arr[i];
		}
		return str;
	}
}