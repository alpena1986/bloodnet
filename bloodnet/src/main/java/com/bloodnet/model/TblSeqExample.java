package com.bloodnet.model;

import java.util.ArrayList;
import java.util.List;

public class TblSeqExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    public TblSeqExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
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
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
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

        public Criteria andFunctionCodeIsNull() {
            addCriterion("function_code is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("function_code is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("function_code =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("function_code <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("function_code >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("function_code >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("function_code <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("function_code <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLike(String value) {
            addCriterion("function_code like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotLike(String value) {
            addCriterion("function_code not like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<String> values) {
            addCriterion("function_code in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<String> values) {
            addCriterion("function_code not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("function_code between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("function_code not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeIsNull() {
            addCriterion("div_code is null");
            return (Criteria) this;
        }

        public Criteria andDivCodeIsNotNull() {
            addCriterion("div_code is not null");
            return (Criteria) this;
        }

        public Criteria andDivCodeEqualTo(String value) {
            addCriterion("div_code =", value, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeNotEqualTo(String value) {
            addCriterion("div_code <>", value, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeGreaterThan(String value) {
            addCriterion("div_code >", value, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeGreaterThanOrEqualTo(String value) {
            addCriterion("div_code >=", value, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeLessThan(String value) {
            addCriterion("div_code <", value, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeLessThanOrEqualTo(String value) {
            addCriterion("div_code <=", value, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeLike(String value) {
            addCriterion("div_code like", value, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeNotLike(String value) {
            addCriterion("div_code not like", value, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeIn(List<String> values) {
            addCriterion("div_code in", values, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeNotIn(List<String> values) {
            addCriterion("div_code not in", values, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeBetween(String value1, String value2) {
            addCriterion("div_code between", value1, value2, "divCode");
            return (Criteria) this;
        }

        public Criteria andDivCodeNotBetween(String value1, String value2) {
            addCriterion("div_code not between", value1, value2, "divCode");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andInitialValueIsNull() {
            addCriterion("initial_value is null");
            return (Criteria) this;
        }

        public Criteria andInitialValueIsNotNull() {
            addCriterion("initial_value is not null");
            return (Criteria) this;
        }

        public Criteria andInitialValueEqualTo(Integer value) {
            addCriterion("initial_value =", value, "initialValue");
            return (Criteria) this;
        }

        public Criteria andInitialValueNotEqualTo(Integer value) {
            addCriterion("initial_value <>", value, "initialValue");
            return (Criteria) this;
        }

        public Criteria andInitialValueGreaterThan(Integer value) {
            addCriterion("initial_value >", value, "initialValue");
            return (Criteria) this;
        }

        public Criteria andInitialValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("initial_value >=", value, "initialValue");
            return (Criteria) this;
        }

        public Criteria andInitialValueLessThan(Integer value) {
            addCriterion("initial_value <", value, "initialValue");
            return (Criteria) this;
        }

        public Criteria andInitialValueLessThanOrEqualTo(Integer value) {
            addCriterion("initial_value <=", value, "initialValue");
            return (Criteria) this;
        }

        public Criteria andInitialValueIn(List<Integer> values) {
            addCriterion("initial_value in", values, "initialValue");
            return (Criteria) this;
        }

        public Criteria andInitialValueNotIn(List<Integer> values) {
            addCriterion("initial_value not in", values, "initialValue");
            return (Criteria) this;
        }

        public Criteria andInitialValueBetween(Integer value1, Integer value2) {
            addCriterion("initial_value between", value1, value2, "initialValue");
            return (Criteria) this;
        }

        public Criteria andInitialValueNotBetween(Integer value1, Integer value2) {
            addCriterion("initial_value not between", value1, value2, "initialValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueIsNull() {
            addCriterion("increment_value is null");
            return (Criteria) this;
        }

        public Criteria andIncrementValueIsNotNull() {
            addCriterion("increment_value is not null");
            return (Criteria) this;
        }

        public Criteria andIncrementValueEqualTo(Integer value) {
            addCriterion("increment_value =", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueNotEqualTo(Integer value) {
            addCriterion("increment_value <>", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueGreaterThan(Integer value) {
            addCriterion("increment_value >", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("increment_value >=", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueLessThan(Integer value) {
            addCriterion("increment_value <", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueLessThanOrEqualTo(Integer value) {
            addCriterion("increment_value <=", value, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueIn(List<Integer> values) {
            addCriterion("increment_value in", values, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueNotIn(List<Integer> values) {
            addCriterion("increment_value not in", values, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueBetween(Integer value1, Integer value2) {
            addCriterion("increment_value between", value1, value2, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andIncrementValueNotBetween(Integer value1, Integer value2) {
            addCriterion("increment_value not between", value1, value2, "incrementValue");
            return (Criteria) this;
        }

        public Criteria andLengthIsNull() {
            addCriterion("length is null");
            return (Criteria) this;
        }

        public Criteria andLengthIsNotNull() {
            addCriterion("length is not null");
            return (Criteria) this;
        }

        public Criteria andLengthEqualTo(Integer value) {
            addCriterion("length =", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotEqualTo(Integer value) {
            addCriterion("length <>", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThan(Integer value) {
            addCriterion("length >", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("length >=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThan(Integer value) {
            addCriterion("length <", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthLessThanOrEqualTo(Integer value) {
            addCriterion("length <=", value, "length");
            return (Criteria) this;
        }

        public Criteria andLengthIn(List<Integer> values) {
            addCriterion("length in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotIn(List<Integer> values) {
            addCriterion("length not in", values, "length");
            return (Criteria) this;
        }

        public Criteria andLengthBetween(Integer value1, Integer value2) {
            addCriterion("length between", value1, value2, "length");
            return (Criteria) this;
        }

        public Criteria andLengthNotBetween(Integer value1, Integer value2) {
            addCriterion("length not between", value1, value2, "length");
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
     * This class corresponds to the database table tbl_seq
     *
     * @mbggenerated do_not_delete_during_merge Fri Apr 07 15:03:38 JST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_seq
     *
     * @mbggenerated Fri Apr 07 15:03:38 JST 2017
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