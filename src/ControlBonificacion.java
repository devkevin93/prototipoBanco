public class ControlBonificacion {
    public double suma;
    public double registrarSalario(Funcionario funcionario){
        this.suma = funcionario.getBonificacion() + this.suma;
        System.out.println("calculo actual: " + this.suma);
        return  this.suma;
    }



}
