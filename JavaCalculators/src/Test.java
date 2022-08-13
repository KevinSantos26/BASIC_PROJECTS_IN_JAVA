

public class Test {
    public static void main (String[] args)
    {

        Calc C = new Calc();
        C.dds();
        C.setP1(30); //se quiser forçar um valor.
        C.setP2(50); //se quiser forçar um valor.
        System.out.println(C.getP1());
        System.out.println(C.getP2());
        C.calc(C.getP1(), C.getP2());

    }
}


