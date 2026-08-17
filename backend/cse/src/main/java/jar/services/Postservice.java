package jar.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import jar.model.Student;
import jar.repo.StudentRepo;

@Service
public class Postservice {
    @Autowired
    private StudentRepo db;

    public Map<Object, Object> post(@RequestBody Student s) {
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
