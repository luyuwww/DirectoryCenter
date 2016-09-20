package test; /**
 * Created by luyuwww on 2015-11-01.
 */

import com.luyuwww.Application;
import com.luyuwww.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ServcieTest {
    @Test
    public void testJPA(){
        System.out.println(testService.test());
    }

    @Test
    public void testJdbc(){
        testService.testJdbc();
    }
    @Autowired
    private TestService testService;
}
