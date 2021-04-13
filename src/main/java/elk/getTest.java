//package elk;
//
//import org.apache.http.HttpHost;
//import org.elasticsearch.ElasticsearchException;
//import org.elasticsearch.action.get.GetRequest;
//import org.elasticsearch.action.get.GetResponse;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestClientBuilder;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.elasticsearch.rest.RestStatus;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.HashMap;
//import java.util.Map;
//
//import static org.apache.http.HttpHost.DEFAULT_SCHEME_NAME;
//
//public class getTest {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(getTest.class);
//    private static final String rawURL = "http://esekilxv9202.rnd.ki.sw.ericsson.se:5605";
//    public static void main(String[] args) throws MalformedURLException {
//////        String indexName = "mje-seki-20191216";
////        String indexName = "mje-seki-20191217";
//////        String documentId = "Z_dBD28BIGzSE_zRzJvB";
////        String documentId = "evl2Em8BIGzSE_zRBCB0";
////
////        String hostName = "esekilxv9202.rnd.ki.sw.ericsson.se";
////        int port = 5605;
//
//        //our own elk server
////         http://seliiuapp00269.lmera.ericsson.se:9208/cat-restart-meas/_doc/OsIhCXMBLzRwc_vE7bmJ
//        String hostName = "seliiuapp00269.lmera.ericsson.se";
//        String indexName = "cat-restart-meas";
//        String documentId = "OsIhCXMBLzRwc_vE7bmJ";
//        int port = 9208;
//
//
//        // parse URL
//        System.out.println("URL = " + rawURL);
//        URL parsedHttpUrl = new URL(rawURL);
//        String protocol = parsedHttpUrl.getProtocol();
//        String host = parsedHttpUrl.getHost();
//        int portt = parsedHttpUrl.getPort();
//        String path = parsedHttpUrl.getPath();
//        System.out.println("protocol = " + protocol);
//        System.out.println("host = " + host);
//        System.out.println("port = " + portt);
//        System.out.println("path = " + path);
//
//
//        RestClientBuilder builder = RestClient.builder(
//                new HttpHost(hostName, port))
//                .setRequestConfigCallback(
//                        requestConfigBuilder -> requestConfigBuilder
//                                .setConnectTimeout(2000).setSocketTimeout(2000).setConnectionRequestTimeout(2000));
//        RestHighLevelClient client = new RestHighLevelClient(builder);
//
////
////        RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(
////                new HttpHost(hostName, port, DEFAULT_SCHEME_NAME)).setPathPrefix("/elastic"));
////
//
//        Map<String, Object> stringObjectMap = get(client, indexName, documentId);
//        System.out.println(stringObjectMap);
//
//    }
//
//
//    public static Map<String, Object> get(RestHighLevelClient client, String indexName, String documentId) {
//        Map<String, Object> sourceAsMap = new HashMap<>();
//        GetRequest getRequest = new GetRequest(indexName, "_doc", documentId);
//        try {
//            GetResponse getResponse = client.get(getRequest, RequestOptions.DEFAULT);
//            if (getResponse.isExists()) {
//                sourceAsMap = getResponse.getSourceAsMap();
//            }
//        } catch (ElasticsearchException e) {
//            if (e.status() == RestStatus.NOT_FOUND) {
//                LOGGER.warn("Cannot find document [{}] from Elasticsearch index [{}] ", documentId, indexName, e);
//            }
//        } catch (IOException e) {
//            LOGGER.warn("Cannot get data due to exception - ", e);
//        }
//        try {
//            client.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return sourceAsMap;
//    }
//}
//
