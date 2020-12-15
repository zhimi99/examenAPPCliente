package examenChristianZhiminaicelaCliente.negocio;

import java.util.List;

import javax.ejb.Remote;

import examenChristianZhiminaicelaCliente.entidades.Notificacion;


public interface gestionNotificacionRemoto {
	
	public List<Notificacion> getNotificaciones()throws Exception;
	

}
