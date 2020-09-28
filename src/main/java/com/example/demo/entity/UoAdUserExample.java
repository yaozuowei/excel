package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UoAdUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,t_uoad_user
     */
    public UoAdUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,t_uoad_user
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,t_uoad_user
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,t_uoad_user
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,t_uoad_user
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,t_uoad_user
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,t_uoad_user
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,t_uoad_user
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,t_uoad_user
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,t_uoad_user
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,t_uoad_user
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 用户表
     * GeneratedCriteria
     * 数据库表：t_uoad_user
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

        public Criteria andUserGuidIsNull() {
            addCriterion("USER_GUID is null");
            return (Criteria) this;
        }

        public Criteria andUserGuidIsNotNull() {
            addCriterion("USER_GUID is not null");
            return (Criteria) this;
        }

        public Criteria andUserGuidEqualTo(String value) {
            addCriterion("USER_GUID =", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotEqualTo(String value) {
            addCriterion("USER_GUID <>", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidGreaterThan(String value) {
            addCriterion("USER_GUID >", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidGreaterThanOrEqualTo(String value) {
            addCriterion("USER_GUID >=", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLessThan(String value) {
            addCriterion("USER_GUID <", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLessThanOrEqualTo(String value) {
            addCriterion("USER_GUID <=", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidLike(String value) {
            addCriterion("USER_GUID like", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotLike(String value) {
            addCriterion("USER_GUID not like", value, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidIn(List<String> values) {
            addCriterion("USER_GUID in", values, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotIn(List<String> values) {
            addCriterion("USER_GUID not in", values, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidBetween(String value1, String value2) {
            addCriterion("USER_GUID between", value1, value2, "userGuid");
            return (Criteria) this;
        }

        public Criteria andUserGuidNotBetween(String value1, String value2) {
            addCriterion("USER_GUID not between", value1, value2, "userGuid");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNull() {
            addCriterion("DELETE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIsNotNull() {
            addCriterion("DELETE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteDateEqualTo(Date value) {
            addCriterion("DELETE_DATE =", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotEqualTo(Date value) {
            addCriterion("DELETE_DATE <>", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThan(Date value) {
            addCriterion("DELETE_DATE >", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELETE_DATE >=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThan(Date value) {
            addCriterion("DELETE_DATE <", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateLessThanOrEqualTo(Date value) {
            addCriterion("DELETE_DATE <=", value, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateIn(List<Date> values) {
            addCriterion("DELETE_DATE in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotIn(List<Date> values) {
            addCriterion("DELETE_DATE not in", values, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateBetween(Date value1, Date value2) {
            addCriterion("DELETE_DATE between", value1, value2, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andDeleteDateNotBetween(Date value1, Date value2) {
            addCriterion("DELETE_DATE not between", value1, value2, "deleteDate");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelIsNull() {
            addCriterion("CREATE_USER_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelIsNotNull() {
            addCriterion("CREATE_USER_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelEqualTo(String value) {
            addCriterion("CREATE_USER_LABEL =", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelNotEqualTo(String value) {
            addCriterion("CREATE_USER_LABEL <>", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelGreaterThan(String value) {
            addCriterion("CREATE_USER_LABEL >", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_LABEL >=", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelLessThan(String value) {
            addCriterion("CREATE_USER_LABEL <", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER_LABEL <=", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelLike(String value) {
            addCriterion("CREATE_USER_LABEL like", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelNotLike(String value) {
            addCriterion("CREATE_USER_LABEL not like", value, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelIn(List<String> values) {
            addCriterion("CREATE_USER_LABEL in", values, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelNotIn(List<String> values) {
            addCriterion("CREATE_USER_LABEL not in", values, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelBetween(String value1, String value2) {
            addCriterion("CREATE_USER_LABEL between", value1, value2, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andCreateUserLabelNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER_LABEL not between", value1, value2, "createUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelIsNull() {
            addCriterion("UPDATE_USER_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelIsNotNull() {
            addCriterion("UPDATE_USER_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelEqualTo(String value) {
            addCriterion("UPDATE_USER_LABEL =", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelNotEqualTo(String value) {
            addCriterion("UPDATE_USER_LABEL <>", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelGreaterThan(String value) {
            addCriterion("UPDATE_USER_LABEL >", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_LABEL >=", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelLessThan(String value) {
            addCriterion("UPDATE_USER_LABEL <", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER_LABEL <=", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelLike(String value) {
            addCriterion("UPDATE_USER_LABEL like", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelNotLike(String value) {
            addCriterion("UPDATE_USER_LABEL not like", value, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelIn(List<String> values) {
            addCriterion("UPDATE_USER_LABEL in", values, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelNotIn(List<String> values) {
            addCriterion("UPDATE_USER_LABEL not in", values, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_LABEL between", value1, value2, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLabelNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER_LABEL not between", value1, value2, "updateUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelIsNull() {
            addCriterion("DELETE_USER_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelIsNotNull() {
            addCriterion("DELETE_USER_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelEqualTo(String value) {
            addCriterion("DELETE_USER_LABEL =", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelNotEqualTo(String value) {
            addCriterion("DELETE_USER_LABEL <>", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelGreaterThan(String value) {
            addCriterion("DELETE_USER_LABEL >", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_USER_LABEL >=", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelLessThan(String value) {
            addCriterion("DELETE_USER_LABEL <", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelLessThanOrEqualTo(String value) {
            addCriterion("DELETE_USER_LABEL <=", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelLike(String value) {
            addCriterion("DELETE_USER_LABEL like", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelNotLike(String value) {
            addCriterion("DELETE_USER_LABEL not like", value, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelIn(List<String> values) {
            addCriterion("DELETE_USER_LABEL in", values, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelNotIn(List<String> values) {
            addCriterion("DELETE_USER_LABEL not in", values, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelBetween(String value1, String value2) {
            addCriterion("DELETE_USER_LABEL between", value1, value2, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andDeleteUserLabelNotBetween(String value1, String value2) {
            addCriterion("DELETE_USER_LABEL not between", value1, value2, "deleteUserLabel");
            return (Criteria) this;
        }

        public Criteria andRecordVersionIsNull() {
            addCriterion("RECORD_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andRecordVersionIsNotNull() {
            addCriterion("RECORD_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andRecordVersionEqualTo(Integer value) {
            addCriterion("RECORD_VERSION =", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionNotEqualTo(Integer value) {
            addCriterion("RECORD_VERSION <>", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionGreaterThan(Integer value) {
            addCriterion("RECORD_VERSION >", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("RECORD_VERSION >=", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionLessThan(Integer value) {
            addCriterion("RECORD_VERSION <", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionLessThanOrEqualTo(Integer value) {
            addCriterion("RECORD_VERSION <=", value, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionIn(List<Integer> values) {
            addCriterion("RECORD_VERSION in", values, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionNotIn(List<Integer> values) {
            addCriterion("RECORD_VERSION not in", values, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_VERSION between", value1, value2, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andRecordVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("RECORD_VERSION not between", value1, value2, "recordVersion");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNull() {
            addCriterion("TENANT_ID is null");
            return (Criteria) this;
        }

        public Criteria andTenantIdIsNotNull() {
            addCriterion("TENANT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTenantIdEqualTo(String value) {
            addCriterion("TENANT_ID =", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotEqualTo(String value) {
            addCriterion("TENANT_ID <>", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThan(String value) {
            addCriterion("TENANT_ID >", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdGreaterThanOrEqualTo(String value) {
            addCriterion("TENANT_ID >=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThan(String value) {
            addCriterion("TENANT_ID <", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLessThanOrEqualTo(String value) {
            addCriterion("TENANT_ID <=", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdLike(String value) {
            addCriterion("TENANT_ID like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotLike(String value) {
            addCriterion("TENANT_ID not like", value, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdIn(List<String> values) {
            addCriterion("TENANT_ID in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotIn(List<String> values) {
            addCriterion("TENANT_ID not in", values, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdBetween(String value1, String value2) {
            addCriterion("TENANT_ID between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andTenantIdNotBetween(String value1, String value2) {
            addCriterion("TENANT_ID not between", value1, value2, "tenantId");
            return (Criteria) this;
        }

        public Criteria andUserLabelIsNull() {
            addCriterion("USER_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andUserLabelIsNotNull() {
            addCriterion("USER_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andUserLabelEqualTo(String value) {
            addCriterion("USER_LABEL =", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotEqualTo(String value) {
            addCriterion("USER_LABEL <>", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelGreaterThan(String value) {
            addCriterion("USER_LABEL >", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelGreaterThanOrEqualTo(String value) {
            addCriterion("USER_LABEL >=", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelLessThan(String value) {
            addCriterion("USER_LABEL <", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelLessThanOrEqualTo(String value) {
            addCriterion("USER_LABEL <=", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelLike(String value) {
            addCriterion("USER_LABEL like", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotLike(String value) {
            addCriterion("USER_LABEL not like", value, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelIn(List<String> values) {
            addCriterion("USER_LABEL in", values, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotIn(List<String> values) {
            addCriterion("USER_LABEL not in", values, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelBetween(String value1, String value2) {
            addCriterion("USER_LABEL between", value1, value2, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserLabelNotBetween(String value1, String value2) {
            addCriterion("USER_LABEL not between", value1, value2, "userLabel");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("USER_PWD is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("USER_PWD is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("USER_PWD =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("USER_PWD <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("USER_PWD >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PWD >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("USER_PWD <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("USER_PWD <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("USER_PWD like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("USER_PWD not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("USER_PWD in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("USER_PWD not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("USER_PWD between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("USER_PWD not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserKindIsNull() {
            addCriterion("USER_KIND is null");
            return (Criteria) this;
        }

        public Criteria andUserKindIsNotNull() {
            addCriterion("USER_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andUserKindEqualTo(String value) {
            addCriterion("USER_KIND =", value, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindNotEqualTo(String value) {
            addCriterion("USER_KIND <>", value, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindGreaterThan(String value) {
            addCriterion("USER_KIND >", value, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindGreaterThanOrEqualTo(String value) {
            addCriterion("USER_KIND >=", value, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindLessThan(String value) {
            addCriterion("USER_KIND <", value, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindLessThanOrEqualTo(String value) {
            addCriterion("USER_KIND <=", value, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindLike(String value) {
            addCriterion("USER_KIND like", value, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindNotLike(String value) {
            addCriterion("USER_KIND not like", value, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindIn(List<String> values) {
            addCriterion("USER_KIND in", values, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindNotIn(List<String> values) {
            addCriterion("USER_KIND not in", values, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindBetween(String value1, String value2) {
            addCriterion("USER_KIND between", value1, value2, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserKindNotBetween(String value1, String value2) {
            addCriterion("USER_KIND not between", value1, value2, "userKind");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNull() {
            addCriterion("USER_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andUserSourceIsNotNull() {
            addCriterion("USER_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andUserSourceEqualTo(String value) {
            addCriterion("USER_SOURCE =", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotEqualTo(String value) {
            addCriterion("USER_SOURCE <>", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThan(String value) {
            addCriterion("USER_SOURCE >", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SOURCE >=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThan(String value) {
            addCriterion("USER_SOURCE <", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLessThanOrEqualTo(String value) {
            addCriterion("USER_SOURCE <=", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceLike(String value) {
            addCriterion("USER_SOURCE like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotLike(String value) {
            addCriterion("USER_SOURCE not like", value, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceIn(List<String> values) {
            addCriterion("USER_SOURCE in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotIn(List<String> values) {
            addCriterion("USER_SOURCE not in", values, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceBetween(String value1, String value2) {
            addCriterion("USER_SOURCE between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserSourceNotBetween(String value1, String value2) {
            addCriterion("USER_SOURCE not between", value1, value2, "userSource");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("USER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("USER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("USER_STATUS =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("USER_STATUS <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("USER_STATUS >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STATUS >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("USER_STATUS <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("USER_STATUS <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("USER_STATUS like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("USER_STATUS not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("USER_STATUS in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("USER_STATUS not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("USER_STATUS between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("USER_STATUS not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserSystemIsNull() {
            addCriterion("USER_SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andUserSystemIsNotNull() {
            addCriterion("USER_SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andUserSystemEqualTo(String value) {
            addCriterion("USER_SYSTEM =", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemNotEqualTo(String value) {
            addCriterion("USER_SYSTEM <>", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemGreaterThan(String value) {
            addCriterion("USER_SYSTEM >", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SYSTEM >=", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemLessThan(String value) {
            addCriterion("USER_SYSTEM <", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemLessThanOrEqualTo(String value) {
            addCriterion("USER_SYSTEM <=", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemLike(String value) {
            addCriterion("USER_SYSTEM like", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemNotLike(String value) {
            addCriterion("USER_SYSTEM not like", value, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemIn(List<String> values) {
            addCriterion("USER_SYSTEM in", values, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemNotIn(List<String> values) {
            addCriterion("USER_SYSTEM not in", values, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemBetween(String value1, String value2) {
            addCriterion("USER_SYSTEM between", value1, value2, "userSystem");
            return (Criteria) this;
        }

        public Criteria andUserSystemNotBetween(String value1, String value2) {
            addCriterion("USER_SYSTEM not between", value1, value2, "userSystem");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUserLevel1IsNull() {
            addCriterion("USER_LEVEL1 is null");
            return (Criteria) this;
        }

        public Criteria andUserLevel1IsNotNull() {
            addCriterion("USER_LEVEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevel1EqualTo(String value) {
            addCriterion("USER_LEVEL1 =", value, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1NotEqualTo(String value) {
            addCriterion("USER_LEVEL1 <>", value, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1GreaterThan(String value) {
            addCriterion("USER_LEVEL1 >", value, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1GreaterThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL1 >=", value, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1LessThan(String value) {
            addCriterion("USER_LEVEL1 <", value, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1LessThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL1 <=", value, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1Like(String value) {
            addCriterion("USER_LEVEL1 like", value, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1NotLike(String value) {
            addCriterion("USER_LEVEL1 not like", value, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1In(List<String> values) {
            addCriterion("USER_LEVEL1 in", values, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1NotIn(List<String> values) {
            addCriterion("USER_LEVEL1 not in", values, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1Between(String value1, String value2) {
            addCriterion("USER_LEVEL1 between", value1, value2, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel1NotBetween(String value1, String value2) {
            addCriterion("USER_LEVEL1 not between", value1, value2, "userLevel1");
            return (Criteria) this;
        }

        public Criteria andUserLevel2IsNull() {
            addCriterion("USER_LEVEL2 is null");
            return (Criteria) this;
        }

        public Criteria andUserLevel2IsNotNull() {
            addCriterion("USER_LEVEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevel2EqualTo(String value) {
            addCriterion("USER_LEVEL2 =", value, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2NotEqualTo(String value) {
            addCriterion("USER_LEVEL2 <>", value, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2GreaterThan(String value) {
            addCriterion("USER_LEVEL2 >", value, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2GreaterThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL2 >=", value, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2LessThan(String value) {
            addCriterion("USER_LEVEL2 <", value, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2LessThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL2 <=", value, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2Like(String value) {
            addCriterion("USER_LEVEL2 like", value, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2NotLike(String value) {
            addCriterion("USER_LEVEL2 not like", value, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2In(List<String> values) {
            addCriterion("USER_LEVEL2 in", values, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2NotIn(List<String> values) {
            addCriterion("USER_LEVEL2 not in", values, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2Between(String value1, String value2) {
            addCriterion("USER_LEVEL2 between", value1, value2, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel2NotBetween(String value1, String value2) {
            addCriterion("USER_LEVEL2 not between", value1, value2, "userLevel2");
            return (Criteria) this;
        }

        public Criteria andUserLevel3IsNull() {
            addCriterion("USER_LEVEL3 is null");
            return (Criteria) this;
        }

        public Criteria andUserLevel3IsNotNull() {
            addCriterion("USER_LEVEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevel3EqualTo(String value) {
            addCriterion("USER_LEVEL3 =", value, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3NotEqualTo(String value) {
            addCriterion("USER_LEVEL3 <>", value, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3GreaterThan(String value) {
            addCriterion("USER_LEVEL3 >", value, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3GreaterThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL3 >=", value, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3LessThan(String value) {
            addCriterion("USER_LEVEL3 <", value, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3LessThanOrEqualTo(String value) {
            addCriterion("USER_LEVEL3 <=", value, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3Like(String value) {
            addCriterion("USER_LEVEL3 like", value, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3NotLike(String value) {
            addCriterion("USER_LEVEL3 not like", value, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3In(List<String> values) {
            addCriterion("USER_LEVEL3 in", values, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3NotIn(List<String> values) {
            addCriterion("USER_LEVEL3 not in", values, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3Between(String value1, String value2) {
            addCriterion("USER_LEVEL3 between", value1, value2, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserLevel3NotBetween(String value1, String value2) {
            addCriterion("USER_LEVEL3 not between", value1, value2, "userLevel3");
            return (Criteria) this;
        }

        public Criteria andUserOrderIsNull() {
            addCriterion("USER_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andUserOrderIsNotNull() {
            addCriterion("USER_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andUserOrderEqualTo(Integer value) {
            addCriterion("USER_ORDER =", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotEqualTo(Integer value) {
            addCriterion("USER_ORDER <>", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderGreaterThan(Integer value) {
            addCriterion("USER_ORDER >", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ORDER >=", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderLessThan(Integer value) {
            addCriterion("USER_ORDER <", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ORDER <=", value, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderIn(List<Integer> values) {
            addCriterion("USER_ORDER in", values, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotIn(List<Integer> values) {
            addCriterion("USER_ORDER not in", values, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderBetween(Integer value1, Integer value2) {
            addCriterion("USER_ORDER between", value1, value2, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ORDER not between", value1, value2, "userOrder");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellIsNull() {
            addCriterion("USER_NAME_SPELL is null");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellIsNotNull() {
            addCriterion("USER_NAME_SPELL is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellEqualTo(String value) {
            addCriterion("USER_NAME_SPELL =", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellNotEqualTo(String value) {
            addCriterion("USER_NAME_SPELL <>", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellGreaterThan(String value) {
            addCriterion("USER_NAME_SPELL >", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME_SPELL >=", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellLessThan(String value) {
            addCriterion("USER_NAME_SPELL <", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME_SPELL <=", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellLike(String value) {
            addCriterion("USER_NAME_SPELL like", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellNotLike(String value) {
            addCriterion("USER_NAME_SPELL not like", value, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellIn(List<String> values) {
            addCriterion("USER_NAME_SPELL in", values, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellNotIn(List<String> values) {
            addCriterion("USER_NAME_SPELL not in", values, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellBetween(String value1, String value2) {
            addCriterion("USER_NAME_SPELL between", value1, value2, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameSpellNotBetween(String value1, String value2) {
            addCriterion("USER_NAME_SPELL not between", value1, value2, "userNameSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellIsNull() {
            addCriterion("USER_NAME_INITIAL_SPELL is null");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellIsNotNull() {
            addCriterion("USER_NAME_INITIAL_SPELL is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellEqualTo(String value) {
            addCriterion("USER_NAME_INITIAL_SPELL =", value, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellNotEqualTo(String value) {
            addCriterion("USER_NAME_INITIAL_SPELL <>", value, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellGreaterThan(String value) {
            addCriterion("USER_NAME_INITIAL_SPELL >", value, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME_INITIAL_SPELL >=", value, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellLessThan(String value) {
            addCriterion("USER_NAME_INITIAL_SPELL <", value, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME_INITIAL_SPELL <=", value, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellLike(String value) {
            addCriterion("USER_NAME_INITIAL_SPELL like", value, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellNotLike(String value) {
            addCriterion("USER_NAME_INITIAL_SPELL not like", value, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellIn(List<String> values) {
            addCriterion("USER_NAME_INITIAL_SPELL in", values, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellNotIn(List<String> values) {
            addCriterion("USER_NAME_INITIAL_SPELL not in", values, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellBetween(String value1, String value2) {
            addCriterion("USER_NAME_INITIAL_SPELL between", value1, value2, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andUserNameInitialSpellNotBetween(String value1, String value2) {
            addCriterion("USER_NAME_INITIAL_SPELL not between", value1, value2, "userNameInitialSpell");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameIsNull() {
            addCriterion("EVER_USED_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameIsNotNull() {
            addCriterion("EVER_USED_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameEqualTo(String value) {
            addCriterion("EVER_USED_NAME =", value, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameNotEqualTo(String value) {
            addCriterion("EVER_USED_NAME <>", value, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameGreaterThan(String value) {
            addCriterion("EVER_USED_NAME >", value, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameGreaterThanOrEqualTo(String value) {
            addCriterion("EVER_USED_NAME >=", value, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameLessThan(String value) {
            addCriterion("EVER_USED_NAME <", value, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameLessThanOrEqualTo(String value) {
            addCriterion("EVER_USED_NAME <=", value, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameLike(String value) {
            addCriterion("EVER_USED_NAME like", value, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameNotLike(String value) {
            addCriterion("EVER_USED_NAME not like", value, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameIn(List<String> values) {
            addCriterion("EVER_USED_NAME in", values, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameNotIn(List<String> values) {
            addCriterion("EVER_USED_NAME not in", values, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameBetween(String value1, String value2) {
            addCriterion("EVER_USED_NAME between", value1, value2, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andEverUsedNameNotBetween(String value1, String value2) {
            addCriterion("EVER_USED_NAME not between", value1, value2, "everUsedName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNull() {
            addCriterion("IDCARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIsNotNull() {
            addCriterion("IDCARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardNoEqualTo(String value) {
            addCriterion("IDCARD_NO =", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotEqualTo(String value) {
            addCriterion("IDCARD_NO <>", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThan(String value) {
            addCriterion("IDCARD_NO >", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD_NO >=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThan(String value) {
            addCriterion("IDCARD_NO <", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLessThanOrEqualTo(String value) {
            addCriterion("IDCARD_NO <=", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoLike(String value) {
            addCriterion("IDCARD_NO like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotLike(String value) {
            addCriterion("IDCARD_NO not like", value, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoIn(List<String> values) {
            addCriterion("IDCARD_NO in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotIn(List<String> values) {
            addCriterion("IDCARD_NO not in", values, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoBetween(String value1, String value2) {
            addCriterion("IDCARD_NO between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardNoNotBetween(String value1, String value2) {
            addCriterion("IDCARD_NO not between", value1, value2, "idcardNo");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIsNull() {
            addCriterion("IDCARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIsNotNull() {
            addCriterion("IDCARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeEqualTo(String value) {
            addCriterion("IDCARD_TYPE =", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeNotEqualTo(String value) {
            addCriterion("IDCARD_TYPE <>", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeGreaterThan(String value) {
            addCriterion("IDCARD_TYPE >", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARD_TYPE >=", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeLessThan(String value) {
            addCriterion("IDCARD_TYPE <", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeLessThanOrEqualTo(String value) {
            addCriterion("IDCARD_TYPE <=", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeLike(String value) {
            addCriterion("IDCARD_TYPE like", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeNotLike(String value) {
            addCriterion("IDCARD_TYPE not like", value, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeIn(List<String> values) {
            addCriterion("IDCARD_TYPE in", values, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeNotIn(List<String> values) {
            addCriterion("IDCARD_TYPE not in", values, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeBetween(String value1, String value2) {
            addCriterion("IDCARD_TYPE between", value1, value2, "idcardType");
            return (Criteria) this;
        }

        public Criteria andIdcardTypeNotBetween(String value1, String value2) {
            addCriterion("IDCARD_TYPE not between", value1, value2, "idcardType");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("NATION is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("NATION is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("NATION =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("NATION <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("NATION >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("NATION >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("NATION <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("NATION <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("NATION like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("NATION not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("NATION in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("NATION not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("NATION between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("NATION not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNull() {
            addCriterion("NATIVE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIsNotNull() {
            addCriterion("NATIVE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andNativePlaceEqualTo(String value) {
            addCriterion("NATIVE_PLACE =", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotEqualTo(String value) {
            addCriterion("NATIVE_PLACE <>", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThan(String value) {
            addCriterion("NATIVE_PLACE >", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("NATIVE_PLACE >=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThan(String value) {
            addCriterion("NATIVE_PLACE <", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLessThanOrEqualTo(String value) {
            addCriterion("NATIVE_PLACE <=", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceLike(String value) {
            addCriterion("NATIVE_PLACE like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotLike(String value) {
            addCriterion("NATIVE_PLACE not like", value, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceIn(List<String> values) {
            addCriterion("NATIVE_PLACE in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotIn(List<String> values) {
            addCriterion("NATIVE_PLACE not in", values, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceBetween(String value1, String value2) {
            addCriterion("NATIVE_PLACE between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andNativePlaceNotBetween(String value1, String value2) {
            addCriterion("NATIVE_PLACE not between", value1, value2, "nativePlace");
            return (Criteria) this;
        }

        public Criteria andPartyIsNull() {
            addCriterion("PARTY is null");
            return (Criteria) this;
        }

        public Criteria andPartyIsNotNull() {
            addCriterion("PARTY is not null");
            return (Criteria) this;
        }

        public Criteria andPartyEqualTo(String value) {
            addCriterion("PARTY =", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotEqualTo(String value) {
            addCriterion("PARTY <>", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThan(String value) {
            addCriterion("PARTY >", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyGreaterThanOrEqualTo(String value) {
            addCriterion("PARTY >=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThan(String value) {
            addCriterion("PARTY <", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLessThanOrEqualTo(String value) {
            addCriterion("PARTY <=", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyLike(String value) {
            addCriterion("PARTY like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotLike(String value) {
            addCriterion("PARTY not like", value, "party");
            return (Criteria) this;
        }

        public Criteria andPartyIn(List<String> values) {
            addCriterion("PARTY in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotIn(List<String> values) {
            addCriterion("PARTY not in", values, "party");
            return (Criteria) this;
        }

        public Criteria andPartyBetween(String value1, String value2) {
            addCriterion("PARTY between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andPartyNotBetween(String value1, String value2) {
            addCriterion("PARTY not between", value1, value2, "party");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIsNull() {
            addCriterion("WORK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIsNotNull() {
            addCriterion("WORK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStatusEqualTo(String value) {
            addCriterion("WORK_STATUS =", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotEqualTo(String value) {
            addCriterion("WORK_STATUS <>", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusGreaterThan(String value) {
            addCriterion("WORK_STATUS >", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_STATUS >=", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusLessThan(String value) {
            addCriterion("WORK_STATUS <", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusLessThanOrEqualTo(String value) {
            addCriterion("WORK_STATUS <=", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusLike(String value) {
            addCriterion("WORK_STATUS like", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotLike(String value) {
            addCriterion("WORK_STATUS not like", value, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusIn(List<String> values) {
            addCriterion("WORK_STATUS in", values, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotIn(List<String> values) {
            addCriterion("WORK_STATUS not in", values, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusBetween(String value1, String value2) {
            addCriterion("WORK_STATUS between", value1, value2, "workStatus");
            return (Criteria) this;
        }

        public Criteria andWorkStatusNotBetween(String value1, String value2) {
            addCriterion("WORK_STATUS not between", value1, value2, "workStatus");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateIsNull() {
            addCriterion("JOIN_COMPANY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateIsNotNull() {
            addCriterion("JOIN_COMPANY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateEqualTo(String value) {
            addCriterion("JOIN_COMPANY_DATE =", value, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateNotEqualTo(String value) {
            addCriterion("JOIN_COMPANY_DATE <>", value, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateGreaterThan(String value) {
            addCriterion("JOIN_COMPANY_DATE >", value, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateGreaterThanOrEqualTo(String value) {
            addCriterion("JOIN_COMPANY_DATE >=", value, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateLessThan(String value) {
            addCriterion("JOIN_COMPANY_DATE <", value, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateLessThanOrEqualTo(String value) {
            addCriterion("JOIN_COMPANY_DATE <=", value, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateLike(String value) {
            addCriterion("JOIN_COMPANY_DATE like", value, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateNotLike(String value) {
            addCriterion("JOIN_COMPANY_DATE not like", value, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateIn(List<String> values) {
            addCriterion("JOIN_COMPANY_DATE in", values, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateNotIn(List<String> values) {
            addCriterion("JOIN_COMPANY_DATE not in", values, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateBetween(String value1, String value2) {
            addCriterion("JOIN_COMPANY_DATE between", value1, value2, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andJoinCompanyDateNotBetween(String value1, String value2) {
            addCriterion("JOIN_COMPANY_DATE not between", value1, value2, "joinCompanyDate");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNull() {
            addCriterion("COMPANY_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNotNull() {
            addCriterion("COMPANY_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelEqualTo(String value) {
            addCriterion("COMPANY_TEL =", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotEqualTo(String value) {
            addCriterion("COMPANY_TEL <>", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThan(String value) {
            addCriterion("COMPANY_TEL >", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY_TEL >=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThan(String value) {
            addCriterion("COMPANY_TEL <", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThanOrEqualTo(String value) {
            addCriterion("COMPANY_TEL <=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLike(String value) {
            addCriterion("COMPANY_TEL like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotLike(String value) {
            addCriterion("COMPANY_TEL not like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIn(List<String> values) {
            addCriterion("COMPANY_TEL in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotIn(List<String> values) {
            addCriterion("COMPANY_TEL not in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelBetween(String value1, String value2) {
            addCriterion("COMPANY_TEL between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotBetween(String value1, String value2) {
            addCriterion("COMPANY_TEL not between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIsNull() {
            addCriterion("OFFICE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIsNotNull() {
            addCriterion("OFFICE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS =", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS <>", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressGreaterThan(String value) {
            addCriterion("OFFICE_ADDRESS >", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS >=", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressLessThan(String value) {
            addCriterion("OFFICE_ADDRESS <", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_ADDRESS <=", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressLike(String value) {
            addCriterion("OFFICE_ADDRESS like", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotLike(String value) {
            addCriterion("OFFICE_ADDRESS not like", value, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressIn(List<String> values) {
            addCriterion("OFFICE_ADDRESS in", values, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotIn(List<String> values) {
            addCriterion("OFFICE_ADDRESS not in", values, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressBetween(String value1, String value2) {
            addCriterion("OFFICE_ADDRESS between", value1, value2, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andOfficeAddressNotBetween(String value1, String value2) {
            addCriterion("OFFICE_ADDRESS not between", value1, value2, "officeAddress");
            return (Criteria) this;
        }

        public Criteria andDirectTelIsNull() {
            addCriterion("DIRECT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andDirectTelIsNotNull() {
            addCriterion("DIRECT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andDirectTelEqualTo(String value) {
            addCriterion("DIRECT_TEL =", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelNotEqualTo(String value) {
            addCriterion("DIRECT_TEL <>", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelGreaterThan(String value) {
            addCriterion("DIRECT_TEL >", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelGreaterThanOrEqualTo(String value) {
            addCriterion("DIRECT_TEL >=", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelLessThan(String value) {
            addCriterion("DIRECT_TEL <", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelLessThanOrEqualTo(String value) {
            addCriterion("DIRECT_TEL <=", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelLike(String value) {
            addCriterion("DIRECT_TEL like", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelNotLike(String value) {
            addCriterion("DIRECT_TEL not like", value, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelIn(List<String> values) {
            addCriterion("DIRECT_TEL in", values, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelNotIn(List<String> values) {
            addCriterion("DIRECT_TEL not in", values, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelBetween(String value1, String value2) {
            addCriterion("DIRECT_TEL between", value1, value2, "directTel");
            return (Criteria) this;
        }

        public Criteria andDirectTelNotBetween(String value1, String value2) {
            addCriterion("DIRECT_TEL not between", value1, value2, "directTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIsNull() {
            addCriterion("OFFICE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIsNotNull() {
            addCriterion("OFFICE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeTelEqualTo(String value) {
            addCriterion("OFFICE_TEL =", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotEqualTo(String value) {
            addCriterion("OFFICE_TEL <>", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelGreaterThan(String value) {
            addCriterion("OFFICE_TEL >", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelGreaterThanOrEqualTo(String value) {
            addCriterion("OFFICE_TEL >=", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLessThan(String value) {
            addCriterion("OFFICE_TEL <", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLessThanOrEqualTo(String value) {
            addCriterion("OFFICE_TEL <=", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelLike(String value) {
            addCriterion("OFFICE_TEL like", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotLike(String value) {
            addCriterion("OFFICE_TEL not like", value, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelIn(List<String> values) {
            addCriterion("OFFICE_TEL in", values, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotIn(List<String> values) {
            addCriterion("OFFICE_TEL not in", values, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelBetween(String value1, String value2) {
            addCriterion("OFFICE_TEL between", value1, value2, "officeTel");
            return (Criteria) this;
        }

        public Criteria andOfficeTelNotBetween(String value1, String value2) {
            addCriterion("OFFICE_TEL not between", value1, value2, "officeTel");
            return (Criteria) this;
        }

        public Criteria andUserVersionIsNull() {
            addCriterion("USER_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andUserVersionIsNotNull() {
            addCriterion("USER_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andUserVersionEqualTo(Integer value) {
            addCriterion("USER_VERSION =", value, "userVersion");
            return (Criteria) this;
        }

        public Criteria andUserVersionNotEqualTo(Integer value) {
            addCriterion("USER_VERSION <>", value, "userVersion");
            return (Criteria) this;
        }

        public Criteria andUserVersionGreaterThan(Integer value) {
            addCriterion("USER_VERSION >", value, "userVersion");
            return (Criteria) this;
        }

        public Criteria andUserVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_VERSION >=", value, "userVersion");
            return (Criteria) this;
        }

        public Criteria andUserVersionLessThan(Integer value) {
            addCriterion("USER_VERSION <", value, "userVersion");
            return (Criteria) this;
        }

        public Criteria andUserVersionLessThanOrEqualTo(Integer value) {
            addCriterion("USER_VERSION <=", value, "userVersion");
            return (Criteria) this;
        }

        public Criteria andUserVersionIn(List<Integer> values) {
            addCriterion("USER_VERSION in", values, "userVersion");
            return (Criteria) this;
        }

        public Criteria andUserVersionNotIn(List<Integer> values) {
            addCriterion("USER_VERSION not in", values, "userVersion");
            return (Criteria) this;
        }

        public Criteria andUserVersionBetween(Integer value1, Integer value2) {
            addCriterion("USER_VERSION between", value1, value2, "userVersion");
            return (Criteria) this;
        }

        public Criteria andUserVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_VERSION not between", value1, value2, "userVersion");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNull() {
            addCriterion("ORG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIsNotNull() {
            addCriterion("ORG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCodeEqualTo(String value) {
            addCriterion("ORG_CODE =", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotEqualTo(String value) {
            addCriterion("ORG_CODE <>", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThan(String value) {
            addCriterion("ORG_CODE >", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CODE >=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThan(String value) {
            addCriterion("ORG_CODE <", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLessThanOrEqualTo(String value) {
            addCriterion("ORG_CODE <=", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeLike(String value) {
            addCriterion("ORG_CODE like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotLike(String value) {
            addCriterion("ORG_CODE not like", value, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeIn(List<String> values) {
            addCriterion("ORG_CODE in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotIn(List<String> values) {
            addCriterion("ORG_CODE not in", values, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeBetween(String value1, String value2) {
            addCriterion("ORG_CODE between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgCodeNotBetween(String value1, String value2) {
            addCriterion("ORG_CODE not between", value1, value2, "orgCode");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("POST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("POST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("POST_CODE =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("POST_CODE <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("POST_CODE >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("POST_CODE >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("POST_CODE <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("POST_CODE <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("POST_CODE like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("POST_CODE not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("POST_CODE in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("POST_CODE not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("POST_CODE between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("POST_CODE not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNull() {
            addCriterion("POST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPostNameIsNotNull() {
            addCriterion("POST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPostNameEqualTo(String value) {
            addCriterion("POST_NAME =", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotEqualTo(String value) {
            addCriterion("POST_NAME <>", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThan(String value) {
            addCriterion("POST_NAME >", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameGreaterThanOrEqualTo(String value) {
            addCriterion("POST_NAME >=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThan(String value) {
            addCriterion("POST_NAME <", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLessThanOrEqualTo(String value) {
            addCriterion("POST_NAME <=", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameLike(String value) {
            addCriterion("POST_NAME like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotLike(String value) {
            addCriterion("POST_NAME not like", value, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameIn(List<String> values) {
            addCriterion("POST_NAME in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotIn(List<String> values) {
            addCriterion("POST_NAME not in", values, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameBetween(String value1, String value2) {
            addCriterion("POST_NAME between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andPostNameNotBetween(String value1, String value2) {
            addCriterion("POST_NAME not between", value1, value2, "postName");
            return (Criteria) this;
        }

        public Criteria andPostGroupIsNull() {
            addCriterion("POST_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPostGroupIsNotNull() {
            addCriterion("POST_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPostGroupEqualTo(String value) {
            addCriterion("POST_GROUP =", value, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupNotEqualTo(String value) {
            addCriterion("POST_GROUP <>", value, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupGreaterThan(String value) {
            addCriterion("POST_GROUP >", value, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupGreaterThanOrEqualTo(String value) {
            addCriterion("POST_GROUP >=", value, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupLessThan(String value) {
            addCriterion("POST_GROUP <", value, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupLessThanOrEqualTo(String value) {
            addCriterion("POST_GROUP <=", value, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupLike(String value) {
            addCriterion("POST_GROUP like", value, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupNotLike(String value) {
            addCriterion("POST_GROUP not like", value, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupIn(List<String> values) {
            addCriterion("POST_GROUP in", values, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupNotIn(List<String> values) {
            addCriterion("POST_GROUP not in", values, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupBetween(String value1, String value2) {
            addCriterion("POST_GROUP between", value1, value2, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostGroupNotBetween(String value1, String value2) {
            addCriterion("POST_GROUP not between", value1, value2, "postGroup");
            return (Criteria) this;
        }

        public Criteria andPostZzIsNull() {
            addCriterion("POST_ZZ is null");
            return (Criteria) this;
        }

        public Criteria andPostZzIsNotNull() {
            addCriterion("POST_ZZ is not null");
            return (Criteria) this;
        }

        public Criteria andPostZzEqualTo(String value) {
            addCriterion("POST_ZZ =", value, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzNotEqualTo(String value) {
            addCriterion("POST_ZZ <>", value, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzGreaterThan(String value) {
            addCriterion("POST_ZZ >", value, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzGreaterThanOrEqualTo(String value) {
            addCriterion("POST_ZZ >=", value, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzLessThan(String value) {
            addCriterion("POST_ZZ <", value, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzLessThanOrEqualTo(String value) {
            addCriterion("POST_ZZ <=", value, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzLike(String value) {
            addCriterion("POST_ZZ like", value, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzNotLike(String value) {
            addCriterion("POST_ZZ not like", value, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzIn(List<String> values) {
            addCriterion("POST_ZZ in", values, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzNotIn(List<String> values) {
            addCriterion("POST_ZZ not in", values, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzBetween(String value1, String value2) {
            addCriterion("POST_ZZ between", value1, value2, "postZz");
            return (Criteria) this;
        }

        public Criteria andPostZzNotBetween(String value1, String value2) {
            addCriterion("POST_ZZ not between", value1, value2, "postZz");
            return (Criteria) this;
        }

        public Criteria andExtra1IsNull() {
            addCriterion("EXTRA1 is null");
            return (Criteria) this;
        }

        public Criteria andExtra1IsNotNull() {
            addCriterion("EXTRA1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra1EqualTo(String value) {
            addCriterion("EXTRA1 =", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotEqualTo(String value) {
            addCriterion("EXTRA1 <>", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1GreaterThan(String value) {
            addCriterion("EXTRA1 >", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA1 >=", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1LessThan(String value) {
            addCriterion("EXTRA1 <", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1LessThanOrEqualTo(String value) {
            addCriterion("EXTRA1 <=", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1Like(String value) {
            addCriterion("EXTRA1 like", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotLike(String value) {
            addCriterion("EXTRA1 not like", value, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1In(List<String> values) {
            addCriterion("EXTRA1 in", values, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotIn(List<String> values) {
            addCriterion("EXTRA1 not in", values, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1Between(String value1, String value2) {
            addCriterion("EXTRA1 between", value1, value2, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra1NotBetween(String value1, String value2) {
            addCriterion("EXTRA1 not between", value1, value2, "extra1");
            return (Criteria) this;
        }

        public Criteria andExtra2IsNull() {
            addCriterion("EXTRA2 is null");
            return (Criteria) this;
        }

        public Criteria andExtra2IsNotNull() {
            addCriterion("EXTRA2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra2EqualTo(String value) {
            addCriterion("EXTRA2 =", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotEqualTo(String value) {
            addCriterion("EXTRA2 <>", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2GreaterThan(String value) {
            addCriterion("EXTRA2 >", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA2 >=", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2LessThan(String value) {
            addCriterion("EXTRA2 <", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2LessThanOrEqualTo(String value) {
            addCriterion("EXTRA2 <=", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2Like(String value) {
            addCriterion("EXTRA2 like", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotLike(String value) {
            addCriterion("EXTRA2 not like", value, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2In(List<String> values) {
            addCriterion("EXTRA2 in", values, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotIn(List<String> values) {
            addCriterion("EXTRA2 not in", values, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2Between(String value1, String value2) {
            addCriterion("EXTRA2 between", value1, value2, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra2NotBetween(String value1, String value2) {
            addCriterion("EXTRA2 not between", value1, value2, "extra2");
            return (Criteria) this;
        }

        public Criteria andExtra3IsNull() {
            addCriterion("EXTRA3 is null");
            return (Criteria) this;
        }

        public Criteria andExtra3IsNotNull() {
            addCriterion("EXTRA3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra3EqualTo(String value) {
            addCriterion("EXTRA3 =", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotEqualTo(String value) {
            addCriterion("EXTRA3 <>", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3GreaterThan(String value) {
            addCriterion("EXTRA3 >", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA3 >=", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3LessThan(String value) {
            addCriterion("EXTRA3 <", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3LessThanOrEqualTo(String value) {
            addCriterion("EXTRA3 <=", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3Like(String value) {
            addCriterion("EXTRA3 like", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotLike(String value) {
            addCriterion("EXTRA3 not like", value, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3In(List<String> values) {
            addCriterion("EXTRA3 in", values, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotIn(List<String> values) {
            addCriterion("EXTRA3 not in", values, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3Between(String value1, String value2) {
            addCriterion("EXTRA3 between", value1, value2, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra3NotBetween(String value1, String value2) {
            addCriterion("EXTRA3 not between", value1, value2, "extra3");
            return (Criteria) this;
        }

        public Criteria andExtra4IsNull() {
            addCriterion("EXTRA4 is null");
            return (Criteria) this;
        }

        public Criteria andExtra4IsNotNull() {
            addCriterion("EXTRA4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra4EqualTo(String value) {
            addCriterion("EXTRA4 =", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotEqualTo(String value) {
            addCriterion("EXTRA4 <>", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4GreaterThan(String value) {
            addCriterion("EXTRA4 >", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA4 >=", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4LessThan(String value) {
            addCriterion("EXTRA4 <", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4LessThanOrEqualTo(String value) {
            addCriterion("EXTRA4 <=", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4Like(String value) {
            addCriterion("EXTRA4 like", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotLike(String value) {
            addCriterion("EXTRA4 not like", value, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4In(List<String> values) {
            addCriterion("EXTRA4 in", values, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotIn(List<String> values) {
            addCriterion("EXTRA4 not in", values, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4Between(String value1, String value2) {
            addCriterion("EXTRA4 between", value1, value2, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra4NotBetween(String value1, String value2) {
            addCriterion("EXTRA4 not between", value1, value2, "extra4");
            return (Criteria) this;
        }

        public Criteria andExtra5IsNull() {
            addCriterion("EXTRA5 is null");
            return (Criteria) this;
        }

        public Criteria andExtra5IsNotNull() {
            addCriterion("EXTRA5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra5EqualTo(String value) {
            addCriterion("EXTRA5 =", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5NotEqualTo(String value) {
            addCriterion("EXTRA5 <>", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5GreaterThan(String value) {
            addCriterion("EXTRA5 >", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA5 >=", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5LessThan(String value) {
            addCriterion("EXTRA5 <", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5LessThanOrEqualTo(String value) {
            addCriterion("EXTRA5 <=", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5Like(String value) {
            addCriterion("EXTRA5 like", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5NotLike(String value) {
            addCriterion("EXTRA5 not like", value, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5In(List<String> values) {
            addCriterion("EXTRA5 in", values, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5NotIn(List<String> values) {
            addCriterion("EXTRA5 not in", values, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5Between(String value1, String value2) {
            addCriterion("EXTRA5 between", value1, value2, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra5NotBetween(String value1, String value2) {
            addCriterion("EXTRA5 not between", value1, value2, "extra5");
            return (Criteria) this;
        }

        public Criteria andExtra6IsNull() {
            addCriterion("EXTRA6 is null");
            return (Criteria) this;
        }

        public Criteria andExtra6IsNotNull() {
            addCriterion("EXTRA6 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra6EqualTo(String value) {
            addCriterion("EXTRA6 =", value, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6NotEqualTo(String value) {
            addCriterion("EXTRA6 <>", value, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6GreaterThan(String value) {
            addCriterion("EXTRA6 >", value, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA6 >=", value, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6LessThan(String value) {
            addCriterion("EXTRA6 <", value, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6LessThanOrEqualTo(String value) {
            addCriterion("EXTRA6 <=", value, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6Like(String value) {
            addCriterion("EXTRA6 like", value, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6NotLike(String value) {
            addCriterion("EXTRA6 not like", value, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6In(List<String> values) {
            addCriterion("EXTRA6 in", values, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6NotIn(List<String> values) {
            addCriterion("EXTRA6 not in", values, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6Between(String value1, String value2) {
            addCriterion("EXTRA6 between", value1, value2, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra6NotBetween(String value1, String value2) {
            addCriterion("EXTRA6 not between", value1, value2, "extra6");
            return (Criteria) this;
        }

        public Criteria andExtra7IsNull() {
            addCriterion("EXTRA7 is null");
            return (Criteria) this;
        }

        public Criteria andExtra7IsNotNull() {
            addCriterion("EXTRA7 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra7EqualTo(String value) {
            addCriterion("EXTRA7 =", value, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7NotEqualTo(String value) {
            addCriterion("EXTRA7 <>", value, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7GreaterThan(String value) {
            addCriterion("EXTRA7 >", value, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA7 >=", value, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7LessThan(String value) {
            addCriterion("EXTRA7 <", value, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7LessThanOrEqualTo(String value) {
            addCriterion("EXTRA7 <=", value, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7Like(String value) {
            addCriterion("EXTRA7 like", value, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7NotLike(String value) {
            addCriterion("EXTRA7 not like", value, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7In(List<String> values) {
            addCriterion("EXTRA7 in", values, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7NotIn(List<String> values) {
            addCriterion("EXTRA7 not in", values, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7Between(String value1, String value2) {
            addCriterion("EXTRA7 between", value1, value2, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra7NotBetween(String value1, String value2) {
            addCriterion("EXTRA7 not between", value1, value2, "extra7");
            return (Criteria) this;
        }

        public Criteria andExtra8IsNull() {
            addCriterion("EXTRA8 is null");
            return (Criteria) this;
        }

        public Criteria andExtra8IsNotNull() {
            addCriterion("EXTRA8 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra8EqualTo(String value) {
            addCriterion("EXTRA8 =", value, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8NotEqualTo(String value) {
            addCriterion("EXTRA8 <>", value, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8GreaterThan(String value) {
            addCriterion("EXTRA8 >", value, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA8 >=", value, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8LessThan(String value) {
            addCriterion("EXTRA8 <", value, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8LessThanOrEqualTo(String value) {
            addCriterion("EXTRA8 <=", value, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8Like(String value) {
            addCriterion("EXTRA8 like", value, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8NotLike(String value) {
            addCriterion("EXTRA8 not like", value, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8In(List<String> values) {
            addCriterion("EXTRA8 in", values, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8NotIn(List<String> values) {
            addCriterion("EXTRA8 not in", values, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8Between(String value1, String value2) {
            addCriterion("EXTRA8 between", value1, value2, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra8NotBetween(String value1, String value2) {
            addCriterion("EXTRA8 not between", value1, value2, "extra8");
            return (Criteria) this;
        }

        public Criteria andExtra9IsNull() {
            addCriterion("EXTRA9 is null");
            return (Criteria) this;
        }

        public Criteria andExtra9IsNotNull() {
            addCriterion("EXTRA9 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra9EqualTo(String value) {
            addCriterion("EXTRA9 =", value, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9NotEqualTo(String value) {
            addCriterion("EXTRA9 <>", value, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9GreaterThan(String value) {
            addCriterion("EXTRA9 >", value, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA9 >=", value, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9LessThan(String value) {
            addCriterion("EXTRA9 <", value, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9LessThanOrEqualTo(String value) {
            addCriterion("EXTRA9 <=", value, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9Like(String value) {
            addCriterion("EXTRA9 like", value, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9NotLike(String value) {
            addCriterion("EXTRA9 not like", value, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9In(List<String> values) {
            addCriterion("EXTRA9 in", values, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9NotIn(List<String> values) {
            addCriterion("EXTRA9 not in", values, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9Between(String value1, String value2) {
            addCriterion("EXTRA9 between", value1, value2, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra9NotBetween(String value1, String value2) {
            addCriterion("EXTRA9 not between", value1, value2, "extra9");
            return (Criteria) this;
        }

        public Criteria andExtra10IsNull() {
            addCriterion("EXTRA10 is null");
            return (Criteria) this;
        }

        public Criteria andExtra10IsNotNull() {
            addCriterion("EXTRA10 is not null");
            return (Criteria) this;
        }

        public Criteria andExtra10EqualTo(String value) {
            addCriterion("EXTRA10 =", value, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10NotEqualTo(String value) {
            addCriterion("EXTRA10 <>", value, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10GreaterThan(String value) {
            addCriterion("EXTRA10 >", value, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRA10 >=", value, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10LessThan(String value) {
            addCriterion("EXTRA10 <", value, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10LessThanOrEqualTo(String value) {
            addCriterion("EXTRA10 <=", value, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10Like(String value) {
            addCriterion("EXTRA10 like", value, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10NotLike(String value) {
            addCriterion("EXTRA10 not like", value, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10In(List<String> values) {
            addCriterion("EXTRA10 in", values, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10NotIn(List<String> values) {
            addCriterion("EXTRA10 not in", values, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10Between(String value1, String value2) {
            addCriterion("EXTRA10 between", value1, value2, "extra10");
            return (Criteria) this;
        }

        public Criteria andExtra10NotBetween(String value1, String value2) {
            addCriterion("EXTRA10 not between", value1, value2, "extra10");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：t_uoad_user
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 用户表
     * Criterion
     * 数据库表：t_uoad_user
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