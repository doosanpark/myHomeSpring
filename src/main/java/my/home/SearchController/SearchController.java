package my.home.SearchController;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/search", method = RequestMethod.POST)
public class SearchController {
    @PostMapping(
            value = "/test",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, String>> test(){
        Map<String, String> retVal = new HashMap<>();
        retVal.put("message", "test");
        return ResponseEntity.ok(retVal);
    }

    @PostMapping(
        value = "/list",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, String>> list(@RequestBody HashMap<String, String> requestMap){
        Map<String, String> retVal = new HashMap<>();
        retVal.put("searchKeyword", requestMap.get("keyword"));
        return ResponseEntity.ok(retVal);
    }
}
