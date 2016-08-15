/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.managedbean.jsf2.EntityCiudadano;
import com.unipago.service.CiudadanoWC_Service;
import com.unipago.service.EntidadCiudadano;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author JoseEduardo
 */
@Named(value = "controllerBeanCiudadano")
@SessionScoped
public class ControllerBeanCiudadano implements Serializable {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Ciudadano_WC/Ciudadano_WC.wsdl")
    private CiudadanoWC_Service service;
    private int Id;

    public ControllerBeanCiudadano() {
        service = new CiudadanoWC_Service();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getSexo(int Sexo) {
        if (Sexo == 77) {
            return "M";
        }
        if (Sexo == 70) {
            return "F";
        }
        return "Null";
    }

    public String requestIndex() {
        return "index";
    }

    public String EliminarCiudadano(int id) {
        boolean rs = deleteCiudadano(id);
        if (rs) {
            return "ListaCiudadanoView";
        }
        return "Index";
    }

    private boolean deleteCiudadano(int ID) {
        com.unipago.service.CiudadanoWC port = service.getCiudadanoWCPort();
        return port.deleteCiudadano(ID);
    }

    private boolean addCiudadano(com.unipago.service.EntidadCiudadano entityCiudadano) {
        com.unipago.service.CiudadanoWC port = service.getCiudadanoWCPort();
        return port.addCiudadano(entityCiudadano);
    }

    public List<EntidadCiudadano> ListaCiudadanos() {
        return listaCiudadano();
    }

    public EntidadCiudadano getEntidad() {
        return new EntidadCiudadano();
    }

    public String requestBuscar(EntityCiudadano bean, int ID) {
        if (bean != null && ID != 0) {
            EntidadCiudadano entidad = buscarCiudadano(ID);
            bean.setId(entidad.getID());
            bean.setNombre(entidad.getNombre());
            bean.setApellido(entidad.getApellido());
            if (entidad.getSexo() == 77) {
                bean.setSexo("M");
            } else if (entidad.getSexo() == 70) {
                bean.setSexo("F");
            }
            bean.setFecha(entidad.getFecha());
            bean.setDireccion(entidad.getDireccion());
            bean.setCorreo(entidad.getCorreo());
            bean.setTelefono(entidad.getTelefono());
            return "BuscarCiudadanoView";
        }
        return "Error";
    }

    public String requestAgregar(EntityCiudadano bean) {
        if (bean != null) {
            EntidadCiudadano entidad = new EntidadCiudadano();
            entidad.setNombre(bean.getNombre());
            entidad.setApellido(bean.getApellido());
            char Sexo = bean.getSexo().charAt(0);
            entidad.setSexo(Sexo);
            entidad.setFecha(bean.getFecha());
            entidad.setDireccion(bean.getDireccion());
            entidad.setCorreo(bean.getCorreo());
            entidad.setTelefono(bean.getTelefono());
            String rs = AgregarCiudadano(entidad);
            bean.Reset();
            if (rs.equals("Exito")) {
                return "index";
            }
        }
        return "Error";
    }

    public String RequestActualizar(EntityCiudadano bean) {
        if (bean != null) {
            EntidadCiudadano entidad = new EntidadCiudadano();
            entidad.setNombre(bean.getNombre());
            entidad.setApellido(bean.getApellido());
            char Sexo = bean.getSexo().charAt(0);
            entidad.setSexo(Sexo);
            entidad.setFecha(bean.getFecha());
            entidad.setDireccion(bean.getDireccion());
            entidad.setCorreo(bean.getCorreo());
            entidad.setTelefono(bean.getTelefono());
            boolean rs = updateCiudadano(entidad, bean.getId());
            bean.Reset();
            if (rs) {
                return "index";
            }
        }
        return "Error";
    }

    public String AgregarCiudadano(EntidadCiudadano entiti) {
        boolean exito = addCiudadano(entiti);
        if (exito) {
            return "Exito";
        }
        return "Error";
    }

    private java.util.List<com.unipago.service.EntidadCiudadano> listaCiudadano() {
        com.unipago.service.CiudadanoWC port = service.getCiudadanoWCPort();
        return port.listaCiudadano();
    }

    private EntidadCiudadano buscarCiudadano(int ID) {
        com.unipago.service.CiudadanoWC port = service.getCiudadanoWCPort();
        return port.buscarCiudadano(ID);
    }

    private boolean updateCiudadano(com.unipago.service.EntidadCiudadano Entiti, int ID) {
        com.unipago.service.CiudadanoWC port = service.getCiudadanoWCPort();
        return port.updateCiudadano(Entiti, ID);
    }

}
