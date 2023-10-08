public class Contador extends Funcionario{

    @Override
    public double getBonificacion() {
        return super.getSalario()+this.getSalario()*0.05;
    }
}
