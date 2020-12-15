package examenChristianZhiminaicelaCliente.vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import examenChristianZhiminaicelaCliente.negocio.gestionNotificacionRemoto;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JList;

public class ventanaPrincipal extends JFrame {

	private JPanel contentPane;
	
	private  gestionNotificacionRemoto on; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NOTIFICACIONES ENVIADAS");
		lblNewLabel.setBounds(131, 29, 219, 16);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(81, 98, 281, 141);
		contentPane.add(panel);
		
		JList list = new JList();
		panel.add(list);
	}
	
	public void referenciarONCliente() throws Exception {
		try {  
            final Hashtable<String, Comparable> jndiProperties =  
                    new Hashtable<String, Comparable>();  
            jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,  
                    "org.wildfly.naming.client.WildFlyInitialContextFactory");  
            jndiProperties.put("jboss.naming.client.ejb.context", true);  
              
            jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");  
            jndiProperties.put(Context.SECURITY_PRINCIPAL, "ejbremoto");  //usuario creado en wildfly
            jndiProperties.put(Context.SECURITY_CREDENTIALS, "ejbremoto");  
              
            final Context context = new InitialContext(jndiProperties);  
              
            final String lookupName = "ejb:/examenChristianZhiminaicelaServidor/gestionNotificacionON!app.g1.examenChristianZhiminaicelaServidor.negocio.gestionNotificacionRemoto";
            
            this.on = (gestionNotificacionRemoto) context.lookup(lookupName);  
              
        } catch (Exception ex) {  
            ex.printStackTrace();  
            throw ex;  
        }
	}
	
	
}
