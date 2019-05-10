package cn.itrip.beans.pojo;

import java.io.Serializable;

/**
 * itrip_hotel
 * @author 
 */
public class ItripHotelWithBLOBs extends ItripHotel implements Serializable {
    /**
     * 酒店介绍（保存附文本）
     */
    private String details;

    /**
     * 酒店设施
     */
    private String facilities;

    /**
     * 酒店政策
     */
    private String hotelpolicy;

    private static final long serialVersionUID = 1L;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getHotelpolicy() {
        return hotelpolicy;
    }

    public void setHotelpolicy(String hotelpolicy) {
        this.hotelpolicy = hotelpolicy;
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
        ItripHotelWithBLOBs other = (ItripHotelWithBLOBs) that;
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
            && (this.getModifiedby() == null ? other.getModifiedby() == null : this.getModifiedby().equals(other.getModifiedby()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()))
            && (this.getFacilities() == null ? other.getFacilities() == null : this.getFacilities().equals(other.getFacilities()))
            && (this.getHotelpolicy() == null ? other.getHotelpolicy() == null : this.getHotelpolicy().equals(other.getHotelpolicy()));
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
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        result = prime * result + ((getFacilities() == null) ? 0 : getFacilities().hashCode());
        result = prime * result + ((getHotelpolicy() == null) ? 0 : getHotelpolicy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", details=").append(details);
        sb.append(", facilities=").append(facilities);
        sb.append(", hotelpolicy=").append(hotelpolicy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}