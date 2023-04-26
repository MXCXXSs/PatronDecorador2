/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondecorador;

/**
 *
 * @author nicol
 */
public class NotificadorWhatsApp implements iNotificador {

    @Override
    public void notificar(iPrestamo prestamo) {
        System.out.println("Enviando mensaje de notificación vía whatsapp");
    }
}
