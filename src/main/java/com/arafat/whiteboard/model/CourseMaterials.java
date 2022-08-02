package com.arafat.whiteboard.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "course_materials")
public class CourseMaterials {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long materialId;

    @Column(name = "file_type")
    private String fileType;

    @Column(name = "file_location")
    private String file_location;

    @Column(name = "create_time")
    private Date create_time;

    public CourseMaterials(){

    }

    public CourseMaterials(String fileType, String file_location, Date create_time) {
        this.fileType = fileType;
        this.file_location = file_location;
        this.create_time = create_time;
    }

    public long getmaterialId() {
        return materialId;
    }

    public CourseMaterials setmaterialId(long materialId) {
        this.materialId = materialId;
        return this;
    }

    public String getFileType() {
        return fileType;
    }

    public CourseMaterials setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }

    public String getFile_location() {
        return file_location;
    }

    public CourseMaterials setFile_location(String file_location) {
        this.file_location = file_location;
        return this;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public CourseMaterials setCreate_time(Date create_time) {
        this.create_time = create_time;
        return this;
    }


}
