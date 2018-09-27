package com.huawei.m2m;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;

/**
 * Created by Administrator on 2018\3\12 0012.
 */
class HelloWorld {

    public static void main(String[] args) throws Exception {
        //System.out.println("HelloWord!");
        JAXBContext context = JAXBContext.newInstance(ExcelWookBook.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        ExcelWookBook excelWookBook = (ExcelWookBook) unmarshaller.unmarshal(new FileInputStream("G:\\IdeaProjects\\JavaTest\\src\\excel.xml"));
        System.out.println(excelWookBook);
    }

}
