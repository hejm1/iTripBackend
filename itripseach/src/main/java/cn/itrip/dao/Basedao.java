package cn.itrip.dao;

import cn.itrip.pojo.Page;
import cn.itrip.pojo.itriphotel;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;

import java.io.IOException;
import java.util.List;

public class Basedao<T> {

    HttpSolrClient httpSolrClient;
    public Basedao(String url){
        httpSolrClient=new HttpSolrClient(url);
    }

    public Page queryPage(SolrQuery solrQuery,Class clas,Integer index,Integer pageSize) throws IOException, SolrServerException {

        solrQuery.setStart((index-1)*pageSize);
        solrQuery.setRows(pageSize);
        QueryResponse queryResponse=httpSolrClient.query(solrQuery);
        List<itriphotel> list= queryResponse.getBeans(clas);
        Page page=new Page(index,pageSize,new Long(queryResponse.getResults().getNumFound()).intValue());
        page.setRows(list);
        return page;
    }
}
