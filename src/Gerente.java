public class Gerente extends Funcionario implements Autenticable {

    public double getBonificacion(){
        return super.getSalario();
    }

    @Override
    public void setClave(String clave) {

    }

}

