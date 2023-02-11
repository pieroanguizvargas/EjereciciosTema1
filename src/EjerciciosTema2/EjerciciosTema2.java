public class EjerciciosTema2 {

    // Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    public static void main(String[] args) {
        class IvaPrecio {
            public static final double IVA = 0.30;
            public static double precioConIva(double precio){
                double precioFinal = precio * (1 + IVA);
                return precioFinal;
            }
        }
    }
}
