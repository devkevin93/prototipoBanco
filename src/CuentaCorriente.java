public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(int agencia, int numero) {
        super(agencia, numero);


    }

    @Override
    public void deposita(double valor) {
        this.saldo = this.saldo+valor;
    }

    @Override
    public boolean saca(double valor) {
        double comision = 0.2;
        return super.saca(valor + comision);
    }
}
