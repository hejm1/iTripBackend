package cn.itrip.auth.controller;

import cn.itrip.auth.service.itripUserService;
import cn.itrip.beans.pojo.ItripUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

@Controller
@RequestMapping("/user")
public class itripUserControllerImpl{

    @Resource
    public itripUserService itripUserServices;


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String userName) {
        int a=itripUserServices.listSelectUser(userName);
        if (a==1){
            return "index";
        }else {
            return "indexsss";
        }

    }



    @RequestMapping(value = "/login1",method = RequestMethod.POST)
    @ResponseBody
    public ItripUser login1(@RequestBody String userName) throws UnsupportedEncodingException {
        userName = new String(userName.getBytes("ISO8859-1"),"UTF-8");
        ItripUser itripUser = itripUserServices.listSelectUser1(userName);

        return itripUser;

    }
}
