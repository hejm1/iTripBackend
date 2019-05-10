package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * itrip_hotel_room
 * @author 
 */
public class ItripHotelRoom implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 酒店ID
     */
    private Long hotelid;

    /**
     * 房间名称
     */
    private String roomtitle;

    /**
     * 房间价格
     */
    private BigDecimal roomprice;

    /**
     * 酒店床型
     */
    private Long roombedtypeid;

    /**
     * 是否包含早餐
     */
    private Integer ishavingbreakfast;

    /**
     * 1:在线付 2:到店付 3:不限
     */
    private Integer paytype;

    /**
     * 满意度（冗余字段，在用户评论后更新）
     */
    private Long satisfaction;

    /**
     * 是否可预订(0:不可以 1:可以)
     */
    private Integer isbook;

    /**
     * 是否可取消(0:不可 1:可以)
     */
    private Integer iscancel;

    /**
     * 是否及时响应(0:不及时 1:及时)
     */
    private Integer istimelyresponse;

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

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getRoomtitle() {
        return roomtitle;
    }

    public void setRoomtitle(String roomtitle) {
        this.roomtitle = roomtitle;
    }

    public BigDecimal getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(BigDecimal roomprice) {
        this.roomprice = roomprice;
    }

    public Long getRoombedtypeid() {
        return roombedtypeid;
    }

    public void setRoombedtypeid(Long roombedtypeid) {
        this.roombedtypeid = roombedtypeid;
    }

    public Integer getIshavingbreakfast() {
        return ishavingbreakfast;
    }

    public void setIshavingbreakfast(Integer ishavingbreakfast) {
        this.ishavingbreakfast = ishavingbreakfast;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Long getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(Long satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Integer getIsbook() {
        return isbook;
    }

    public void setIsbook(Integer isbook) {
        this.isbook = isbook;
    }

    public Integer getIscancel() {
        return iscancel;
    }

    public void setIscancel(Integer iscancel) {
        this.iscancel = iscancel;
    }

    public Integer getIstimelyresponse() {
        return istimelyresponse;
    }

    public void setIstimelyresponse(Integer istimelyresponse) {
        this.istimelyresponse = istimelyresponse;
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
        ItripHotelRoom other = (ItripHotelRoom) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()))
            && (this.getRoomtitle() == null ? other.getRoomtitle() == null : this.getRoomtitle().equals(other.getRoomtitle()))
            && (this.getRoomprice() == null ? other.getRoomprice() == null : this.getRoomprice().equals(other.getRoomprice()))
            && (this.getRoombedtypeid() == null ? other.getRoombedtypeid() == null : this.getRoombedtypeid().equals(other.getRoombedtypeid()))
            && (this.getIshavingbreakfast() == null ? other.getIshavingbreakfast() == null : this.getIshavingbreakfast().equals(other.getIshavingbreakfast()))
            && (this.getPaytype() == null ? other.getPaytype() == null : this.getPaytype().equals(other.getPaytype()))
            && (this.getSatisfaction() == null ? other.getSatisfaction() == null : this.getSatisfaction().equals(other.getSatisfaction()))
            && (this.getIsbook() == null ? other.getIsbook() == null : this.getIsbook().equals(other.getIsbook()))
            && (this.getIscancel() == null ? other.getIscancel() == null : this.getIscancel().equals(other.getIscancel()))
            && (this.getIstimelyresponse() == null ? other.getIstimelyresponse() == null : this.getIstimelyresponse().equals(other.getIstimelyresponse()))
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
        result = prime * result + ((getHotelid() == null) ? 0 : getHotelid().hashCode());
        result = prime * result + ((getRoomtitle() == null) ? 0 : getRoomtitle().hashCode());
        result = prime * result + ((getRoomprice() == null) ? 0 : getRoomprice().hashCode());
        result = prime * result + ((getRoombedtypeid() == null) ? 0 : getRoombedtypeid().hashCode());
        result = prime * result + ((getIshavingbreakfast() == null) ? 0 : getIshavingbreakfast().hashCode());
        result = prime * result + ((getPaytype() == null) ? 0 : getPaytype().hashCode());
        result = prime * result + ((getSatisfaction() == null) ? 0 : getSatisfaction().hashCode());
        result = prime * result + ((getIsbook() == null) ? 0 : getIsbook().hashCode());
        result = prime * result + ((getIscancel() == null) ? 0 : getIscancel().hashCode());
        result = prime * result + ((getIstimelyresponse() == null) ? 0 : getIstimelyresponse().hashCode());
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
        sb.append(", hotelid=").append(hotelid);
        sb.append(", roomtitle=").append(roomtitle);
        sb.append(", roomprice=").append(roomprice);
        sb.append(", roombedtypeid=").append(roombedtypeid);
        sb.append(", ishavingbreakfast=").append(ishavingbreakfast);
        sb.append(", paytype=").append(paytype);
        sb.append(", satisfaction=").append(satisfaction);
        sb.append(", isbook=").append(isbook);
        sb.append(", iscancel=").append(iscancel);
        sb.append(", istimelyresponse=").append(istimelyresponse);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", createdby=").append(createdby);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}