package jar.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Student;
import jar.repo.StudentRepo;

@RestController
public class Deleteid {

  @Autowired
  // which db ?
  StudentRepo db;

  // Path variables typically identify specific resources.
  // Query parameters usually modify or filter results, such as by sorting or
  // pagination.

  // Definition: @RequestParam binds a method parameter to a query parameter in
  // the URL.
  @DeleteMapping("/update/{id}")
  Map<Object, Object> deleteStudent(@PathVariable long id) {
    Map<Object, Object> res = new HashMap<>();

    Student existing = db.findById(id).orElse(null);

    if (existing == null) {
      res.put("status", 404);
      res.put("msg", "User not found");
      res.put("result", "delete failed");
      return res;
    }

    db.delete(existing);
    // Using 203
    res.put("status", 203);
    res.put("msg", "Delete API");
    res.put("result", "user deleted successfully");
    return res;
  }
}
