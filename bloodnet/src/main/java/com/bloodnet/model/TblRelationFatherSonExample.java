package com.bloodnet.model;

import java.util.ArrayList;
import java.util.List;

public class TblRelationFatherSonExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public TblRelationFatherSonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFatherProfileIdIsNull() {
            addCriterion("father_profile_id is null");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdIsNotNull() {
            addCriterion("father_profile_id is not null");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdEqualTo(String value) {
            addCriterion("father_profile_id =", value, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdNotEqualTo(String value) {
            addCriterion("father_profile_id <>", value, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdGreaterThan(String value) {
            addCriterion("father_profile_id >", value, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdGreaterThanOrEqualTo(String value) {
            addCriterion("father_profile_id >=", value, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdLessThan(String value) {
            addCriterion("father_profile_id <", value, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdLessThanOrEqualTo(String value) {
            addCriterion("father_profile_id <=", value, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdLike(String value) {
            addCriterion("father_profile_id like", value, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdNotLike(String value) {
            addCriterion("father_profile_id not like", value, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdIn(List<String> values) {
            addCriterion("father_profile_id in", values, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdNotIn(List<String> values) {
            addCriterion("father_profile_id not in", values, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdBetween(String value1, String value2) {
            addCriterion("father_profile_id between", value1, value2, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andFatherProfileIdNotBetween(String value1, String value2) {
            addCriterion("father_profile_id not between", value1, value2, "fatherProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdIsNull() {
            addCriterion("son_profile_id is null");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdIsNotNull() {
            addCriterion("son_profile_id is not null");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdEqualTo(String value) {
            addCriterion("son_profile_id =", value, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdNotEqualTo(String value) {
            addCriterion("son_profile_id <>", value, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdGreaterThan(String value) {
            addCriterion("son_profile_id >", value, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdGreaterThanOrEqualTo(String value) {
            addCriterion("son_profile_id >=", value, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdLessThan(String value) {
            addCriterion("son_profile_id <", value, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdLessThanOrEqualTo(String value) {
            addCriterion("son_profile_id <=", value, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdLike(String value) {
            addCriterion("son_profile_id like", value, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdNotLike(String value) {
            addCriterion("son_profile_id not like", value, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdIn(List<String> values) {
            addCriterion("son_profile_id in", values, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdNotIn(List<String> values) {
            addCriterion("son_profile_id not in", values, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdBetween(String value1, String value2) {
            addCriterion("son_profile_id between", value1, value2, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andSonProfileIdNotBetween(String value1, String value2) {
            addCriterion("son_profile_id not between", value1, value2, "sonProfileId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdIsNull() {
            addCriterion("registrar_id is null");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdIsNotNull() {
            addCriterion("registrar_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdEqualTo(String value) {
            addCriterion("registrar_id =", value, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdNotEqualTo(String value) {
            addCriterion("registrar_id <>", value, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdGreaterThan(String value) {
            addCriterion("registrar_id >", value, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdGreaterThanOrEqualTo(String value) {
            addCriterion("registrar_id >=", value, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdLessThan(String value) {
            addCriterion("registrar_id <", value, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdLessThanOrEqualTo(String value) {
            addCriterion("registrar_id <=", value, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdLike(String value) {
            addCriterion("registrar_id like", value, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdNotLike(String value) {
            addCriterion("registrar_id not like", value, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdIn(List<String> values) {
            addCriterion("registrar_id in", values, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdNotIn(List<String> values) {
            addCriterion("registrar_id not in", values, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdBetween(String value1, String value2) {
            addCriterion("registrar_id between", value1, value2, "registrarId");
            return (Criteria) this;
        }

        public Criteria andRegistrarIdNotBetween(String value1, String value2) {
            addCriterion("registrar_id not between", value1, value2, "registrarId");
            return (Criteria) this;
        }

        public Criteria andDelflgIsNull() {
            addCriterion("delflg is null");
            return (Criteria) this;
        }

        public Criteria andDelflgIsNotNull() {
            addCriterion("delflg is not null");
            return (Criteria) this;
        }

        public Criteria andDelflgEqualTo(Boolean value) {
            addCriterion("delflg =", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotEqualTo(Boolean value) {
            addCriterion("delflg <>", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgGreaterThan(Boolean value) {
            addCriterion("delflg >", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delflg >=", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgLessThan(Boolean value) {
            addCriterion("delflg <", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgLessThanOrEqualTo(Boolean value) {
            addCriterion("delflg <=", value, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgIn(List<Boolean> values) {
            addCriterion("delflg in", values, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotIn(List<Boolean> values) {
            addCriterion("delflg not in", values, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgBetween(Boolean value1, Boolean value2) {
            addCriterion("delflg between", value1, value2, "delflg");
            return (Criteria) this;
        }

        public Criteria andDelflgNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delflg not between", value1, value2, "delflg");
            return (Criteria) this;
        }

        public Criteria andCreateAppIsNull() {
            addCriterion("create_app is null");
            return (Criteria) this;
        }

        public Criteria andCreateAppIsNotNull() {
            addCriterion("create_app is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAppEqualTo(String value) {
            addCriterion("create_app =", value, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppNotEqualTo(String value) {
            addCriterion("create_app <>", value, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppGreaterThan(String value) {
            addCriterion("create_app >", value, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppGreaterThanOrEqualTo(String value) {
            addCriterion("create_app >=", value, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppLessThan(String value) {
            addCriterion("create_app <", value, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppLessThanOrEqualTo(String value) {
            addCriterion("create_app <=", value, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppLike(String value) {
            addCriterion("create_app like", value, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppNotLike(String value) {
            addCriterion("create_app not like", value, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppIn(List<String> values) {
            addCriterion("create_app in", values, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppNotIn(List<String> values) {
            addCriterion("create_app not in", values, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppBetween(String value1, String value2) {
            addCriterion("create_app between", value1, value2, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateAppNotBetween(String value1, String value2) {
            addCriterion("create_app not between", value1, value2, "createApp");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNull() {
            addCriterion("create_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNotNull() {
            addCriterion("create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDtEqualTo(String value) {
            addCriterion("create_dt =", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotEqualTo(String value) {
            addCriterion("create_dt <>", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThan(String value) {
            addCriterion("create_dt >", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThanOrEqualTo(String value) {
            addCriterion("create_dt >=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThan(String value) {
            addCriterion("create_dt <", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThanOrEqualTo(String value) {
            addCriterion("create_dt <=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLike(String value) {
            addCriterion("create_dt like", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotLike(String value) {
            addCriterion("create_dt not like", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtIn(List<String> values) {
            addCriterion("create_dt in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotIn(List<String> values) {
            addCriterion("create_dt not in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtBetween(String value1, String value2) {
            addCriterion("create_dt between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotBetween(String value1, String value2) {
            addCriterion("create_dt not between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andUpdateAppIsNull() {
            addCriterion("update_app is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAppIsNotNull() {
            addCriterion("update_app is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAppEqualTo(String value) {
            addCriterion("update_app =", value, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppNotEqualTo(String value) {
            addCriterion("update_app <>", value, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppGreaterThan(String value) {
            addCriterion("update_app >", value, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppGreaterThanOrEqualTo(String value) {
            addCriterion("update_app >=", value, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppLessThan(String value) {
            addCriterion("update_app <", value, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppLessThanOrEqualTo(String value) {
            addCriterion("update_app <=", value, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppLike(String value) {
            addCriterion("update_app like", value, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppNotLike(String value) {
            addCriterion("update_app not like", value, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppIn(List<String> values) {
            addCriterion("update_app in", values, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppNotIn(List<String> values) {
            addCriterion("update_app not in", values, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppBetween(String value1, String value2) {
            addCriterion("update_app between", value1, value2, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateAppNotBetween(String value1, String value2) {
            addCriterion("update_app not between", value1, value2, "updateApp");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIsNull() {
            addCriterion("update_dt is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIsNotNull() {
            addCriterion("update_dt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDtEqualTo(String value) {
            addCriterion("update_dt =", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotEqualTo(String value) {
            addCriterion("update_dt <>", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtGreaterThan(String value) {
            addCriterion("update_dt >", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtGreaterThanOrEqualTo(String value) {
            addCriterion("update_dt >=", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLessThan(String value) {
            addCriterion("update_dt <", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLessThanOrEqualTo(String value) {
            addCriterion("update_dt <=", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtLike(String value) {
            addCriterion("update_dt like", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotLike(String value) {
            addCriterion("update_dt not like", value, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtIn(List<String> values) {
            addCriterion("update_dt in", values, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotIn(List<String> values) {
            addCriterion("update_dt not in", values, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtBetween(String value1, String value2) {
            addCriterion("update_dt between", value1, value2, "updateDt");
            return (Criteria) this;
        }

        public Criteria andUpdateDtNotBetween(String value1, String value2) {
            addCriterion("update_dt not between", value1, value2, "updateDt");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated do_not_delete_during_merge Fri Apr 07 18:36:16 JST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 18:36:16 JST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}