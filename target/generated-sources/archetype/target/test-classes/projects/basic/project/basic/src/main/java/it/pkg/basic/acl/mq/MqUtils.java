package it.pkg.basic.acl.mq;

import it.pkg.basic.Config;
import it.pkg.basic.kit.MqKit;

/**
 * 发送具体业务消息
 */
public class MqUtils {

    /**
     * 给注册用户发送积分
     */
    public static boolean sendIntegrationToRegister(Long userId) {
        String json = "{\"userId\": 10000}";
        return MqKit.sendDelayMessage(Config.topicAddIntegrationToRegister,
                "topicAddIntegrationToRegister-"+userId, json);
    }


}
