package cn.itrip.beans.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * itrip_hotel_order
 * @author 
 */
public class ItripHotelOrder implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户id
     */
    private Long userid;

    /**
     * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     */
    private Integer ordertype;

    /**
     * 订单号
     */
    private String orderno;

    /**
     * 交易编号
     */
    private String tradeno;

    /**
     * 冗余字段 酒店id
     */
    private Long hotelid;

    /**
     * 冗余字段 酒店名称
     */
    private String hotelname;

    /**
     * 房间id
     */
    private Long roomid;

    /**
     * 消耗数量
     */
    private Integer count;

    /**
     * 预订天数
     */
    private Integer bookingdays;

    /**
     * 入住时间
     */
    private Date checkindate;

    /**
     * 退房时间
     */
    private Date checkoutdate;

    /**
     * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     */
    private Integer orderstatus;

    /**
     * 支付金额
     */
    private BigDecimal payamount;

    /**
     * 支付方式:1:支付宝 2:微信 3:到店付
     */
    private Integer paytype;

    /**
     * 联系手机号
     */
    private String noticephone;

    /**
     * 联系邮箱
     */
    private String noticeemail;

    /**
     * 是否需要发票（0：不需要 1：需要）
     */
    private Integer isneedinvoice;

    /**
     * 发票类型（0：个人 1：公司）
     */
    private Integer invoicetype;

    /**
     * 发票抬头
     */
    private String invoicehead;

    /**
     * 入住人名称
     */
    private String linkusername;

    /**
     * 0:WEB端 1:手机端 2:其他客户端
     */
    private Integer booktype;

    /**
     * 预定时间
     */
    private Date creationdate;

    private Long createdby;

    /**
     * 支付完成时间
     */
    private Date modifydate;

    private Long modifiedby;

    /**
     * 特殊需求
     */
    private String specialrequirement;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBookingdays() {
        return bookingdays;
    }

    public void setBookingdays(Integer bookingdays) {
        this.bookingdays = bookingdays;
    }

    public Date getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    public Date getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public BigDecimal getPayamount() {
        return payamount;
    }

    public void setPayamount(BigDecimal payamount) {
        this.payamount = payamount;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getNoticephone() {
        return noticephone;
    }

    public void setNoticephone(String noticephone) {
        this.noticephone = noticephone;
    }

    public String getNoticeemail() {
        return noticeemail;
    }

    public void setNoticeemail(String noticeemail) {
        this.noticeemail = noticeemail;
    }

    public Integer getIsneedinvoice() {
        return isneedinvoice;
    }

    public void setIsneedinvoice(Integer isneedinvoice) {
        this.isneedinvoice = isneedinvoice;
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
    }

    public String getInvoicehead() {
        return invoicehead;
    }

    public void setInvoicehead(String invoicehead) {
        this.invoicehead = invoicehead;
    }

    public String getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername;
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
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

    public String getSpecialrequirement() {
        return specialrequirement;
    }

    public void setSpecialrequirement(String specialrequirement) {
        this.specialrequirement = specialrequirement;
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
        ItripHotelOrder other = (ItripHotelOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getOrdertype() == null ? other.getOrdertype() == null : this.getOrdertype().equals(other.getOrdertype()))
            && (this.getOrderno() == null ? other.getOrderno() == null : this.getOrderno().equals(other.getOrderno()))
            && (this.getTradeno() == null ? other.getTradeno() == null : this.getTradeno().equals(other.getTradeno()))
            && (this.getHotelid() == null ? other.getHotelid() == null : this.getHotelid().equals(other.getHotelid()))
            && (this.getHotelname() == null ? other.getHotelname() == null : this.getHotelname().equals(other.getHotelname()))
            && (this.getRoomid() == null ? other.getRoomid() == null : this.getRoomid().equals(other.getRoomid()))
            && (this.getCount() == null ? other.getCount() == null : this.getCount().equals(other.getCount()))
            && (this.getBookingdays() == null ? other.getBookingdays() == null : this.getBookingdays().equals(other.getBookingdays()))
            && (this.getCheckindate() == null ? other.getCheckindate() == null : this.getCheckindate().equals(other.getCheckindate()))
            && (this.getCheckoutdate() == null ? other.getCheckoutdate() == null : this.getCheckoutdate().equals(other.getCheckoutdate()))
            && (this.getOrderstatus() == null ? other.getOrderstatus() == null : this.getOrderstatus().equals(other.getOrderstatus()))
            && (this.getPayamount() == null ? other.getPayamount() == null : this.getPayamount().equals(other.getPayamount()))
            && (this.getPaytype() == null ? other.getPaytype() == null : this.getPaytype().equals(other.getPaytype()))
            && (this.getNoticephone() == null ? other.getNoticephone() == null : this.getNoticephone().equals(other.getNoticephone()))
            && (this.getNoticeemail() == null ? other.getNoticeemail() == null : this.getNoticeemail().equals(other.getNoticeemail()))
            && (this.getIsneedinvoice() == null ? other.getIsneedinvoice() == null : this.getIsneedinvoice().equals(other.getIsneedinvoice()))
            && (this.getInvoicetype() == null ? other.getInvoicetype() == null : this.getInvoicetype().equals(other.getInvoicetype()))
            && (this.getInvoicehead() == null ? other.getInvoicehead() == null : this.getInvoicehead().equals(other.getInvoicehead()))
            && (this.getLinkusername() == null ? other.getLinkusername() == null : this.getLinkusername().equals(other.getLinkusername()))
            && (this.getBooktype() == null ? other.getBooktype() == null : this.getBooktype().equals(other.getBooktype()))
            && (this.getCreationdate() == null ? other.getCreationdate() == null : this.getCreationdate().equals(other.getCreationdate()))
            && (this.getCreatedby() == null ? other.getCreatedby() == null : this.getCreatedby().equals(other.getCreatedby()))
            && (this.getModifydate() == null ? other.getModifydate() == null : this.getModifydate().equals(other.getModifydate()))
            && (this.getModifiedby() == null ? other.getModifiedby() == null : this.getModifiedby().equals(other.getModifiedby()))
            && (this.getSpecialrequirement() == null ? other.getSpecialrequirement() == null : this.getSpecialrequirement().equals(other.getSpecialrequirement()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getOrdertype() == null) ? 0 : getOrdertype().hashCode());
        result = prime * result + ((getOrderno() == null) ? 0 : getOrderno().hashCode());
        result = prime * result + ((getTradeno() == null) ? 0 : getTradeno().hashCode());
        result = prime * result + ((getHotelid() == null) ? 0 : getHotelid().hashCode());
        result = prime * result + ((getHotelname() == null) ? 0 : getHotelname().hashCode());
        result = prime * result + ((getRoomid() == null) ? 0 : getRoomid().hashCode());
        result = prime * result + ((getCount() == null) ? 0 : getCount().hashCode());
        result = prime * result + ((getBookingdays() == null) ? 0 : getBookingdays().hashCode());
        result = prime * result + ((getCheckindate() == null) ? 0 : getCheckindate().hashCode());
        result = prime * result + ((getCheckoutdate() == null) ? 0 : getCheckoutdate().hashCode());
        result = prime * result + ((getOrderstatus() == null) ? 0 : getOrderstatus().hashCode());
        result = prime * result + ((getPayamount() == null) ? 0 : getPayamount().hashCode());
        result = prime * result + ((getPaytype() == null) ? 0 : getPaytype().hashCode());
        result = prime * result + ((getNoticephone() == null) ? 0 : getNoticephone().hashCode());
        result = prime * result + ((getNoticeemail() == null) ? 0 : getNoticeemail().hashCode());
        result = prime * result + ((getIsneedinvoice() == null) ? 0 : getIsneedinvoice().hashCode());
        result = prime * result + ((getInvoicetype() == null) ? 0 : getInvoicetype().hashCode());
        result = prime * result + ((getInvoicehead() == null) ? 0 : getInvoicehead().hashCode());
        result = prime * result + ((getLinkusername() == null) ? 0 : getLinkusername().hashCode());
        result = prime * result + ((getBooktype() == null) ? 0 : getBooktype().hashCode());
        result = prime * result + ((getCreationdate() == null) ? 0 : getCreationdate().hashCode());
        result = prime * result + ((getCreatedby() == null) ? 0 : getCreatedby().hashCode());
        result = prime * result + ((getModifydate() == null) ? 0 : getModifydate().hashCode());
        result = prime * result + ((getModifiedby() == null) ? 0 : getModifiedby().hashCode());
        result = prime * result + ((getSpecialrequirement() == null) ? 0 : getSpecialrequirement().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", ordertype=").append(ordertype);
        sb.append(", orderno=").append(orderno);
        sb.append(", tradeno=").append(tradeno);
        sb.append(", hotelid=").append(hotelid);
        sb.append(", hotelname=").append(hotelname);
        sb.append(", roomid=").append(roomid);
        sb.append(", count=").append(count);
        sb.append(", bookingdays=").append(bookingdays);
        sb.append(", checkindate=").append(checkindate);
        sb.append(", checkoutdate=").append(checkoutdate);
        sb.append(", orderstatus=").append(orderstatus);
        sb.append(", payamount=").append(payamount);
        sb.append(", paytype=").append(paytype);
        sb.append(", noticephone=").append(noticephone);
        sb.append(", noticeemail=").append(noticeemail);
        sb.append(", isneedinvoice=").append(isneedinvoice);
        sb.append(", invoicetype=").append(invoicetype);
        sb.append(", invoicehead=").append(invoicehead);
        sb.append(", linkusername=").append(linkusername);
        sb.append(", booktype=").append(booktype);
        sb.append(", creationdate=").append(creationdate);
        sb.append(", createdby=").append(createdby);
        sb.append(", modifydate=").append(modifydate);
        sb.append(", modifiedby=").append(modifiedby);
        sb.append(", specialrequirement=").append(specialrequirement);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}