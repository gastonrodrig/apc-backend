package com.apcemedicom.exepciones;

public class UsuarioNotFoundException extends Exception{
    public UsuarioNotFoundException(){
        super("el usuario con ese username ya existe en la base de datos, vuelva a intentar");
    }

    public UsuarioNotFoundException (String mensaje){
        super(mensaje);
    }
}
