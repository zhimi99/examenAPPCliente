package examenChristianZhiminaicelaCliente.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


public class Destinario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	
	private String nombreDestinario;
	
	
	private String telefono;
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombreDestinario() {
		return nombreDestinario;
	}


	public void setNombreDestinario(String nombreDestinario) {
		this.nombreDestinario = nombreDestinario;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Destinario [id=" + id + ", nombreDestinario=" + nombreDestinario + ", telefono=" + telefono + "]";
	}
	
	
}
