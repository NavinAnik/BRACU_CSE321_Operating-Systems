import java.util.*;

public class task1 {
    public static void main (String args[])
    {
        int n=4;
        String p[] = new String[] {"p1", "p2", "p3", "p4"};
        int a[] = {0,1,2,3};
        int b[] = {8,4,9,5};
        int bc[] = {8,4,9,5};
        int c[] = new int[n];
        int d[] = new int[n];
        int w[] = new int[n];
        int f[] = new int[n];
        int k[]= new int[n];
        int i, st=0, tot=0;
        float avgwt=0, avgta=0;

        while(true){
            int min=99,ca=n;
            if (tot==n)
                break;

            for ( i=0;i<n;i++)
            {
                if ((a[i]<=st) && (f[i]==0) && (b[i]<min))
                {
                    min=b[i];
                    ca=i;
                }
            }

            if (ca==n)
                st++;
            else
            {
                b[ca]--;
                st++;
                if (b[ca]==0)
                {
                    c[ca]= st;
                    f[ca]=1;
                    tot++;
                }
            }
        }

        for(i=0;i<n;i++)
        {
            d[i] = c[i] - a[i];
            w[i] = d[i] - bc[i];
            avgwt+= w[i];
            avgta+= d[i];
        }

        System.out.println("pid  arrival  burst  complete turn waiting");
        for(i=0;i<n;i++)
        {
            System.out.println(p[i] +"\t"+ a[i]+"\t"+ bc[i] +"\t\t"+ c[i] +"\t"+ d[i] +"\t"+ w[i]);
        }

        System.out.println("\naverage turn around time is "+ (float)(avgta/n));
        System.out.println("average waiting time is "+ (float)(avgwt/n));

    }
}