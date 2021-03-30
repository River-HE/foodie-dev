package com.imooc.service;

import com.imooc.pojo.Stu;

/**
 * @Auther river
 * @Date 2021/3/30
 */
public interface StuService {

    public Stu getStuInfo(int id);

    public void saveStu();

    public void updateStu(int id);

    public void deleteStu(int id);
}
