package org.example.untitled1.kit.common.annotation;


import org.example.untitled1.kit.common.enums.LimitType;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 限流注解
 * @author noah
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RateLimiter {
    /**
     * 限流key,支持使用Spring el表达式来动态获取方法上的参数值
     * 格式类似于  #code.id #{#code}
     */
    String key() default "";

    /**
     * 限流时间,单位秒
     */
    int time() default 60;

    /**
     * 限流次数
     */
    int count() default 100;

    /**
     * 限流类型
     */
    LimitType limitType() default LimitType.DEFAULT;

    /**
     * 提示消息 支持国际化 格式为 {code}
     */
    String message() default "{rate.limiter.message}";
}
