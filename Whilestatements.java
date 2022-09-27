public class Whilestatements
{
    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        do {
            System.out.println("i =" + i + "which is < 15");
            i++;
        } while (i < 15); 
        int k = 10;
        do {
            System.out.println("k = " + k + "k which is > 5");
            k--;
        } while (k > 5);
        int b = 8;

        do {
            System.out.println("b = " + b + " which is <= 20," + " a is " + a + " which is < 10");
            a++;
            b++;
        } while (b <= 20 & a < 10);

    } 

    public static void main(String[] args)
    {        
        Whilestatements hw = new Whilestatements();
        hw.run();
    }
}