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
public class PrestamoRevista implements iPrestamo{
        private LocalDate fechaDevolucion = null;
        private String fecha="2023-04-30"; 

    public PrestamoRevista() {
        System.out.println("La revista Semana ha sido prestada, y la fecha de devolucion será " + fecha);
        
    }

    @Override
    public LocalDate fechaDevolucion() {
        return fechaDevolucion;
    }
}
