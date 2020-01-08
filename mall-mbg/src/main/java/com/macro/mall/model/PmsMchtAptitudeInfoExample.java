package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class PmsMchtAptitudeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmsMchtAptitudeInfoExample() {
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

        public Criteria andContactMobileIsNull() {
            addCriterion("contact_mobile is null");
            return (Criteria) this;
        }

        public Criteria andContactMobileIsNotNull() {
            addCriterion("contact_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andContactMobileEqualTo(String value) {
            addCriterion("contact_mobile =", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotEqualTo(String value) {
            addCriterion("contact_mobile <>", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThan(String value) {
            addCriterion("contact_mobile >", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileGreaterThanOrEqualTo(String value) {
            addCriterion("contact_mobile >=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThan(String value) {
            addCriterion("contact_mobile <", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLessThanOrEqualTo(String value) {
            addCriterion("contact_mobile <=", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileLike(String value) {
            addCriterion("contact_mobile like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotLike(String value) {
            addCriterion("contact_mobile not like", value, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileIn(List<String> values) {
            addCriterion("contact_mobile in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotIn(List<String> values) {
            addCriterion("contact_mobile not in", values, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileBetween(String value1, String value2) {
            addCriterion("contact_mobile between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactMobileNotBetween(String value1, String value2) {
            addCriterion("contact_mobile not between", value1, value2, "contactMobile");
            return (Criteria) this;
        }

        public Criteria andContactNickIsNull() {
            addCriterion("contact_nick is null");
            return (Criteria) this;
        }

        public Criteria andContactNickIsNotNull() {
            addCriterion("contact_nick is not null");
            return (Criteria) this;
        }

        public Criteria andContactNickEqualTo(String value) {
            addCriterion("contact_nick =", value, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickNotEqualTo(String value) {
            addCriterion("contact_nick <>", value, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickGreaterThan(String value) {
            addCriterion("contact_nick >", value, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickGreaterThanOrEqualTo(String value) {
            addCriterion("contact_nick >=", value, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickLessThan(String value) {
            addCriterion("contact_nick <", value, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickLessThanOrEqualTo(String value) {
            addCriterion("contact_nick <=", value, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickLike(String value) {
            addCriterion("contact_nick like", value, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickNotLike(String value) {
            addCriterion("contact_nick not like", value, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickIn(List<String> values) {
            addCriterion("contact_nick in", values, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickNotIn(List<String> values) {
            addCriterion("contact_nick not in", values, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickBetween(String value1, String value2) {
            addCriterion("contact_nick between", value1, value2, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactNickNotBetween(String value1, String value2) {
            addCriterion("contact_nick not between", value1, value2, "contactNick");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNull() {
            addCriterion("contact_email is null");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNotNull() {
            addCriterion("contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactEmailEqualTo(String value) {
            addCriterion("contact_email =", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotEqualTo(String value) {
            addCriterion("contact_email <>", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThan(String value) {
            addCriterion("contact_email >", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_email >=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThan(String value) {
            addCriterion("contact_email <", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThanOrEqualTo(String value) {
            addCriterion("contact_email <=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLike(String value) {
            addCriterion("contact_email like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotLike(String value) {
            addCriterion("contact_email not like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailIn(List<String> values) {
            addCriterion("contact_email in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotIn(List<String> values) {
            addCriterion("contact_email not in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailBetween(String value1, String value2) {
            addCriterion("contact_email between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotBetween(String value1, String value2) {
            addCriterion("contact_email not between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactSexIsNull() {
            addCriterion("contact_sex is null");
            return (Criteria) this;
        }

        public Criteria andContactSexIsNotNull() {
            addCriterion("contact_sex is not null");
            return (Criteria) this;
        }

        public Criteria andContactSexEqualTo(Integer value) {
            addCriterion("contact_sex =", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotEqualTo(Integer value) {
            addCriterion("contact_sex <>", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexGreaterThan(Integer value) {
            addCriterion("contact_sex >", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_sex >=", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexLessThan(Integer value) {
            addCriterion("contact_sex <", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexLessThanOrEqualTo(Integer value) {
            addCriterion("contact_sex <=", value, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexIn(List<Integer> values) {
            addCriterion("contact_sex in", values, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotIn(List<Integer> values) {
            addCriterion("contact_sex not in", values, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexBetween(Integer value1, Integer value2) {
            addCriterion("contact_sex between", value1, value2, "contactSex");
            return (Criteria) this;
        }

        public Criteria andContactSexNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_sex not between", value1, value2, "contactSex");
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

        public Criteria andLegalNickIsNull() {
            addCriterion("legal_nick is null");
            return (Criteria) this;
        }

        public Criteria andLegalNickIsNotNull() {
            addCriterion("legal_nick is not null");
            return (Criteria) this;
        }

        public Criteria andLegalNickEqualTo(String value) {
            addCriterion("legal_nick =", value, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickNotEqualTo(String value) {
            addCriterion("legal_nick <>", value, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickGreaterThan(String value) {
            addCriterion("legal_nick >", value, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickGreaterThanOrEqualTo(String value) {
            addCriterion("legal_nick >=", value, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickLessThan(String value) {
            addCriterion("legal_nick <", value, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickLessThanOrEqualTo(String value) {
            addCriterion("legal_nick <=", value, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickLike(String value) {
            addCriterion("legal_nick like", value, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickNotLike(String value) {
            addCriterion("legal_nick not like", value, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickIn(List<String> values) {
            addCriterion("legal_nick in", values, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickNotIn(List<String> values) {
            addCriterion("legal_nick not in", values, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickBetween(String value1, String value2) {
            addCriterion("legal_nick between", value1, value2, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalNickNotBetween(String value1, String value2) {
            addCriterion("legal_nick not between", value1, value2, "legalNick");
            return (Criteria) this;
        }

        public Criteria andLegalMobileIsNull() {
            addCriterion("legal_mobile is null");
            return (Criteria) this;
        }

        public Criteria andLegalMobileIsNotNull() {
            addCriterion("legal_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andLegalMobileEqualTo(String value) {
            addCriterion("legal_mobile =", value, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileNotEqualTo(String value) {
            addCriterion("legal_mobile <>", value, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileGreaterThan(String value) {
            addCriterion("legal_mobile >", value, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileGreaterThanOrEqualTo(String value) {
            addCriterion("legal_mobile >=", value, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileLessThan(String value) {
            addCriterion("legal_mobile <", value, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileLessThanOrEqualTo(String value) {
            addCriterion("legal_mobile <=", value, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileLike(String value) {
            addCriterion("legal_mobile like", value, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileNotLike(String value) {
            addCriterion("legal_mobile not like", value, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileIn(List<String> values) {
            addCriterion("legal_mobile in", values, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileNotIn(List<String> values) {
            addCriterion("legal_mobile not in", values, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileBetween(String value1, String value2) {
            addCriterion("legal_mobile between", value1, value2, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalMobileNotBetween(String value1, String value2) {
            addCriterion("legal_mobile not between", value1, value2, "legalMobile");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardIsNull() {
            addCriterion("legal_id_card is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardIsNotNull() {
            addCriterion("legal_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardEqualTo(String value) {
            addCriterion("legal_id_card =", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardNotEqualTo(String value) {
            addCriterion("legal_id_card <>", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardGreaterThan(String value) {
            addCriterion("legal_id_card >", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("legal_id_card >=", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardLessThan(String value) {
            addCriterion("legal_id_card <", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardLessThanOrEqualTo(String value) {
            addCriterion("legal_id_card <=", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardLike(String value) {
            addCriterion("legal_id_card like", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardNotLike(String value) {
            addCriterion("legal_id_card not like", value, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardIn(List<String> values) {
            addCriterion("legal_id_card in", values, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardNotIn(List<String> values) {
            addCriterion("legal_id_card not in", values, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardBetween(String value1, String value2) {
            addCriterion("legal_id_card between", value1, value2, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andLegalIdCardNotBetween(String value1, String value2) {
            addCriterion("legal_id_card not between", value1, value2, "legalIdCard");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIsNull() {
            addCriterion("business_license_no is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIsNotNull() {
            addCriterion("business_license_no is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoEqualTo(String value) {
            addCriterion("business_license_no =", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotEqualTo(String value) {
            addCriterion("business_license_no <>", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoGreaterThan(String value) {
            addCriterion("business_license_no >", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_no >=", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLessThan(String value) {
            addCriterion("business_license_no <", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("business_license_no <=", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLike(String value) {
            addCriterion("business_license_no like", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotLike(String value) {
            addCriterion("business_license_no not like", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIn(List<String> values) {
            addCriterion("business_license_no in", values, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotIn(List<String> values) {
            addCriterion("business_license_no not in", values, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoBetween(String value1, String value2) {
            addCriterion("business_license_no between", value1, value2, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotBetween(String value1, String value2) {
            addCriterion("business_license_no not between", value1, value2, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdIsNull() {
            addCriterion("company_province_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdIsNotNull() {
            addCriterion("company_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdEqualTo(String value) {
            addCriterion("company_province_id =", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdNotEqualTo(String value) {
            addCriterion("company_province_id <>", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdGreaterThan(String value) {
            addCriterion("company_province_id >", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_province_id >=", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdLessThan(String value) {
            addCriterion("company_province_id <", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("company_province_id <=", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdLike(String value) {
            addCriterion("company_province_id like", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdNotLike(String value) {
            addCriterion("company_province_id not like", value, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdIn(List<String> values) {
            addCriterion("company_province_id in", values, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdNotIn(List<String> values) {
            addCriterion("company_province_id not in", values, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdBetween(String value1, String value2) {
            addCriterion("company_province_id between", value1, value2, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyProvinceIdNotBetween(String value1, String value2) {
            addCriterion("company_province_id not between", value1, value2, "companyProvinceId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdIsNull() {
            addCriterion("company_city_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdIsNotNull() {
            addCriterion("company_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdEqualTo(String value) {
            addCriterion("company_city_id =", value, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdNotEqualTo(String value) {
            addCriterion("company_city_id <>", value, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdGreaterThan(String value) {
            addCriterion("company_city_id >", value, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_city_id >=", value, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdLessThan(String value) {
            addCriterion("company_city_id <", value, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdLessThanOrEqualTo(String value) {
            addCriterion("company_city_id <=", value, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdLike(String value) {
            addCriterion("company_city_id like", value, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdNotLike(String value) {
            addCriterion("company_city_id not like", value, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdIn(List<String> values) {
            addCriterion("company_city_id in", values, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdNotIn(List<String> values) {
            addCriterion("company_city_id not in", values, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdBetween(String value1, String value2) {
            addCriterion("company_city_id between", value1, value2, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyCityIdNotBetween(String value1, String value2) {
            addCriterion("company_city_id not between", value1, value2, "companyCityId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdIsNull() {
            addCriterion("company_area_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdIsNotNull() {
            addCriterion("company_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdEqualTo(String value) {
            addCriterion("company_area_id =", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdNotEqualTo(String value) {
            addCriterion("company_area_id <>", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdGreaterThan(String value) {
            addCriterion("company_area_id >", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_area_id >=", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdLessThan(String value) {
            addCriterion("company_area_id <", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdLessThanOrEqualTo(String value) {
            addCriterion("company_area_id <=", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdLike(String value) {
            addCriterion("company_area_id like", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdNotLike(String value) {
            addCriterion("company_area_id not like", value, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdIn(List<String> values) {
            addCriterion("company_area_id in", values, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdNotIn(List<String> values) {
            addCriterion("company_area_id not in", values, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdBetween(String value1, String value2) {
            addCriterion("company_area_id between", value1, value2, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIdNotBetween(String value1, String value2) {
            addCriterion("company_area_id not between", value1, value2, "companyAreaId");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileIsNull() {
            addCriterion("company_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileIsNotNull() {
            addCriterion("company_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileEqualTo(String value) {
            addCriterion("company_mobile =", value, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileNotEqualTo(String value) {
            addCriterion("company_mobile <>", value, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileGreaterThan(String value) {
            addCriterion("company_mobile >", value, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileGreaterThanOrEqualTo(String value) {
            addCriterion("company_mobile >=", value, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileLessThan(String value) {
            addCriterion("company_mobile <", value, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileLessThanOrEqualTo(String value) {
            addCriterion("company_mobile <=", value, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileLike(String value) {
            addCriterion("company_mobile like", value, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileNotLike(String value) {
            addCriterion("company_mobile not like", value, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileIn(List<String> values) {
            addCriterion("company_mobile in", values, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileNotIn(List<String> values) {
            addCriterion("company_mobile not in", values, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileBetween(String value1, String value2) {
            addCriterion("company_mobile between", value1, value2, "companyMobile");
            return (Criteria) this;
        }

        public Criteria andCompanyMobileNotBetween(String value1, String value2) {
            addCriterion("company_mobile not between", value1, value2, "companyMobile");
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