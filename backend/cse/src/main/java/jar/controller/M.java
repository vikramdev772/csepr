package jar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jar.math.Sum;

@RestController
public class M {

    @GetMapping("/sum")
    Map<Object, Object> f(@RequestParam int n) {

        Map<Object, Object> m = new HashMap<>();

        m.put("api", " sum of n numbers api");
        m.put("number", n);
        m.put("result", new Sum().add(n));

        return m;

    }

}
