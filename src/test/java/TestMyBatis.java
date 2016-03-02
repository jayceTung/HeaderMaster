import com.alibaba.fastjson.JSON;
import com.joker.hm.pojo.User;
import com.joker.hm.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;



@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

/**
 * Created by Joker on 2016/2/26.
 */
public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //	private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

    ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(
            new String[] { "classpath:spring-mybatis.xml", "classpath:spring-mvc.xml" });

//	@Before
//	public void before() {
//		ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		userService = (IUserService) ac.getBean("userService");
//	}

    @Test
    public void test1() {
        User user = userService.getUserById("0");
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
