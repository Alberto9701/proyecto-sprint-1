package lambda;

public class Ejecutor {
    public static void main(String[] args) {
        //ICalculadora calculadora = (nombre)-> System.out.println("bienvenido a las expresiones lambda " + nombre );
        //calculadora.mensaje("Alberto");

        //implementacion de la funcion operacion de nuestra interfaz funcional (suma)
        ICalculadora calculadora1 = (n1,n2)->{
            double resultado = n1 + n2;
            System.out.println("La suma es " +resultado);
        };

        calculadora1.operacion(5,9);

        //implementacion de la funcion operacion de nuestra interfaz funcional (resta)
        ICalculadora calculadora2 = (n1,n2)->{
            double resultado = n1 - n2;
            System.out.println("La resta es " +resultado);
        };

        calculadora2.operacion(5,9);

        //implementacion de la funcion operacion de nuestra interfaz funcional (multiplicacion)
        ICalculadora calculadora3 = (n1,n2)->{
            double resultado = n1*n2;
            System.out.println("La multiplicacion es " + resultado);
        };

        calculadora3.operacion(5,9);

        //implementacion de la funcion operacion de nuestra interfaz funcional ( division)
        ICalculadora calculadora4 = (n1,n2)->{
            double resultado = n1/n2;
            System.out.println("La division de " + n1 + " / " + n2 + " es " + resultado);
        };
        calculadora4.operacion(6,2);
    }
}
