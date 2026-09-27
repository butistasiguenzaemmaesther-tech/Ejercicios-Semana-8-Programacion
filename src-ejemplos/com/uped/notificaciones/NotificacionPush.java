package com.uped.notificaciones;

public class NotificacionPush extends Notificacion {

    public NotificacionPush(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación Push a: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}