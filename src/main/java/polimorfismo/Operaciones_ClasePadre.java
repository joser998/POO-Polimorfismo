package polimorfismo;

import java.util.Scanner;

//Clase Abstracta Padre
public abstract class Operaciones_ClasePadre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos() {
        System.out.print("\nDame el primer valor: ");
        valor1 = entrada.nextInt();
        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    //Metodo Abstracto
    public abstract void Operaciones();

    public void MostrarResultado() {
        System.out.println(resultado);
    }

}
