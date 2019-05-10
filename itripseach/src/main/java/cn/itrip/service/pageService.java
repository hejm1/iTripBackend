package cn.itrip.service;

import cn.itrip.pojo.ItripHotelVO;
import cn.itrip.pojo.Page;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

public interface pageService {
    public Page<ItripHotelVO> queryPage(ItripHotelVO vo,Page page) throws IOException, SolrServerException;
}
