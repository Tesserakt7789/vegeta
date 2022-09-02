import javax.swing.text.MutableAttributeSet;
import java.nio.channels.Pipe;
import java.util.Arrays;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.math.BigDecimal;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {

    public static void main(String[] args) {
  /*double y = 5;
        double x = 7;
        double k =y + 1;
        double c = Math.pow(x,2)+1;
        double d = Math.pow(c,6);
        double h = Math.pow(x,2)-3;
        double f = Math.sin(h);
        double e = Math.tan(y);
        double z = k * (x + d * f - e);
        System.out.println(z);

   */


        /*  //2
        double x = 78;
        double y = 0;
        double a = Math.pow(x,2)-4;
        double b = Math.pow(y,2)+2;
        double c = a / b;
        double e = Math.sqrt(Math.pow(x,2)+1);
        double h = Math.sin(e);
        double f = Math.pow(2,h);
        double z = c + f;
        System.out.println(z);

         */


/*
        double x = 20;
        double y = 6;
        double a = Math.abs (Math.pow(x,2) - y);
        double b = Math. pow(x,2) + Math.pow(y,2);
        double c = 1 / Math.tan(a/b);
        double e = Math.pow(x,2) + 1;
        double h = Math.log10 (e);
        double f = c + h;
        System.out.println(f);

 */

        /*
        double x = 18;
        double e = 13;
        double a = Math.pow(e,x) + 1;
        double b = Math.log(a);
        double c = Math.cbrt(Math.pow(x,2) + 4);
        double f = b + c;
        System.out.println(f);
        */
        /*

         double x = 77;
         double y = 0.5;
         double a = Math.pow(2,x) - 5;
         double b = Math.pow(3,y) + 2;
         double c = a / b;
         double q = Math.abs(x) + 1;
         double r = Math.pow(q,4);
         double e = Math.pow(y,2) + r;
         double h = Math.log(2) / Math.log(e);
         double f = c + h;
        System.out.println(f);

         */

/*
        double x = 50;
        double y = -858.9;
        double a = 3 * x + 4;
        double b = Math.pow(y,2) + 4;
        double c = a / b;
        double r = Math.atan(c);
        double g = Math.pow(x,2) + 3;
        double q = Math.pow(g,3);
        double e = Math.sqrt(q);
        double f = r + e;
        System.out.println(f);

 */
        /*
        double x = Math.sqrt(96);
        double y = Math.cbrt(48);
        double a = Math.pow(x,2) + Math.pow(y,2);
        double b = Math.pow(a,5);
        double c = b + 4;
        double g = Math.pow(c,7);
        double e = x + y;
        double h = Math.cos(e);
        double f = Math.sin(h);
        double q = g + f;
        System.out.println(q);

         */
/*
        double x = 5;
        double y = 5;
        double a = Math.pow(y,2) + 4;
        double b = Math.cbrt(a);
        double c = Math.pow(x,2) + b;
        double f = Math.pow(c,(double) 1/4);
        double z = Math.abs(x) + Math.abs(y);
        double h = Math.pow(z,10);
        double e = f + h;
        System.out.println(e);
*/

/*
        double x = 68;
        double y = 86;
        double k = Math.pow(y,2) + 4;
        double n = Math.pow(k,3);
        double m = x + 4;
        double v = m / n;
        double z = Math.pow(v,1/5f);
        double a = x + z;
        double h = Math.pow(a,2);
        double b = Math.sin(h);
        double e = 3 * z + y / Math.pow(x,2);
        double f = b + e;
        System.out.println(f);

 */

/*
        double x = 192;
        double y = 72;
        double e = 17;
        double a = x + y;
        double b = Math.cos(a) + 1;
        double z = Math.pow(Math.sin(b),2);
        double f = Math.PI / 12 + x;
        double q = Math.sin(f);
        double j = y + z;
        double t = Math.PI + Math.pow(z,2);
        double p = Math.cos(j / t);
        double v = z + 4;
        double u = Math.pow(e,v);
        double i = p + u;
        double c = q * i;
        System.out.println(c);

 */
//        String name="sdd";
//        System.out.printf("Name; %s \n",name);
//        System.out.println("Name; "+

//        Scanner in=new Scanner(System.in);
//        System.out.println("input number");
//        double n=in.nextDouble();

        // in.close();
/*
       Scanner in=new Scanner(System.in);
        System.out.println("input a");
        int a=in.nextInt();
        System.out.println("input b");
        int b=in.nextInt();
        System.out.println("input x");
        int x=in.nextInt();

        double y=0;
        double k=Math.pow(a,2)+Math.pow(b,2);
        double d=3*(Math.pow(Math.E,a-x)+Math.log(3)/Math.log(k+5));
        double f=Math.pow(Math.tan(a+b),4);

        if(k>5){
            y=d;

        }
        else if(k<1){
            y=f;
        }
        else{
            y=-3;



        }
        System.out.println(y);

 */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input a");
        int a = in.nextInt();
        System.out.println("input x");
        int x = in.nextInt();
        double Y = 0;
        double k = 1 + Math.pow(a,2);
        double b = Math.pow(k,6);
        double d = Math.abs(x) + Math.pow(x,8);
        double c = Math.pow(Math.log(d),2);
        double e = Math.cos(c);

        if (-5<=x && x<=5) {
            Y=b;

        }
        else if (x>5) {
            Y=e;

        }
        else {
            Y=a;
        }
        System.out.println(Y);

         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input a");
        int a = in.nextInt();
        System.out.println("input x");
        int x = in.nextInt();
        System.out.println("input b");
        int b = in.nextInt();

        double Y = 0;
        double k = a+x;
        double c = a + Math.abs(b);
        double v = Math.pow(Math.E,Math.abs(k));
        double i = v*Math.pow(Math.cos(k+b),2);
        double z = Math.cbrt(Math.atan(k));

        if (c<-5) {
            Y=i;
        }
        else if (c>2){
            Y=z;
        }
        else  {
            Y=z;
        }
        System.out.println(Y);

         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input a");
        int a = in.nextInt();
        System.out.println("input b");
        int b = in.nextInt();

        double Y = 0;
        double k = a + b;
        double c = Math.pow(Math.atan(k),1/5f);
        double e = Math.log(8) / Math.log(k);
        double v = Math.pow(e,2);
        double g = Math.pow(a,15);

        if (k<3) {
            Y = c;
        }
        else if (k>5) {
            Y = v;
        }
        else  {
            Y = g;
        }
        System.out.println(Y);

         */
/*
        Scanner in = new Scanner(System.in);
        System.out.println("input b");
        int b = in.nextInt();
        System.out.println("input c");
        int c = in.nextInt();
        System.out.println("input a");
        int a = in.nextInt();
        System.out.println("input x");
        int x = in.nextInt();

        double Y = 0;
        double k = b + Math.pow(Math.tan(c+a), 1/5f);
        double e = Math.abs(x) + Math.pow(x,8);
        double h = Math.pow(Math.log(e),2);
        double f = Math.cos(h);
        double i = Math.pow(a,-10);

        if (c>-1 && c<1) {
            Y = k;
        }
        else if (c<=-1) {
            Y = f;
        }
        else {
            Y = i;
        }
        System.out.println(Y);

 */






        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input a");
        int a = in.nextInt();
        System.out.println("input x");
        int x = in.nextInt();

        double Y = 0;
        double k = Math.pow(Math.cos(Math.pow(x,2)),2);
        double j = Math.abs(x + a);
        double e = Math.pow(Math.sin(j),2);
        double i = e + k;
        double v = Math.pow(a,2) + Math.pow(x,4);
        double g = Math.log(2) / Math.log(v);
        double n = Math.pow(a,2) + Math.pow(x,2);
        double h = Math.pow(n,1/4f);
        double f = h * i;

        if (Math.abs(a)<3) {
            Y = i;
        }
        else {
            Y = f;
        }
        System.out.println(Y);

         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input z");
        int z = in.nextInt();
        System.out.println("input a");
        int a = in.nextInt();

        double Y = 0;
        double b = Math.tan(z+a);
        double c = 4 + Math.pow(a,2);
        double o = Math.log(2) / Math.log(c);
        double e = Math.pow(o,5);
        double v = e + b;
        double h = Math.pow(z,4) + (4 * a);
        double f = Math.pow(h,5);

        if (Math.abs(a)>3) {
            Y = v;
        }
        else {
            Y = f;
        }
        System.out.println(Y);

         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        System.out.println("input z");
        int z = in.nextInt();

        double Y = 0;
        double g = Math.abs(x + 1);
        double k = Math.pow(Math.E,g);
        double o = Math.abs(x) + (Math.abs(z) * 2);
        double v = Math.pow(o,1/4f);
        double h = v + k;
        double a = x + z;
        double b = Math.pow(a,7);
        double c = Math.pow(Math.tan(b),2);

        if (1<=x && x<=7) {
            Y = h;
        }
        else {
            Y = c;
        }
        System.out.println(Y);

         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input a");
        int a = in.nextInt();
        System.out.println("input b");
        int b = in.nextInt();
        System.out.println("input c");
        int c = in.nextInt();

        double Y = 0;
        double k = a + b;
        double e = Math.pow(a,2) + Math.pow(b,2) + 2;
        double v = 1 / Math.tan(e);
        double h = Math.pow(v,2);
        double t = Math.pow(10,-7);

        if (k<7) {
            Y = h;
        }
        else {
            Y = t;
        }
        System.out.println(Y);

         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        System.out.println("input a");
        int a = in.nextInt();
        System.out.println("input b");
        int b = in.nextInt();

        double Y = 0;
        double k = Math.tan(a + Math.pow(b,2));
        double c = x + a + b;
        double v = Math.pow(Math.E,Math.cos(c));
        double g = v * k;
        double u = 4 + Math.pow(a,2) + Math.pow(b,2);
        double h = Math.log(3) / Math.log(u);

        if (a<3) {
            Y = g;
        }
        else  {
            Y = h;
        }
        System.out.println(Y);

         */
        /*

        Scanner OR = new Scanner(System.in);
        System.out.println("input a");
        int a = OR.nextInt();
        System.out.println("input b");
        int b = OR.nextInt();
        System.out.println("input c");
        int c = OR.nextInt();
        System.out.println("input d");
        int d = OR.nextInt();
        int z = a%2!=0 && b%2!=0 || c%2!=0 && d%2!=0 || a%2!=0 && c%2!=0 || a%2!=0 && d%2!=0 || b%2!=0 && c%2!=0? 1:2;
        System.out.println(z);

         */


        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input a");
        int a = OR.nextInt();
        System.out.println("input b");
        int b = OR.nextInt();
        System.out.println("input c");
        int c = OR.nextInt();
        System.out.println("input d");
        int d = OR.nextInt();
     boolean z=d/c==c/b &&  c/b==b/a?  true:false;
        System.out.println(z);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input a");
        int a = OR.nextInt();
        System.out.println("input b");
        int b = OR.nextInt();
        System.out.println("input c");
        int c = OR.nextInt();
        System.out.println("input d");
        int d = OR.nextInt();
        if (a>b && a>c && a>d && b>c && b>d) {
            System.out.println(a+" "+b+" " +c+" "+d);
        }
        else if (a>b && a>d && a>c && b>d && b>c) {
            System.out.println(a+" "+b+" "+d+" "+c);
        }
        else  if (a>d && a>b && a>c && d>b && d>c) {
            System.out.println(a+" "+d+" "+b+" "+c);
        }
        else if (a>d && a>c && a>b && d>c && d>b) {
            System.out.println(a+" "+d+" "+c+" "+b);
        }
        else if (a>c && a>d && a>b && c>d && c>b) {
            System.out.println(a+" "+c+" "+d+" "+b);
        }
        else if (a>c && a>b && a>d && c>b && c>d) {
            System.out.println(a+" "+c+" "+b+" "+d);
        }
        else if (b>a && b>c && b>d && a>c && a>d) {
            System.out.println(b+" "+a+" "+c+" "+d);
        }
        else if (b>a && b>d && b>c && a>d && a>c) {
            System.out.println(b+" "+a+" "+d+" "+c);
        }
        else if (b>d && b>a && b>c && d>a && d>c) {
            System.out.println(b+" "+d+" "+a+" "+c);
        }
        else if () {
            System.out.println(b+" "+d+" "+c+" "+a);
        }
        else if () {
            System.out.println(b+" "+c+" "+d+" "+a);
        }
        else  if () {
            System.out.println(b+" "+c+" "+a+" "+d);
        }
        else if () {
            System.out.println();
        }

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input x");
        int x = OR.nextInt();

        double Y = 0;
        double s = Math.sin(5 * x);
        double a = Math.tan(1 + x);
        double b = 1 + x;
        double v = 1 / b;

        if (x>=-1 && x<0) {
            Y = s;
        }
        else if (x>=0 && x<1) {
            Y = a;
        }
        else if (x>=1 && x<=2) {
            Y = v;
        }
        System.out.println(Y);

         */


/*
        Scanner OR = new Scanner(System.in);
        System.out.println("input x");
        int x = OR.nextInt();

        double Y = 0;
        double f = 2 + Math.cos(x);
        double a = Math.log(6 * x);
        if (x>=1 && x<2) {
            Y=x;
        }
        else if (x>=2 && x<3) {
            Y=f;
        }
        else if (x>=3 && x<=4){
            Y=a;
        }
        System.out.println(Y);

 */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input x");
        int x = OR.nextInt();

        double Y = 0;
        double a = Math.tan(x) / 2;
        double n = Math.sin(x) / x;
        double m = Math.pow(x,3);

        if (x>=0 && x<0.8) {
            Y = a;
        }
        else if (x>=0.8 && x<1.3) {
            Y = n;
        }
        else if (x>=1.3 && x<=2) {
            Y = m;
        }
        System.out.println(Y);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input x");
        int x = OR.nextInt();

        double Y = 0;
        double a = Math.pow(Math.E,x) *4;
        double c = Math.pow(x,2) + 2 * x;
        double m = Math.PI;

        if (x>=-2 && x<-1.4) {
            Y = a;
        }
        else if (x>=-1.4 && x<=0) {
            Y = c;
        }
        else  if (x>=-0.4 && x<=0) {
            Y = m;
        }
        System.out.println(Y);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input x");
        int x = OR.nextInt();

        double Y = 0;
        double a = Math.atan(x);
        double z = Math.cos(x) * Math.sin(x);
        double b = Math.pow(Math.E,x) + Math.pow(Math.E,-x) / 2;

        if (x>=0.1 && x<0.8) {
            Y = a;
        }
        else if (x>=0.8 && x<1.3) {
            Y = z;
        }
        else if (x>=1.3 && x<=1.8) {
            Y = b;
        }
        System.out.println(Y);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input x");
        int x = OR.nextInt();

        double Y = 0;
        double a = Math.abs(x);
        double b = 2 + x;
        double c = Math.pow(2,x) + 1;

        if (x>=-0.5 && x<0) {
            Y = a;
        }
        else if (x>=0 && x<0.5) {
            Y = b;
        }
        else if (x>=0.5 && x<=1) {
            Y = c;
        }
        System.out.println(Y);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input x");
        int x = OR.nextInt();
        double Y = 0;
        double a = x + 1.5;
        double e = 10 / a;
        double b = Math.pow(2,x) - 2;
        double c = Math.sqrt(Math.PI * x);

        if (x>=1 && x<3) {
            Y = e;
        } else if (x >= 3 && x < 5) {
            Y = b;
        } else if (x >= 5 && x <= 7) {
            Y = c;
        }
        System.out.println(Y);

         */
//        Scanner OR = new Scanner(System.in);
//        System.out.println("input x");
//        int x = OR.nextInt();
//        double Y = 0;
//        double a = (3-x) * x;
//        double b = Math.tan(2*x);
//
//        if (x >= -1 && x <= 0) {
//            Y = a;
//        } else if (x >= 0 && x < 1) {
//            Y = 1;
//        } else if (x >= 1 && x <= 2) {
//            Y = b;
//        }
//        System.out.println(Y);

        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input x");
        int x = OR.nextInt();
        double Y = 0;
        double a = Math.pow(Math.E,x) / Math.pow(Math.E,-x) + Math.PI - 1;
        double b= 20 * Math.sin(x) / Math.pow(2+x,3);

        if (x >= -1 && x < 0) {

            Y = a;
        } else if (x >= 0 && x <= 1) {
            Y = b;
        }
        System.out.println(Y);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input x");
        int x = OR.nextInt();
        double Y = 0;
        double a = Math.PI * Math.cos(x);
        double b = x * Math.tan(x) - Math.log(x);

        if (x >= 0 && x < 0.5) {
            Y = a;
        } else if (x >= 0.5 && x <= 1) {
            Y = b;
        }
        System.out.println(Y);

         */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int k=0;
        if(n<100 || n>1000){
            System.out.println("input n");
            n= in.nextInt();
            int a = n % 10;
            int b = n / 10 % 10;
            int c = n / 100;

            if (a == b + c) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }
        else{
            System.out.println("input n");
            n=in.nextInt();
        }
        */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        System.out.println("input k");
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 10;
        int k = in.nextInt();
        if (n<100 || n>1000){
            System.out.println("input n");
            n = in.nextInt();
        }
        if (n > k) {
            int g = n / (a+b+c);
            System.out.println(g);
        }
        else {
            int f = n/k;
            System.out.println(f);
        }

         */


        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        if (n<100 || n>1000){
            System.out.println("input n");
            n = in.nextInt();
        }
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100;
        int z = Math.min(a,b);
        int v = Math.min(z,c);
        System.out.println(v);

         */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100;
        if (n>300){
            int v = b / a;
        }
        else {
            int m = c / b;
        }
        int u = c/a;
        System.out.println(u);

         */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100;
        if (b + c < 5) {
            char f = 'a';
            System.out.println(f);
        }
        else {
            char x = 'b';
            System.out.println(x);
        }

         */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100;

        boolean z = a == b + c? true:false;
        System.out.println(z);

         */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100;

        boolean z  = a == b || a == c || b == c? true:false;
        System.out.println(z);

         */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100;

        int z = Math.max(a,b);
        int v = Math.max(z,c);
        System.out.println(v);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input a");
        int a = OR.nextInt();
        System.out.println("input b");
        int b = OR.nextInt();
        System.out.println("input c");
        int c = OR.nextInt();
        System.out.println("input d");
        int d = OR.nextInt();

        boolean z = b-a == d-c? true:false;
        System.out.println(z);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input a");
        int a = OR.nextInt();
        System.out.println("input b");
        int b = OR.nextInt();
        System.out.println("input c");
        int c = OR.nextInt();
        System.out.println("input d");
        int d = OR.nextInt();

        int z = Math.max(a,b);
        int v = Math.max(c,d);
        int i = Math.max(z,v);
        System.out.println(i);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input a");
        int a = OR.nextInt();
        System.out.println("input b");
        int b = OR.nextInt();
        System.out.println("input c");
        int c = OR.nextInt();
        System.out.println("input d");
        int d = OR.nextInt();

        boolean z = b / a == d / c? true:false;
        System.out.println(z);

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input a");
        int a = OR.nextInt();
        System.out.println("input b");
        int b = OR.nextInt();
        System.out.println("input c");
        int c = OR.nextInt();
        System.out.println("input d");
        int d = OR.nextInt();

        int z = (a%2!=0 && b%2!=0) || (c%2!=0 && d%2!=0) || (b%2!=0 && c%2!=0) || (a%2!=0 && d%2!=0) || (a%2!=0 && c%2!=0) || (b%2!=0 && d%2!=0) ? 1:2;
        System.out.println(z);

         */
         /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input a");
        int a = OR.nextInt();
        System.out.println("input b");
        int b = OR.nextInt();
        System.out.println("input c");
        int c = OR.nextInt();
        System.out.println("input d");
        int d = OR.nextInt();

        boolean z = a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c;
        System.out.println(z);

          */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int a = n % 10;
        int b = n / 100 % 10;
        int c = n % 1000 / 100;
        int d = n % 10000 / 1000;
        int v = n / 10000;

         */


        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        if (n > 0){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

         */
        /*
        Scanner OR = new Scanner(System.in);
        System.out.println("input n");
        int n = OR.nextInt();
        int i = String.valueOf(n).length();
        System.out.println(i);

         */
//45
        /*

        int sum = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 3 == 0) {
                sum += i;

            }
        }
        System.out.println(sum);

         */


        /*
        int multi= 1;
        for (int i = 10; i <100 ; i++) {
            if (i % 3 ==0 && i % 5 ==0){
               multi*=i;
            }
        }
        System.out.println(multi);

         */
/*
        boolean t = false;
        for (int i = 1000; i < 10000; i++) {
            for (int j = 10; j < 100; j++) {
                if (i * 16 == Math.pow(j, 2)) {
                    t = true;
                    System.out.println(i);
                    break;

                }


            }
            if (t) {
                break;
            }


        }

        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int k=0;
        for (int i = 1; i <100 ; i++) {
            if (n == Math.pow(i,3)){
                k=i;

                  break;
            }

            }
        if(n==Math.pow(k,3)) {
            System.out.println(true);
        }
            else{
                System.out.println(false);
            }

        }

 */
//        int i = 1;
//        for (; i<10; ) {
//            System.out.println(i);
//            i++;
//        }
//        for (; ; ){
//            System.out.println(69);
//        }
        //41 В данном цикле for в зависимости от диапазонна i  задача имеет различные решение.
        // Цикл выведет сумму натуральных чисел которые делятся на 2 без остатка.
        // Ответ: 2, 2+4=6, 6+6=12, 12+8=20. Каждое число является суммой предыдущего и нынешнего.
//        int n = 2;
//        int sum = 0;
//        for (int i = 1; i < 9 ; i++) {
//            if (i % n == 0) {
//                sum += i;
//                System.out.println(sum);
//            }
//       }
        //42 Система работы та же, что и в 41 задании, но с умножением.
//        int n = 2;
//        int multi = 1;
//        for (int i = 1; i < 11 ; i++) {
//            if (i % n == 0) {
//                multi*=i;
//                System.out.println(multi);
//            }
//
//        }
        //43
//        int n = 2;
//        int sum = 0;
//        for (int i = 1; i < 21; i++) {
//            if (i % n == 0) {
//                sum+=i;
//                System.out.println(sum);
//            }
//
//        }
        //44
//        int n = 3;
//        int multi = 1;
//        for (int i = 1; i < 10 ; i++) {
//            if (i % n == 3) {
//                multi*=i;
//                System.out.println(multi);
//            }
//
//        }
        //45
//        int n = 3;
//        int sum = 0;
//        for (int i = 10 ; i < 100 ; i++) {
//            if (i % n == 0) {
//                sum+=i;
//                System.out.println(sum);
//            }
//
//        }
        //46
//        long multi = 1;
//        for (long i = 100; i < 1000 ; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                multi*=i;
//                System.out.println(multi);
//            }
//
//        }
        //47
//        int sum = 0;
//        for (int i = 100; i < 1000 ; i++) {
//            if (i % 5 != 0) {
//                sum+=i;
//                System.out.println(sum);
//            }
//
//        }
        //48
//        long multi = 1;
//        for (long i = 100; i < 1000 ; i++) {
//            if (i % 2 != 0 && i % 3 != 0) {
//                multi*=i;
//                System.out.println(multi);
//            }
//
//        }
        //49
//        long multi = 1;
//        for (int i = 100; i < 1000 ; i++) {
//            if (i % 3 == 1 && i % 4 == 2) {
//                multi*=i;
//                System.out.println(multi);
//            }
//        }
        //50

        /*for (int i = 100; i < 1000; i++) {
            for (int j = 10; j < 100; j++) {
                if (i * 16 == Math.pow(j, 2)) {
                    System.out.println(i);


                }


            }
            break;
        }*/

        //51
//        boolean t=false;
//        for (int i = 10000; i > 1000 ; i--) {
//
//            for (int j = 100; j < 1000 ; j++) {
//                if (i * 26== Math.pow(j, 2)) {
//                    t=true;
//                    System.out.println(i);
//                    break;
//
//                }
//
//            }
//                 if(t){
//
//                  break;
//                  }
        //57
//        Scanner in=new Scanner(System.in);
//        System.out.println("input n");
//        int n = in.nextInt();
//        int count=0;
//        while (n !=0 ) {
//
//            n/=10;
//            count++;
//        }
//        System.out.println(count);
        //59
//        Scanner in=new Scanner(System.in);
//        System.out.println("input n");
//        int n = in.nextInt();
//        int multi = 1;
//        while (n != 0) {
//            multi *=n%10;
//            n = n / 10;
//        }
//        System.out.println(multi);
        //61
//        Scanner in=new Scanner(System.in);
//        System.out.println("input n");
//        int n = in.nextInt();
//        int num = 0;
//        int sum = 0;
//        for (int i = 1; ;i *= 10) {
//            num = n/i%10*i;
//            sum+=num;
//            if (num == 0 ){
//                break;
//            }
//        }
//        System.out.println(sum);

        //60
//        Scanner in=new Scanner(System.in);
//        System.out.println("input n");
//        int n = in.nextInt();
//        int num = 0;
//        for (int i = 1; ;i *= 10) {
//            num = n/i%10;
//            if (num == 0 ){
//                break;
//            }
//            System.out.print(num+" ");
//        }
        //62
//        Scanner in = new Scanner(System.in);
//        System.out.println("input n");
//        int n = in.nextInt();
//        System.out.println("input N");
//        int N = in.nextInt();
//        int num = 0;
//        int sum = 0;
//        int moon = 0;
//        for (int i = 1; ; i *= 10) {
//            num = n / i % 10;
//            if (num == 0) {
//                break;
//            }
//            System.out.print(num + " ");
//        }
//        for (int i = 1; ; i *= 10) {
//            moon = N / i % 10;
//            if (moon == 0) {
//                break;
//            }
//            System.out.print(moon + " ");
//        }
        //66
/*
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        System.out.println("input k");
        int k = in.nextInt();
        int sum = 0;
        int sun = 0;
       while(n>0){
           sum+= n%10;
            n/=10;

        }
        while(k>0){
            if (k % 2 == 0) {

                sun+=k%10;
                k/=10;

                }
            }




        boolean z = sum == sun;
        System.out.println(z);

 */
/*
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int t=0;
        int f=0;
        int k=0;
        while(n>0){
            t=n%10;
            f=n/10;
            if(t%2!=0) {
                f = t;
                break;
            }
                else{
                    k=t;
                    break;


            }
        }
        if(t==f){
            System.out.println(true);
        }
        else if (k==t){
            System.out.println(false);
        }

 */


        //68
        /*
        int [] num = {-1,-9,-7,-4,5,3,2};
        int sum = 0;
        int count = 0;
        for (int i : num) {
            if (i > 0) {
                sum +=i;
                count++;

            }
        }
        System.out.println(sum/count);

         */
        /*
        int [] [] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(" "+ nums[i] [j]);

            }
            System.out.println();
        }

         */
        //69
        /*
        int multi = 1;
        int count = 0;
        int moon [] = {-2,-7,-98-6,5,6};
        for (int sun:moon) {
            if (sun>0) {
                multi*=sun;
                count++;
            }
        }
        System.out.println(multi/count);

         */
        //70
        /*
        int multi = 1;
        int count = 0;
        int moon [] = {-3,9,-6,9};
        for (int sun:moon
             ) {
            if (sun<0){
                multi*=sun;
                count++;
            }
        }
        System.out.println(multi/count);
        */
        //71
        /*
        int sum = 0;
        int count = 0;
        int moon [] = {-9,-7,9,5,7};
        for (int d:moon
             ) {
            if (d < 0) {
                sum+=d;
                count++;
            }

        }
        System.out.println(sum/count);
        */
        //72
        /*
        int sum = 0;
        int moon [] = {2,3,7,9,5,8};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 == 0) {
                sum+=moon[i];
            }

        }
        System.out.println(sum);

         */
        //73
        /*
        int multi = 1;
        int moon [] = {1,2,3,4,5,6};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 == 0) {
                multi*=moon[i];
            }

        }
        System.out.println(multi);

         */
        //74
        /*
        int multi = 1;
        int count = 0;
        int moon [] = {2,4,5,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0) {
                multi*=moon[i];
                count++;
            }

        }
        System.out.println(multi/count);

         */
        //75
        /*
        int sum = 0;
        int moon [] = {-6,-9,6,2,3};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0 && moon[i] > 0) {
                sum+=moon[i];

            }
        }
        System.out.println(sum);


         */
        //76
        /*
        int c = 0;
        int k = 2;
        int moon [] = {2,6,4,8,5};
        for (int i = 0; i < moon.length ; i++) {
            if (i % k == 0) {
                c++;

            }

        }
        System.out.println(c);

         */
        /*
        int c = 0;
        int s = 0;
        int moon [] = {-6,-1,-6,-3,6,5,4,3};
        for (int a:moon
             ) {
            if (a > 0) {
                c++;
            }
            else if (a < 0){
                s++;
            }

        }
        System.out.println(c+" "+s);

         */
        //84
        /*
        int k = 3;
        int sum = 0;
        int count = 0;
        int moon[] = {2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length ; i++) {
            if (i % k == 0) {
                sum+=moon[i];
                count++;
            }

        }
        System.out.println(sum/count);

         */
        //85
        /*
        int k = 2;
        int sum = 0;
        int moon[] = {1,23,4,5,6,7};
        for (int h:moon
             ) {
            if (h % k == 0) {
                sum+=h;
            }

        }
        System.out.println(sum);

         */
        //87
/*
        int k = 2;
        int multi = 1;
        int count = 0;
        int moon [] = {2,3,4,5,6,7,8};
        for (int n:moon
             ) {
            if (n % k == 0) {

                multi*=n;
                count++;
            }
        }
        System.out.println((multi/count)*k);
*/
        //81
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int sum = 0;
        int moon  [] = {1,2,3,4,-7,-4};
        for (int a:moon
             ) {
            if (Math.abs(a) < k) {
                sum+= Math.pow(a,3);
            }

        }
        System.out.println(sum);
        */

//84
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input t");
        int  t= in.nextInt();
        int multi = 1;
        int moon  [] = {1,2,3,4,-7,-4};
        for (int a:moon
        ) {
            if (Math.abs(a) < t) {
                multi*= a;
            }

        }
        System.out.println(multi);

         */
        //83
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int c = 0;
        int moon  [] = {1,2,3,4,-7,-4};
        for (int a:moon
        ) {
            if (Math.abs(a) < k) {
                c++;
            }

        }
        System.out.println(c);

         */
        //86
//        Scanner in = new Scanner(System.in);
//        System.out.println("input k");
//        int k = in.nextInt();
//        int multi = 1;
//        int moon  [] = {1,2,3,4,-7,-4};
//        for (int i = 0; i < moon.length; i++) {
//            if (moon[i] - i > 0) {
//                multi*=moon[i];
//            }
//
//        }
//        System.out.println(multi);
        //71
        /*
        for (double x = 2.4; x <= 7.6 ; x+=0.2) {
            double y = Math.tan(2*x + Math.pow(x,2));
            System.out.println(y);

        }


         */
        //80
        /*
        double x = 2.4;
        while (x <= 7.6) {
            double y = Math.tan(2*x + Math.pow(x,2));
            x += 0.2;
            System.out.println(y);
        }

         */
        //76
        /*
        double y = 0;
        int  x = -5;
        while (x <= 5) {
            if (x > 0) {

                y = Math.pow(x,2) + 4 * Math.pow(x,8);

            }
            else {
                y=0;
            }
            x+=2;
            System.out.println(y);
        }
        */
        //
        /*
        double y = 0;
        for (int x = -5; x <=5 ; x+=2) {
            if (x > 0) {
                y = Math.pow(2,5-x);
            }
            else {
                y = 7 - x;
            }
            System.out.println(y);
        }

         */
        //81
        /*
        double y = 0;
        double x = -7.5;
        while (x <= 8.3) {
            y =  Math.log(Math.pow(x,2)+4)/ Math.log(3);
            x+= 0.3;
            System.out.println(y);
        }

         */
        //90
        /*
        double y = 0;
        for (int x =-30 ; x <=30 ; x+=3.5) {
            if (x > 5) {
                y = Math.sin(x);
            }
            else {
                y = Math.cos(x);
            }
            System.out.println(y);

        }

         */
        //121
        /*
        double x = 0;
        double y = 0;
        double sum = 0;
        for (int i = 1; i <16 ; i++) {
            if (i % 2 != 0) {
                x = i;
            }
            else {
                x=Math.pow(i,3);
            }
            if (i % 2 != 0) {
                y = Math.pow(i,2);

            }
            else {
                y = i;
            }

        }
        sum+=Math.pow(x-y,2);
        System.out.println(sum);
        */
//123
        /*

        double x = 0;
        double y = 0;
        double multi = 0;
        for (int i = 1; i <14 ; i++) {
            if (i % 2 != 0) {
                x = Math.pow(Math.E,i-4);
            }
            else {
                x=Math.pow(i,2) - i;
            }
            y = Math.pow(i,4);

        }
        multi+=Math.pow(x,2) * Math.pow(y,2);
        System.out.println(multi);

         */
        //125
        /*
        double x = 0;
        double y = 0;
        double sum = 0;
        for (int i = 1; i <=10 ; i++) {
            if (i % 3 == 0) {
                x = Math.log(i) / Math.log(Math.E);
            }
            else {
                x=3;
            }
            if (i % 7 == 0) {
                y = Math.log(i) / Math.log(3) ;

            }
            else {
                y = 3;
            }

        }
        sum+=x-y;
        System.out.println(sum);

         */
        //72
        /*
        for (double x = -5.4; x <=1.2; x+=0.4) {
            double y = Math.pow(1 / Math.tan(Math.pow(x,2)),2);
            System.out.println(y);

        }

         */
        //73
        /*
        for (double x = 7.5; x <= 12.5; x+=0.2) {
            double y = Math.pow(x+1,2);
            System.out.println(y);
        }


         */
        //74
        /*
        for (double x = -3.8; x <=5.4; x+=0.3) {
            double y = Math.pow(2,x+4);
            System.out.println(y);
        }

         */
        //75
        /*
        for (double x = -1 * Math.PI; x <= Math.PI ; x+= Math.PI / 8) {
            double y = Math.pow(Math.sin(x),2) + Math.cos(x);
            System.out.println(y);
        }

         */
        //77
        /*
        double y = 0;
        for (int x =-8 ; x <=8 ; x+=3) {
            if (x > 3) {
                y = Math.pow(x,2) + 4 * Math.pow(x,8);
            }
            else {
                y = 0;
            }
            System.out.println(y);

        }

         */
        //78
        /*
        double y = 0;
        int x = 10;
        while (x <= 20) {
            if (x > 12) {
                y = 3 * Math.log(x) / Math.log(3);
            }
            else {
                Math.pow(x,3);
            }
            x+=2;
        }
        System.out.println(y);

         */
        //79
        /*
        double y = 0;
        int x = -4;
        while (x <= 5) {
            if (x > 1) {
                y = Math.log(4) / Math.log(x);
            }
            else {
                y = -9;
            }
            x+=1;
        }
        System.out.println(y);

         */
        //80
        /*
        double y = 0;
        for (double x = -5; x <= 5; x+=2) {
            if (x > 5) {
                y = Math.pow(2,5-x);
            }
            else {
                y = 7 - x;
            }
        }
        System.out.println(y);

         */
        //82
        /*
        for (double x = -2.7; x <= 3.3; x+=0.5) {
            double y = Math.pow( x + Math.pow(x,2),7);
            System.out.println(y);
        }

         */
        //83
        /*
        for (double x = -4.8; x <= 5.2; x+=0.2) {
            double y = Math.pow(Math.atan(x+1),2);
            System.out.println(y);
        }
         */
        //84
        /*
        for (double x = -6.4; x <= 2.4; x+=0.2) {
            double y = Math.pow(Math.E,1 / Math.tan(x));
            System.out.println(y);
        }

         */
        //85
        /*
        for (double x = -3.3; x <= 2.7; x+=0.3) {
            double y = Math.abs(2 * x + Math.pow(x,3));
            System.out.println(y);
        }

         */
        //86
        /*
        double y = 0;
        for (double x = -5; x <= 8 ; x+=2) {
            if (x > 2) {
                 y = Math.pow(3,x + 4);
            }
            else {
                 y = -8;

            }
        }
        System.out.println(y);

         */
        //87
        /*
        double y = 0;
        for (double x = 10 ; x <= 23 ; x+= 3.2) {
            if (x > 7) {
                y = Math.pow( Math.E, Math.sin(x));
            }
            else {
                y = 0;

            }
        }
        System.out.println(y);

         */
        //88
        /*
        double y = 0;
        for (double x = -3 ; x <= 3 ; x+= 0.8) {
            if (x > 1) {
                y = 6 * Math.pow( Math.E,8 + x);
            }
            else {
                y = x + 4;
            }
        }
        System.out.println(y);

         */
        //89
        /*
        double y = 0;
        for (double x = -5 ; x <= 9 ; x+= 1.5) {
            if (x > 3) {
                y = Math.log(x) / Math.log(4);
            }
            else {
                y = -9;
            }
        }
        System.out.println(y);

         */
        //122
        /*
        double x = 0;
        double y = 0;
        double sum = 0;
        for (int i = 1; i <10 ; i++) {
            if (i % 2 != 0) {
                x = Math.pow(Math.E,i-4);
            }
            else {
                x=Math.pow(i,2) - i;
            }
            if (Math.pow(i,2) % 2 != 0) {
                y = Math.pow(Math.tan(i),2);

            }
            else {
                y = 0;
            }

        }
        sum+=Math.pow(x,2) - Math.pow(y,2);
        System.out.println(sum);

         */
        //124
        /*
        double x = 0;
        double y = 0;
        double multi = 1;
        for (int i = 1; i <18 ; i++) {
            if (i % 2 != 0) {
                x = Math.pow(2,i - 4);
            }
            else {
                x=Math.pow(i,2) + 2;
            }
            y = Math.pow(i,2) + 2;

        }
        multi*=x*y;
        System.out.println(multi);

         */
        //126
        /*
        double x = 0;
        double y = 0;
        double sum = 0;
        for (int i = 1; i <16 ; i++) {
            if (i % 5 == 0) {
                x = i;
            }
            else {
                x = 0;
            }
            if (i % 7 == 0) {
                y = Math.pow(i,2);

            }
            else {
                y = i;
            }

        }
        sum+=x-y;
        System.out.println(sum);

         */
        //127
        /*
        double x = 0;
        double y = 0;
        double multi = 1;
        for (int i = 1; i <17 ; i++) {
            if (i % 2 != 0) {
                x = Math.pow(Math.sin(i),2);
            }
            else {
                x = 0;
            }
            if (i % 2 != 0) {
                y = Math.tan(i);

            }
            else {
                y = i / Math.tan(i);
            }

        }
        multi*=Math.pow(x,2) - y;
        System.out.println(multi);

         */
        //128
        /*
        double x = 0;
        double y = 0;
        double multi = 1;
        for (int i = 1; i <14 ; i++) {
            if (i % 2 == 0) {
                x = Math.pow(Math.E,3 * i - 4);
            }
            else {
                x=Math.pow(i,2) - i;
            }
            y = Math.pow(i - 1,2);

        }
        multi*= x * Math.pow(y,2);
        System.out.println(multi);

         */
        //129
        /*

        double x = 0;
        double y = 0;
        double sum = 0;
        for (int i = 1; i <16 ; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                x = Math.tan(i);
            }
            else {
                x = 1 / Math.tan(i);
            }
            y = Math.pow(Math.E,i - 4);

            sum+=x * y - i;
        }
        System.out.println(sum);

         */


        //130
        /*
        double x = 0;
        double y = 0;
        double multi = 1;
        for (int i = 1; i <10 ; i++) {
            if (i % 5 == 0) {
                x = i;
            }
            else {
                x=Math.pow(i,2);
            }
            if (i % 3 == 0) {
                y = Math.pow(i,3);

            }
            else {
                y = 6;
            }

        }
        multi*= x * y;
        System.out.println(multi);

         */
        //131
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double y = 0;
        for (int k = 1; k < 4 ; k++) {
            if (x > 1) {
                y = 3 * Math.pow(x,k + 1);
            }
            else {
                y = 5 * x + Math.pow(k,7);
            }
            System.out.println(y);
        }

         */
        //132
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        System.out.println("input n");
        int n = in.nextInt();
        double y = 0;
        for (int k = 1; k < n; k++) {
            if (x > 5) {
                y = 3 * Math.log(x) / Math.log(3) + 5 * k;
            }
            else {
                y = 4 * Math.pow(x + k,8);
            }
            System.out.println(y);
        }

         */
        //133
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double y = 0;
        for (int k = 1; k < 5; k++) {
            if (x < 1) {
                y = 8 * Math.pow(x,8);
            }
            else {
                y = 7 * x + Math.log(x) / Math.log(3);
            }
            System.out.println(y);
        }

         */
        //134
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double y = 0;
        for (int k = 1; k < 8; k++) {
            if (x > 1) {
                y = Math.pow(x,k - 1);
            } else if (0 < x && x < 5) {
                y = x * Math.pow(k,3);
            }
            else {
                y = Math.pow(10,-6);
            }
            System.out.println(y);

        }

         */
        //135
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double y = 0;
        for (int k = 1; k < 4 ; k++) {
            if (x > 1) {
                y = Math.pow(x,k - 1);
            } else if (x < 3) {
                y = x * Math.pow(k,3);
            }
            else {
                y = Math.pow(10,-6);
            }
            System.out.println(y);
        }

         */
        //136
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double y = 0;
        for (int k = 2; k < 8 ; k++) {
            if (3 < x && x < 7) {
                y = 9 * Math.pow(x,k);
            }
            else {
                y = 8 * x + Math.pow(k,3);
            }
            System.out.println(y);
        }

         */
        //137
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double y = 0;
        for (int k = 1; k < 10 ; k++) {
            if (2 < x && x < 6) {
                y = Math.log(x) / Math.log(4) + Math.log(k);
            }
            else {
                y = 4 * Math.pow(x + k,8);
            }
            System.out.println(y);

         */
        //138
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double y = 0;
        for (int k = 2; k < 7 ; k++) {
            if (x < 6) {
                y = Math.pow(x,k) + k;
            }
            else {
                y = Math.log(k) / Math.log(5);
            }
            System.out.println(y);

         */
        //139
/*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double y = 0;
        for (int k = 1; k < 8 ; k++) {
            if (2 < x && x < 5) {
                y = 7 * Math.pow(Math.E, k + 3);
            } else if (0 < x && x <= 5) {
                y = 8 * x * Math.pow(k, 5);
            } else {
                y = 7;
            }
        }
            System.out.println(y);

 */


        //140
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double y = 0;
        for (int k = 2; k < 10 ; k++) {
            if (3 < x && x < 5) {
                y = Math.pow(x, k + 6) ;
            } else if (x <= 3) {
                y = x + Math.pow(k,4);
            } else {
                y = Math.pow(5,6);
            }
        }
            System.out.println(y);

         */
        //141
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input a");
        int a = in.nextInt();
        double w = 0;
        int sum = 0;
        int multi = 1;
        for (int m = 0; m < 5 ; m++) {
            for (int n = 0; n < 6; n++) {
                sum+=Math.pow(a,m + n);
            }
           w = multi*=sum;
        }
        System.out.println(w);

         */
        //142
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input a");
        int a = in.nextInt();
        int sum = 0;
        int sum2 = 0;
        for (int k = 1; k < 9 ; k++) {
            for (int m = 1; m < 5; m++) {
                sum2 += a * Math.pow(m,2) + Math.pow(k,2);
            }
             sum+=sum2;
        }
        System.out.println(sum);

         */
        //143
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        double p = 0;
        int multi2 = 1;
        int multi = 1;
        for (int i = 0; i < 15 ; i++) {
            for (int m = 1; m < 6; m++) {
                multi *= (double) i / (i + m * n);
            }
            p = multi2*=multi;
        }
        System.out.println(p);

         */
        //144
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input c");
        int c = in.nextInt();
        int sum2 = 0;
        int sum = 0;
        for (int i = 1; i < 7 ; i++) {
            for (int k = 1; k < 8; k++) {
                sum += Math.pow(i,2) + c * k;
            }
             sum2+=sum;
        }
        System.out.println(sum2);

         */
        //145
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input c");
        int c = in.nextInt();
        int sum = 0;
        int multi = 1;
        for (int i = 1; i < 7 ; i++) {
            for (int k = 1; k < 8; k++) {
                multi*=Math.pow(i,2) + c * k;
            }
           sum+=multi;
        }
        System.out.println(sum);

         */
        //146
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input с");
        double c = in.nextInt();
        double sum = 0;
        double sum2 = 0;
        for (double i = 1; i < 5 ; i++) {
            for (double k = 1; k < 8; k++) {
                sum2 = (c * i + k) / k;
            }
            sum = Math.pow(i,2) * sum2;
        }
        System.out.println(sum);

         */
        //147
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        double n = in.nextInt();
        System.out.println("input v");
        double v = in.nextInt();
        double sum = 0;
        double sum2 = 0;
        for (double k = 1; k < n ; k++) {
            for (double i = 1; i < k; i++) {
                 sum2 = v * i + k;
            }
         sum = (k + 5) * sum2;
        }
        System.out.println(sum);

         */
        //148
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input f");
        double f = in.nextInt();
        double multi = 1;
        double sum = 0;
        for (double i = 1; i < 12 ; i++) {
            for (double j = 1; j < 7; j++) {
                sum = f * i + Math.pow(j,2);
            }
            multi = (i + 1) * sum;
        }
        System.out.println(multi);

         */
        //149
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input a");
        double a = in.nextInt();
        double sum = 0;
        double multi = 1;
        for (double i = 1; i < 8 ; i++) {
            for (double j = 1; j < 8; j++) {
                multi = Math.cos(a * i + j);
            }
            sum = Math.sin(Math.pow(i,2) + 1) * multi;
        }
        System.out.println(sum);

         */
        //150
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input b");
        double b = in.nextInt();
        double multi = 1;
        double sum = 0;
        for (double k = 1; k < 10 ; k++) {
            for (double j = 1; j < 8; j++) {
                sum = Math.tan(b * k + Math.pow(j,2));
            }
            multi = (k + 1) * sum;
        }
        System.out.println(multi);

         */
        //88
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int sum = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a : moon
             ) {
            if (a % 2 == 0) {
                sum += Math.pow(a,2);
            }

        }
        System.out.println(sum);

         */
        //89
        /*
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
             ) {
            for (int i = 0; i < moon.length; i++) {
                if (i % 2 == 0) {
                    count++;
                }

            }

        }
        System.out.println(count);

         */
        //90
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int sum = 0;
        int multi = 1;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a:moon
             ) {
            if (a % 2 == 0) {
                multi*=a;
                sum+=multi;
            }

        }
        System.out.println(sum);

         */
        //91
        /*
        int sum = 0;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
             ) {
            if (a % 2 != 0) {
                sum+= a;
                count++;
            }

        }
        System.out.println(sum/count);

         */
        //92
        /*

        int multi = 1;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
             ) {
            if (a % 2 != 0) {
                multi*=a;
                count++;
            }

        }
        System.out.println(multi/count);

         */
        //93
        /*
        int count = 0;
        int count1 = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
             ) {
            if (a % 2 != 0) {

                count1++;
            }

        }
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(count1);

         */


        //94
        /*
        int c = 0;
        int [] moon = {0,1,2,3,4,0,5,6,7,0};
        for (int a:moon
             ) {
            if (a==0) {
                c++;
            }
        }
        System.out.println(c);

         */
        //95
        /*
        int sum =0;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
             ) {
            if (a % 3 == 0) {
                sum+=a;
                count++;
            }
        }
        System.out.println(sum/count);

         */
        //96
        /*
        int multi = 1;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9,10};
        for (int a: moon
             ) {
            if (a % 5 == 0) {
                multi*=a;
                count++;
            }

        }
        System.out.println(multi/count);

         */
        //97
        /*
        int c = 0;
        int [] moon= {1,2,3,14,6,9,28};
        for (int a: moon
             ) {
            if (a % 7 == 0) {
                c++;
            }
        }
        System.out.println(c+" ");

         */
        //98
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int sum = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
             ) {
            if (a % k == 0) {
                sum+=a;
            }
        }
        System.out.println(sum);

         */
        //99
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input m");
        int m = in.nextInt();
        int multi = 1;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
             ) {
            if (a % m == 0) {
                multi*=a;
            }
        }
        System.out.println(multi);

         */
        //100
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input t");
        int t = in.nextInt();
        int c = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
             ) {
            if (a % t == 0) {
                c++;
            }

        }
        System.out.println(c+" ");

         */
        //101
        /*
        int multi = 1;
        int [] moon = {1,2,35,10,70,9};
        for (int a: moon
             ) {
            if (a % 5 == 2) {
                multi*=a;
            }
        }
        System.out.println(multi);

         */
        //102
        /*
        int multi = 1;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a:moon
             ) {
            for (int i = 0; i < moon.length; i++) {
                if (a % 3 == 0) {
                    multi*=Math.pow(a,2);
                    count++;
                }

            }

        }
        System.out.println(multi/count);

         */
        //103
        /*
        int sum = 0;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
             ) {
            for (int i = 0; i < moon.length; i++) {
                if (i == Math.pow(a, 2)) {
                    sum+=a;
                    count++;
                }
            }
        }
        System.out.println(sum/count);

         */
        //104
        /*
        int multi = 1;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
            for (int i = 0; i < args.length; i++) {
                if (moon[i] > i) {
                    multi*=moon[i];
                    count++;
                }
            }
        System.out.println(multi/count);

         */
        //106
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input t");
        int t = in.nextInt();
        int c = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < args.length; i++) {
            if (Math.abs(moon[i] - i) < t) {
                c++;
            }
        }
        System.out.println(c+" ");

         */
        //108
        /*
        int [] moon = {6,2,-8,2,5,6,9};
        int max = moon[0];
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > max) {
                max = moon[i];
            }
        }
        System.out.println(max);

         */
        //109
        /*
        int [] moon = {9,8,7,4,8,2,5,2};
        int min = moon [0];
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] < min) {
                min = moon[i];
            }
        }
        System.out.println(min);

         */
        //110
        /*
        int [] moon = {6,2,-8,2,5,6,9};
        int max = moon[0];
        int min = moon[0];
        int sum = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > max) {
                max = moon[i];

            }
            if (moon[i] < min) {
                min = moon[i];
            }
            sum = max + min;
        }
        System.out.println(sum);

         */
        //111
        /*
        int [] moon = {6,2,-8,2,5,6,9};
        int max = moon[0];
        int min = moon[0];
        int multi = 1;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > max) {
                max = moon[i];

            }
            if (moon[i] < min) {
                min = moon[i];
            }
            multi = max * min;
        }
        System.out.println(multi);

         */
        //114
