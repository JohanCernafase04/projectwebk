package mail.send;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Hotmail {
	
	private final static Properties properties = new Properties();
	
	private String password;
 
	private static Session session;

	public static void main(String[] args) {

			// TODO Auto-generated method stub

			properties.put("mail.smtp.host","smtp.live.com");
			properties.put("mail.smtp.starttls.enable", "true");
			properties.put("mail.smtp.port",25);
			properties.put("mail.smtp.mail.sender","johan_www9@hotmail.com");
			properties.put("mail.smtp.user", "Johan Cerna Portilla");;
			properties.put("mail.smtp.auth", "true");
			session = Session.getDefaultInstance(properties);
			
			try{
				MimeMessage message = new MimeMessage(session);
				message.setFrom(new InternetAddress((String)properties.get("mail.smtp.mail.sender")));
				message.addRecipient(Message.RecipientType.TO, new InternetAddress("cerna.imf@gmail.com"));
				message.setSubject("PERU");
				message.setText("CORONAVIRUS EN PER� | ALERTA DE PANDEMIA | �ltimas noticias de hoy 21 de abril EN DIRECTO sobre el coronavirus en Per�. En el D�a 37 del estado de emergencia nacional y aislamiento social obligatorio decretado por el presidente de la Rep�blica Mart�n Vizcarra para frenar el avance del coronavirus (COVID-19); el Ministerio de Salud anunci� 17 837 casos positivos de 155 724 muestras, 6982 recuperados y 484 fallecidos en el Per�.");
				Transport t = session.getTransport("smtp");
			
				t.connect("johan_www9@hotmail.com","gojanfase4");
				//t.connect((String)properties.get("mail.smtp.user"), "gojanfase4");
				t.sendMessage(message, message.getAllRecipients());
				t.close();
			}catch (MessagingException me){
	                        //Aqui se deberia o mostrar un mensaje de error o en lugar
	                        //de no hacer nada con la excepcion, lanzarla para que el modulo
	                        //superior la capture y avise al usuario con un popup, por ejemplo.
				System.out.println(me.getMessage());
				return;
			}

	}

}
