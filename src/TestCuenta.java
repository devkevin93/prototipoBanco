public class TestCuenta {
    public static void main(String[] args) {
        CuentaAhorros ca = new CuentaAhorros(2,3);
        CuentaCorriente cc = new CuentaCorriente(1,1);
        cc.deposita(2000);
        cc.transfiere(1000,ca);

        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());



    }
}
