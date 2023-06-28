package it.pkg.acl.mq;

import it.pkg.Config;
import it.pkg.kit.MqKit;

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
