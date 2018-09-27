package com.huawei.m2m;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by Administrator on 2018\9\20 0020.
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class ExcelSheet implements Serializable {
    @XmlElement(name = "name")
    private String sheetName;

    @XmlElementWrapper(name = "columns")
    @XmlElement(name = "column")
    private String[] columns;

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String[] getColumns() {
        return columns;
    }

    public void setColumns(String columns[]) {
        this.columns = columns;
    }

    @Override
    public String toString() {
        return "ExcelSheet{" +
                "sheetName='" + sheetName + '\'' +
                ", columns=" + Arrays.toString(columns) +
                '}';
    }
}
