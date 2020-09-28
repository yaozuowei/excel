package com.example.demo.mapper;

import com.example.demo.entity.UoAdUser;
import com.example.demo.entity.UoAdUserExample;

import java.util.List;

public interface UoAdUserMapper {
    /**
     *  根据主键删除数据库的记录,t_uoad_user
     *
     * @param userGuid
     */
    int deleteByPrimaryKey(String userGuid);

    /**
     *  新写入数据库记录,t_uoad_user
     *
     * @param record
     */
    int insert(UoAdUser record);

    /**
     *  动态字段,写入数据库记录,t_uoad_user
     *
     * @param record
     */
    int insertSelective(UoAdUser record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,t_uoad_user
     *
     * @param example
     */
    List<UoAdUser> selectByExample(UoAdUserExample example);

    /**
     *  根据指定主键获取一条数据库记录,t_uoad_user
     *
     * @param userGuid
     */
    UoAdUser selectByPrimaryKey(String userGuid);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,t_uoad_user
     *
     * @param record
     */
    int updateByPrimaryKeySelective(UoAdUser record);

    /**
     *  根据主键来更新符合条件的数据库记录,t_uoad_user
     *
     * @param record
     */
    int updateByPrimaryKey(UoAdUser record);
}