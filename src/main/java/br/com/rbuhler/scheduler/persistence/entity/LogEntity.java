package br.com.rbuhler.scheduler.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOG")
public class LogEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String instance;

    private String dateTime;

    public String getInstance(){
        return this.instance;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setInstance(String instance){
        this.instance = instance;
    }

    public void setDateTime(String dateTime){
        this.dateTime = dateTime;
    }
}