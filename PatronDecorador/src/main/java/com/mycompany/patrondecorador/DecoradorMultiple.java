/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondecorador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicol
 */
public class DecoradorMultiple implements iNotificador{
    private final List<iNotificador> notificadores = new ArrayList<>();

    public void addNotificador(iNotificador notificador) {
        notificadores.add(notificador);
    }

    public void removeNotificador(iNotificador notificador) {
        notificadores.remove(notificador);
    }

    @Override
    public void notificar(iPrestamo prestamo) {
        for (iNotificador notificador : notificadores) {
            notificador.notificar(prestamo);
        }
    }
}
