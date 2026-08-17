package jar.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jar.model.Student;
import jar.repo.StudentRepo;

@Service
public class Upservice {

    @Autowired
    StudentRepo db;

    public Map<Object, Object> up(Student s, long id) {
        Map<Object, Object> res = new HashMap<>();
        Student et = db.findById(id).orElse(null);

        if (et == null) {
            res.put("status", 404);
            res.put("msg", "user not found");
            return res;
        }

        String name = s.getName();
        String roll = s.getRoll();
        String ip = s.getIp();

        et.setName(name);
        et.setRoll(roll);
        et.setIp(ip);
        db.save(et);

        res.put("status", 200);
        res.put("msg", "update api");
        res.put("result", "user updated sucessfully");
        return res;
    }
}
