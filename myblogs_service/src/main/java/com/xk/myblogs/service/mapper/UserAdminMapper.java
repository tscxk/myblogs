package com.xk.myblogs.service.mapper;

import com.xk.myblogs.client.entity.UserAdmin;
import com.xk.myblogs.client.entity.UserAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

public interface UserAdminMapper {
    /**
     * 按条件计数
	 * @param example 条件
     * 
     * WARNING - @mbg.generated MyBatis Generator Create
     */
    long countByExample(UserAdminExample example);

    /**
     * 按条件删除
	 * @param example 条件
     * 
     * WARNING - @mbg.generated MyBatis Generator Create
     */
    int deleteByExample(UserAdminExample example);

    /**
     * 插入数据 所有字段
     * @param record 操作 实体 bean 对象
     * 
     * WARNING - @mbg.generated MyBatis Generator Create
     */
    int insert(UserAdmin record);

    /**
     * 插入数据 值不为 null 的字段
     * @param record 操作 实体 bean 对象
     * 
     * WARNING - @mbg.generated MyBatis Generator Create
     */
    int insertSelective(UserAdmin record);

    /**
     * 按条件查询
	 * @param example 条件
     * 
     * WARNING - @mbg.generated MyBatis Generator Create
     */
    List<UserAdmin> selectByExample(UserAdminExample example);

    /**
     * 按条件更新值不为 null 的字段
     * @param record 操作 实体 bean 对象
	 * @param example 条件
     * 
     * WARNING - @mbg.generated MyBatis Generator Create
     */
    int updateByExampleSelective(@Param("record") UserAdmin record, @Param("example") UserAdminExample example);

    /**
     * 按条件更新所有字段
     * @param record 操作 实体 bean 对象
	 * @param example 条件
     * 
     * WARNING - @mbg.generated MyBatis Generator Create
     */
    int updateByExample(@Param("record") UserAdmin record, @Param("example") UserAdminExample example);
}