//1
        /*int [] moon = {77,33,77,2,77,5,1,6};
        //int max = moon[0];
        int d = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > moon[i+1]) {
                d=i;
                break;

            }
            else{
                d=i+1;
                break;
            }

        }
        System.out.println(d);

         */
        /*  //2
        int [] moon = {77,33,77,2,77,5,1,6};
        int max = moon[0];
        int d = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > moon[i+1]) {
                max = moon[i];
                d=i;
                break;


            }


        }
        System.out.println(d);

         */
        //115
        /* //2
        int [] moon = {77,33,77,2,77,5,1,6};
        int max = moon[moon.length-1];
        int d = 0;
        for (int i = moon.length-1 ;i>=0;i--) {
            if (moon[i] > max) {
                max = moon[i];
                d=i;
                break;



            }


        }
        System.out.println(d);

         */
        //115
        /* //1
        int [] moon = {77,33,77,2,77,5,1,6};
        int d = 0;
        for (int i = moon.length-1; i >=0;i--) {
            if (moon[i] > moon[i-1]) {
                d=i;
                break;

            }
            else{
                d=i-1;
                break;
            }

        }
        System.out.println(d);

         */
        //116
        /*
        int [] moon = {77,33,77,2,77,5,1,6};
        int min = moon[0];
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] < min) {
                min=i;
                break;

            }


        }
        System.out.println(min);

         */
