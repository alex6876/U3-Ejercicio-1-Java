public class CuentaBancaria {
    private String titular;
    private double saldoActual;
    private String numeroCuenta;

    public CuentaBancaria(String titular, double saldoActual, String numeroCuenta) {
        this.titular = titular;
        if (saldoActual >= 0) {
            this.saldoActual = saldoActual;
        }else {
            this.saldoActual = 0;
        }

        this.numeroCuenta = numeroCuenta;
    }

    public String gettitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        if(saldoActual >= 0) {
            this.saldoActual = saldoActual;
            System.out.println("saldo: $"+saldoActual);
        }else{
            System.out.println("Saldo debe ser mayor a cero");
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public void depositar(double monto){
        if(monto > 0){
            saldoActual = saldoActual + monto;
            System.out.println("Monto depositado: $" + monto);
        }else{
            System.out.println("El saldo debe ser mayor a cero.");
        }
    }

    public void extraer(double monto){
        if(monto > 0 && monto <= saldoActual){
            saldoActual = saldoActual - monto;
            System.out.println("Monto extraido: $" + monto);
        }else{
            System.out.println("Extracción invalida.");
        }
    }

    public void mostrar(){
        System.out.println("titular: " + titular);
        System.out.println("Numero Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldoActual);
    }
}

