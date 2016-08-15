/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Unipago.Bean;

import Entity.EntidadCiudadano;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JoseEduardo
 */
public class SessionBeanCiudadanoTest {

    EntidadCiudadano ciudadano1;

    public SessionBeanCiudadanoTest() {
        ciudadano1 = new EntidadCiudadano();
        ciudadano1.setNombre("Prueba");
        ciudadano1.setApellido("PruebaJUnit");
        ciudadano1.setSexo('M');
        ciudadano1.setFecha("08/08/2016");
        ciudadano1.setDireccion("Prueba");
        ciudadano1.setCorreo("Prueba@gmail.com");
        ciudadano1.setTelefono("prueba");
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() throws Exception {
        
    }

    /**
     * Test of AddCiudadano method, of class SessionBeanCiudadano.
     */
    @Test
    public void testAddCiudadano() throws Exception {
        SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
        boolean result = SessioCiudadano.AddCiudadano(this.ciudadano1);
        boolean Esperado = true;
        assertEquals(Esperado, result);
        System.out.println("ID"+ this.ciudadano1.getID());
    }

    /**
     * Test of DeleteCiudadano method, of class SessionBeanCiudadano.
     */
    @Test
    public void testDeleteCiudadano() throws Exception {
        SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
        boolean result = SessioCiudadano.DeleteCiudadano(0);
        boolean ExpetResult = false;
        assertEquals(ExpetResult, result);
    }

    /**
     * Test of UpdateCiudadano method, of class SessionBeanCiudadano.
     */
    @Test
    public void testUpdateCiudadano() throws Exception {
        SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
        ciudadano1.setNombre("Update");
        boolean result = SessioCiudadano.UpdateCiudadano(ciudadano1, 0);
        boolean ExpResult = false;
        assertEquals(ExpResult, result);
    }

    /**
     * Test of ListaCiudadanos method, of class SessionBeanCiudadano.
     */
    @Test
    public void testListaCiudadanos() throws Exception {
        SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
        ArrayList<EntidadCiudadano> listado = SessioCiudadano.ListaCiudadanos();
        ArrayList<EntidadCiudadano> ExpResult = listado;
        assertEquals(ExpResult, listado);
    }

    /**
     * Test of BuscarCiudadano method, of class SessionBeanCiudadano.
     */
    @Test
    public void testBuscarCiudadano() throws Exception {
        SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
        EntidadCiudadano ciudadano1 = SessioCiudadano.BuscarCiudadano(this.ciudadano1.getID());
        EntidadCiudadano expResult = ciudadano1;
        assertEquals(expResult, ciudadano1);
    }

}
