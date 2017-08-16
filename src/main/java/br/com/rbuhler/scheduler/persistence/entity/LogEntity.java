package br.com.rbuhler.scheduler.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "LOG")
public class LogEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String instance;

    private String dateTime;

    private String status;


    public Integer getId(){ return this.id; }

    public String getInstance(){
        return this.instance;
    }

    public String getDateTime() {
        return dateTime;
    }

    public String getStatus(){ return  this.status; }


    public void setId(Integer id){ this.id = id; }

    public void setInstance(String instance){
        this.instance = instance;
    }

    public void setDateTime(String dateTime){
        this.dateTime = dateTime;
    }

    public void setStatus(String status){ this.status = status; }
}