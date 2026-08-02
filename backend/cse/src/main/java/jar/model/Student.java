package jar.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String name;
    public String rollno;
    public String ip;

    public void setName(String n) {
        this.name = n;

    }

    public void setRoll(String r) {
        this.rollno = r;

    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName(){
        return this.name;
    }
       public String getRoll(){
        return this.rollno;
    }
       public String getIp(){
        return this.ip;
    }

}
