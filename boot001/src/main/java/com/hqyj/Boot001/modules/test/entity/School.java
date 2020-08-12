package com.hqyj.Boot001.modules.test.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "h_school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schoolId;
    private int schoolName;
    @Transient
    private String regin;

    @OneToMany(mappedBy = "school",cascade = CascadeType.REFRESH,fetch = FetchType.LAZY)
    private List<Clazz>clazzes;

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(int schoolName) {
        this.schoolName = schoolName;
    }

    public String getRegin() {
        return regin;
    }

    public void setRegin(String regin) {
        this.regin = regin;
    }

    public List<Clazz> getClazzes() {
        return clazzes;
    }

    public void setClazzes(List<Clazz> clazzes) {
        this.clazzes = clazzes;
    }
}
