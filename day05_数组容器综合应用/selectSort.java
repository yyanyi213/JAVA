//选择排序算法
class demo
{
	public static void main(String[] args)
	{
		int[] arr={11,433,54,21,6,8};
		print(arr);
		selectSort(arr);
		print(arr);
	}
	
	//算法
	public static void selectSort(int[] arr) 
    {
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)				
			{
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
	}
	
	//打印算法
	public static void print(int[] arr)
    {
		for(int i=0;i<arr.length;i++)
			if(i!=arr.length-1)
				System.out.print(arr[i]+",");
			else
				System.out.println(arr[i]);
	}
}