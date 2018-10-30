//二进制转化为十六进制
//现在要求显示为正向的十六进制数
//可以先把字符存放在字符数组中，然后逆向遍历数组或者直接将字符逆向存放数组。
//toString方法可以将字符数组转化为字符串
//去除多余的0
//使用查表法
class demo
{
	public static void main(String[] args)
	{
		int num =99;
		System.out.println(toHex(num));
	}
	
	public static String toHex(int num)	
	{
		//建立一个表格
		char[] chs={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		char[] arr= new char[8];
		int index=arr.length;
		while(num!=0)
		{
			int tem=num & 15;	
			arr[--index]=chs[tem];
			num=num >>> 4;
		}
		return "0x"+toString(arr,index);
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