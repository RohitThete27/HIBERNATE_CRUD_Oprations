package Demo;

import domain.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DisplayProductDetails {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id");
        int id = sc.nextInt();
        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx;

        Scanner sc1 = new Scanner(System.in);
        cfg = new Configuration();
        cfg = cfg.configure();
        factory = cfg.buildSessionFactory();
        ses = factory.openSession();

        Product p=ses.get(Product.class,id);
        System.out.println(p.getProductid());
        System.out.println(p.getProductname());
        System.out.println(p.getProductprice());
        System.out.println(p.getProductcategory());
    }
}
