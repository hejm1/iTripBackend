package cn.itrip.auth.service.impl;

import cn.itrip.auth.service.tokenService;
import cn.itrip.common.RedisAPI;

public class tokenServiceimpl implements tokenService {

    private RedisAPI redisAPI;
    /**
     * 生成Token
     * @return
     */
    @Override
    public String generateToken() throws Exception {
        return null;
    }

    /**
     * 保存Token
     */
    @Override
    public void saveToken() throws Exception {

    }
}
