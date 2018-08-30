import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Member;

public class main {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure("projectConfig.xml").buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Member m=new Member();
		m.setName("AliAkbar");
		session.save(m);
		tx.commit();
	}

}
