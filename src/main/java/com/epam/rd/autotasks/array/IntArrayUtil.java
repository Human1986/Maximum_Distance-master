package com.epam.rd.autotasks.array;

public class IntArrayUtil {

	public static int maximumDistance(int[] array) {
		
         if (array == null) array = new int[]{};


        if (array.length == 0 || array.length == 1) {
            return 0;
        }

        int max_num1 = 0;
        int max_num2 = 0;
        int dist = 0;
        int first;
        int second = 0;


        for (int i = 0; i < array.length; i++) {
            if (max_num1 < array[i]) {
                max_num1 = array[i];
                first = i;
                for (int j = array.length - 1; j > 0; j--) {
                    if (max_num2 < array[j]) {
                        max_num2 = array[j];
                        second = j;
                    }
                }
                dist = second - first;
            }
        }
        return dist;
	}

	public static void main(String[] args) {
		{
			int[] array = null;
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] {};
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 4, 100, 3, 4 };
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 5, 50, 50, 4, 5 };
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 5, 350, 350, 4, 350 };
			System.out.println("result = " + maximumDistance(array));
		}
		{
			int[] array = new int[] { 10, 10, 10, 10, 10 };
			System.out.println("result = " + maximumDistance(array));
		}
	}

}
