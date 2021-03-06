package com.bloodnet.mappers;

import com.bloodnet.model.TblHuman;
import com.bloodnet.model.TblHumanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblHumanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_human
     *
     * @mbggenerated Fri Mar 24 18:18:32 JST 2017
     */
    int countByExample(TblHumanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_human
     *
     * @mbggenerated Fri Mar 24 18:18:32 JST 2017
     */
    int deleteByExample(TblHumanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_human
     *
     * @mbggenerated Fri Mar 24 18:18:32 JST 2017
     */
    int insert(TblHuman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_human
     *
     * @mbggenerated Fri Mar 24 18:18:32 JST 2017
     */
    int insertSelective(TblHuman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_human
     *
     * @mbggenerated Fri Mar 24 18:18:32 JST 2017
     */
    List<TblHuman> selectByExample(TblHumanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_human
     *
     * @mbggenerated Fri Mar 24 18:18:32 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblHuman record, @Param("example") TblHumanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_human
     *
     * @mbggenerated Fri Mar 24 18:18:32 JST 2017
     */
    int updateByExample(@Param("record") TblHuman record, @Param("example") TblHumanExample example);
}