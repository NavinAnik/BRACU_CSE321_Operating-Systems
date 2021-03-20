import java.util.Scanner;

public class task2
{

    int bT[];
    int pt[];
    int aT[];
    String[] pId;
    int nP;

    void getData(Scanner input)
    {
        System.out.print("Enter the number of Process for Scheduling           : ");
        int inputNumberOfProcess = input.nextInt();
        nP = inputNumberOfProcess;
        bT = new int[nP];
        pt = new int[nP];
        aT = new int[nP];
        pId = new String[nP];
        String st = "P";
        for (int i = 0; i < nP; i++)
        {
            pId[i] = st.concat(Integer.toString(i));
            System.out.print("burst time   for Process" + (i) + " : ");
            bT[i] = input.nextInt();
            System.out.print("arrival time for Process" + (i) + " : ");
            aT[i] = input.nextInt();
            System.out.print("priority for Process" + (i) + " : ");
            pt[i] = input.nextInt();
        }
    }

    void sortPriority(int[] at, int[] bt, int[] prt, String[] pid)
    {

        int temp;
        String stemp;
        for (int i = 0; i < nP; i++)
        {

            for (int j = 0; j < nP - i - 1; j++)
            {
                if (at[j] > at[j + 1])
                {
                    //swapping arrival time
                    temp = at[j];
                    at[j] = at[j + 1];
                    at[j + 1] = temp;

                    //swapping burst time
                    temp = bt[j];
                    bt[j] = bt[j + 1];
                    bt[j + 1] = temp;

                    //swapping priority
                    temp = prt[j];
                    prt[j] = prt[j + 1];
                    prt[j + 1] = temp;

                    //swapping process identity
                    stemp = pid[j];
                    pid[j] = pid[j + 1];
                    pid[j + 1] = stemp;

                }
                //sorting according to priority when arrival timings are same
                if (at[j] == at[j + 1])
                {
                    if (prt[j] > prt[j + 1])
                    {
                        //swapping arrival time
                        temp = at[j];
                        at[j] = at[j + 1];
                        at[j + 1] = temp;

                        //swapping burst time
                        temp = bt[j];
                        bt[j] = bt[j + 1];
                        bt[j + 1] = temp;

                        //swapping priority
                        temp = prt[j];
                        prt[j] = prt[j + 1];
                        prt[j + 1] = temp;

                        //swapping process identity
                        stemp = pid[j];
                        pid[j] = pid[j + 1];
                        pid[j + 1] = stemp;

                    }
                }
            }

        }
    }

    void priorityAlgorithm()
    {
        int finishTime[] = new int[nP];
        int bt[] = bT.clone();
        int at[] = aT.clone();
        int prt[] = pt.clone();
        String pid[] = pId.clone();
        int waitingTime[] = new int[nP];
        int turnAroundTime[] = new int[nP];

        sortPriority(at, bt, prt, pid);

        //calculating waiting & turn-around time for each process
        finishTime[0] = at[0] + bt[0];
        turnAroundTime[0] = finishTime[0] - at[0];
        waitingTime[0] = turnAroundTime[0] - bt[0];

        for (int i = 1; i < nP; i++)
        {
            finishTime[i] = bt[i] + finishTime[i - 1];
            turnAroundTime[i] = finishTime[i] - at[i];
            waitingTime[i] = turnAroundTime[i] - bt[i];
        }
        float sum = 0;
        for (int n : waitingTime)
        {
            sum += n;
        }
        float averageWaitingTime = sum / nP;

        sum = 0;
        for (int n : turnAroundTime)
        {
            sum += n;
        }
        float averageTurnAroundTime = sum / nP;

        //print on console the order of processes along with their finish time & turn around time
        System.out.println("Priority Scheduling Algorithm : ");
        System.out.println("ProcessId     "+"BurstTime    "+"ArrivalTime    "+"Priority    "+"FinishTime    "+"WaitingTime    "+"TurnAroundTime");
        for (int i = 0; i < nP; i++) {
            System.out.println(pid[i]+"           "+bt[i]+"         "+at[i]+"         "+prt[i]+"         "+finishTime[i]+"         "+waitingTime[i]+"         "+turnAroundTime[i]);
        }
        System.out.println("AverageWaitingTime "+ averageWaitingTime);
        System.out.println("AverageTurnAroundTime "+averageTurnAroundTime);
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        task2 obj = new task2();
        obj.getData(input);
        obj.priorityAlgorithm();
    }
}