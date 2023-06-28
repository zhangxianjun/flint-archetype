#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.acl.mq;

import ${package}.${artifactId}.Config;
import ${package}.${artifactId}.kit.MqKit;

/**
 * 发送具体业务消息
 */
public class MqUtils {

    /**
     * 给注册用户发送积分
     */
    public static boolean sendIntegrationToRegister(Long userId) {
        String json = "{${symbol_escape}"userId${symbol_escape}": 10000}";
        return MqKit.sendDelayMessage(Config.topicAddIntegrationToRegister,
                "topicAddIntegrationToRegister-"+userId, json);
    }


}
