package org.elasticsearch.api.demo.query;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.api.demo.BaseDemo;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.junit.Test;

/**
 * @see <a href='https://www.elastic.co/guide/en/elasticsearch/client/java-api/5.5/java-query-dsl-match-all-query.html'></a>
 * @auhthor lei.fang@shijue.me
 * @since . 2017-07-08
 */
public class MatchAllQueryDemo extends BaseDemo {

    @Test
    public void testForClient() throws Exception {
        QueryBuilder queryBuilder = QueryBuilders.matchAllQuery();
        SearchResponse searchResponse = client.prepareSearch()
                .setIndices("indexName")
                .setTypes("typeName")
                .setQuery(queryBuilder)
                .execute().actionGet();
    }

}
