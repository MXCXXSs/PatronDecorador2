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
public class PrestamoLibro implements iPrestamo {

    private LocalDate fechaDevolucion = null;

    public PrestamoLibro(LocalDate fechaDevolucion) {
        System.out.println("El libro prestado es 100 años de soledad, la fecha de devolucion será el día: " + fechaDevolucion);
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public LocalDate fechaDevolucion() {
        return fechaDevolucion;
    }
}
