public class PruebaAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setAgencia(1);
        cuenta.depositar(400);
        cuenta.saca(300);
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getAgencia());

    }
}
