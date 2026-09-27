package com.uped.notificaciones;

public class MainNotificaciones {

    public static void main(String[] args) {

        Notificacion correo = new NotificacionCorreo(
                "emma@gmail.com",
                "Hola, este es un correo de prueba."
        );

        Notificacion sms = new NotificacionSMS(
                "7890-1234",
                "Este es un mensaje SMS de prueba."
        );

        Notificacion push = new NotificacionPush(
                "Emma",
                "Tienes una nueva notificación."
        );

        correo.enviar();
        correo.registrarHistorial();

        sms.enviar();
        sms.registrarHistorial();

        push.enviar();
        push.registrarHistorial();
    }
}