package kr.re.kitri.hello.dao;
import kr.re.kitri.hello.model.Amigo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {
//        "classpath:spring/applicationContext.xml /n"
//                + "classpath:spring/db.xml")}
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