/*
        int [] moon = {77,33,77,2,77,5,1,6};

        int d = 0;
        for (int i = 0; i< moon.length; i++) {
            if (moon[i] < moon[i+1]) {
                d = i;
                break;
            }
            else{
                d=i+1;
                break;


            }

 */
        //117
        /* //1
        int [] moon = {4,77,12,9,7};
        int f = 0;
        for (int i = moon.length - 1; i > 0 ; i--) {
            if (moon[i]<moon[i-1]) {
                f = i;
                break;
            }
            else {
                f = i-1;
                break;
            }
        }
        System.out.println(f);

         */
        //117
        /* //2
        int [] moon = {7,13,7,2,80,2,9,5};
        int min = moon[moon.length-1];
        int f = 0;
        for (int i = moon.length-1 ;i>=0;i--) {
            if (moon[i] < min) {
                min = moon[i];
                f=i;
                break;
                }
            }
        System.out.println(f);

         */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n % 100 / 10;
        int v = n / 1000;
        if (a + b > c + v) {
            System.out.println(true);

        }
        else {
            System.out.println(false);
        }

         */
        /*
        Scanner in=new Scanner(System.in);
        System.out.println("input length");
        int length=in.nextInt();
        int array[]=new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i]=in.nextInt();


        }


        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }

         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input length");
        int length = in.nextInt();
        int [] moon = new int[length];
        int max = moon[0];
        for (int i = 0; i < moon.length; i++) {
            moon[i] = in.nextInt();
            if (moon[i] > max) {
                max = moon[i];
            }
        }
        System.out.println(max);

         */
        /* сканер массива
        Scanner in = new Scanner(System.in);
        System.out.println("input length");
        int length = in.nextInt();
        int [] moon = new int[length];
        int max = moon[0];
        int d = 0;
        for (int i = 0; i < moon.length; i++) {
            moon [i] = in.nextInt();
        }

         */
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        switch (n){
            case 2:
                System.out.println("vivo");
            case 4:
                System.out.println("vovi");
        }

         */
        //2
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        double c = 2;
        double a = 1.5;
        double d = 2;
        double x = 3;
        double z = 0;
        switch (n){
            case 0:
                z = 1 + c * Math.sqrt(d);
                System.out.println(z);
                break;
            case 1:
            case 6:
                z = x - a;
                System.out.println(z);
                break;
            case 2:
            case 3:
            case 4:
                z = 2 / (3 * Math.pow(x,2)) - 1/ (2*d);
                System.out.println(z);
                break;
        }

         */
        //3
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input x");
        int x = in.nextInt();
        double a = 5;
        double y = 2;
        double b = 1.2;
        double v = 0.6;
        double z = 0;
        switch (x){
            case 3:
                z = Math.pow(y,2) + 0.3 * a;
                System.out.println(z);
                break;
                case 5:
                case 2:
                z = a + Math.pow(Math.E,y * b);
                System.out.println(z);
                break;
            case 6:
            case 7:
            case 8:
                z = Math.pow(y,2) + y + b;
                break;
        }

         */
        //4
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input j");
        int j = in.nextInt();
        double a = 3.5;
        double i = 2.3;
        double d = 2;
        double x = 3;
        double z = 0;
        switch (j){
            case 1:
                z = 1 + d * Math.sin(d / a);
                System.out.println(z);
                break;
            case 2:
            case 4:
            case 8:
                z = (i - 1) * i + Math.pow(a,2);
                System.out.println(z);
                break;
            case 5:
            case 6:
            case 7:
                z = i + 2 / (3 * x);
                System.out.println(z);
                break;

        }

         */
        //5
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input c");
        int c = in.nextInt();
        double a = 4;
        double b = 0.4;
        double w = 1;
        double x = 2.5;
        double z = 0;
        switch (c){
            case 3:
                z = w / 3 + Math.pow(a,2) * x;
                System.out.println(z);
                break;
            case 8:
            case 9:
            case 10:
                z = w - Math.log(Math.E) / Math.log(b);
                System.out.println(z);
                break;
            case 2:
            case 5:
            case 7:
                z = Math.pow(b,2) + w + x;
                System.out.println(z);
                break;

        }
        */
        //118_1
        /*  в первом форе мы узнаём количество элементов меньше 0
        int[] array={3,-5,-5,6,-7,4};
        int count=0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]<0){
                count++;
            }

        }
        int b[]=new int[count];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                b[j]=array[i];
                j++;
            }

        }
        for (int i = 0; i <b.length ; i++) {
            System.out.println(b[i]);

        }

         */
        //118_2
        /*
        int[] array={3,-5,-5,6,-7,4};
        for (int i = 0; i < array.length; i++) {
            if(array[i]<0){
                int b[]=new int[]{array[i]};
                for (int j = 0; j <b.length; j++) {
                    System.out.println(b[j]);

                }
            }

        }
        */
        //119_1
        /*
        int[] moon = {11, 28, 3, 44, 58, 6, 7, 8, 49};
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i]%7!=0) {
                count++;
            }

        }
        int b[] = new int[count];
        int s = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i]%7!=0) {
                b[s] = moon[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

         */
        //119_2
        /*
        int [] moon = {11, 28, 3, 44, 58, 6, 7, 8, 49};
        for (int i = 0; i < moon.length; i++) {
            if(moon[i] % 7 != 0){
                int b[]= new int [] {moon[i]};
                for (int j = 0; j <b.length; j++) {
                    System.out.println(b[j]);

                }
            }

        }

         */
        //120_1
        /*
        int[] moon = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int a = 2;
        int f = 4;
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] < 2 || moon[i] > 4) {
                count++;
            }

        }
        int b[] = new int[count];
        int s = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] < 2 || moon[i] > 4) {
                b[s] = moon[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

         */

        //120_2
        /*
        int a = 2;
        int f = 4;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (moon[i]< 2 || moon[i] > 4) {
                int b [] = new int [] {moon[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }
        }

         */
        //119 удалить элементы которые делятся на 7
        //121 удалить элементы у которых нечетный индекс
        //122 удалить элементы у которых четный индекс
        //123 удалить элементы которые при делении на число k остаток будет 2
        //124 удалить элементы которые модуль больше k
        //125 удалить элементы которые четные
        //126 удалить элементы которые нечетные
        //127 удалить элементы которых квадрат меньше k

        //121_1
        /*
        int[] moon = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 == 0) {
                count++;
            }

        }
        int b[] = new int[count];
        int s = 0;
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 == 0) {
                b[s] = moon[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

         */
        //121_2
        /*
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 == 0) {
                int b [] = new int []{moon[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }
        }

         */
        //122_1
        /*
        int[] moon = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0) {
                count++;
            }

        }
        int b[] = new int[count];
        int s = 0;
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0) {
                b[s] = moon[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

         */
        //122_2
        /*
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0) {
                int b [] = new int []{moon[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }
        }

         */
        //123_1
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int[] moon = {21, 77, 93, 22, 50, 69, 199, 90, 1};
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon [i] % k != 2) {
                count++;
            }

        }
        int b[] = new int[count];
        int s = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] % k != 2) {
                b[s] = moon[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

         */
        //123_2
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int[] moon = {21, 77, 93, 22, 50, 69, 199, 90, 1};
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] % k != 0) {
                int b [] = new int []{moon[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }
        }

         */
        //124_1
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int[] moon = {212, 7, 9, 22, 80, 69, 19, 90, 11};
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (Math.abs(moon[i]) < k) {
                count++;
            }

        }
        int b[] = new int[count];
        int s = 0;
        for (int i = 0; i < moon.length; i++) {
            if (Math.abs(moon[i]) < k) {
                b[s] = moon[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

         */
        //124_2
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int[] moon = {212, 7, 9, 22, 80, 69, 19, 90, 11};
        for (int i = 0; i < moon.length; i++) {
            if (Math.abs(moon[i]) < k) {
                int b [] = new int []{moon[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }
        }

         */
        //125_1
        /*
        int[] moon = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] % 2 != 0) {
                count++;
            }

        }
        int b[] = new int[count];
        int s = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] % 2 != 0) {
                b[s] = moon[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

         */
        //125_2
        /*
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] % 2 != 0) {
                int b [] = new int []{moon[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }
        }

         */
        //126_1
        /*
        int[] moon = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] % 2 == 0) {
                count++;
            }

        }
        int b[] = new int[count];
        int s = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] % 2 == 0) {
                b[s] = moon[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

         */
        //126_2
        /*
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] % 2 == 0) {
                int b [] = new int []{moon[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }
        }

         */
        //127_1
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int [] moon = {8,4,9,34,66,8,2,99};
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (Math.pow(moon[i], 2) > k) {
                count++;
            }

        }
        int b[] = new int[count];
        int s = 0;
        for (int i = 0; i < moon.length; i++) {
            if (Math.pow(moon[i], 2) > k) {
                b[s] = moon[i];
                s++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }



        //127_2

        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int [] moon = {8,4,9,34,66,8,2,99};
        for (int i = 0; i < moon.length; i++) {
            if (Math.pow(moon[i], 2) > k) {
                int b [] = new int[] {moon [i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);

                }

            }
        }
        
         */


        //6
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input n");
        int n = in.nextInt();
        double a = 0.5;
        double b = 2;
        double h = 4;
        double R = 1.4;
        double z = 0;
        switch (n){
            case 0:
            case 1:
            case 6:
                z = a * b + Math.atan(Math.pow(a,2));
                System.out.println(z);
                break;
            case  7:
                z = (a * h) / 2;
                System.out.println(z);
                break;
            case 2:
            case 3:
            case 4:
                z = Math.pow(Math.PI * R,2);
                System.out.println(z);
                break;
        }

         */

        //7
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        double p = 0.6;
        double l = 2;
        double h = 5;
        double R = 4;
        double z = 0;
        switch (k){
            case 3:
            case 4:
            case 5:
                z = p * l;
                System.out.println(z);
                break;
            case 1:
            case 2:
            case 8:
                z = (p * h) / 2 + Math.cos(p);
                System.out.println(z);
                break;
            case 9:
                z = Math.PI * R * l;
                System.out.println(z);
                break;

        }

         */


        //8
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input b");
        int b = in.nextInt();
        double a = 0.37;
        double d = 2;
        double c = 1.5;
        double x = 0.63;
        double z = 0;
        switch (b){
            case 1:
            case 2:
                z = Math.sin(x) + c * d;
                System.out.println(z);
                break;
            case 3:
            case 4:
            case 5:
                z = x / a + Math.sqrt(d * a * 2);
                System.out.println(z);
                break;
            case 8:
                z = (a + d) * Math.cos(x);
                System.out.println(z);
                break;
        }

         */
        //9
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("input c");
        int c = in.nextInt();
        double a = 1.5;
        double y = 2.6;
        double x = 1.6;
        double z = 0;
        switch (c){
            case 0:
            case 1:
            case 2:
                z = y + (x - a) / (x + a);
                System.out.println(z);
                break;
            case 4:
            case 5:
                z = y - x;
                System.out.println(z);
                break;
            case 3:
                z = Math.pow(y,2) + Math.pow(Math.E,a * x);
                System.out.println(z);
                break;
        }

         */
        /*
        int [] moon = {6,8,2,4,9,5};
        int d = 0;
        for (int i = 0; i < moon.length; i++) {
            for (int j = i+1; j < moon.length; j++) {
                if (moon[j]<moon[i]){
                    d = moon[i];
                    moon[i] = moon[j];
                    moon[j] = d;
                }
            }
            System.out.println(moon[i]);
        }

         */
        //ЕСТЬ МАССИВ НАДО получить новый массив
        //128 НАДО получить новый массив из всех положительных элементов, кождому числу надо прибовлять максимум
//        129 из каждой два вектора, начиная с первого элемента, брать элемент с наибольшим значением модуля;
//        130. из вектора,  надо поменять местами заменяя значения каждого элемента с индексом на значения предшествующего ему элемента с нечетным индексом;
//        131. Добавление нулевого значения после каждого положительного элемента вектора;
//        132 надо получить новый массив из положительных чисел если есть хоть одно число меньше числа b если нет то и отрицательных
//        133. надо получить новый массив из тех чисел которые с модулем меньше среднего арифм. минимума и максимума
//        134 ․ надо получить новый массив из  чисел у которых нечетные индексы добовляя к ним максимум четных элементов
//        135 ․ сначала беря отрицательные элементы вектора, затем ноль
//        увеличение значения наибольшего элемента заданного вектора;
//        136․ надо получить новый массив начиная с первого элемента каждый 3 элемент сделать нулевым а  к остальные прибавить максимум
//        137 удалить первый максимум и  последний минимум
        //128_1
        /*
        int [] moon = {3,-5,8,3,9,-10,-7,-2};
        int max = moon[0];
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > 0 ) {
                count++;
            }

            if (moon[i] > max) {
                max = moon[i];
            }
        }
        int b [] = new int [count];
        int j=0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > 0) {
                b[j]=moon[i]+max;
                j++;

            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

         */
        //128_2
        /*
        int [] moon = {-7,7,9,2,-8,-1};
        int max = moon[0];
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > max) {
                max = moon[i];
            }

            }
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > 0) {
                int b [] = new int[] {moon[i]+max};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }

        }

         */
        //129_1

        /*int [] moon = {5,8,2,5,97,3};
        int max=0;
        for (int i = 0; i < moon.length ; i+=2) {
            if (moon[i] > moon[i+1]) {
                max = moon[i];
                int b[]=new int[]{max};
            }
            else {
                max = moon[i+1];
                int b[]=new int[]{max};
            }

        }
        for (int i = 0; i < moon[i]; i++) {
            System.out.println(moon[i]);
        }*/


        //131_1
        /*int [] moon = {-9,5,-2,7,-5,2,4,1,8,9};
        int count = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > 0) {
                count++;
            }
        }
        int b [] = new int[count];
        int j = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > 0) {
                b[j] = moon[i] * 10;
                j++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }*/
        //131_2
        /*int [] moon = {-7,-5,-9,-7,-5,-2,90,11};
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > 0) {
                int b [] = new int[] {moon[i]};
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j] * 10);
                }
            }
        }*/
        //130_1
        /*int [] moon = {1,4,2,7,8,0,5,7,9,3};
        int g = 0;
        int [] b;
            for (int i = 0; i < moon.length; i++) {
                if (i % 2 == 0) {
                    g = moon[i + 1];
                    b = new int[] {g};
                }
                else  {
                    g = moon[i - 1];
                    b = new int[] {g};
                }
                for (int j = 0; j < b.length; j++) {
                    System.out.println(b[j]);
                }
            }*/


        //137_1
        /*int [] moon = {4,7,9,2,3,8,5};
        int max = moon[0];
        int min = moon[0];
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] < min) {
                min = i;
            }
            if (moon[i] > max) {
                max = i;
            }
        }
        for (int i = min; i < moon.length; i++) {
            moon[min] = moon[min - 1];
        }
        for (int i = min; i < moon.length; i++) {
            moon[max] = moon[max - 1];
        }*/


        //132
        /*Scanner in = new Scanner(System.in);
        System.out.println("input b");
        int b = in.nextInt();
        boolean k = false;
        int bb [];
        int [] moon = {4,-6,-2,9,7,6};
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] < b) {
                k = true;
                break;
            }
        }
        if (k) {
            for (int i = 0; i < moon.length; i++) {
                if (moon[i] > 0) {
                    bb = new int[]{moon[i]};
                    for (int j = 0; j < bb.length; j++) {
                        System.out.println(bb[j]);
                    }

                }
            }
        }
        else {
            for (int i = 0; i < moon.length; i++) {
                if (moon[i] < 0) {
                    bb = new int[]{moon[i]};
                    for (int j = 0; j < bb.length; j++) {
                        System.out.println(bb[j]);

                }
            }
        }

        }*/
        //136 с начала 0 потом отрицательные потом положительные

        //136
        /*int [] moon = {1,2,7,9,5,21};
        int max = moon[0];
        int [] b;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > max) {
                max = moon[i];
            }
        }
        b = new int[moon.length];
        for (int i = 0; i < moon.length; i++) {
            if (i%3==2){
                b[i]=0;
            }
            else {
                b[i] = moon[i] + max;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }*/

        /*int [] moon = {1,5,6,-5,-8};
        int max = moon[0];
        int min = moon[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < moon.length; i++) {
            if (moon[i] > max) {
                max = i;
                indexMax++;
            }
            if (moon[i] < min) {
                min =i;
                indexMin++;
            }
        }
        int a = indexMax;
        int b = indexMin;
        int generallength = moon.length - 2;
        int [] moon2  =new int[generallength];
        int k  =0;
        for (int i = 0; i < moon.length; i++) {
            if (i == a || i == b) {
                i++;
            }
            moon2[k++] = moon[i];
            for (int j = 0; j < moon2[j]; j++) {
                System.out.println(moon[j]);
            }
        }*/
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("input x");
//        int x = in.nextInt();
//        System.out.println("input y");
//        int y = in.nextInt();
//        double z = Math.pow((x+4)/(Math.pow(Math.pow(y,2)+4,3)),(double)1/5);
//        double v = Math.pow(Math.sin(x + z),2) + 3 * z + y / Math.pow(x,2);
//        System.out.println(v);
//        Scanner in = new Scanner(System.in);
//        System.out.println("input a");
//        int a = in.nextInt();
//        System.out.println("input b");
//        int b = in.nextInt();
//        System.out.println("input x");
//        int x = in.nextInt();
//        double y = 0;
//        double q = Math.pow(a,2)+Math.pow(b,2);
//        if (q > 5) {
//            y = 3 * Math.pow(Math.E, a - x) + Math.log(q+5) / Math.log(3);
//        }
//        else if(q<1){
//            y = Math.pow(Math.tan(a+b),4);
//        }
//        else {
//            y = -3;
//        }
//        System.out.println(y);

//        Scanner in = new Scanner(System.in);
//        System.out.println("input a");
//        double a = in.nextDouble();
//        System.out.println("input d");
//        int d = in.nextInt();
//        System.out.println("input x");
//        int x = in.nextInt();
//        System.out.println("input c");
//        int c = in.nextInt();
//        System.out.println("input n");
//        int n = in.nextInt();
//        System.out.println("input i");
//        int i = in.nextInt();
//        double z = 0;
//        switch (n){
//            case 0:
//                z = i + c * Math.sqrt(d);
//            case 1:
//            case 6:
//                z = x - a;
//            case 2:
//            case 3:
//            case 4:
//                z = 2 / 3 * Math.pow(x,2) - 1 / 2 * d;
//        }
//        System.out.println(z);

//       1 Scanner in = new Scanner(System.in);
//        System.out.println("input a");
//        int a = in.nextInt();
//        System.out.println("input x");
//        int x = in.nextInt();
//        double y = 0;
//        if (-5 <= x && x <= 5) {
//            y = Math.pow(1 + Math.pow(a,2),6);
//        }
//        else if(x > 5){
//            y = Math.cos(Math.pow(Math.log(Math.abs(x) + Math.pow(x,8)) / Math.E,2));
//        }
//        else {
//            y = a;
//        }
//        System.out.println(y);

//       2 Scanner in = new Scanner(System.in);
//        System.out.println("input a");
//        int a = in.nextInt();
//        System.out.println("input x");
//        int x = in.nextInt();
//        System.out.println("input b");
//        int b = in.nextInt();
//        double y = 0;
//        double z = a + Math.abs(b);
//        if (z < -5) {
//            y = Math.pow(Math.E,Math.abs(a + x)) * Math.pow(Math.cos(a + b + x),2);
//        } else if (z > 2) {
//            y = Math.pow(Math.atan(a + x),1/3);
//        }
//        else {
//            y = z;
//        }
//        System.out.println(y);

//       3 double a = 5;
//        double b = 0.2;
//        double y = 0.6;
//        double z = 0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("input x");
//        int x = in.nextInt();
//        switch (x){
//            case 3:
//                z = Math.pow(y,2) + 0.3 * a;
//            case 2:
//            case 5:
//                z = a + Math.pow(Math.E,y * b);
//            case 6:
//            case 7:
//            case 8:
//                z = Math.pow(y,2) + y - b;
//        }
//       4 System.out.println(z);
//        double a = 3.5;
//        double d = 2;
//        double i = 2.3;
//        double x = 3;
//        double z = 0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("input j");
//        int j = in.nextInt();
//        switch (j){
//            case 1:
//                z = 1 + d * Math.sin(d) / a;
//            case 2:
//            case 4:
//            case 8:
//                z = (i - 1) * i + Math.pow(a,2);
//            case 5:
//            case 6:
//            case 7:
//                z = i + 2 / 3 * x;
//        }
//        System.out.println(z);


//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        double xd = Math.max(a,b);
//        double max = Math.max(xd,c);
//        System.out.println(max);

//        boolean z = (a == 1) || (b == 1) || (c == 1)? true:false;
//        System.out.println(z);

//        int z  = (a + b > c) && (a + c > b) && (c + b > a)? 1:2;
//        System.out.println(z);

//        if (a < b && b < c) {
//            System.out.println(a+" "+b+" "+c);
//
//        } else if (a < c && c < b) {
//            System.out.println(a+" "+c +" "+b);
//        }
//        else if (b< a && a< c) {
//            System.out.println(b+" "+ a+" "+c);
//        } else if (b < a && c < a) {
//            System.out.println(b+" "+c+" "+a);
//        } else if (c < a && a < b) {
//            System.out.println(c+" "+a +" "+b);
//        } else if (c < a && b < a) {
//            System.out.println(c+" "+b +" "+c);
//        }
//      5  Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        double z = Math.min(a,b);
//        double min = Math.min(z,c);
//        System.out.println(min);


//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        boolean z = (a == 2) || (b == 2) || (c == 2)? true:false;
//        System.out.println(z);

//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        if (a % 2 == 0 || b % 2 == 0 || c % 2 == 0) {
//
//                System.out.println("1");
//            }
//
//        else {
//            System.out.println("2");
//
//        }

//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//
//        boolean z = a/b == b/c? true:false;
//        System.out.println(z);

//        Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        if (a > b && b > c) {
//            System.out.println(a+" "+b+" "+c);
//
//        } else if (a > c && c > b) {
//            System.out.println(a+" "+c +" "+b);
//        }
//        else if (b> a && a> c) {
//            System.out.println(b+" "+ a+" "+c);
//        } else if (b > a && c > a) {
//            System.out.println(b+" "+c+" "+a);
//        } else if (c > a && a > b) {
//            System.out.println(c+" "+a +" "+b);
//        } else if (c > a && b > a) {
//            System.out.println(c+" "+b +" "+c);
//        }


//      11  Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input d: ");
//        int d = scr.nextInt();
//        double v = Math.max(a,b);
//        double n = Math.max(c,d);
//        double max = Math.max(v,n);
//        System.out.println(max);

//       12 Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input d: ");
//        int d = scr.nextInt();
//        double v = Math.min(a,b);
//        double m = Math.min(c,d);
//        double min = Math.min(v,m);
//        System.out.println(min);


//      13  Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input d: ");
//        int d = scr.nextInt();
//        boolean z = (a == 1) || (b == 1) || (c == 1) || (d == 1)? true:false;
//        System.out.println(z);

//       14 Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input d: ");
//        int d = scr.nextInt();
//        boolean z = a + b == c + d? true:false;
//        System.out.println(z);

//      15  Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input d: ");
//        int d = scr.nextInt();
//        boolean z = (a == b+c+d) || (b == a+c+d) || (c == b+a+d) || (d == c+b+a)? true:false;
//        System.out.println(z);

//      17  Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input d: ");
//        int d = scr.nextInt();
//        boolean z = a+b == c+d? true:false;
//        System.out.println(z);

//      16 ?  Scanner scr = new Scanner(System.in);
//        System.out.println("input a: ");
//        int a = scr.nextInt();
//        System.out.println("input b: ");
//        int b = scr.nextInt();
//        System.out.println("input c: ");
//        int c = scr.nextInt();
//        System.out.println("input d: ");
//        int d = scr.nextInt();
//        int z = a%2!=0 && b%2!=0 || c%2!=0 && d%2!=0 || a%2!=0 && c%2!=0 || a%2!=0 && d%2!=0 || b%2!=0 && c%2!=0? 1:2;
//        System.out.println(z);

//     21   Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100;
//        boolean z = a == b+c? true:false;
//        System.out.println(z);

//      22  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100;
//        boolean z = a % 2 == 0 && b % 2 == 0 && c % 2 == 0? true:false;
//        System.out.println(z);


//       23 Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        System.out.println("input k");
//        int k = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100;
//        if (n > k) {
//            double z = a+b+c;
//            System.out.println(z);
//        }
//        else {
//            double z = n / 1;
//            System.out.println(z);
//        }

//        24  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100;
//        double z = Math.max(a,b);
//        double max = Math.max(z,c);
//        System.out.println(max);


//      25  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100;
//        double z  = Math.min(a,b);
//        double min = Math.min(z,c);
//        System.out.println(min);

//      26  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100;
//        if (a > b) {
//            double z = n / (a + b + c);
//            System.out.println(z);
//        }
//        else {
//            System.out.println(n);
//        }

//      27  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100;
//        if (n > 300) {
//            double z = a / b;
//            System.out.println(z);
//        }
//        else {
//            double z = c / a;
//            System.out.println(z);
//        }

//     26   Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100;
//        if (b + c > 5) {
//            System.out.println("A");
//        }
//        else {
//            System.out.println("B");
//        }

//      31  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        boolean z = (a + b == c + d)? true:false;
//        System.out.println(z);

//       32 Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        if (n < 5000) {
//            double z = n / (a + c);
//            System.out.println(z);
//        }
//        else {
//            double z = n / (d + b);
//            System.out.println(z);
//        }

//      33  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        boolean z = (a == 1) || (b == 1) || (c == 1) || (d == 1)? true:false;
//        System.out.println(z);

//       34 Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        if (a + b > 5) {
//            System.out.println("S");
//        }
//        else {
//            System.out.println("D");
//        }

//       35 Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        int y = 0;
//        int z = a * b == 12? 12:0;
//        System.out.println(z);

//      36  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        if (d == 4 && a == 4) {
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }

//       37 Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        double z = a+b+c+d;
//        if (n == Math.pow(z, 2)) {
//            System.out.println("YES");
//        }
//        else {
//            System.out.println("NO");
//        }

//      38  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        if (a > b) {
//            double z = a * c;
//            System.out.println(z);
//        }
//        else {
//            System.out.println(1);
//        }

//      39  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        int z = (a + b + c + d > 20)? 1:0;
//        System.out.println(z);

//       40 Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        double a = n % 10;
//        double b = n / 10 % 10;
//        double c = n / 100 % 10;
//        double d = n / 1000;
//        int z = (a * b * c * d > 200)? 1:0;
//        System.out.println(z);

//      41  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        int sum = 0;
//        for (int i = 1; i < 11; i++) {
//            if (i % n == 0) {
//                sum+=i;
//                System.out.println(sum);
//            }
//        }

//      42  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        int multi = 1;
//        for (int i = 1; i < 111; i++) {
//            if (i % n == 0) {
//                multi*=i;
//                System.out.println(multi);
//            }
//        }

//      43  Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        int sum = 0;
//        for (int i = 1; i < 11; i++) {
//            if (i % n == 2) {
//                sum+=i;
//                System.out.println(sum);
//            }
//        }

//       44 Scanner scr = new Scanner(System.in);
//        System.out.println("input n ");
//        int n = scr.nextInt();
//        int multi = 1;
//        for (int i = 1; i < 111; i++) {
//            if (i % n == 3) {
//                multi*=i;
//                System.out.println(multi);
//            }
//        }

//      45  int sum = 0;
//        for (int i = 10; i < 111; i++) {
//            if (i % 3 == 0) {
//                sum+=i;
//                System.out.println(sum);
//            }
//        }

//      46  long multi = 1;
//        for (int i = 10; i < 111; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                multi*=i;
//                System.out.println(multi);
//            }
//        }
//       47 int sum = 0;
//        for (int i = 100; i < 1000; i++) {
//            if (i % 5 != 0) {
//                sum+=i;
//                System.out.println(sum);
//            }
//        }

//      48  long multi = 1;
//        for (int i = 100; i < 1000; i++) {
//            if (i % 2 != 0 && i % 3 != 0) {
//                multi*=i;
//                System.out.println(multi);
//            }
//        }

//      49  long multi = 1;
//        for (int i = 100; i < 1000; i++) {
//            if (i % 3 == 1 && i % 4 == 2) {
//                multi*=i;
//                System.out.println(multi);
//            }
//        }


//      71  for (double x = 2.4; x < 7.6; x+=0.2) {
//            double y = Math.tan(2*x + Math.pow(x,2));
//            System.out.println(y);
//        }

//      72  for (double x = -5.4; x < 1.2; x+=0.4) {
//            double y = Math.pow( 1 / Math.tan(Math.pow(x,2)),2);
//            System.out.println(y);
//        }

//       73 for (double x = 7.5; x < 12.5; x+=0.2) {
//            double y = Math.pow(x+1,2);
//            System.out.println(y);
//        }

//     74   for (double x = -3.8; x < 5.4; x+=0.3) {
//            double y = Math.pow(2,x+4);
//            System.out.println(y);
//        }

//      75  for (double x = -Math.PI; x < Math.PI; x+=Math.PI/8) {
//            double y =Math.pow(Math.sin(x),2) + Math.cos(x);
//            System.out.println(y);
//        }


//        for (double x = -5; x < 5; x+=2) {
//            if (x > 0) {
//                double y = Math.pow(x,2) + 4 * Math.pow(x,8);
//                System.out.println(y);
//            }
//            else {
//                System.out.println(0);
//            }
//        }

//      121  double sum = 0;
//        double x = 0;
//        double y = 0;
//        for (int i = 1; i < 16; i++) {
//            if (i % 2 == 0) {
//                x = i;
//                y = Math.pow(i,2);
//            }
//            else {
//                x = Math.pow(i,3);
//                y = i;
//            }
//            sum += Math.pow(x-y,2);
//
//        }
//        System.out.println(sum);

//     122   double sum = 0;
//        double x = 0;
//        double y = 0;
//        for (int i = 1; i < 10; i++) {
//            if (i % 2 == 0) {
//                x = Math.pow(Math.E,i-4);
//            }
//            else {
//                x = Math.pow(i,2) - i;
//                y = 0;
//            }
//            if (Math.pow(i, 2) % 2 == 0) {
//                Math.pow(Math.tan(i),2);
//            }
//            sum += Math.pow(x,2) - Math.pow(y,2);
//        }
//        System.out.println(sum);

//    123    double multi = 1;
//        double x = 0;
//        double y = 0;
//        for (int i = 1; i < 14; i++) {
//            if (i % 2 == 0) {
//                x = Math.pow(Math.E,i-4);
//            }
//            else {
//               x = Math.pow(i,2) - i;
//            }
//            y = Math.pow(i,4);
//            multi *= Math.pow(x,2) * Math.pow(y,2);
//        }
//        System.out.println(multi);

//       124 double multi = 1;
//        double x = 0;
//        double y = 0;
//        for (int i = 2; i < 18; i++) {
//            if (i % 2 == 0) {
//                x = Math.pow(2,i-4);
//            }
//            else {
//                x = Math.pow(i,2) + 2;
//                y = Math.pow(i,2) + 2;
//            }
//            multi *= x * y;
//        }
//        System.out.println(multi);

//     125   double sum = 0;
//        double x = 0;
//        double y = 0;
//        for (int i = 1; i < 10; i++) {
//            if (i % 3 == 0) {
//                x = Math.log(i);
//            } else {
//                x = 3;
//                y = 3;
//            }
//            if (i % 7 == 0) {
//                y = Math.log(i) / Math.log(3);
//            }
//            sum += x - y;
//        }
//        System.out.println(sum);

//     126   double sum = 0;
//        double x = 0;
//        double y = 0;
//        for (int i = 1; i < 16; i++) {
//            if (i % 5 == 0) {
//                x = i;
//            }
//            else {
//                x = 0;
//            }
//            if (i % 7 == 0) {
//                y = Math.pow(i,2);
//            }
//            else {
//                y = i;
//            }
//            sum += x - y;
//        }
//        System.out.println(sum);

//     127   double multi = 1;
//        double x = 0;
//        double y = 0;
//        for (int i = 1; i < 17; i++) {
//            if (i % 2 == 0) {
//                x = Math.pow(Math.sin(i),2);
//                y = Math.tan(i);
//            }
//            else {
//                x = 0;
//                y = 1 / Math.tan(i);
//            }
//            multi *= Math.pow(x,2) * y;
//
//        }
//        System.out.println(multi);

//      128  double multi = 1;
//        double x = 0;
//        double y = 0;
//        for (int i = 1; i < 14; i++) {
//            if (i % 2 == 0) {
//                x = Math.pow(Math.E,3 * i - 4);
//            }
//            else {
//                x = Math.pow(i,2) - i;
//            }
//            y  = Math.pow(i - 1,2);
//            multi *= x * Math.pow(y,2);
//        }
//        System.out.println(multi);

//       129 double sum = 0;
//        double x = 0;
//        double y = 0;
//        for (int i = 1; i < 16; i++) {
//            if (Math.abs(i) == 0) {
//                x = Math.tan(i);
//            }
//            else {
//                x = 1 / Math.tan(i);
//            }
//            y = Math.pow(Math.E,i - 4);
//            sum += x * y - i;
//        }
//        System.out.println(sum);

//     130   double multi = 1;
//        double x = 0;
//        double y = 0;
//        for (int i = 1; i < 10; i++) {
//            if (i % 5 == 0) {
//                x = i;
//            }
//            else {
//                x = Math.pow(i,2);
//                y = 6;
//            }
//            if (i % 3 == 0) {
//                y = Math.pow(i,3);
//            }
//            multi *= x * y;
//        }
//        System.out.println(multi);

//      131  Scanner in = new Scanner(System.in);
//        System.out.println("input x");
//        double x = in.nextDouble();
//        double y = 0;
//        for (double k = 1; k < 4; k++) {
//            if (x > 1) {
//                y = Math.pow(3 * x,k + 1);
//            }
//            else {
//                y = 5 * x + Math.pow(k,7);
//            }
//        }
//        System.out.println(y);

//      132  Scanner in = new Scanner(System.in);
//        System.out.println("input x");
//        double x = in.nextDouble();
//        System.out.println("input n");
//        double n = in.nextDouble();
//        double y = 0;
//        for (double k = 1; k < n; k++) {
//            if (x > 5) {
//                y = 3 * Math.log(x + 5 * k) / Math.log(3);
//            }
//            else {
//                y = 4 * Math.pow(x + k,8);
//            }
//        }
//        System.out.println(y);

//     133   Scanner in = new Scanner(System.in);
//        System.out.println("input x");
//        double x = in.nextDouble();
//        double y = 0;
//        for (int k = 1; k < 5; k++) {
//            if (x < 1) {
//                y = 8 * Math.pow(x,k);
//            }
//            else {
//                y = 7 * x + Math.log(x) / Math.log(3);
//            }
//        }
//        System.out.println(y);

//      134  Scanner in = new Scanner(System.in);
//        System.out.println("input x");
//        double x = in.nextDouble();
//        double y = 0;
//        for (int k = 1; k < 8; k++) {
//            if (x > 1) {
//                y = Math.pow(x,k - 1);
//            }
//            if (0 < x && x < 5) {
//                y = x * Math.pow(k,3);
//            }
//            else {
//                y = Math.pow(10,-6);
//            }
//        }
//        System.out.println(y);

//       135 Scanner in = new Scanner(System.in);
//        System.out.println("input x");
//        double x = in.nextDouble();
//        double y = 0;
//        for (int k = 1; k < 4; k++) {
//            if (x > 1) {
//                y = Math.pow(x,k - 1);
//            }
//            if (x < 3) {
//                y = x * Math.pow(k,3);
//            }
//            else {
//                y = Math.pow(10,-6);
//            }
//        }
//        System.out.println(y);

//      136  Scanner in = new Scanner(System.in);
//        System.out.println("input x");
//        double x = in.nextDouble();
//        double y = 0;
//        for (int k = 2; k < 8; k++) {
//            if (3 < x && x < 7) {
//                y = 9 * Math.pow(x,k);
//            }
//            else {
//                y = 8 * x + Math.pow(k,3);
//            }
//        }
//        System.out.println(y);

//     141   double sum = 0;
//        double multi = 1;
//        double w = 0;
//        double a = 0;
//        for (int m = 0; m < 5; m++) {
//            for (int n = 0; n < 6; n++) {
//                sum += Math.pow(a,m+n);
//
//            }
//            multi *= sum;
//        }
//        System.out.println(multi);

//      142  double sum = 0;
//        double sum1 = 0;
//        double a = 0;
//        for (int k = 1; k < 9; k++) {
//            for (int m = 1; m < 5; m++) {
//                sum += Math.pow(a*m,2) + Math.pow(k,2);
//            }
//            sum1 += sum;
//        }
//        System.out.println(sum1);

//      143  double multi = 0;
//        double multi1 = 0;
//        double n = 0;
//        for (int i = 0; i < 15; i++) {
//            for (int m = 1; m < 6; m++) {
//                multi *= i / (i + n * n);
//            }
//            multi1 *= multi;
//        }
//        System.out.println(multi1);

//       41 double sum = 0;
//        double n = 8;
//        for (int i = 1; i < 100; i++) {
//            if (i % n == 0) {
//                sum += i;
//            }
//            System.out.println(sum);
//        }

//        for (int i = 1; ; i++) {
//            System.out.println(i);
//
//        }


        /*double n = 7;
        double k = 0;
        for (double i = 1; i < 10; i++) {
            if (n == Math.pow(i, 3)) {
                k = i;
                break;
            }
        }
        if (n == Math.pow(k, 3)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }*/


        /*Scanner in = new Scanner (System.in);
        System.out.println("input n");
        double n = in.nextDouble();
        boolean z = n == Math.pow(3,n)? true:false;
        System.out.println(z);*/

        /*int x = 475699998;
        int num = (int)Math.log10(x)+1;
        System.out.println(num);*/

        /*int n = 123456987;
        int count = 0;
        for ( ; n != 0 ; n /= 10)
            ++count;
        System.out.println(count);*/

       /*int [] [] moon = new  int [][]{
               {1,2,3},
               {4,5,6},
               {7,8,9}
       };
        for (int i = 0; i < moon.length; i++) {
            for (int j = 0; j < moon[i].length; j++) {
                System.out.print(moon[i][j]);
            }
            System.out.println();
        }*/



        /*68 int count = 0;
        int sum = 0;
        int [] moon = {6,4,6,3,-9,-6,-6,3};
        for (int i:moon
             ) {
            if (i > 0) {
                sum+=i;
                count+=i;
            }
            System.out.println(count);

        }*/

       /*69 int count = 0;
        int multi = 1;
        int [] moon = {9,4,-9,-1,5,6};
        for (int i:moon
             ) {
            if (i > 0) {
                multi*=i;
                count+=i;
            }
            System.out.println(count);
        }*/

      /*70  int count = 0;
        int multi = 1;
        int [] moon = {5,8,1,5,-8,-3,-1,9};
        for (int i:moon
             ) {
            if (i < 0) {
                multi*=i;
                count+=i;
            }
            System.out.println(count);
        }*/

      /* 71 int count = 0;
        int sum = 0;
        int [] moon = {6,-3,7,-2,-6,9,-4,2,6,-8};
        for (int i:moon
             ) {
            if (i < 0) {
                sum+=i;
                count+=i;
            }
            System.out.println(count);
        }*/

        /*72 int sum = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
            System.out.println(sum);
        }*/

       /*73 int multi = 1;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 == 0) {
                multi*=i;
            }
            System.out.println(multi);

        }*/

        /* 74 int multi = 1;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0) {
                multi *= Math.pow(moon[i],2);
            }
            System.out.println(multi);
        }*/

       /*75 int sum = 0;
        int [] moon = {1,-2,3,-4,5,6,-7,8,-9};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0) {
                sum += Math.abs(moon[i]);
            }
            System.out.println(sum);
        }*/


        /* 76 Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int [] moon = {1,2,3,4,5,6,7,8,9};
        int count = 0;
        for (int a:moon
             ) {
            if (a % k == 0) {
                count++;
            }


        }
        System.out.println(count);*/

       /* 77 int count = 0;
        int count1 = 0;
        int [] moon = {5,7,2,-9,-8,3,-1};
        for (int a: moon
             ) {
            if (a > 0) {
                count++;
            }
            if (a < 0) {
                count1++;
            }


        }
        System.out.println(count+ " "+count1);*/

        /* 81 Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int sum = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a:moon
             ) {
            if (Math.abs(a) < k) {
                sum++;
            }

        }
        System.out.println(sum);*/

        /* 82 Scanner in = new Scanner(System.in);
        System.out.println("input t");
        int t = in.nextInt();
        int multi = 1;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a:moon
        ) {
            if (Math.abs(a) < t) {
                multi*=a;
            }

        }
        System.out.println(multi);*/

        /* 83 Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a:moon
        ) {
            if (Math.abs(a) < k) {
                count++;
            }

        }
        System.out.println(count);*/


       /* 84 ?Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int sum = 0;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (k % i == 0) {
                sum++;
                count++;
            }
        }
        System.out.println(count);*/

        /* 88 int sum = 0;
        int [] moon = {1,2,3,4,5,6,7,87,8,9,9,9};
        for (int a:moon
        ) {
            if (a % 2 == 0) {
                sum+=Math.pow(a,2);
            }

        }
        System.out.println(sum);*/

        /*int[] array = {1, -4, 3, 5};
        int length = array.length;
        System.out.println(length);*/


        /* 89 int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a:moon
             ) {
            if (a % 2 == 0) {
                count++;
            }

        }
        System.out.println(count);*/

        /* 90 int multi = 1;
        int sum = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a:moon
             ) {
            if (a % 2 == 0) {
                sum++;
                multi*=a;
            }

        }
        System.out.println(sum+ " " +multi);*/

        /* 91 int sum = 0;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0) {
                sum+=moon[i];
                count++;
            }
        }
        System.out.println(sum/count);*/

       /* 92 int multi = 1;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < moon.length; i++) {
            if (i % 2 != 0) {
                multi*=moon[i];
                count++;
            }
        }
        System.out.println(multi/count);*/

        /* 94 int count = 0;
        int [] moon = {1,2,4,0,6,8,9,5,3,0,9};
        for (int a:moon
             ) {
            if (a == 0) {
                count++;
            }

        }
        System.out.println(count);*/

        /* 95 int sum =0;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
        ) {
            if (a % 3 == 0) {
                sum+=a;
                count++;
            }
        }
        System.out.println(sum/count);*/

       /* 96 int multi = 1;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9,10};
        for (int a: moon
        ) {
            if (a % 5 == 0) {
                multi*=a;
                count++;
            }

        }
        System.out.println(multi/count);*/

        /* 97 int count = 0;
        int [] moon= {1,2,3,14,6,9,28};
        for (int a: moon
        ) {
            if (a % 7 == 0) {
                count++;
            }
        }
        System.out.println(count);*/


        /* 98 Scanner in = new Scanner(System.in);
        System.out.println("input k");
        int k = in.nextInt();
        int sum = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
        ) {
            if (a % k == 0) {
                sum+=a;
            }
        }
        System.out.println(sum);*/


        /* 99 Scanner in = new Scanner(System.in);
        System.out.println("input m");
        int m = in.nextInt();
        int multi = 1;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
        ) {
            if (a % m == 0) {
                multi*=a;
            }
        }
        System.out.println(multi);*/

        /* 100 Scanner in = new Scanner(System.in);
        System.out.println("input t");
        int t = in.nextInt();
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
        ) {
            if (a % t == 0) {
                count++;
            }

        }
        System.out.println(count);*/


        /* 101 int multi = 1;
        int [] moon = {1,2,35,10,70,9};
        for (int a: moon
        ) {
            if (a % 5 == 2) {
                multi*=a;
            }
        }
        System.out.println(multi);*/


       /* 102 int sum = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a:moon
        ) {
            for (int i = 0; i < moon.length; i++) {
                if (a % 3 == 0) {
                    sum+=Math.pow(a,2);
                }

            }

        }
        System.out.println(sum);*/


        /* 103 int sum = 0;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int a: moon
        ) {
            for (int i = 0; i < moon.length; i++) {
                if (i == Math.pow(a, 2)) {
                    sum+=a;
                    count++;
                }
            }
        }
        System.out.println(sum/count);*/


        /* 104 int multi = 1;
        int count = 0;
        int [] moon = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < args.length; i++) {
            if (moon[i] > i) {
                multi*=moon[i];
                count++;
            }
        }
        System.out.println(multi/count);*/

















    }
}