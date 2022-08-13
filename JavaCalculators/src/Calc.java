import java.util.Scanner;

public class Calc {
    private double p1,p2;
    //set = setar um valor na variável.
    //get = pegar o valor que está na variável.


    public void dds ()
    {
        System.out.println("(c)Kevin 2022 \n");

        Scanner rd = new Scanner(System.in);

        System.out.print("Enter your P1 note: ");
        p1 = rd.nextDouble();

        System.out.print("Enter your P2 note: ");
        p2 = rd.nextDouble();

    }
    public void calc (double p1, double p2)
    {
        System.out.println("Arithmetic mean: " + (p1+p2) / 2);
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }
}
