package my.home.SearchController;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api/search", method = RequestMethod.POST)
@CrossOrigin(origins = "http://localhost:3000")
public class SearchController {
    @PostMapping(
            value = "/test",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<java.lang.Object> test(){
        Map<String, String> retVal = new HashMap<>();
        retVal.put("message", "test");
        return ResponseEntity.ok(retVal);
    }

    @PostMapping(
        value = "/list",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<java.lang.Object> list(@RequestBody HashMap<String, String> requestMap){
        Map<String, Object> retVal = new HashMap<>();
        List<Map<String, Object>> searchList = new ArrayList<>();
        String keyword = requestMap.get("keyword");

        for (int i = 1; i <= 5; i++){
            Map<String, Object> searchItem = new HashMap<>();
            searchItem.put("id", i);
            searchItem.put("url", "http://localhost:3000/search/searchMain");

            Object[] params = new Object[]{keyword, "집", i};
            String msg = MessageFormat.format("{0} {1} {2}", params);
            searchItem.put("name", msg);

            searchList.add(searchItem);
        }

        retVal.put("searchKeyword", keyword);
        retVal.put("searchList", searchList);

        return ResponseEntity.ok(retVal);
    }
}
