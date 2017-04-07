package com.bloodnet.mappers;

import com.bloodnet.model.TblRelationMotherDaughter;
import com.bloodnet.model.TblRelationMotherDaughterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRelationMotherDaughterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_mother_daughter
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int countByExample(TblRelationMotherDaughterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_mother_daughter
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int deleteByExample(TblRelationMotherDaughterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_mother_daughter
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int insert(TblRelationMotherDaughter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_mother_daughter
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int insertSelective(TblRelationMotherDaughter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_mother_daughter
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    List<TblRelationMotherDaughter> selectByExample(TblRelationMotherDaughterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_mother_daughter
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblRelationMotherDaughter record, @Param("example") TblRelationMotherDaughterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_mother_daughter
     *
     * @mbggenerated Fri Apr 07 16:00:45 JST 2017
     */
    int updateByExample(@Param("record") TblRelationMotherDaughter record, @Param("example") TblRelationMotherDaughterExample example);
}