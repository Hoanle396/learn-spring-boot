package com.info.spring.database;

import com.info.spring.model.*;
import com.info.spring.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class database {
    @Bean
    CommandLineRunner initDatabase(Skill skill){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                SkillModel a= new SkillModel("VueJs","3 month","fab fa-vuejs","#029918","https://vuejs.org");
                SkillModel b= new SkillModel("Laravel","5 month","fab fa-laravel","#f54d05","https://laravel.com");
                SkillModel c= new SkillModel("Spring boot","1 month","fab fa-java","#034efc","https://spring.io");
                SkillModel d= new SkillModel("Html","3 month","fab fa-html5","#029918","https://vuejs.org");
                SkillModel e= new SkillModel("Css","5 month","fab fa-css3","#f54d05","https://laravel.com");
                SkillModel f= new SkillModel("Java Script","1 month","fab fa-js-square","#034efc","https://spring.io");
                System.out.println("insert: "+skill.save(a));
                System.out.println("insert: "+skill.save(b));
                System.out.println("insert: "+skill.save(c));
                System.out.println("insert: "+skill.save(d));
                System.out.println("insert: "+skill.save(e));
                System.out.println("insert: "+skill.save(f));
            }
        };
    }
    @Bean
    CommandLineRunner initInfor(infor infor){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                info a= new info("Lê Hữu Hoàn","../assets/logo.jpg","Lead Designer and Developer","https://facebook.com/hoanle.396","mailto:hoanle396@gmail.com","tel:0345648638","abcxyz");
                System.out.println("insert: "+infor.save(a));
            }
        };
    }
    @Bean
    CommandLineRunner initAccount(Account account){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                RoleModel a= new RoleModel("admin","admin");
                System.out.println("insert: "+account.save(a));
            }
        };
    }
}
