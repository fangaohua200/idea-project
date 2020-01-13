package service;

import org.apache.dubbo.config.annotation.Service;
import service1.api.CustomerService;
//全路径避免混淆
//标注此方法暴露为dubbo接口
@org.apache.dubbo.config.annotation.Service
public class CustomerServiceImpl implements CustomerService {

    public String getService() {
        return "这就是dubbo接口实现的内容";
    }
}
