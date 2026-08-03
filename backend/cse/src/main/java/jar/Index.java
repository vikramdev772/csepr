package jar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jar.dto.R;

@RestController
public class Index {

  // @GetMapping("/")
  @PostMapping("/")
  R res() {

    return new R();
  }

  @GetMapping("/api")
  Map<Object, Object> m1() {

    Map<Object, Object> r = new HashMap<>();

    r.put("name", "welcome spring api");
    r.put("status", 200);
    r.put("github", "https://github.com/vikramdev772/csepr");
    r.put("fruits", "🍌🍉🫐🍏🍑🥭🍎");

    return r;
  }

  @GetMapping("/api/fib")
  List<Object> m2(@RequestParam int n) {
    List<Object> l = new ArrayList<>();
    l.add(0);
    l.add(1);
    for (int i = 2; i <= n; i++) {
      int o = new Index().f(i);
      l.add(o);
    }
    return l;

  }

  // Trying fib in recursive way and Checking at testcase 37
  int f(int n) {
    // Base-case
    if (n <= 1) {
      return n;
    }
    // recursive case
    return f(n - 1) + f(n - 1);
  }

}
