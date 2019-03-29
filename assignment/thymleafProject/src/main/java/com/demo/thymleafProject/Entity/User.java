package com.demo.thymleafProject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

    @Entity
    public class User implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer id;

        private String name;

        private String email;

        private Boolean isAdmin;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Boolean getAdmin() {
            return isAdmin;
        }

        public void setAdmin(Boolean admin) {
            isAdmin = admin;
        }

}