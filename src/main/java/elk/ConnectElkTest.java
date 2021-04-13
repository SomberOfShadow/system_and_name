//package elk;
//
//import com.ericsson.commonlibrary.statisticscollectorframework.listeners.DataInjector;
//import com.ericsson.commonlibrary.statisticscollectorframework.service.ElasticSearchService;
//import com.ericsson.commonlibrary.statisticscollectorframework.suppliers.DataSupplierHolder;
//
//import java.util.Map;
//
//public class ConnectElkTest{
//    public static void main(String[] args) {
////        String indexName = "eenheni-20200707";
////        String hostName = "esekilxv9202.rnd.ki.sw.ericsson.se";
////        int port = 5605;
//
//
//        String hostName = "seliiuapp00269.lmera.ericsson.se";
//        String indexName = "cat-restart-meas";
//        String documentId = "OsIhCXMBLzRwc_vE7bmJ";
//        int port = 9208;
//
//
//        ElasticSearchService elasticSearchService = new ElasticSearchService(indexName, hostName, port);
//
//        Map<String, Object> stringObjectMap = elasticSearchService.get(documentId);
//        System.out.println(stringObjectMap);
////        ExampleObject exampleObject= new ExampleObject("eenheni", "male");
//
////        try {
////            elasticSearchService.send(exampleObject);
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//
//    }
//}
