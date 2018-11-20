class ArrayToolDemo
{
	public static void main(String[] args)
	{
		int[] arr = {3, 6, 5, 2, 8};

		int max = ArrayTool.getMax(arr);
		System.out.println("max = " + max);

		int min = ArrayTool.getMin(arr);
		System.out.println("min = " + min);

		ArrayTool.printArray(arr);
		ArrayTool.selectSort(arr);
		ArrayTool.printArray(arr);

	}
}
