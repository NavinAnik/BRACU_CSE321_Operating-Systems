public class task3
{
    static void wT(int pid[], int n,
                            int bt[], int wt[], int qt)
    {
        int rt[] = new int[n];
        for (int i = 0 ; i < n ; i++){
            rt[i] =  bt[i];
        }


        int t = 0;
        while(true)
        {



            boolean done = true;


            for (int i = 0 ; i < n; i++)
            {


                if (rt[i] > 0)
                {


                    done = false;



                    if (rt[i] > qt)
                    {


                        t += qt;
                        rt[i] -= qt;
                    }


                    else


                    {
                        t = t + rt[i];
                        wt[i] = t - bt[i];
                        rt[i] = 0;
                    }
                }

            }

            if (done == true)


                break;
        }
    }
    static void tT(int pid[], int n, int bt[], int wt[], int tat[])
    {
        for (int i = 0; i < n ; i++)
            tat[i] = bt[i] + wt[i];
    }
    static void avgTime(int pid[], int n, int bt[],
                        int quantum)
    {

        int wt[] = new int[n], tat[] = new int[n];
        int twt = 0, atat = 0;
        String pid1[] = new String[] {"p1", "p2", "p3"};
        wT(pid, n, bt, wt, quantum);
        tT(pid, n, bt, wt, tat);
        System.out.println("Processes " + " Burst" +
                " Waiting" + " Turn around" + " Completion");
        for (int i=0; i<n; i++)
        {
            twt = twt + wt[i];
            atat = atat + tat[i];
            System.out.println(" " + pid1[i] + "\t\t" + bt[i] +"\t " +
                    wt[i] +"\t\t " + tat[i]+"\t\t" + tat[i]);
        }

        System.out.println("Average waiting time = " +
                (float)twt / (float)n);
        System.out.println("Average turn around time = " +
                (float)atat / (float)n);
    }

    public static void main(String[] args)
    {
        int pid[] = { 1, 2, 3};
        String pid1[] = new String[] {"p1", "p2", "p3"};
        int n = pid.length;
        int btime[] = {24, 3, 3};
        int q = 4;
        avgTime(pid, n, btime, q);
    }
} 