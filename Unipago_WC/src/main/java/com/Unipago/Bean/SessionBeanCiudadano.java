/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Unipago.Bean;

import Entity.EntidadCiudadano;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class SessionBeanCiudadano implements SessionBeanCiudadanoLocal {

    private EntityManagerFactory emFactory = null;
    private EntityManager entityManaged = null;
    private EntityTransaction EntityTransaction;

    public SessionBeanCiudadano() {
    }

    @Override
    public boolean AddCiudadano(EntidadCiudadano ciudadano) {
        boolean Exito = false;
        try {
            emFactory = Persistence.createEntityManagerFactory("Ciudadano");
            entityManaged = emFactory.createEntityManager();
            EntityTransaction = entityManaged.getTransaction();
            EntityTransaction.begin();
            entityManaged.persist(ciudadano);
            entityManaged.getTransaction().commit();
            Exito = true;
        } catch (Exception ex) {
            if (EntityTransaction != null) {
                System.out.println("Eror ingresar" + ex.getMessage());
                EntityTransaction.rollback();
                Exito = false;
            }
        } finally {
            if (emFactory != null) {
                emFactory.close();
                emFactory = null;
            }
            if (entityManaged != null) {
                entityManaged = null;
            }
        }
        return Exito;
    }

    @Override
    public boolean DeleteCiudadano(int ID) {
        boolean Exito = false;
        try {
            emFactory = Persistence.createEntityManagerFactory("Ciudadano");
            entityManaged = emFactory.createEntityManager();
            EntityTransaction = entityManaged.getTransaction();
            EntityTransaction.begin();
            EntidadCiudadano entidaE = entityManaged.find(EntidadCiudadano.class, ID);
            entityManaged.remove(entidaE);
            EntityTransaction.commit();
            Exito = true;
        } catch (Exception ex) {
            if (EntityTransaction != null) {
                System.out.println("Error Eliminar" + ex.getMessage());
                EntityTransaction.rollback();
                Exito = false;
            }
        } finally {
            if (emFactory != null) {
                emFactory.close();
                emFactory = null;
            }
            if (entityManaged != null) {
                entityManaged = null;
            }
        }
        return Exito;

    }

    @Override
    public boolean UpdateCiudadano(EntidadCiudadano ciudadano, int ID) {
        boolean Exito = false;
        try {
            emFactory = Persistence.createEntityManagerFactory("Ciudadano");
            entityManaged = emFactory.createEntityManager();
            EntityTransaction = entityManaged.getTransaction();
            EntityTransaction.begin();
            EntidadCiudadano ciudadanoUpdate = entityManaged.find(EntidadCiudadano.class, ID);
            ciudadanoUpdate.setNombre(ciudadano.getNombre());
            ciudadanoUpdate.setApellido(ciudadano.getApellido());
            ciudadanoUpdate.setSexo(ciudadano.getSexo());
            ciudadanoUpdate.setFecha(ciudadano.getFecha());
            ciudadanoUpdate.setDireccion(ciudadano.getDireccion());
            ciudadanoUpdate.setCorreo(ciudadano.getCorreo());
            ciudadanoUpdate.setTelefono(ciudadano.getTelefono());
            EntityTransaction.commit();
            Exito = true;
        } catch (Exception ex) {
             if (EntityTransaction != null) {
                System.out.println("Eror ingresar" + ex.getMessage());
                 EntityTransaction.rollback();
                      Exito = false;
            }
        } finally {
              if (emFactory != null) {
                emFactory.close();
                emFactory = null;
            }
            if (entityManaged != null) {
                entityManaged = null;
            }
        }
      return Exito;
    }

    @Override
    public ArrayList<EntidadCiudadano> ListaCiudadanos() {
        ArrayList<EntidadCiudadano> ArrayLista = new ArrayList<EntidadCiudadano>();
        try {
            emFactory = Persistence.createEntityManagerFactory("Ciudadano");
            entityManaged = emFactory.createEntityManager();
            Query ListTodos = entityManaged.createNamedQuery("Ciudadano.findAll");
            List<EntidadCiudadano> lista = ListTodos.getResultList();
            ArrayLista.addAll(lista);
        } catch (Exception ex) {
            System.out.println("Error " + ex.getMessage());
        } finally {
            if (emFactory != null) {
                emFactory.close();
                emFactory = null;
            }
            if (entityManaged != null) {
                entityManaged = null;
            }
        }
        return ArrayLista;

    }

    @Override
    public EntidadCiudadano BuscarCiudadano(int ID) {
       EntidadCiudadano entity = null;
       try{
            emFactory = Persistence.createEntityManagerFactory("Ciudadano");
            entityManaged = emFactory.createEntityManager();
            EntityTransaction = entityManaged.getTransaction();
            EntityTransaction.begin();
            entity = entityManaged.find(EntidadCiudadano.class, ID);
       }catch(Exception ex){
        System.out.println("Error " + ex.getMessage());
       }finally{
        if (emFactory != null) {
                emFactory.close();
                emFactory = null;
            }
            if (entityManaged != null) {
                entityManaged = null;
            }
       }
       return entity;
    }
}
