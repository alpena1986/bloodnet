package com.bloodnet.mappers;

import com.bloodnet.model.TblAcid;
import com.bloodnet.model.TblAcidExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblAcidMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_acid
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int countByExample(TblAcidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_acid
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int deleteByExample(TblAcidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_acid
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int insert(TblAcid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_acid
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int insertSelective(TblAcid record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_acid
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    List<TblAcid> selectByExample(TblAcidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_acid
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblAcid record, @Param("example") TblAcidExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_acid
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int updateByExample(@Param("record") TblAcid record, @Param("example") TblAcidExample example);
}