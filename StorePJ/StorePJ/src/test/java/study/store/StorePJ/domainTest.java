package study.store.StorePJ;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import study.store.StorePJ.domain.Product;

import javax.persistence.EntityManager;

import static org.junit.Assert.*;

@SpringBootTest
@Transactional
public class domainTest {

    @Autowired
    EntityManager em;

    @Test
    public void createProductTest() {
        Product product = new Product();
        product.setProductName("과자");

        em.persist(product); //영속성 컨텍스트안에 product들어감
        em.flush(); //강제로 db에 쿼리날리기



        //assertEquals("과자",product.getProductName());
    }
}
