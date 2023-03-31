public class bubbleSort
{
    public static void main(String[] args) 
    {
        int [] someNums = {88, 33, 99, 22, 54};

        System.out.println("Array before sorting: ");
        printArray(someNums);

        // System.out.print("BUBBLE SORT");
        // ascSort(someNums);
        // System.out.println("\nArray after sorting in ascending order: ");
        // printArray(someNums);

        System.out.print("\nINNSERTION SORT");
        insertionSort(someNums);
        System.out.println("\nArray after using Insertion Sort: ");
        printArray(someNums);
    }

        // descSort(someNums);
        // System.out.println("\nArray after sorting in descending order: ");
        // printArray(someNums);


    public static void ascSort(int [] someNums)
    {
        int temp;
        int size = someNums.length-1;
        int comparsionCount = someNums.length-1;
        for (int a = 0; a < size; a++)  // control the number of passes
        {
            for (int i = 0; i < comparsionCount; i++)  // comparsion loops
            {
                if (someNums[i] > someNums[i + 1])
                {
                    temp = someNums[i];
                    someNums[i] = someNums[i + 1];
                    someNums[i + 1] = temp;
                }
            }
            System.out.print("\nIteration " + (a+1) + ": ");
            printArray(someNums);
            --comparsionCount;
        }
    }

    public static void descSort(int [] someNums)
    {
        int temp;
        int size = someNums.length-1;
        int comparsionCount = someNums.length-1;
        for (int a = 0; a < size; a++)  // control the number of passes
        {
            for (int i = 0; i < comparsionCount; i++)  // comparsion loops
            {
                if (someNums[i] < someNums[i + 1])
                {
                    temp = someNums[i];
                    someNums[i] = someNums[i + 1];
                    someNums[i + 1] = temp;
                }
            }
            --comparsionCount;
        }
    }
    
    public static void insertionSort(int [] someNums)
    {
        int a = 1, b, temp;
        while (a < someNums.length)
        {
            temp = someNums[a];
            b = a - 1;
            while (b >= 0 && someNums[b] > temp)
            {
                someNums[b + 1] = someNums[b];
                b--;
    

            }
            someNums[b + 1] = temp;
            System.out.print("\nIteration " + (a+1) + ": ");
            printArray(someNums);
            a++;
        }
    }

    public static void printArray(int [] someNums)
    {
        for (int i = 0; i < someNums.length; i++)
        {
            System.out.print(someNums[i] + " ");
        }
    }
}