package cn.itrip.service.impl;

import cn.itrip.dao.Basedao;
import cn.itrip.pojo.ItripHotelVO;
import cn.itrip.pojo.Page;
import cn.itrip.pojo.itriphotel;
import cn.itrip.service.pageService;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;

import java.io.IOException;

public class pageServiceimpl implements pageService {

    @Override
    public Page<ItripHotelVO> queryPage(ItripHotelVO vo,Page page) throws IOException, SolrServerException {
        String url="http://localhost:8080/solr/collection2";
        Basedao basedao=new Basedao(url);
        SolrQuery solrQuery=new SolrQuery();
        solrQuery.setQuery("address:"+vo.getAddress());
        Page<ItripHotelVO> page1=basedao.queryPage(solrQuery, itriphotel.class,vo.getIndex(),page.getPageSize());
        return page1;
    }
}
