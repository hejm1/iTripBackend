package cn.itrip.pojo;




import org.apache.solr.client.solrj.beans.Field;

import java.io.Serializable;

public class itriphotel implements Serializable {
    @Field
    private String hotelName;
    @Field
    private String address;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
