//������ת��Ϊʮ������
//����Ҫ����ʾΪ�����ʮ��������
//�����Ȱ��ַ�������ַ������У�Ȼ����������������ֱ�ӽ��ַ����������顣
//toString�������Խ��ַ�����ת��Ϊ�ַ���
//ȥ�������0
//ʹ�ò��
class demo
{
	public static void main(String[] args)
	{
		int num =99;
		System.out.println(toHex(num));
	}
	
	public static String toHex(int num)	
	{
		//����һ�����
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