package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * itrip_user
 * @author 
 */
public class ItripUser implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
     */
    private String usercode;

    /**
     * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
     */
    private String userpassword;

    /**
     * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
     */
    private Integer usertype;

    /**
     * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
     */
    private Long flatid;

    /**
     * 用户昵称
     */
    private String username;

    /**
     * 微信号
     */
    private String wechat;

    /**
     * qq账号
     */
    private String qq;

    /**
     * 微博账号
     */
    private String weibo;

    /**
     * 百度账号
     */
    private String baidu;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    /**
     * 是否激活,(0 false，1 true,默认是0)
     */
    private Integer activated;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Long getFlatid() {
        return flatid;
    }

    public void setFlatid(Long flatid) {
        this.flatid = flatid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getBaidu() {
        return baidu;
    }

    public void setBaidu(String baidu) {
        this.baidu = baidu;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ItripUser other = (ItripUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsercode() == null ? other.getUsercode() == null : this.getUsercode().equals(other.getUsercode()))
            && (this.getUserpassword() == null ? other.getUserpassword() == null : this.getUserpassword().equals(other.getUserpassword()))
            && (this.getUsertype() == null ? other.getUsertype() == null : this.getUsertype().equals(other.getUsertype()))
            && (this.getFlatid() == null ? other.getFlatid() == null : this.getFlatid().equals(other.getFlatid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getWechat() == null ? other.getWechat() == null : this.getWechat().equals(other.getWechat()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getWeibo() == null ? other.getWeibo() == null : this.getWeibo().equals(other.getWeibo()))
            && (this.getBaidu() == null ? other.getBaidu() == null : this.getBaidu().equals(other.getBaidu()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getCreatedby() == null ? other.getCreatedby() == null : this.getCreatedby().equals(other.getCreatedby()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getModifiedby() == null ? other.getModifiedby() == null : this.getModifiedby().equals(other.getModifiedby()))
            && (this.getActivated() == null ? other.getActivated() == null : this.getActivated().equals(other.getActivated()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsercode() == null) ? 0 : getUsercode().hashCode());
        result = prime * result + ((getUserpassword() == null) ? 0 : getUserpassword().hashCode());
        result = prime * result + ((getUsertype() == null) ? 0 : getUsertype().hashCode());
        result = prime * result + ((getFlatid() == null) ? 0 : getFlatid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getWechat() == null) ? 0 : getWechat().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getWeibo() == null) ? 0 : getWeibo().hashCode());
        result = prime * result + ((getBaidu() == null) ? 0 : getBaidu().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getCreatedby() == null) ? 0 : getCreatedby().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getModifiedby() == null) ? 0 : getModifiedby().hashCode());
        result = prime * result + ((getActivated() == null) ? 0 : getActivated().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", usercode=").append(usercode);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", usertype=").append(usertype);
        sb.append(", flatid=").append(flatid);
        sb.append(", username=").append(username);
        sb.append(", wechat=").append(wechat);
        sb.append(", qq=").append(qq);
        sb.append(", weibo=").append(weibo);
        sb.append(", baidu=").append(baidu);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", createdby=").append(createdby);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", activated=").append(activated);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}