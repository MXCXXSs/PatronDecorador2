/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.patrondecorador;

import java.time.LocalDate;

/**
 *
 * @author nicol
 */
public class PatronDecorador {

    public static void main(String[] args) {
        /*  iPrestamo prestamo = new PrestamoLibro(LocalDate.of(2023,4,26));
        iNotificador notificadorCorreo = new NotificadorEmail();
        iNotificador notificadorMsgTexto = new NotificadorSMS();
        iNotificador notificadorWhatsapp = new NotificadorWhatsApp();
        NotificadorDecorador prestamoConNotificacion=new NotificadorDecorador(prestamo, notificadorWhatsapp);
        prestamoConNotificacion.notificar();
         */
        iPrestamo prestamoLibro = new PrestamoLibro(LocalDate.of(2023, 4, 26));
        DecoradorMultiple notificador = new DecoradorMultiple();
        notificador.addNotificador(new NotificadorEmail());
        notificador.addNotificador(new NotificadorSMS());
        notificador.addNotificador(new NotificadorWhatsApp());
        NotificadorDecorador prestamoLibroConNotificacion = new NotificadorDecorador(prestamoLibro, notificador);
        prestamoLibroConNotificacion.notificar();
        iPrestamo prestamoRevista = new PrestamoRevista();
        DecoradorMultiple notificadorR = new DecoradorMultiple();
        notificadorR.addNotificador(new NotificadorEmail());

        notificadorR.addNotificador(new NotificadorWhatsApp());
        NotificadorDecorador prestamoRevistaConNotificacion = new NotificadorDecorador(prestamoRevista, notificadorR);
        prestamoRevistaConNotificacion.notificar();

    }
}
