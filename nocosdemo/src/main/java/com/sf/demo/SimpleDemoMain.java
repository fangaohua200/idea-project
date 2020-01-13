package com.sf.demo;

import com.alibaba.nacos.api.NacosFactory;
import com.alibaba.nacos.api.config.ConfigService;
import com.alibaba.nacos.api.config.listener.Listener;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Properties;
import java.util.concurrent.Executor;

public class SimpleDemoMain {
    public static void main(String[] args) throws NacosException, InterruptedException {
        String serverAddr="192.168.190.129:8848";
        String dataid = "nacos-demo.yaml";
        String group = "DEFAULT_GROUP";
        String namespace="c18fa342-9845-4f4e-a2d7-9ab34fb66e4c";
        Properties properties=new Properties();
        properties.setProperty("serverAddr", serverAddr);
        properties.setProperty("namespace", namespace);
        //获取配置
        ConfigService configServier = NacosFactory.createConfigService(properties);
        String config1 = configServier.getConfig(dataid, group, 5000);
        System.out.println(config1);

        //监听 当有变化的时候获取通知
        configServier.addListener(dataid, group, new Listener() {
            public Executor getExecutor() {
                return null;
            }

            public void receiveConfigInfo(String s) {
                System.out.println(s);
            }
        });

        while (true){
            Thread.sleep(2000);
        }

    }
}
