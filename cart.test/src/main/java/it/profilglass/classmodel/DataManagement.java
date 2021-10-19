package it.profilglass.classmodel;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DataManagement {
	
	private StandardServiceRegistry ssr;
	private Metadata meta;
	private Configuration config;
	
	public DataManagement()
	{
		this.ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		this.meta = new MetadataSources(ssr).getMetadataBuilder().build();
	}
	
	public void insertCentroLavoro(String centroLavoro, String descrizione)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Transaction t = session.beginTransaction();
			
			CentroLavoro cl=new CentroLavoro(centroLavoro, descrizione);
			
			session.save(cl);
			t.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			 factory.close();  
		     session.close();   
		}		
	}
	
	public void updateDescrizioneCentroLavoro(String centroLavoro, String descrizione)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Transaction t = session.beginTransaction();
			
			Query<CentroLavoro> query = session.createQuery("update CentroLavoro set descrizione = :desc where idCentro = :id");
			query.setParameter("id", centroLavoro);
			query.setParameter("desc", centroLavoro);
			
			query.executeUpdate();
			t.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			 factory.close();  
		     session.close();   
		}		
	}
	
	public void deleteCentroLavoro(String centroLavoro)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Transaction t = session.beginTransaction();
			
			Query<CentroLavoro> query = session.createQuery("delete CentroLavoro where idCentro = :id");
			query.setParameter("id", centroLavoro);
			
			query.executeUpdate();
			t.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			 factory.close();  
		     session.close();   
		}		
	}
	
	public CentroLavoro readCentroLavoroById(String centroLavoro)
	{
		CentroLavoro cl = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Query<CentroLavoro> query = session.createQuery("from CentroLavoro where idCentro = :id");
			query.setParameter("id", centroLavoro);
			
			cl = query.list().get(0);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			 factory.close();  
		     session.close();
		}
		
		return cl;
	}
	
	public Attivita readAttivitaById(String attivita)
	{
		Attivita at = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Query<Attivita> query = session.createQuery("from Attivita where Attivita = :id");
			query.setParameter("id", attivita);
			
			at = query.list().get(0);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			 factory.close();  
		     session.close();
		}
		
		return at;
	}
	
	
}
