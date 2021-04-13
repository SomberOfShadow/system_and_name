//package elk;
//
//import com.google.gson.Gson;
//import org.apache.http.HttpHost;
//import org.elasticsearch.ElasticsearchException;
//import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
//import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
//import org.elasticsearch.action.index.IndexRequest;
//import org.elasticsearch.action.index.IndexResponse;
//import org.elasticsearch.client.RequestOptions;
//import org.elasticsearch.client.RestClient;
//import org.elasticsearch.client.RestClientBuilder;
//import org.elasticsearch.client.RestHighLevelClient;
//import org.elasticsearch.common.unit.TimeValue;
//import org.elasticsearch.common.xcontent.XContentType;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//public class SendDataToElkTest {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(SendDataToElkTest.class);
//    private static final int CONNECT_TIME_OUT = 20000;
//    private static final int SOCKET_TIME_OUT = 20000;
//    private static final int CONNECTION_TIME_OUT = 20000;
//
//    private static final Gson gson = new Gson();
////    private RestHighLevelClient client;
//
//    private static final String indexName = "eenheni-20200707";
//    private static final String TYPE = "_doc";
//
//    public static void main(String[] args) throws IOException {
//
//        RestHighLevelClient client;
//        String hostName = "esekilxv9202.rnd.ki.sw.ericsson.se";
//        int port = 5605;
//
//        RestClientBuilder builder = RestClient.builder(
//                new HttpHost(hostName, port))
//                .setRequestConfigCallback(
//                        requestConfigBuilder -> requestConfigBuilder
//                                .setConnectTimeout(CONNECT_TIME_OUT).setSocketTimeout(SOCKET_TIME_OUT).setConnectionRequestTimeout(CONNECTION_TIME_OUT));
//        client = new RestHighLevelClient(builder);
//
//
////        IndexRequest request = new IndexRequest(indexName, TYPE, "1");
//
//        ExampleObject exampleObject= new ExampleObject("eenheni", "male");
//
//        Map<String, Object> jsonMap = new HashMap<>();
//
//        jsonMap.put("name", "eenheni");
//        jsonMap.put("gender", "male");
//
//
//
//        IndexRequest indexRequest = new IndexRequest(indexName, TYPE, "1").source(jsonMap, XContentType.JSON);
//
////        IndexResponse response = client.index(indexRequest);
//        IndexResponse response = client.index(indexRequest, RequestOptions.DEFAULT);
//
//
//
//        LOGGER.info("---------------------------------");
////        try {
////           if(client.ping()){
//////               send(exampleObject);
////           }
////
////        } catch (IOException e) {
////            LOGGER.warn("Fail to ping elk server.");
////        }
//
//    }
//
//    public static void send (Object object) {
//        try {
//            indexData(gson.toJson(object));
//        } catch (IOException e) {
//           LOGGER.warn("Fail to send data.");
//        }
//    }
//
//
//    public static void indexData(String jsonString) throws IOException {
//        IndexRequest indexRequest = createSingleIndexRequest(indexName, TYPE, jsonString);
//        try {
////        IndexResponse response = client.index(indexRequest);
//        } catch (ElasticsearchException e) { //NOSONAR
//            LOGGER.warn("Exception happens.");
//        }
//    }
//
//    private static IndexRequest createSingleIndexRequest(String indexName, String type, String document) {
//
//        IndexRequest indexRequest = null;
//        try {
//            indexRequest = new IndexRequest(indexName, type, "1").source(document, XContentType.JSON);
//        } catch (Exception e) { //NOSONAR
//            LOGGER.warn("Fail to create index {}", indexName);
//        }
//        return indexRequest;
//    }
//
//}
