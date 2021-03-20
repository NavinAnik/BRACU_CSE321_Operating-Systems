import java.util.*;
import java.io.*;
public class BK{
    public static void main(String[] args) throws Exception
    {
        BufferedReader ab = new BufferedReader(new FileReader("C:\\Users\\Anik\\AppData\\Roaming\\JetBrains\\IdeaIC2020.3\\scratches\\input1.txt"));

        int a=Integer.parseInt(ab.readLine());
        int d=Integer.parseInt(ab.readLine());

        String[] b = new String[a];
        int[][] c = new int[a][d];
        int[][] e = new int[a][d];
        int[][] f = new int[a][d];
        int[][] g = new int[a+1][d];
        LinkedList<Integer> track = new LinkedList<Integer>();

        String s3=ab.readLine();
        StringTokenizer st3 = new StringTokenizer(s3, " ");
        int n=0;

        while(st3.hasMoreTokens())
        {
            b[n]=st3.nextToken();
            n++;
        }

        for(int i=0; i<a; i++)
        {
            String s=ab.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");

            for(int j=0; j<d; j++)
            {
                c[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<a; i++)
        {
            String s=ab.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");

            for(int j=0; j<d; j++)
            {
                e[i][j]=Integer.parseInt(st.nextToken());
                f[i][j]=c[i][j]-e[i][j];
            }
        }

        System.out.print("Need Matrix:");
        for(int i=0; i<a; i++)
        {
            System.out.println();

            for(int j=0; j<d; j++)
            {
                System.out.print(f[i][j]+" ");
            }
        }

        System.out.println();
        String s=ab.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int counter=0;
        while(st.hasMoreTokens())
        {
            g[0][counter]=Integer.parseInt(st.nextToken());
            counter++;
        }

        counter=0;
        for(int i=0;;i++)
        {
            i=i%a;
            boolean flag=true;

            for(int j=0; j<d; j++)
            {
                if(f[i][j]<=g[counter][j])
                {

                }

                else
                    {
                    flag=false;
                    break;
                }

                if(flag && j==(d-1) && !track.contains(i))
                {
                    for(int k=0; k<d; k++){
                        g[counter+1][k]=g[counter][k]+e[i][k];
                    }

                    track.addLast(i);
                    counter++;
                }
            }

            if(track.size()==a)
            {
                break;
            }
        }

        System.out.println("Safe sequence:");
        for(int i=0; i<track.size(); i++)
        {
            System.out.print(b[track.get(i)]+" ");
        }

        System.out.println();

        System.out.print("Change in available resource matrix: ");
        for(int i=1; i<g.length; i++)
        {
            System.out.println();

            for(int j=0; j<d; j++){
                System.out.print(g[i][j]+" ");
            }
        }

        System.out.println();
    }
}