package it.pkg;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.text.SimpleDateFormat;

/**
 * 通用Junit测试类
 * 继承此类后，无需再次配置参数，直接运行即可
 * @Author noah
 * @Date 2023/6/14 16:19
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@Slf4j
public class BaseJunitTests {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Before
    public void init() {
        System.out.println("执行Junit测试代码------开始------" + sdf.format(System.currentTimeMillis()));
    }

    @After
    public void destroy() {
        System.out.println("执行Junit测试代码------结束------" + sdf.format(System.currentTimeMillis()));
    }

}
