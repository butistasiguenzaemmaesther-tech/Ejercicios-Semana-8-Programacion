package com.uped.notificaciones;

public class NotificacionCorreo extends Notificacion {

    public NotificacionCorreo(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}