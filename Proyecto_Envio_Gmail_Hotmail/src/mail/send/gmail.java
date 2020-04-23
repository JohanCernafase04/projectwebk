package mail.send;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.*;
import javax.mail.Session;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class gmail {
	
	private final static Properties properties = new Properties();
	
	private String password;
 
	private static Session session;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port",587);
		properties.put("mail.smtp.mail.sender","cerna.imf@gmail.com");
		properties.put("mail.smtp.user", "Johan Cerna Portilla");
		properties.put("mail.smtp.auth", "true");
		session = Session.getDefaultInstance(properties);
		
		try{
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress((String)properties.get("mail.smtp.mail.sender")));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("cerna.imf@gmail.com"));
			message.setSubject("PERU");
			message.setText("CORONAVIRUS EN PERÚ | ALERTA DE PANDEMIA | Últimas noticias de hoy 21 de abril EN DIRECTO sobre el coronavirus en Perú. En el Día 37 del estado de emergencia nacional y aislamiento social obligatorio decretado por el presidente de la República Martín Vizcarra para frenar el avance del coronavirus (COVID-19); el Ministerio de Salud anunció 17 837 casos positivos de 155 724 muestras, 6982 recuperados y 484 fallecidos en el Perú.");
			Transport t = session.getTransport("smtp");
		
			t.connect("cerna.imf@gmail.com","cernaportilla0204");
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
