/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unipago_wc;

import Entity.EntidadCiudadano;
import com.Unipago.Bean.SessionBeanCiudadano;
import java.util.ArrayList;

/**
 *
 * @author JoseEduardo
 */
public class MainBeanTest {

    public static void main(String args[]) {
        System.out.println("Provando Beans");
//----------------insertando ciudadano test exite--------------
//        EntidadCiudadano ciudadano1 = new EntidadCiudadano();
//        ciudadano1.setNombre("Miguel");
//        ciudadano1.setApellido("Barbaro");
//        ciudadano1.setSexo('M');
//        ciudadano1.setFecha("15/8/1975");
//        ciudadano1.setDireccion("Calle las cruzado Nr.3");
//        ciudadano1.setCorreo("Barba6@gmail.com");
//        ciudadano1.setTelefono("809-741-3274");
//        SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
//        boolean result = SessioCiudadano.AddCiudadano(ciudadano1);
//        if (result) {
//            System.out.println("EL ciudadano se inserto con exito");
//        }else{
//         System.out.println("Error en la insercion del ciudadano");
//        }
//------------------------------------------------------------------------------------------
//-----------------------Provando Array list ciudadano----------------------------------------
//        SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
//        ArrayList<EntidadCiudadano> listado = SessioCiudadano.ListaCiudadanos();
//        for (EntidadCiudadano entidadCiudadano : listado) {
//            System.out.println(entidadCiudadano.toString());
//        }
//------------------------------------------------------------------------------------------
//-------------------------Provando Eliminar Ciudadano--------------------------------------
//        SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
//        boolean result = SessioCiudadano.DeleteCiudadano(6);
//        if (result) {
//            System.out.println("El ciudadano se eleimino con exito");
//        } else {
//            System.out.println("Error en la eliminacion del ciudadano");
//        }
//    }
//------------------------------------------------------------------------------------------
//-------------------------Provando Actualizar Ciudadano--------------------------------------
//     SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
//     EntidadCiudadano ciudadano1 = new EntidadCiudadano();
//        ciudadano1.setNombre("Julio");
//        ciudadano1.setApellido("Masacessi");
//        ciudadano1.setSexo('M');
//        ciudadano1.setFecha("15/8/1990");
//        ciudadano1.setDireccion("Calle miguel Angel Nr.33");
//        ciudadano1.setCorreo("juli6@gmail.com");
//        ciudadano1.setTelefono("809-741-3159");
//        boolean result = SessioCiudadano.UpdateCiudadano(ciudadano1, 9);
//        if (result){
//            System.out.println("El ciudadano se Actualizo con exito");
//        } else {
//            System.out.println("Error en la Actualisacion del ciudadano");
//        }
//------------------------------------------------------------------------------------------
//-------------------------Provando Encontrar Ciudadano --------------------------------------
//        SessionBeanCiudadano SessioCiudadano = new SessionBeanCiudadano();
//        EntidadCiudadano ciudadano1 = SessioCiudadano.BuscarCiudadano(16);
//        System.out.println(ciudadano1.getNombre());
//        System.out.println(ciudadano1.getApellido());

    }

}
