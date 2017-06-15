package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Amigo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by danawacomputer on 2017-06-14.
 */
public class AmigoDaoTest {

    private ApplicationContext context;

    @Before
    public void init() {
        context =
                new ClassPathXmlApplicationContext
                        ("classpath:spring/db.xml",
                                "classpath:spring/applicationContext.xml");
    }

    @Test
    public void testInsertAmigo() {
        AmigoDao dao = context.getBean("amigoDao", AmigoDao.class);

        Amigo article = new Amigo();
        article.setAmigoName("TestName");
        article.setAmigoNumber("TestNumber");
        article.setAmigoEmail("TestEmail.");

        dao.insertAmigo(article);

    }
}