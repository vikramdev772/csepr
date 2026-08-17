package jar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.repo.StudentRepo;
import jar.services.Postservice;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentRepo db;

    @Autowired
    private Postservice postService;

    @GetMapping
    Map<Object, Object> m1() {
        Map<Object, Object> res = new HashMap<>();
        res.put("msg", "Get api");
        res.put("list", getAllStudents());
        return res;
    }

    @PostMapping
    Map<Object, Object> post(@RequestBody Student s) {
        return postService.post(s);
    }

    List<Student> getAllStudents() {
        return db.findAll();
    }
}
