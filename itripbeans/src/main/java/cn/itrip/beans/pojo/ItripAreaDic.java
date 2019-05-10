package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * itrip_area_dic
 * @author 
 */
public class ItripAreaDic implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 区域名称
     */
    private String name;

    /**
     * 区域编号
     */
    private String areano;

    /**
     * 父级区域
     */
    private Long parent;

    /**
     * 0:未激活 1:已激活
     */
    private Integer isactivated;

    /**
     * 是否是商圈(0:不是 1:是)
     */
    private Integer istradingarea;

    /**
     * (0:不是 1：是)
     */
    private Integer ishot;

    /**
     * 区域级别(0:国家级 1:省级 2:市级 3:县/区)
     */
    private Integer level;

    /**
     * 1:国内 2：国外
     */
    private Integer ischina;

    private String pinyin;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAreano() {
        return areano;
    }

    public void setAreano(String areano) {
        this.areano = areano;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Integer getIsactivated() {
        return isactivated;
    }

    public void setIsactivated(Integer isactivated) {
        this.isactivated = isactivated;
    }

    public Integer getIstradingarea() {
        return istradingarea;
    }

    public void setIstradingarea(Integer istradingarea) {
        this.istradingarea = istradingarea;
    }

    public Integer getIshot() {
        return ishot;
    }

    public void setIshot(Integer ishot) {
        this.ishot = ishot;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIschina() {
        return ischina;
    }

    public void setIschina(Integer ischina) {
        this.ischina = ischina;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
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
        ItripAreaDic other = (ItripAreaDic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getAreano() == null ? other.getAreano() == null : this.getAreano().equals(other.getAreano()))
            && (this.getParent() == null ? other.getParent() == null : this.getParent().equals(other.getParent()))
            && (this.getIsactivated() == null ? other.getIsactivated() == null : this.getIsactivated().equals(other.getIsactivated()))
            && (this.getIstradingarea() == null ? other.getIstradingarea() == null : this.getIstradingarea().equals(other.getIstradingarea()))
            && (this.getIshot() == null ? other.getIshot() == null : this.getIshot().equals(other.getIshot()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getIschina() == null ? other.getIschina() == null : this.getIschina().equals(other.getIschina()))
            && (this.getPinyin() == null ? other.getPinyin() == null : this.getPinyin().equals(other.getPinyin()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getCreatedby() == null ? other.getCreatedby() == null : this.getCreatedby().equals(other.getCreatedby()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getModifiedby() == null ? other.getModifiedby() == null : this.getModifiedby().equals(other.getModifiedby()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getAreano() == null) ? 0 : getAreano().hashCode());
        result = prime * result + ((getParent() == null) ? 0 : getParent().hashCode());
        result = prime * result + ((getIsactivated() == null) ? 0 : getIsactivated().hashCode());
        result = prime * result + ((getIstradingarea() == null) ? 0 : getIstradingarea().hashCode());
        result = prime * result + ((getIshot() == null) ? 0 : getIshot().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getIschina() == null) ? 0 : getIschina().hashCode());
        result = prime * result + ((getPinyin() == null) ? 0 : getPinyin().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getCreatedby() == null) ? 0 : getCreatedby().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getModifiedby() == null) ? 0 : getModifiedby().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", areano=").append(areano);
        sb.append(", parent=").append(parent);
        sb.append(", isactivated=").append(isactivated);
        sb.append(", istradingarea=").append(istradingarea);
        sb.append(", ishot=").append(ishot);
        sb.append(", level=").append(level);
        sb.append(", ischina=").append(ischina);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", createdby=").append(createdby);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}