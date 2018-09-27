package com.huawei.m2m;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018\9\20 0020.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "excel")
public class ExcelWookBook implements Serializable {
    @XmlElement(name = "id")
    private String id;
    @XmlElement(name = "name")
    private String name;

    @XmlElementWrapper(name = "sheets")
    @XmlElement(name = "sheet")
    private List<ExcelSheet> sheets;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ExcelSheet> getSheets() {
        return sheets;
    }

    public void setSheets(List<ExcelSheet> sheets) {
        this.sheets = sheets;
    }

    @Override
    public String toString() {
        return "ExcelWookBook{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sheets=" + sheets +
                '}';
    }
}
