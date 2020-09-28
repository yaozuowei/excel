package com.example.demo.controller;

import com.example.demo.entity.UoAdUser;
import com.example.demo.entity.UoAdUserExample;
import com.example.demo.mapper.UoAdUserMapper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.*;
import java.util.List;

/**
 * @author YaoZuoWei
 * @date 2020/9/18 9:57
 * @Description:
 */
@RestController
public class ExcelController {

    @Resource
    public UoAdUserMapper uoAdUserMapper;

    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public UoAdUser index() {

        UoAdUser uoAdUser=uoAdUserMapper.selectByPrimaryKey("009670");

        XSSFWorkbook wb = null;
        try {
            File cfgFile = ResourceUtils.getFile("F:\\baoxin\\文档\\欧冶云商\\630.xlsx");
            //excel模板路径
            InputStream in = new FileInputStream(cfgFile);
            //读取excel模板
            wb = new XSSFWorkbook(in);
            Sheet sheet = wb.getSheetAt(0);
            for (int rowNum=1; rowNum<=sheet.getLastRowNum(); rowNum++) {
                Row row = sheet.getRow(rowNum);
                System.out.println(row.getCell(1).toString()+"---"+row.getCell(2).toString());

                UoAdUserExample uoAdUserExample=new UoAdUserExample();
                uoAdUserExample.createCriteria().andUserGuidEqualTo(row.getCell(1).toString().trim());

                List<UoAdUser> uoAdUsers=uoAdUserMapper.selectByExample(uoAdUserExample);
                if (uoAdUsers!=null&&!uoAdUsers.isEmpty()){
                    UoAdUser user=uoAdUsers.get(0);
                    user.setPostGroup(row.getCell(2).toString().trim());
                    uoAdUserMapper.updateByPrimaryKeySelective(user);
                }
                System.out.println("成功--"+rowNum);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return uoAdUser;
    }
}
