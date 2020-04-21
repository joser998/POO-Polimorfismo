package polimorfismo;

public class ClasePrincipal {

    public static void main(String[] args) {
            
        //Objeto Clase Padre para interactuar con la clase Suma_ClaseHija
        Operaciones_ClasePadre mensajero_Suma = new Suma_ClaseHija();
        //Pedimos Datos
        mensajero_Suma.PedirDatos();
        //Se hacen las operaciones en este caso la suma
        mensajero_Suma.Operaciones();
        //Se muestra el resultado
        System.out.print("El resultado es: ");
        mensajero_Suma.MostrarResultado();
        
        
        
        //************************************************************************************
        
        
        //Objeto clase Padre para interactucar con la clase hija Resta
        Operaciones_ClasePadre mensajero_Resta = new Resta_ClaseHija();
        //Pedimos los datos de la misma forma
        mensajero_Resta.PedirDatos();
        //Se realizan las operaciones
        mensajero_Resta.Operaciones();
        //Se muestra el resultado
        System.out.print("El resultado es: ");
        mensajero_Resta.MostrarResultado();
        
    }
}
