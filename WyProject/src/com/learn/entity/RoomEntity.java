package com.learn.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * 垃圾站信息
 *
 */
public class RoomEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    //
    private Long id;

    //垃圾站名
    private String name;

    //小区管理人员
    private Long house;

    //联系人
    private String size;

    private HouseEntity houseEntity;

    public HouseEntity getHouseEntity() {
        return houseEntity;
    }

    public void setHouseEntity(HouseEntity houseEntity) {
        this.houseEntity = houseEntity;
    }

    /**
     * 设置：
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取：
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置：垃圾站名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取：垃圾站名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置：小区管理人员
     */
    public void setHouse(Long house) {
        this.house = house;
    }

    /**
     * 获取：小区管理人员
     */
    public Long getHouse() {
        return house;
    }

    /**
     * 设置：联系人
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * 获取：联系人
     */
    public String getSize() {
        return size;
    }
}
