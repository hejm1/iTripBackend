package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * itrip_hotel
 * @author 
 */
public class ItripHotel implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 酒店名称
     */
    private String hotelname;

    /**
     * 所在国家id
     */
    private Long countryid;

    /**
     * 所在省份id
     */
    private Long provinceid;

    /**
     * 所在城市id
     */
    private Long cityid;

    /**
     * 酒店所在地址
     */
    private String address;

    /**
     * 酒店类型(1:国内酒店 2:国际酒店)
     */
    private Integer hoteltype;

    /**
     * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
     */
    private Integer hotellevel;

    /**
     * 是否是团购酒店
     */
    private Integer isgrouppurchase;

    /**
     * 城市名称 冗余字段
     */
    private String redundantcityname;

    /**
     * 省名称 冗余字段
     */
    private String redundantprovincename;

    /**
     * 国家名称 冗余字段
     */
    private String redundantcountryname;

    /**
     * 酒店库存（冗余，每天开定时任务的时候更新）
     */
    private Integer redundanthotelstore;

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

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public Long getCountryid() {
        return countryid;
    }

    public void setCountryid(Long countryid) {
        this.countryid = countryid;
    }

    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(Integer hoteltype) {
        this.hoteltype = hoteltype;
    }

    public Integer getHotellevel() {
        return hotellevel;
    }

    public void setHotellevel(Integer hotellevel) {
        this.hotellevel = hotellevel;
    }

    public Integer getIsgrouppurchase() {
        return isgrouppurchase;
    }

    public void setIsgrouppurchase(Integer isgrouppurchase) {
        this.isgrouppurchase = isgrouppurchase;
    }

    public String getRedundantcityname() {
        return redundantcityname;
    }

    public void setRedundantcityname(String redundantcityname) {
        this.redundantcityname = redundantcityname;
    }

    public String getRedundantprovincename() {
        return redundantprovincename;
    }

    public void setRedundantprovincename(String redundantprovincename) {
        this.redundantprovincename = redundantprovincename;
    }

    public String getRedundantcountryname() {
        return redundantcountryname;
    }

    public void setRedundantcountryname(String redundantcountryname) {
        this.redundantcountryname = redundantcountryname;
    }

    public Integer getRedundanthotelstore() {
        return redundanthotelstore;
    }

    public void setRedundanthotelstore(Integer redundanthotelstore) {
        this.redundanthotelstore = redundanthotelstore;
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
        ItripHotel other = (ItripHotel) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHotelname() == null ? other.getHotelname() == null : this.getHotelname().equals(other.getHotelname()))
            && (this.getCountryid() == null ? other.getCountryid() == null : this.getCountryid().equals(other.getCountryid()))
            && (this.getProvinceid() == null ? other.getProvinceid() == null : this.getProvinceid().equals(other.getProvinceid()))
            && (this.getCityid() == null ? other.getCityid() == null : this.getCityid().equals(other.getCityid()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getHoteltype() == null ? other.getHoteltype() == null : this.getHoteltype().equals(other.getHoteltype()))
            && (this.getHotellevel() == null ? other.getHotellevel() == null : this.getHotellevel().equals(other.getHotellevel()))
            && (this.getIsgrouppurchase() == null ? other.getIsgrouppurchase() == null : this.getIsgrouppurchase().equals(other.getIsgrouppurchase()))
            && (this.getRedundantcityname() == null ? other.getRedundantcityname() == null : this.getRedundantcityname().equals(other.getRedundantcityname()))
            && (this.getRedundantprovincename() == null ? other.getRedundantprovincename() == null : this.getRedundantprovincename().equals(other.getRedundantprovincename()))
            && (this.getRedundantcountryname() == null ? other.getRedundantcountryname() == null : this.getRedundantcountryname().equals(other.getRedundantcountryname()))
            && (this.getRedundanthotelstore() == null ? other.getRedundanthotelstore() == null : this.getRedundanthotelstore().equals(other.getRedundanthotelstore()))
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
        result = prime * result + ((getHotelname() == null) ? 0 : getHotelname().hashCode());
        result = prime * result + ((getCountryid() == null) ? 0 : getCountryid().hashCode());
        result = prime * result + ((getProvinceid() == null) ? 0 : getProvinceid().hashCode());
        result = prime * result + ((getCityid() == null) ? 0 : getCityid().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getHoteltype() == null) ? 0 : getHoteltype().hashCode());
        result = prime * result + ((getHotellevel() == null) ? 0 : getHotellevel().hashCode());
        result = prime * result + ((getIsgrouppurchase() == null) ? 0 : getIsgrouppurchase().hashCode());
        result = prime * result + ((getRedundantcityname() == null) ? 0 : getRedundantcityname().hashCode());
        result = prime * result + ((getRedundantprovincename() == null) ? 0 : getRedundantprovincename().hashCode());
        result = prime * result + ((getRedundantcountryname() == null) ? 0 : getRedundantcountryname().hashCode());
        result = prime * result + ((getRedundanthotelstore() == null) ? 0 : getRedundanthotelstore().hashCode());
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
        sb.append(", hotelname=").append(hotelname);
        sb.append(", countryid=").append(countryid);
        sb.append(", provinceid=").append(provinceid);
        sb.append(", cityid=").append(cityid);
        sb.append(", address=").append(address);
        sb.append(", hoteltype=").append(hoteltype);
        sb.append(", hotellevel=").append(hotellevel);
        sb.append(", isgrouppurchase=").append(isgrouppurchase);
        sb.append(", redundantcityname=").append(redundantcityname);
        sb.append(", redundantprovincename=").append(redundantprovincename);
        sb.append(", redundantcountryname=").append(redundantcountryname);
        sb.append(", redundanthotelstore=").append(redundanthotelstore);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", createdby=").append(createdby);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}