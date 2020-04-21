package polimorfismo;

//Clase Hija
public class Suma_ClaseHija extends Operaciones_ClasePadre {

    //Metodo Sobre escrito de Clase Padre
    @Override
    public void Operaciones() {
        resultado = valor1 + valor2;
    }

}
