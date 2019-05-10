package cn.itrip.auth.service;

public interface tokenService {
    /**
     * 生成Token
     * @return
     */
    public String generateToken() throws Exception;

    /**
     * 保存Token
     */
    public void saveToken()throws Exception;
}
