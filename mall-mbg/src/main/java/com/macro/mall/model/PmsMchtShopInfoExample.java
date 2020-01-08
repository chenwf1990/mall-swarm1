package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PmsMchtShopInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsMchtShopInfoExample() {
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

        public Criteria andMchtIdIsNull() {
            addCriterion("mcht_id is null");
            return (Criteria) this;
        }

        public Criteria andMchtIdIsNotNull() {
            addCriterion("mcht_id is not null");
            return (Criteria) this;
        }

        public Criteria andMchtIdEqualTo(Long value) {
            addCriterion("mcht_id =", value, "mchtId");
            return (Criteria) this;
        }

        public Criteria andMchtIdNotEqualTo(Long value) {
            addCriterion("mcht_id <>", value, "mchtId");
            return (Criteria) this;
        }

        public Criteria andMchtIdGreaterThan(Long value) {
            addCriterion("mcht_id >", value, "mchtId");
            return (Criteria) this;
        }

        public Criteria andMchtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mcht_id >=", value, "mchtId");
            return (Criteria) this;
        }

        public Criteria andMchtIdLessThan(Long value) {
            addCriterion("mcht_id <", value, "mchtId");
            return (Criteria) this;
        }

        public Criteria andMchtIdLessThanOrEqualTo(Long value) {
            addCriterion("mcht_id <=", value, "mchtId");
            return (Criteria) this;
        }

        public Criteria andMchtIdIn(List<Long> values) {
            addCriterion("mcht_id in", values, "mchtId");
            return (Criteria) this;
        }

        public Criteria andMchtIdNotIn(List<Long> values) {
            addCriterion("mcht_id not in", values, "mchtId");
            return (Criteria) this;
        }

        public Criteria andMchtIdBetween(Long value1, Long value2) {
            addCriterion("mcht_id between", value1, value2, "mchtId");
            return (Criteria) this;
        }

        public Criteria andMchtIdNotBetween(Long value1, Long value2) {
            addCriterion("mcht_id not between", value1, value2, "mchtId");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(String value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(String value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(String value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(String value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(String value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLike(String value) {
            addCriterion("shop_type like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotLike(String value) {
            addCriterion("shop_type not like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<String> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<String> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(String value1, String value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(String value1, String value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIsNull() {
            addCriterion("main_category is null");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIsNotNull() {
            addCriterion("main_category is not null");
            return (Criteria) this;
        }

        public Criteria andMainCategoryEqualTo(Long value) {
            addCriterion("main_category =", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotEqualTo(Long value) {
            addCriterion("main_category <>", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryGreaterThan(Long value) {
            addCriterion("main_category >", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryGreaterThanOrEqualTo(Long value) {
            addCriterion("main_category >=", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryLessThan(Long value) {
            addCriterion("main_category <", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryLessThanOrEqualTo(Long value) {
            addCriterion("main_category <=", value, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryIn(List<Long> values) {
            addCriterion("main_category in", values, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotIn(List<Long> values) {
            addCriterion("main_category not in", values, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryBetween(Long value1, Long value2) {
            addCriterion("main_category between", value1, value2, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andMainCategoryNotBetween(Long value1, Long value2) {
            addCriterion("main_category not between", value1, value2, "mainCategory");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsIsNull() {
            addCriterion("category_keywords is null");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsIsNotNull() {
            addCriterion("category_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsEqualTo(String value) {
            addCriterion("category_keywords =", value, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsNotEqualTo(String value) {
            addCriterion("category_keywords <>", value, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsGreaterThan(String value) {
            addCriterion("category_keywords >", value, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("category_keywords >=", value, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsLessThan(String value) {
            addCriterion("category_keywords <", value, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsLessThanOrEqualTo(String value) {
            addCriterion("category_keywords <=", value, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsLike(String value) {
            addCriterion("category_keywords like", value, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsNotLike(String value) {
            addCriterion("category_keywords not like", value, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsIn(List<String> values) {
            addCriterion("category_keywords in", values, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsNotIn(List<String> values) {
            addCriterion("category_keywords not in", values, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsBetween(String value1, String value2) {
            addCriterion("category_keywords between", value1, value2, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andCategoryKeywordsNotBetween(String value1, String value2) {
            addCriterion("category_keywords not between", value1, value2, "categoryKeywords");
            return (Criteria) this;
        }

        public Criteria andShopSuffixIsNull() {
            addCriterion("shop_suffix is null");
            return (Criteria) this;
        }

        public Criteria andShopSuffixIsNotNull() {
            addCriterion("shop_suffix is not null");
            return (Criteria) this;
        }

        public Criteria andShopSuffixEqualTo(String value) {
            addCriterion("shop_suffix =", value, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixNotEqualTo(String value) {
            addCriterion("shop_suffix <>", value, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixGreaterThan(String value) {
            addCriterion("shop_suffix >", value, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("shop_suffix >=", value, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixLessThan(String value) {
            addCriterion("shop_suffix <", value, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixLessThanOrEqualTo(String value) {
            addCriterion("shop_suffix <=", value, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixLike(String value) {
            addCriterion("shop_suffix like", value, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixNotLike(String value) {
            addCriterion("shop_suffix not like", value, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixIn(List<String> values) {
            addCriterion("shop_suffix in", values, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixNotIn(List<String> values) {
            addCriterion("shop_suffix not in", values, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixBetween(String value1, String value2) {
            addCriterion("shop_suffix between", value1, value2, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopSuffixNotBetween(String value1, String value2) {
            addCriterion("shop_suffix not between", value1, value2, "shopSuffix");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceIsNull() {
            addCriterion("shop_introduce is null");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceIsNotNull() {
            addCriterion("shop_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceEqualTo(String value) {
            addCriterion("shop_introduce =", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceNotEqualTo(String value) {
            addCriterion("shop_introduce <>", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceGreaterThan(String value) {
            addCriterion("shop_introduce >", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("shop_introduce >=", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceLessThan(String value) {
            addCriterion("shop_introduce <", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceLessThanOrEqualTo(String value) {
            addCriterion("shop_introduce <=", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceLike(String value) {
            addCriterion("shop_introduce like", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceNotLike(String value) {
            addCriterion("shop_introduce not like", value, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceIn(List<String> values) {
            addCriterion("shop_introduce in", values, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceNotIn(List<String> values) {
            addCriterion("shop_introduce not in", values, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceBetween(String value1, String value2) {
            addCriterion("shop_introduce between", value1, value2, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andShopIntroduceNotBetween(String value1, String value2) {
            addCriterion("shop_introduce not between", value1, value2, "shopIntroduce");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameIsNull() {
            addCriterion("expect_shop_name is null");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameIsNotNull() {
            addCriterion("expect_shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameEqualTo(String value) {
            addCriterion("expect_shop_name =", value, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameNotEqualTo(String value) {
            addCriterion("expect_shop_name <>", value, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameGreaterThan(String value) {
            addCriterion("expect_shop_name >", value, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("expect_shop_name >=", value, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameLessThan(String value) {
            addCriterion("expect_shop_name <", value, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameLessThanOrEqualTo(String value) {
            addCriterion("expect_shop_name <=", value, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameLike(String value) {
            addCriterion("expect_shop_name like", value, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameNotLike(String value) {
            addCriterion("expect_shop_name not like", value, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameIn(List<String> values) {
            addCriterion("expect_shop_name in", values, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameNotIn(List<String> values) {
            addCriterion("expect_shop_name not in", values, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameBetween(String value1, String value2) {
            addCriterion("expect_shop_name between", value1, value2, "expectShopName");
            return (Criteria) this;
        }

        public Criteria andExpectShopNameNotBetween(String value1, String value2) {
            addCriterion("expect_shop_name not between", value1, value2, "expectShopName");
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