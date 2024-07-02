package com.urbansales.tiendaderopa.Model;

public class Autentificacion {

    private String usuario;

    private String password;

    public Autentificacion(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
}
