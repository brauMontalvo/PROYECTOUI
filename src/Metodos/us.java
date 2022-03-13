
package Metodos;


public class us {
    
    //ENCAPSULAMIENTOS DE LA CLASE US

    private String calle;
    private String region;
    private String ciudad;
    private int codigoPostal;
    private String pais;
    private int numTelefono;
    
    public us(){}
    
    
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }


    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }


    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }


    public int getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }


    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }


    public int getNumTelefono() {
        return numTelefono;
    }
    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }
    
}
