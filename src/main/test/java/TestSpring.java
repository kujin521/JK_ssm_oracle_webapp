import cn.itcast.jk.domain.FactoryC;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.jk.dao.FactoryCDao;

/**
 * @Description: 使用spring整合jUnit测试
 * @Author: nutony
 * @Company: http://java.itcast.cn
 * @CreateDate: 2014-3-13
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class TestSpring {
	@Autowired
	FactoryCDao factoryDao;

	@Test
	public void testService() {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		FactoryC f = factoryDao.get("1");
		
		System.out.println(f.getFullName());
	}
}
