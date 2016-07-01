package com.alibaba.middleware.race;

import java.io.Serializable;

public class RaceConfig implements Serializable {

    //这些是写tair key的前缀
    public static String prex_tmall = "platformTmall_";
    public static String prex_taobao = "platformTaobao_";
    public static String prex_ratio = "ratio_";
    public static String teamcode = "426061dowd_";//426061dowd

    //这些jstorm/rocketMq/tair 的集群配置信息，这些配置信息在正式提交代码前会被公布
    public static String JstormTopologyName = "426061dowd";//拓扑名称
    public static String MetaConsumerGroup = "426061dowd";//metaQ消费组配置项
    
    public static String MqPayTopic = "MiddlewareRaceTestData_Pay";//支付Topic名称
    public static String MqTmallTradeTopic = "MiddlewareRaceTestData_TMOrder";//天猫Topic名称
    public static String MqTaobaoTradeTopic = "MiddlewareRaceTestData_TBOrder";//淘宝Tpoic名称
    
    public static String TairConfigServer = "10.101.72.127:5198";//Tair集群config主地址
    public static String TairSalveConfigServer = "10.101.72.128:5198";//Tair集群config备地址
    public static String TairGroup = "group_tianchi";//Tair的Group Name配置项
    public static Integer TairNamespace = 58029; //Tair的NameSpace配置项
}
