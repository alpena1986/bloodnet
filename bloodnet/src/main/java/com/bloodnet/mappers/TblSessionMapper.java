package com.bloodnet.mappers;

import com.bloodnet.model.TblSession;
import com.bloodnet.model.TblSessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblSessionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_session
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    int countByExample(TblSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_session
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    int deleteByExample(TblSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_session
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    int insert(TblSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_session
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    int insertSelective(TblSession record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_session
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    List<TblSession> selectByExample(TblSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_session
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblSession record, @Param("example") TblSessionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_session
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    int updateByExample(@Param("record") TblSession record, @Param("example") TblSessionExample example);
}