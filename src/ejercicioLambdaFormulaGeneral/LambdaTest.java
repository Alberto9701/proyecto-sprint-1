package ejercicioLambdaFormulaGeneral;

import static java.lang.Math.sqrt;

public class LambdaTest {
    public static void main(String[] args) {
        //implementación de la funcion fGeneral de nuestra interfaz IFgeneral
        IFgeneral ecuacion1 = ( a, b, c) -> {
            double discriminante = sqrt( (b*b) - (4*a*c) );
            double x1 = ( (-1*b) + discriminante) / (2*a);
            double x2 = ( (-1*b) - discriminante) / (2*a);
            System.out.println("\nlas raices de la ecuacion ");
            System.out.println("(" + a + ")" + "x^2 + (" + b + ")x + " + c + " = 0 son \n");
            System.out.println("x1: " + x1 + "\nx2: " + x2);
        };

        //ejecutamos el metodo
        ecuacion1.fGeneral(1,-9,20);
        ecuacion1.fGeneral(2,9,10);
        ecuacion1.fGeneral(5,7,2);
        ecuacion1.fGeneral(3,-5,2);
    }

}
