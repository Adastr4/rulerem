package it.profilglass.orm;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

import it.profilglass.classmodel.Attivita;
import it.profilglass.classmodel.BusinessPartner;
import it.profilglass.classmodel.Caratteristica;
import it.profilglass.classmodel.CentroLavoro;
import it.profilglass.classmodel.Opzione;
import it.profilglass.classmodel.OpzioneIdentity;

public class DataManagement {
	
	private static StandardServiceRegistry ssr;
	private static Metadata meta;
	
	static
	{
		ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		meta = new MetadataSources(ssr).getMetadataBuilder().build();
	}
	
	public static CentroLavoro insertCentroLavoro(String centroLavoro, String descrizione)
	{
		CentroLavoro cl = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {			
			cl=new CentroLavoro(centroLavoro, descrizione);
			
			session.save(cl);
			t.commit();
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();   
		}
		
		return cl;
	}
	
	public static void updateDescrizioneCentroLavoro(String centroLavoro, String descrizione)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Query<CentroLavoro> query = session.createQuery("update CentroLavoro set descrizione = :desc where idCentro = :id");
			query.setParameter("id", centroLavoro);
			query.setParameter("desc", centroLavoro);
			
			query.executeUpdate();
			t.commit();
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();   
		}		
	}
	
	public static void deleteCentroLavoro(String centroLavoro)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Query<CentroLavoro> query = session.createQuery("delete CentroLavoro where idCentro = :id");
			query.setParameter("id", centroLavoro);
			
			query.executeUpdate();
			t.commit();
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();   
		}		
	}
	
	public static CentroLavoro readCentroLavoroById(String centroLavoro)
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
			session.clear();
			factory.close();  
		    session.close();
		}
		return cl;
	}
	
	public static Attivita readAttivitaById(String attivita)
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
			session.clear();
			factory.close();  
		    session.close();
		}
		
		return at;
	}
	
	public static Attivita createAttivita(String attivita, String famiglia, String descrizione, int anima, int campione)
	{
		Attivita at = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			at = new Attivita(attivita,famiglia,descrizione,anima,campione);
			
			session.save(at);
			t.commit();
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}	
		return at;
	}
	
	public static void updateAttivitaById(String attivita, String newAttivita, String famiglia, String descrizione, int anima, int campione)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Query<Attivita> query = session.createQuery("update Attivita set Attivita = :idNew, Famiglia = :fam, Descrizione = :des, Anima = :ani, Campione = :cam where Attivita = :id");
			query.setParameter("id", attivita);
			query.setParameter("idNew", newAttivita);
			query.setParameter("fam", famiglia);
			query.setParameter("des", descrizione);
			query.setParameter("ani", anima);
			query.setParameter("cam", campione);
			
			query.executeUpdate();
			t.commit();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
	}
	
	public static void deleteAttivitaById(String attivita)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			
			Query<Attivita> query = session.createQuery("delete Attivita where Attivita = :id");
			query.setParameter("id", attivita);
			
			query.executeUpdate();
			t.commit();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
	}
	
	public static Caratteristica readCaratteristicaByIdAndItem(String item, String caratteristica)
	{
		Caratteristica car = null;
		ArrayList<Opzione> opz = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Query<Caratteristica> query = session.createQuery("from Caratteristica as s where caratteristica = :id and Item = :item");
			query.setParameter("id", caratteristica);
			query.setParameter("item", item);
			
			car = query.list().get(0);
			
			Query<Opzione> queryOpz = session.createQuery("from Opzione where Item = :it and caratteristica = :cara");
			queryOpz.setParameter("it", item);
			queryOpz.setParameter("cara", caratteristica);
			
			opz = (ArrayList<Opzione>) queryOpz.list();
			car.setValori(opz);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();
		    session.close();
		}
		return car;
	}
	
	public static List<Caratteristica> readCaratteristicaById(String caratteristica)
	{
		List<Caratteristica> car = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Query<Caratteristica> query = session.createQuery("from Caratteristica where Caratteristica = :id");
			query.setParameter("id", caratteristica);
			
			car = query.list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			session.clear(); 
			factory.close();  
		    session.close();
		}
		
		return car;
	}
	
	public static void deleteCaratteristicaByIdAndItem(String caratteristica, String item)
	{
		List<Caratteristica> car = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
				Query<Caratteristica> query = session.createQuery("delete Caratteristica where caratteristica = :id and Item = :item");
				query.setParameter("id", caratteristica);
				query.setParameter("item", item);
				
				query.executeUpdate();
				
				Query<Opzione> queryOpz = session.createQuery("delete Opzione where caratteristica = :id and item = :item");
				queryOpz.setParameter("id", caratteristica);
				queryOpz.setParameter("item", item);
				
				queryOpz.executeUpdate();
				t.commit();
		}
		catch (HibernateException e)
		{
			t.rollback();
			e.printStackTrace();
		}
		finally
		{
			session.clear(); 
			factory.close();  
		    session.close();
		}
	}
	
	public static Opzione readOpzioneByItemCaratteristicaOpzione(String item, String caratteristica, String opzione)
	{
		Opzione op = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Query<Opzione> query = session.createQuery("from Opzione where Item = :it and Caratteristica = :cara and Opzione = :opz");
			query.setParameter("it", item);
			query.setParameter("cara", caratteristica);
			query.setParameter("opz", opzione);
			
			op = query.list().get(0);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
		
		return op;
	}
	
	public static ArrayList<Opzione> readOpzioneByItemCaratteristica(String item, String caratteristica)
	{
		ArrayList<Opzione> op = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Query<Opzione> query = session.createQuery("from Opzione where Item = :it and Caratteristica = :cara");
			query.setParameter("it", item);
			query.setParameter("cara", caratteristica);
			
			op = new ArrayList<Opzione>(query.list());
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			 session.flush();
			 factory.close();
		     session.close();
		}
		
		return op;
	}
	
	public static void updateOpzioneByItemCaratteristicaOpzione(String item, String caratteristica, String opzione, String opzioneNew, String descrizione, String descLin1, String descLin2, String descLin3, String descLin4, String descLin5, String descLin6, String descLin7, String descLin8, String descLin9, String descLin10)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			
			Query<Opzione> query = session.createQuery("update Opzione set opzione = :opzNew, descrizione = :desc, Desc_Lin1 = :dl1, Desc_Lin2 = :dl2, Desc_Lin3 = :dl3, Desc_Lin4 = :dl4, Desc_Lin5 = :dl5, Desc_Lin6 = :dl6, Desc_Lin7 = :dl7, Desc_Lin8 = :dl8, Desc_Lin9 = :dl9, Desc_Lin10 = :dl10 where Item = :it and caratteristica = :cara and opzione = :opz");
			query.setParameter("it", item);
			query.setParameter("cara", caratteristica);
			query.setParameter("opz", opzione);
			query.setParameter("opzNew", opzioneNew);
			query.setParameter("dl1", descLin1);
			query.setParameter("dl2", descLin2);
			query.setParameter("dl3", descLin3);
			query.setParameter("dl4", descLin4);
			query.setParameter("dl5", descLin5);
			query.setParameter("dl6", descLin6);
			query.setParameter("dl7", descLin7);
			query.setParameter("dl8", descLin8);
			query.setParameter("dl9", descLin9);
			query.setParameter("dl10", descLin10);
			
			query.executeUpdate();
			t.commit();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
	}
	
	public static void createOpzione(String item, String caratteristica, String opzione, String descrizione, String descLin1, String descLin2, String descLin3, String descLin4, String descLin5, String descLin6, String descLin7, String descLin8, String descLin9, String descLin10)
	{
		Opzione opz = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			opz = new Opzione(new OpzioneIdentity(item,caratteristica,opzione),item,caratteristica,opzione,descrizione,descLin1,descLin2,descLin3,descLin4,descLin5,descLin6,descLin7,descLin8,descLin9,descLin10,0);
			
			session.save(opz);
			t.commit();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
	}
	
	public static void deleteOpzioneByItemCaratteristicaOpzione(String item, String caratteristica, String opzione)
	{
		Opzione op = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Query<Opzione> query = session.createQuery("delete Opzione where Item = :it and Caratteristica = :cara and Opzione = :opz");
			query.setParameter("it", item);
			query.setParameter("cara", caratteristica);
			query.setParameter("opz", opzione);
			
			query.executeUpdate();
			t.commit();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
	}
	
	public static void deleteOpzioneByItemCaratteristica(String item, String caratteristica)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Query<Opzione> query = session.createQuery("delete Opzione where Item = :it and Caratteristica = :cara");
			query.setParameter("it", item);
			query.setParameter("cara", caratteristica);
			
			query.executeUpdate();
			t.commit();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
	}
	
	public static BusinessPartner readBusinessPartnerByBPCode(String businessPartner)
	{
		BusinessPartner bp = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		try {
			Query<BusinessPartner> query = session.createQuery("from BusinessPartner where businessPartner = :bp");
			query.setParameter("bp", businessPartner);
			
			bp = query.list().get(0);
			
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
		
		return bp;
	}
	
	public static BusinessPartner createBusinessPartner(String BusinessPartner, String descrizione, Date dataInizioValidita, Date dataFineValidita, int clienteFornitore)
	{
		BusinessPartner bp = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			bp = new BusinessPartner(BusinessPartner,descrizione,dataInizioValidita,dataFineValidita,clienteFornitore);
			
			session.save(bp);
			t.commit();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
		return bp;
	}
	
	public static void updateBusinessPartner(String businessPartner, String descrizione, Date dataInizioValidita, Date dataFineValidita, int clienteFornitore)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Query<BusinessPartner> query = session.createQuery("update BusinessPartner set Descrizione = :dsc, DataInizioValidita = :dataIn, DataFineValidita = :dataFin, ClienteFornitore = :cliFor where businessPartner = :bp");
			query.setParameter("bp", businessPartner);
			query.setParameter("dsc", descrizione);
			query.setParameter("dataIn", dataInizioValidita);
			query.setParameter("dataFin", dataFineValidita);
			query.setParameter("cliFor", clienteFornitore);
			
			query.executeUpdate();
			t.commit();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
	}
	
	public static void deleteBusinessPartner(String businessPartner)
	{
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Query<BusinessPartner> query = session.createQuery("delete BusinessPartner where businessPartner = :bp");
			query.setParameter("bp", businessPartner);
			
			query.executeUpdate();
			t.commit();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
	}
	
	public static void testJoin()
	{
		List<Opzione> cara = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Query<Opzione> query = session.createQuery("FROM Opzione o join o.caratteristicaObj cara where cara.caratteristicaId = :id and cara.item = :it");
			query.setParameter("id", "CLFINI");
			query.setParameter("it", "BA");
			cara = query.getResultList();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
		   
		     List<Opzione> opzList = cara;
		     Iterator<Opzione> itrOpz = opzList.iterator();
		     while(itrOpz.hasNext())
		     {
		    	 Opzione opz = itrOpz.next();
		    	 System.out.println(opz.getOpzione());
		     } 
	}
	
	public static void testAttivitaMacchina()
	{
		List<AttivitaMacchinaRel> cara = null;
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
			Query<AttivitaMacchinaRel> query = session.createQuery("SELECT a.attivitaRef FROM AttivitaMacchinaRel a");
			//query.setParameter("id", "COLD03");
			cara = query.getResultList();
			
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally
		{
			session.clear();
			factory.close();  
		    session.close();
		}
		   
		     List<AttivitaMacchinaRel> opzList = cara;
		     Iterator<AttivitaMacchinaRel> itrOpz = opzList.iterator();
		     while(itrOpz.hasNext())
		     {
		    	 AttivitaMacchinaRel opz = itrOpz.next();
		    	 System.out.println(opz.getIdentity().toString());
		     } 
	}
}
