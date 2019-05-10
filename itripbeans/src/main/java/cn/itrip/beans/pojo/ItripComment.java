package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * itrip_comment
 * @author 
 */
public class ItripComment implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 如果产品是酒店的话 改字段保存酒店id
     */
    private Long hotelid;

    /**
     * 商品id
     */
    private Long productid;

    /**
     * 订单id
     */
    private Long orderid;

    /**
     * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
     */
    private Integer producttype;

    /**
     * 用户编号
     */
    private Long userid;

    /**
     * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
     */
    private Integer ishavingimg;

    /**
     * 位置评分
     */
    private Integer positionscore;

    /**
     * 设施评分
     */
    private Integer facilitiesscore;

    /**
     * 服务评分
     */
    private Integer servicescore;

    /**
     * 卫生评分
     */
    private Integer hygienescore;

    /**
     * 综合评分
     */
    private Integer score;

    /**
     * 出游类型
     */
    private Long tripmode;

    /**
     * 是否满意（0：有待改善 1：值得推荐）
     */
    private Integer isok;

    private Date creationdate;

    private Long createdby;

    private Date modifydate;

    private Long modifiedby;

    /**
     * 评论内容
     */
    private String content;

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

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Integer getProducttype() {
        return producttype;
    }

    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getIshavingimg() {
        return ishavingimg;
    }

    public void setIshavingimg(Integer ishavingimg) {
        this.ishavingimg = ishavingimg;
    }

    public Integer getPositionscore() {
        return positionscore;
    }

    public void setPositionscore(Integer positionscore) {
        this.positionscore = positionscore;
    }

    public Integer getFacilitiesscore() {
        return facilitiesscore;
    }

    public void setFacilitiesscore(Integer facilitiesscore) {
        this.facilitiesscore = facilitiesscore;
    }

    public Integer getServicescore() {
        return servicescore;
    }

    public void setServicescore(Integer servicescore) {
        this.servicescore = servicescore;
    }

    public Integer getHygienescore() {
        return hygienescore;
    }

    public void setHygienescore(Integer hygienescore) {
        this.hygienescore = hygienescore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getTripmode() {
        return tripmode;
    }

    public void setTripmode(Long tripmode) {
        this.tripmode = tripmode;
    }

    public Integer getIsok() {
        return isok;
    }

    public void setIsok(Integer isok) {
        this.isok = isok;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        ItripComment other = (ItripComment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()))
            && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
            && (this.getOrderid() == null ? other.getOrderid() == null : this.getOrderid().equals(other.getOrderid()))
            && (this.getProducttype() == null ? other.getProducttype() == null : this.getProducttype().equals(other.getProducttype()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getIshavingimg() == null ? other.getIshavingimg() == null : this.getIshavingimg().equals(other.getIshavingimg()))
            && (this.getPositionscore() == null ? other.getPositionscore() == null : this.getPositionscore().equals(other.getPositionscore()))
            && (this.getFacilitiesscore() == null ? other.getFacilitiesscore() == null : this.getFacilitiesscore().equals(other.getFacilitiesscore()))
            && (this.getServicescore() == null ? other.getServicescore() == null : this.getServicescore().equals(other.getServicescore()))
            && (this.getHygienescore() == null ? other.getHygienescore() == null : this.getHygienescore().equals(other.getHygienescore()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getTripmode() == null ? other.getTripmode() == null : this.getTripmode().equals(other.getTripmode()))
            && (this.getIsok() == null ? other.getIsok() == null : this.getIsok().equals(other.getIsok()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getCreatedby() == null ? other.getCreatedby() == null : this.getCreatedby().equals(other.getCreatedby()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getModifiedby() == null ? other.getModifiedby() == null : this.getModifiedby().equals(other.getModifiedby()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHotelid() == null) ? 0 : getHotelid().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getOrderid() == null) ? 0 : getOrderid().hashCode());
        result = prime * result + ((getProducttype() == null) ? 0 : getProducttype().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getIshavingimg() == null) ? 0 : getIshavingimg().hashCode());
        result = prime * result + ((getPositionscore() == null) ? 0 : getPositionscore().hashCode());
        result = prime * result + ((getFacilitiesscore() == null) ? 0 : getFacilitiesscore().hashCode());
        result = prime * result + ((getServicescore() == null) ? 0 : getServicescore().hashCode());
        result = prime * result + ((getHygienescore() == null) ? 0 : getHygienescore().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getTripmode() == null) ? 0 : getTripmode().hashCode());
        result = prime * result + ((getIsok() == null) ? 0 : getIsok().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getCreatedby() == null) ? 0 : getCreatedby().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getModifiedby() == null) ? 0 : getModifiedby().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
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
        sb.append(", productid=").append(productid);
        sb.append(", orderid=").append(orderid);
        sb.append(", producttype=").append(producttype);
        sb.append(", userid=").append(userid);
        sb.append(", ishavingimg=").append(ishavingimg);
        sb.append(", positionscore=").append(positionscore);
        sb.append(", facilitiesscore=").append(facilitiesscore);
        sb.append(", servicescore=").append(servicescore);
        sb.append(", hygienescore=").append(hygienescore);
        sb.append(", score=").append(score);
        sb.append(", tripmode=").append(tripmode);
        sb.append(", isok=").append(isok);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", createdby=").append(createdby);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}