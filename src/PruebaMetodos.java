public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.depositar(500);
        System.out.println(primeraCuenta.getSaldo());

        primeraCuenta.depositar(200);
        System.out.println(primeraCuenta.getSaldo());

        primeraCuenta.saca(100);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.depositar(1000);

        segundaCuenta.transferir(400,primeraCuenta);
        System.out.println("segunda cuenta "+segundaCuenta.getSaldo());
        System.out.println("primera cuenta "+primeraCuenta.getSaldo());



    }
}
