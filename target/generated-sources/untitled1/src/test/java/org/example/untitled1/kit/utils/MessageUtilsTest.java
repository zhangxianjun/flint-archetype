package org.example.untitled1.kit.utils;

import org.junit.jupiter.api.Test;
import org.example.untitled1.BaseJunitTests;

/**
 * 单元测试--国际化工具类
 * @Author noah
 * @Date 2023/6/14 17:11
 * @Version 1.0
 */
class MessageUtilsTest extends BaseJunitTests {

    @Test
    void message() {
        String message = MessageUtils.message("not.null");
        System.out.println(message);
    }
}