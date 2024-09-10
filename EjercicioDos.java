public class EjercicioDos {

    public static  Double Orden0(double x){
        double y=25*Math.pow(x,3)-6*Math.pow(x,2)+7*x-88;
        return y;
    }
    public static Double Orden(double x, int sw){
        double y;
        switch (sw) {
            case 1:
                y=75*Math.pow(x,2)-12*x+7;
                return y;
            case 2:
                return y=150*x-12;
            case 3:
                return 150.0;    
            default:
                return 0.0;
        }
    }
    public static double factorial(int x){
        if (x>0)
            return x*factorial(x-1);
        else
            return 1;
    }
    public static void main(String[] args) {
        double x0=1,x1=3;
        double h=x1-x0;
        double fx0,fx1;
        fx0=Orden0(x0);
        fx1=Orden0(x1);
        double error;
        error=(fx1-fx0)/fx1*100;
        double fx=fx1;
        fx1=fx0;
        System.out.println("Orden 0 "+fx0);
        System.out.println("error porcentual: "+error);
        for (int i = 1; i <= 3; i++) {
            fx1=fx1+Orden(x0, i)*Math.pow(h,i)/factorial(i);
            error=(fx-fx1)/fx*100;
            System.out.println("Orden "+i+" :"+fx1);
            System.out.println("error porcentual: "+error);
        }
    }
}
