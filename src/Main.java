public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 500, "654684646541654");

        cuenta.depositar(2500);
        cuenta.extraer(900);
        cuenta.mostrar();
    }
}