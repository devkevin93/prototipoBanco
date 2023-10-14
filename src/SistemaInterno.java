public class SistemaInterno {
    private String clave = "12345";
    public boolean autentica(Gerente gerente){
        boolean puedeIniciarSesion = gerente.iniciarSesion(clave);
        if (puedeIniciarSesion){
            System.out.println("Inicio de login Exitoso ");
            return true;
        }else {
            System.out.println("Error en login, intente nuevamente  ");
            return false;
        }
    }
}
