package com.darling.boot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.darling.pubIn.bean.User;
import com.darling.pubIn.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 *   @author 董琳琳
 *   @date 2018/10/8 11:20
 *   @description
 */
@Service(version = "1.0.0") // 暴露服务
@Component
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUserAddressList(String userId) {
        ArrayList list = new ArrayList();
        list.add(new User(3,"韦德3","男",36,"迈阿密"));
        list.add(new User(23,"詹姆斯23","男",34,"洛杉矶"));
        list.add(new User(24,"科比24","男",39,"洛杉矶"));
        return list;
    }

    @Override
    public void sayHello() {
        System.out.println("ＨＥＬＬＯ　ＹＳＸＬＸＳＨ");
    }


}
