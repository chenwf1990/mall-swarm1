package com.macro.mall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UmsMemberRuleSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsMemberRuleSettingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayIsNull() {
            addCriterion("continue_sign_day is null");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayIsNotNull() {
            addCriterion("continue_sign_day is not null");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayEqualTo(Integer value) {
            addCriterion("continue_sign_day =", value, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayNotEqualTo(Integer value) {
            addCriterion("continue_sign_day <>", value, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayGreaterThan(Integer value) {
            addCriterion("continue_sign_day >", value, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("continue_sign_day >=", value, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayLessThan(Integer value) {
            addCriterion("continue_sign_day <", value, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayLessThanOrEqualTo(Integer value) {
            addCriterion("continue_sign_day <=", value, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayIn(List<Integer> values) {
            addCriterion("continue_sign_day in", values, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayNotIn(List<Integer> values) {
            addCriterion("continue_sign_day not in", values, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayBetween(Integer value1, Integer value2) {
            addCriterion("continue_sign_day between", value1, value2, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignDayNotBetween(Integer value1, Integer value2) {
            addCriterion("continue_sign_day not between", value1, value2, "continueSignDay");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointIsNull() {
            addCriterion("continue_sign_point is null");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointIsNotNull() {
            addCriterion("continue_sign_point is not null");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointEqualTo(Integer value) {
            addCriterion("continue_sign_point =", value, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointNotEqualTo(Integer value) {
            addCriterion("continue_sign_point <>", value, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointGreaterThan(Integer value) {
            addCriterion("continue_sign_point >", value, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("continue_sign_point >=", value, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointLessThan(Integer value) {
            addCriterion("continue_sign_point <", value, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointLessThanOrEqualTo(Integer value) {
            addCriterion("continue_sign_point <=", value, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointIn(List<Integer> values) {
            addCriterion("continue_sign_point in", values, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointNotIn(List<Integer> values) {
            addCriterion("continue_sign_point not in", values, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointBetween(Integer value1, Integer value2) {
            addCriterion("continue_sign_point between", value1, value2, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andContinueSignPointNotBetween(Integer value1, Integer value2) {
            addCriterion("continue_sign_point not between", value1, value2, "continueSignPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointIsNull() {
            addCriterion("consume_per_point is null");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointIsNotNull() {
            addCriterion("consume_per_point is not null");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointEqualTo(BigDecimal value) {
            addCriterion("consume_per_point =", value, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointNotEqualTo(BigDecimal value) {
            addCriterion("consume_per_point <>", value, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointGreaterThan(BigDecimal value) {
            addCriterion("consume_per_point >", value, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("consume_per_point >=", value, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointLessThan(BigDecimal value) {
            addCriterion("consume_per_point <", value, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("consume_per_point <=", value, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointIn(List<BigDecimal> values) {
            addCriterion("consume_per_point in", values, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointNotIn(List<BigDecimal> values) {
            addCriterion("consume_per_point not in", values, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume_per_point between", value1, value2, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andConsumePerPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("consume_per_point not between", value1, value2, "consumePerPoint");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountIsNull() {
            addCriterion("low_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountIsNotNull() {
            addCriterion("low_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountEqualTo(BigDecimal value) {
            addCriterion("low_order_amount =", value, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("low_order_amount <>", value, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("low_order_amount >", value, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("low_order_amount >=", value, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountLessThan(BigDecimal value) {
            addCriterion("low_order_amount <", value, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("low_order_amount <=", value, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountIn(List<BigDecimal> values) {
            addCriterion("low_order_amount in", values, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("low_order_amount not in", values, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_order_amount between", value1, value2, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andLowOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("low_order_amount not between", value1, value2, "lowOrderAmount");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderIsNull() {
            addCriterion("max_point_per_order is null");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderIsNotNull() {
            addCriterion("max_point_per_order is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderEqualTo(Integer value) {
            addCriterion("max_point_per_order =", value, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderNotEqualTo(Integer value) {
            addCriterion("max_point_per_order <>", value, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderGreaterThan(Integer value) {
            addCriterion("max_point_per_order >", value, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_point_per_order >=", value, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderLessThan(Integer value) {
            addCriterion("max_point_per_order <", value, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderLessThanOrEqualTo(Integer value) {
            addCriterion("max_point_per_order <=", value, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderIn(List<Integer> values) {
            addCriterion("max_point_per_order in", values, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderNotIn(List<Integer> values) {
            addCriterion("max_point_per_order not in", values, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderBetween(Integer value1, Integer value2) {
            addCriterion("max_point_per_order between", value1, value2, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andMaxPointPerOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("max_point_per_order not between", value1, value2, "maxPointPerOrder");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNull() {
            addCriterion("delete_status is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIsNotNull() {
            addCriterion("delete_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusEqualTo(Integer value) {
            addCriterion("delete_status =", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotEqualTo(Integer value) {
            addCriterion("delete_status <>", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThan(Integer value) {
            addCriterion("delete_status >", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_status >=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThan(Integer value) {
            addCriterion("delete_status <", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("delete_status <=", value, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusIn(List<Integer> values) {
            addCriterion("delete_status in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotIn(List<Integer> values) {
            addCriterion("delete_status not in", values, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusBetween(Integer value1, Integer value2) {
            addCriterion("delete_status between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }

        public Criteria andDeleteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_status not between", value1, value2, "deleteStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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