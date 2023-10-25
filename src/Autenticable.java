public interface Autenticable {

    public void setClave( String clave);

    public default boolean iniciarSesion(String clave){

        return false;
    }

    }


