package com.uped.notificaciones;

public class NotificacionSMS extends Notificacion {

    public NotificacionSMS(String destinatario, String mensaje) {
        super(destinatario, mensaje);
    }

    @Override
    public void enviar() {
        String texto = mensaje.length() > 20
                ? mensaje.substring(0, 20) + "..."
                : mensaje;

        System.out.println("Enviando SMS a: " + destinatario);
        System.out.println("Mensaje: " + texto);
    }
}