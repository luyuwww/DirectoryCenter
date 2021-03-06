package com.luyuwww.service;

import com.luyuwww.entity.Dfile2;
import com.luyuwww.entity.TestA;
import com.luyuwww.repository.Dfile2Repository;
import com.luyuwww.repository.TestARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

/**
 * Created by DaMo on 2016/9/20.
 */
@Service
public class TestService {
    @PostConstruct
    public void init(){
        System.out.println("inito");
    }

    public int test(){
        TestA a = new TestA();
        a.setAge("sdf");
        a.setName("dsjfdsdd");
        testARepository.save(a);


        List<TestA> all1 = testARepository.findAll("age = ?", "sdf");

        for (TestA testA : all1) {
            testA.setBz("update" + UUID.randomUUID().toString());
        }

        testARepository.save(all1);

        List<TestA> all = testARepository.findAll();
        return all.size();
    }

    public List<TestA> listAll(){
        Pageable pa =  new PageRequest(0, 8);
        return testARepository.findAll(pa).getContent();
    }

    public List<Dfile2> ListDfile2(Pageable pageable ){
        List<Dfile2> result = dfile2Repository.findAll(pageable).getContent();
        return result;
    }

    public void testJdbc(){
        List list = jdbcTemplate.queryForList("select * from d_file1");
        System.out.println(list.size());

    }

    @Autowired
    TestARepository testARepository;

    @Autowired
    Dfile2Repository dfile2Repository;

    @Autowired
    private JdbcTemplate jdbcTemplate ;
}
