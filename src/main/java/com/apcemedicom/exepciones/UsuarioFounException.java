package com.apcemedicom.exepciones;

public class UsuarioFounException extends Exception{
    public UsuarioFounException(){
        super("el usuario con ese username no existe en la base de datos, vuelva a intentar");
    }

    public UsuarioFounException (String mensaje){
        super(mensaje);
    }
}
