import java.io.*;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Task3 extends RecursiveTask<Integer> {

    int start, end;
    int[] arr;

    private int partion(int start, int end,
                        int[] arr)
    {

        int i = start, j = end;

        int pivote = new Random().nextInt(j - i) + i;

        int t = arr[j];
        arr[j] = arr[pivote];
        arr[pivote] = t;
        j--;


        while (i <= j) {

            if (arr[i] <= arr[end]) {
                i++;
                continue;
            }

            if (arr[j] >= arr[end]) {
                j--;
                continue;
            }

            t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
            j--;
            i++;
        }
        t = arr[j + 1];
        arr[j + 1] = arr[end];
        arr[end] = t;
        return j + 1;
    }
    public Task3(int start, int end,int[] arr) {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute()
    {

        if (start >= end)
            return null;

        int p = partion(start, end, arr);

        Task3 left = new Task3(start, p - 1,  arr);

        Task3 right = new Task3(p + 1, end,arr);

        left.fork();
        right.compute();

        left.join();

        return null;
    }


    public static void main(String args[])
    {
        int m = 7;
        int[] a = { 7, 6, 5, 4, 3, 2, 1 };
        ForkJoinPool pool = ForkJoinPool.commonPool();
        pool.invoke(new Task3(0, m - 1, a));
        for (int i = 0; i < m; i++)
            System.out.print(a[i] + " ");
    }
} 
    

