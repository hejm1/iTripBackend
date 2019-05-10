package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * itrip_user_link_user
 * @author 
 */
public class ItripUserLinkUser implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 常用联系人姓名
     */
    private String linkusername;

    /**
     * 证件号码
     */
    private String linkidcard;

    /**
     * 常用联系人电话
     */
    private String linkphone;

    /**
     * 用户id
     */
    private Integer userid;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    /**
     * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
     */
    private Integer linkidcardtype;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername;
    }

    public String getLinkidcard() {
        return linkidcard;
    }

    public void setLinkidcard(String linkidcard) {
        this.linkidcard = linkidcard;
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Integer getLinkidcardtype() {
        return linkidcardtype;
    }

    public void setLinkidcardtype(Integer linkidcardtype) {
        this.linkidcardtype = linkidcardtype;
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
        ItripUserLinkUser other = (ItripUserLinkUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLinkusername() == null ? other.getLinkusername() == null : this.getLinkusername().equals(other.getLinkusername()))
            && (this.getLinkidcard() == null ? other.getLinkidcard() == null : this.getLinkidcard().equals(other.getLinkidcard()))
            && (this.getLinkphone() == null ? other.getLinkphone() == null : this.getLinkphone().equals(other.getLinkphone()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getCreatedby() == null ? other.getCreatedby() == null : this.getCreatedby().equals(other.getCreatedby()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getModifiedby() == null ? other.getModifiedby() == null : this.getModifiedby().equals(other.getModifiedby()))
            && (this.getLinkidcardtype() == null ? other.getLinkidcardtype() == null : this.getLinkidcardtype().equals(other.getLinkidcardtype()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLinkusername() == null) ? 0 : getLinkusername().hashCode());
        result = prime * result + ((getLinkidcard() == null) ? 0 : getLinkidcard().hashCode());
        result = prime * result + ((getLinkphone() == null) ? 0 : getLinkphone().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getCreatedby() == null) ? 0 : getCreatedby().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getModifiedby() == null) ? 0 : getModifiedby().hashCode());
        result = prime * result + ((getLinkidcardtype() == null) ? 0 : getLinkidcardtype().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", linkusername=").append(linkusername);
        sb.append(", linkidcard=").append(linkidcard);
        sb.append(", linkphone=").append(linkphone);
        sb.append(", userid=").append(userid);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", createdby=").append(createdby);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", linkidcardtype=").append(linkidcardtype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}