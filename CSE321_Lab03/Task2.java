class a extends Thread{


    public static int Divisors;
    public static int ithmax;

    @Override
    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 1;  icount  <= 10000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }
            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }
        }


        System.out.println("integers between 1 and 10000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}

class b extends Thread{

    public static int Divisors;
    public static int ithmax;

    @Override
    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 10001;  icount  <= 20000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }



            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }
        }


        System.out.println("integers between 10001 and 20000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}

class c extends Thread{

    public static int Divisors;
    public static int ithmax;

    @Override
    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 20001;  icount  <= 30000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }
            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }
        }


        System.out.println("integers between 20001 and 30000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}


class d extends Thread{

    public static int Divisors;
    public static int ithmax;

    @Override
    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 30001;  icount  <= 40000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }

            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }
        }


        System.out.println("integers between 30001 and 40000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}



class e extends Thread{

    public static int Divisors;
    public static int ithmax;

    @Override
    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 40001;  icount  <= 50000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }

            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }
        }


        System.out.println("integers between 40001 and 50000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}


class f extends Thread{

    public static int Divisors;
    public static int ithmax;

    @Override
    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 50001;  icount  <= 60000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }



            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }



        }


        System.out.println("integers between 50001 and 60000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}

class g extends Thread{

    public static int Divisors;
    public static int ithmax;

    @Override
    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 60001;  icount  <= 70000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }



            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }



        }


        System.out.println("integers between 60001 and 70000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}


class h extends Thread{

    public static int Divisors;
    public static int ithmax;

    @Override
    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 70001;  icount  <= 80000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }



            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }



        }


        System.out.println("integers between 70001 and 80000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}

class i extends Thread{

    public static int Divisors;
    public static int ithmax;

    @Override
    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 80001;  icount  <= 90000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }

            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }
        }


        System.out.println("integers between 80001 and 90000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}


class j extends Thread{

    public static int Divisors;
    public static int ithmax;

    public void run() {

        int icount;

        Divisors = 1;

        ithmax = 1;

        for ( icount = 90001;  icount  <= 100000;  icount ++ ) {

            int D;

            int idivisorCount;

            idivisorCount = 0;

            for ( D = 1;  D <= icount;  D++ ) {

                if ( icount % D == 0 )

                    idivisorCount++;

            }
            if (idivisorCount > Divisors) {

                Divisors = idivisorCount;

                ithmax = icount;

            }

        }

        System.out.println("integers between 90001 and 100000");

        System.out.println("The maximum number of divisors are " + Divisors);

        System.out.println("A number with " + Divisors + " divisors is " +

                ithmax +" from "+ getName());

    }

}


class Task2 {

    public static void main(String[] args) {

        int num = 0;
        int fnum = 0;

        a az = new a();
        az.run();
        if(az.Divisors > fnum) {
            fnum = az.Divisors;
            num = az.ithmax;
        }

        System.out.println("  ");

        b ao = new b();
        ao.run();
        if(ao.Divisors > fnum) {
            fnum = ao.Divisors;
            num = ao.ithmax;
        }

        System.out.println("  ");

        c at = new c();
        at.run();
        if(at.Divisors > fnum) {
            fnum = at.Divisors;
            num = at.ithmax;
        }

        System.out.println("  ");

        d th = new d();
        th.run();
        if(th.Divisors > fnum) {
            fnum = th.Divisors;
            num = th.ithmax;
        }

        System.out.println("  ");

        e af = new e();
        af.run();
        if(af.Divisors > fnum) {
            fnum = af.Divisors;
            num = af.ithmax;
        }

        System.out.println("  ");

        f fi = new f();
        fi.run();
        if(fi.Divisors > fnum) {
            fnum = fi.Divisors;
            num = fi.ithmax;
        }

        System.out.println("  ");

        g as = new g();
        as.run();
        if(as.Divisors > fnum) {
            fnum = as.Divisors;
            num = as.ithmax;
        }


        System.out.println("  ");

        h se = new h();
        se.run();
        if(se.Divisors > fnum) {
            fnum = se.Divisors;
            num = se.ithmax;
        }

        System.out.println("  ");

        i ae = new i();
        ae.run();
        if(ae.Divisors > fnum) {
            fnum = ae.Divisors;
            num = ae.ithmax;
        }


        System.out.println("  ");

        j an = new j();
        an.run();
        if((an.Divisors > fnum) || (an.ithmax > num)) {
            fnum = an.Divisors;
            num = an.ithmax;

        }

        System.out.println("  ");

        System.out.println(num + " got the largest number of divisors from the results from Thread-0 to Thread-9 and divisor number is: " + fnum);

    }
}


