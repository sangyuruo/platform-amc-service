package com.ai.aisse.core.dao.mapper;


import com.ai.aisse.core.po.Sysuser;

public interface SysuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int insert(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int insertSelective(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    Sysuser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Sysuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sysuser
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Sysuser record);
}