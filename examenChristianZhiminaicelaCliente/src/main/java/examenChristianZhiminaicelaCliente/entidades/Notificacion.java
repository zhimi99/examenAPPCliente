package examenChristianZhiminaicelaCliente.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


public class Notificacion implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	
	private String nombreEnvia;
	
	private String mensaje;
	
	private Destinario destinario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreEnvia() {
		return nombreEnvia;
	}

	public void setNombreEnvia(String nombreEnvia) {
		this.nombreEnvia = nombreEnvia;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Destinario getDestinario() {
		return destinario;
	}

	public void setDestinario(Destinario destinario) {
		this.destinario = destinario;
	}

	@Override
	public String toString() {
		return "Notificacion [id=" + id + ", nombreEnvia=" + nombreEnvia + ", mensaje=" + mensaje + ", destinario="
				+ destinario + "]";
	}
	
	
}
