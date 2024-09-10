public class EjercicioUno {
    
    public static double ctte=5.67*Math.pow(10,-8);
    public static double resultado;
    public static double DerivadaR(double r,double e,double T){
        resultado=8*Math.PI*r*e*ctte*Math.pow(T,4);
        return resultado;
    }
    public static double DerivadaE(double r, double T){
        return resultado=4*Math.PI*Math.pow(r, 2)*ctte*Math.pow(T,4);
    }
    public static double DerivadaT(double r,double e,double T){
        return resultado=16*Math.PI*Math.pow(r,2)*e*ctte*Math.pow(T,3);
    }
    public static void main(String[] args) {
        double r,e,T;
        double er,ee,eT;
        r=0.15;er=0.01;
        e=0.9;ee=0.05;
        T=550;eT=20;
        double H=4*Math.PI*Math.pow(r,2)*e*ctte*Math.pow(T,4);
        double error=DerivadaR(r, e, T)*er+DerivadaE(r,T)*ee+DerivadaT(r,e,T)*eT;
        System.out.println("H : "+H);
        System.out.println("error : "+error);
        System.out.println("H-error : "+(H-error));
        System.out.println( "H+error : "+(H+error));
    }
  
}
