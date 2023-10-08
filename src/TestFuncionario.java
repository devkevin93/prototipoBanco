public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("diego");
        funcionario.setDocumento("12345");
        funcionario.setSalario(2000);
        System.out.println(funcionario.getSalario());
    }
}
