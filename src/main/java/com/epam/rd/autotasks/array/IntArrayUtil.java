package com.epam.rd.autotasks.array;

public class IntArrayUtil {

	public static int maximumDistance(int[] array) {
		
        if (array == null) array = new int[]{};

        for (int arr : array) {
            if (arr < 0) {
                throw new IllegalArgumentException();
            }
        }

        if (array.length == 0 || array.length == 1) {
            return 0;
        }

        int maxDigit = 0;
        int index = 0;


        for (int i = 0; i < array.length; i++) {
            if (maxDigit <= array[i]) {
                maxDigit = array[i];
                index = i;
            }
        }
        return index -1;
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
