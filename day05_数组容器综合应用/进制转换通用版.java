//����ת��ͨ��
//����Ҫ����ʾΪ���������
//�����Ȱ��ַ�������ַ������У�Ȼ����������������ֱ�ӽ��ַ����������顣
//toString�������Խ��ַ�����ת��Ϊ�ַ���
//ȥ�������0

class demo
{
	public static void main(String[] args)
	{
		int num =60;
		System.out.println(toHex(num));
		System.out.println(toOctal(num));
	}
	
	//תʮ��
	public static String toHex(int num)
	{
		return  trans(num,4,15);
	}
	//ת��
	public static String toOctal(int num)
	{
		return  trans(num,3,7);
	}
	
	//ת��
	public static String toBinary(int num)
	{
		return  trans(num,1,1);
	}
	
	public static String trans(int num,int offset,int base)	
	{
		//����һ�����
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