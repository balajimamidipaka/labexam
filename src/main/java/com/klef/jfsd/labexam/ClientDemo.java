package com.klef.jfsd.labexam;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class ClientDemo 
{
    public static void main( String[] args )
    {
    	 Configuration configuration = new Configuration().configure();
         SessionFactory sessionFactory = configuration.buildSessionFactory();
         Session session = sessionFactory.openSession();

         insertClients(session);

         retrieveAndPrintClients(session);

         session.close();
         sessionFactory.close();
    }
    
    private static void insertClients(Session session) {
        Transaction transaction = session.beginTransaction();

        Client client1 = new Client();
        client1.setName("Alice Johnson");
        client1.setGender("Female");
        client1.setAge(28);
        client1.setLocation("New York");
        client1.setEmail("alice.johnson@example.com");
        client1.setMobileNumber("1234567890");

        Client client2 = new Client();
        client2.setName("Bob Smith");
        client2.setGender("Male");
        client2.setAge(35);
        client2.setLocation("San Francisco");
        client2.setEmail("bob.smith@example.com");
        client2.setMobileNumber("0987654321");

        session.persist(client1);
        session.persist(client2);

        transaction.commit();
        System.out.println("Clients inserted successfully.");
    }

    private static void retrieveAndPrintClients(Session session) {
        List<Client> clients = session.createQuery("from Client", Client.class).list();

        System.out.println("Client Records:");
        for (Client client : clients) {
            System.out.println(client);
        }
    }
}
