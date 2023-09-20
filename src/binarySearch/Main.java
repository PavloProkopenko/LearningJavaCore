package binarySearch;
// QuickSort + BinarySearch
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arraySize = 500;
        int N = 1000;

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++)
        {
            Random rand = new Random();
            array[i] = rand.nextInt(N);
        }

        QuickSort(array, 0, arraySize -1);

        Scanner scan = new Scanner(System.in);

        System.out.print("Input number which you want to search: ");
        int searchNumber = scan.nextInt();

        int position = binarySearch(array, 0, arraySize - 1, searchNumber);

        if (position == -1)
        {
            System.out.println("This number doesn't exist in array.");
        }
        else
        {
            System.out.print("This number exist in array!\nPosition: " + position);
        }

    }
    static int binarySearch(int[] array, int low, int high, int searchNumber )
    {
        int middle;

        do {
            middle = low + (high - low) / 2;

            if (searchNumber < array[middle])
                high = --middle;
            else
            if(searchNumber > array[middle])
                low = ++middle;
            else
                return middle;
            if (low > high)
                return -1;
        }while (true);
    }

    static void QuickSort (int[] array, int from, int to)
    {
        int middle, i, j, temp;

        if (from >= to)
            return;

        i = from;
        j = to;
        middle = array[(from + to) / 2];

        while(i <= j)
        {
            while(array[i] < middle)
            {
                i++;
            }
            while(array[j] > middle)
            {
                j--;
            }

            if (i <= j)
            {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        QuickSort(array, from, j);
        QuickSort(array, i, to);
    }
}