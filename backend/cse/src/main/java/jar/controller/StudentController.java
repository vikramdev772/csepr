package jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jar.model.Student;
import jar.repo.*;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @GetMapping()
    Map<Object, Object> m1() {
        Map<Object, Object> res = new HashMap<>();

        res.put("msg", "Get api");

        return res;
    }

    @Autowired
    StudentRepo db;

    @PostMapping()
    Map<Object, Object> m2(@RequestBody Student s) {
        Map<Object, Object> res = new HashMap<>();
        res.put("msg", "Post api");
        String name = s.getName();
        String roll = s.getRoll();
        String ip = s.getIp();
        Student obj = new Student();

        obj.setName(name);
        obj.setRoll(roll);
        obj.setIp(ip);

        db.save(obj);

        return res;
    }

}
