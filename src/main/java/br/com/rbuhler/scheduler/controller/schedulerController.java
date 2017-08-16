package br.com.rbuhler.scheduler.controller;


import br.com.rbuhler.scheduler.persistence.entity.LogEntity;
import br.com.rbuhler.scheduler.persistence.repository.LogEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/scheduler")
public class schedulerController {

    @Autowired
    private LogEntityRepository logEntityRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewLog(@RequestParam String status){

        LogEntity logEntity = new LogEntity();

        logEntity.setDateTime("2017");
        logEntity.setStatus("");
        logEntityRepository.save(logEntity);

        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<LogEntity> getAllLogs(){

        return logEntityRepository.findAll();
    }
}