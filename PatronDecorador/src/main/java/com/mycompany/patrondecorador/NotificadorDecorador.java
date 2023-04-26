/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondecorador;

import java.time.LocalDate;

/**
 *
 * @author nicol
 */
public class NotificadorDecorador implements iPrestamo {

    private iPrestamo prestamo;
    private iNotificador notificador;

    public NotificadorDecorador(iPrestamo prestamo, iNotificador notificador) {
        this.prestamo = prestamo;
        this.notificador = notificador;
    }
    
    

    @Override
    public LocalDate fechaDevolucion() {
        return prestamo.fechaDevolucion();
    }

    public void notificar() {
       
        notificador.notificar(prestamo);

    }
}
