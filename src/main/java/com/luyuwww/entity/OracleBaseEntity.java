package com.luyuwww.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by DaMo on 2016/9/20.
 */
@MappedSuperclass
public class OracleBaseEntity {
    @Id
    @GeneratedValue(generator = "sysuuid")
    @GenericGenerator(name = "sysuuid", strategy = "uuid")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
