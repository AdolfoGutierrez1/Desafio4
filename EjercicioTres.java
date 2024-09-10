public class EjercicioTres {

    public static double factorial(int x){
        if(x>0)
            return x*factorial(x-1);
        else
            return 1;
    }
    public static double LOrden(int n,double y){
        double val;
        val=Math.pow(-1, n-1)*factorial(n-1)*1/Math.pow(y, n);
        return val;
    }
    public static void main(String[] args) {
        
        double x0,x1,h,fx1,fx0,error,fx;
        x1=2.5;x0=1;
        h=x1-x0;
        fx1=Math.log(x1);fx=fx1;
        fx0=Math.log(x0);
        fx1=fx0;
        error=Math.abs((fx-fx1)/fx*100);
        System.out.println("Orden 0 : "+fx1);
        System.out.println("error porcentual : "+error);
        for (int i = 1; i <= 5; i++) {
            fx1=fx1+LOrden(i, x0)*Math.pow(h,i)/factorial(i);
            error=Math.abs((fx-fx1)/fx*100);
            System.out.println("Orden "+i+" : "+fx1);
            System.out.println("error porcentual : "+error);
        }
        System.out.println("a medida que nos alejamos del punto x=1 la serie de Taylor pierde \nprecision y aumenta el error porcentual ");
    }
}
