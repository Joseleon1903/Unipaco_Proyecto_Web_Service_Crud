
package com.Unipago.Bean;

import Entity.EntidadCiudadano;
import java.util.ArrayList;
import javax.ejb.Local;

@Local
public interface SessionBeanCiudadanoLocal {
    
    public boolean AddCiudadano(EntidadCiudadano ciudadano);
    
    public boolean DeleteCiudadano(int ID);
    
    public boolean UpdateCiudadano(EntidadCiudadano ciudadano, int ID);
    
    public ArrayList<EntidadCiudadano> ListaCiudadanos();
    
    public EntidadCiudadano BuscarCiudadano(int ID);
          
    
}
