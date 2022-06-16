package com.learn.entity;

        import java.io.Serializable;
        import java.util.Date;



/**
 * 分类信息
 *
 */
public class HouseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

            //
                    private Long id;
        
            //分类名
                    private String name;
        
            //分类类型
                    private String ceng;
        
                    //分类编号
                    private Integer room;
        
    
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
         * 设置：分类名
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取：分类名
         */
        public String getName() {
            return name;
        }
            /**
         * 设置：分类类型
         */
        public void setCeng(String ceng) {
            this.ceng = ceng;
        }

        /**
         * 获取：分类类型
         */
        public String getCeng() {
            return ceng;
        }
            /**
         * 设置：分类编号
         */
        public void setRoom(Integer room) {
            this.room = room;
        }

        /**
         * 获取：分类编号
         */
        public Integer getRoom() {
            return room;
        }
    }
