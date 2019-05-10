package cn.itrip.auth.service.impl;

import cn.itrip.auth.service.itripUserService;
import cn.itrip.beans.pojo.ItripUser;
import cn.itrip.dao.ItripUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("itripUserService")
public class itripUserServiceImpl implements itripUserService {

    @Resource
    public ItripUserMapper itripUserMapper;

    @Override
    public int listSelectUser(String userName) {
        List<ItripUser> itripUsers = itripUserMapper.listSelectUser();
        for (ItripUser itripUser: itripUsers) {
            if (itripUser.getUsername().equals(userName)){
                return 1;
            }

        }
        return 2;
    }

    @Override
    public ItripUser listSelectUser1(String userName) {
        List<ItripUser> itripUsers = itripUserMapper.listSelectUser();
        String a=null;
        for (ItripUser itripUser1: itripUsers) {
            a = itripUser1.getUsername();
            if (itripUser1.getUsername().equals(userName)) {
                    System.out.println("111");
                    return itripUser1;
            }
        }
        return null;
    }
}
