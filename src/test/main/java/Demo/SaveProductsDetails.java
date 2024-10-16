package Demo;

import domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveProductsDetails {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx;

        //step1- activate hibernate framework
        cfg = new Configuration();

        //step2- read data from .cfg.xml.file
        cfg = cfg.configure();

        //step3-etsablish connection with database
        factory = cfg.buildSessionFactory();

        //step4-start session with database
        ses = factory.openSession();

        //step5- create object of domain class

       ; Product p1 = new Product();
        p1.setProductid(1);
        p1.setProductname("MOBIULE");
        p1.setProductprice(15000.55);
        p1.setProductcategory("gadget");

        //step6-start transaction
        tx = ses.beginTransaction();
        ses.save(p1);
        tx.commit();

        System.out.println("product insert successfully");


    }
}
