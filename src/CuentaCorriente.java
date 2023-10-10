public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);


    }

    @Override
    public boolean saca(double valor) {
        double comision = 0.2;
        boolean saca = super.saca(valor + comision);
        return saca;
    }
}
