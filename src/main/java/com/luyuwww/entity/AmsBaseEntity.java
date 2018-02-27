package com.luyuwww.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by DaMo on 2018-2-27.
 */
@MappedSuperclass
public class AmsBaseEntity {
    @Id
    @GeneratedValue(generator = "sysuuid")
    @GenericGenerator(name = "sysuuid", strategy = "uuid")
    private String syscode;

    public String getSyscode() {
        return syscode;
    }

    public void setSyscode(String syscode) {
        this.syscode = syscode;
    }
}
