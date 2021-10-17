package jpaShop;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import jpaShop.domain.Delivery;
import jpaShop.domain.Member;
import jpaShop.domain.Orders;

public class JpaMains {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();
        // JPA에서는 트랜잭션 단위로 해야함
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            Member member = new Member();
            member.setName("킴");
            member.setStreet("인천");
            member.setZipCode("11233");
            em.persist(member);

            Delivery delivery = new Delivery();
            delivery.setStatus("인천");
            delivery.setCity("광역시");
            delivery.setZipcode("2222");
            delivery.setStatus("배송");
            em.persist(delivery);


            Orders orders = new Orders();
            orders.setDelivery(delivery);
            orders.setMember(member);

            orders.setOrderDate(LocalDateTime.now());

            em.persist(orders);








            tx.commit();


        }catch (Exception e){
            tx.rollback();
            e.printStackTrace();
        }finally {
            em.close();
        }
        emf.close();

    }
}
