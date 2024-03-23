package Demo;

import domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class SaveProductData {
    public static void main(String[] args) {
        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx;

        Scanner sc = new Scanner(System.in);
        cfg = new Configuration();
        cfg = cfg.configure();
        factory = cfg.buildSessionFactory();
        ses = factory.openSession();



        System.out.println("enter productid");
        int id = sc.nextInt();

        System.out.println("enter productname");
        String name= sc.next();

        System.out.println("enter productprice");
        double price=sc.nextDouble();

        System.out.println("enter productcategory");
        String category=sc.next();

        Product p1 = new Product();
        p1.setProductid(id);
        p1.setProductname(name);
        p1.setProductprice(price);
        p1.setProductcategory(category);

        tx = ses.beginTransaction();
        ses.save(p1);
        tx.commit();

        System.out.println("product insert successfully");



    }
}
