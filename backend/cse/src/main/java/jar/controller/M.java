package jar.controller;

import jar.math.Sum;
import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
public class M{

    @GetMapping("/sum")
    Map<Object,Object> f(@RequestParam int n){

        Map<Object,Object> m = new HashMap<>();

        m.put("api"," sum of n numbers api");
        m.put("number",n);
        m.put("result",new Sum().add(n));

        return m;

    }

}