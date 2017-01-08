/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Josue
 */
@Entity
@Table(name = "consultorio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consultorio.findAll", query = "SELECT c FROM Consultorio c")
    , @NamedQuery(name = "Consultorio.findById", query = "SELECT c FROM Consultorio c WHERE c.id = :id")
    , @NamedQuery(name = "Consultorio.findByNombre", query = "SELECT c FROM Consultorio c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Consultorio.findByFechaHora", query = "SELECT c FROM Consultorio c WHERE c.fechaHora = :fechaHora")
    , @NamedQuery(name = "Consultorio.findByTefefono", query = "SELECT c FROM Consultorio c WHERE c.tefefono = :tefefono")})
public class Consultorio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fechaHora")
    @Temporal(TemporalType.DATE)
    private Date fechaHora;
    @Column(name = "tefefono")
    private Integer tefefono;
    @OneToMany(mappedBy = "idConsultorio")
    private Collection<Citas> citasCollection;

    public Consultorio() {
    }

    public Consultorio(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Integer getTefefono() {
        return tefefono;
    }

    public void setTefefono(Integer tefefono) {
        this.tefefono = tefefono;
    }

    @XmlTransient
    public Collection<Citas> getCitasCollection() {
        return citasCollection;
    }

    public void setCitasCollection(Collection<Citas> citasCollection) {
        this.citasCollection = citasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consultorio)) {
            return false;
        }
        Consultorio other = (Consultorio) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Consultorio[ id=" + id + " ]";
    }
    
}
