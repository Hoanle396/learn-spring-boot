package com.info.spring.controllers;

import com.info.spring.model.*;
import com.info.spring.repositories.Account;
import com.info.spring.repositories.Skill;
import com.info.spring.repositories.infor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/home")
public class MyInfoController {
    @Autowired
    private Skill skill;
    @Autowired
    private infor infor4;
    @Autowired
    private Account account;
    @CrossOrigin
    @GetMapping("")
    List getAll(){
        return skill.findAll();
   }
    @CrossOrigin
    @GetMapping("/infor")
    ResponseEntity<ResponseObject> getInfor(){
        long id =7;
        Optional<info> in4= infor4.findById(id);
        if(in4.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseObject("success","query success",in4)
            );
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseObject("failed","Not found","")
            );
        }
    }

    @GetMapping("/{id}")
    ResponseEntity<ResponseObject> findById(@PathVariable long id){
       Optional<SkillModel> findskill= skill.findById(id);
       if(findskill.isPresent()){
           return ResponseEntity.status(HttpStatus.OK).body(
                   new ResponseObject("success","query success",findskill)
           );
       }
       else {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                   new ResponseObject("failed","Not found","")
           );
       }
    }
    @CrossOrigin
    @PostMapping("/insert")
    ResponseEntity<ResponseObject> insertSkill(@RequestBody SkillModel addskill){
       List<SkillModel> find= skill.findByName(addskill.getName().trim());
       if(find.size()>0){
           return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                   new ResponseObject("failed","name a readly taken","")
           );
       }
       return ResponseEntity.status(HttpStatus.OK).body(
               new ResponseObject("ok","Thêm Thành Công",skill.save(addskill))
       );
    }
    @CrossOrigin
    @PostMapping("/login")
    ResponseEntity<ResponseObject> login(@RequestBody AccountModel user){
        AccountModel acc= account.findByUsername(user.getUsername());
        if(!acc.getUsername().isEmpty()){
            if(acc.getPassword().equals(user.getPassword())){
                return ResponseEntity.status(HttpStatus.OK).body(
                        new ResponseObject("success","Đăng nhập thành công",acc)
                );
            }
            else {
                return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                        new ResponseObject("failed","Mật khẩu sai","")
                );
            }
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(
                    new ResponseObject("failed","Không tìm thấy tài khoản của bạn","")
            );
        }
    }
}
