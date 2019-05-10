package cn.itrip.auth.service;

import cn.itrip.beans.pojo.ItripUser;

import java.util.List;

public interface itripUserService {
    public int listSelectUser(String userName);
    public ItripUser listSelectUser1(String userName);
}
