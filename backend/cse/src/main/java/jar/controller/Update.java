package jar.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.services.Upservice;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("*")
public class Update {
    @Autowired
    Upservice obj;

    Update(Upservice obj){
        this.obj = obj;
    }

    @PutMapping("/update/{id}")
    public Map<Object, Object> updateStudent(@RequestBody Student s, @PathVariable long id) {
        return obj.up(s, id);
    }

}
// public class Update {

//     @Autowired
//     StudentRepo db;

//     @PutMapping("/update/{id}")
//     Map<Object, Object> m2(@RequestBody Student s, @PathVariable long id) {
//         Map<Object, Object> res = new HashMap<>();
//         Student et = db.findById(id).orElse(null);
//         res.put("msg", "Post api");
//         String name = s.getName();
//         String roll = s.getRoll();
//         String ip = s.getIp();
//         et.setName(name);
//         et.setRoll(roll);
//         et.setIp(ip);
//         db.save(et);
//         res.put("status", 200);
//         res.put("msg", "update api");
//         res.put("result", "user updated sucessfully");
//         return res;
//     }

// }
