package com.aurora.domain;

import java.util.ArrayList;
import java.util.List;

public class UserDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDataExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNull() {
            addCriterion("telnumber is null");
            return (Criteria) this;
        }

        public Criteria andTelnumberIsNotNull() {
            addCriterion("telnumber is not null");
            return (Criteria) this;
        }

        public Criteria andTelnumberEqualTo(String value) {
            addCriterion("telnumber =", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotEqualTo(String value) {
            addCriterion("telnumber <>", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThan(String value) {
            addCriterion("telnumber >", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("telnumber >=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThan(String value) {
            addCriterion("telnumber <", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLessThanOrEqualTo(String value) {
            addCriterion("telnumber <=", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberLike(String value) {
            addCriterion("telnumber like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotLike(String value) {
            addCriterion("telnumber not like", value, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberIn(List<String> values) {
            addCriterion("telnumber in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotIn(List<String> values) {
            addCriterion("telnumber not in", values, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberBetween(String value1, String value2) {
            addCriterion("telnumber between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andTelnumberNotBetween(String value1, String value2) {
            addCriterion("telnumber not between", value1, value2, "telnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberIsNull() {
            addCriterion("shorttelnumber is null");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberIsNotNull() {
            addCriterion("shorttelnumber is not null");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberEqualTo(String value) {
            addCriterion("shorttelnumber =", value, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberNotEqualTo(String value) {
            addCriterion("shorttelnumber <>", value, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberGreaterThan(String value) {
            addCriterion("shorttelnumber >", value, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberGreaterThanOrEqualTo(String value) {
            addCriterion("shorttelnumber >=", value, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberLessThan(String value) {
            addCriterion("shorttelnumber <", value, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberLessThanOrEqualTo(String value) {
            addCriterion("shorttelnumber <=", value, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberLike(String value) {
            addCriterion("shorttelnumber like", value, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberNotLike(String value) {
            addCriterion("shorttelnumber not like", value, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberIn(List<String> values) {
            addCriterion("shorttelnumber in", values, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberNotIn(List<String> values) {
            addCriterion("shorttelnumber not in", values, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberBetween(String value1, String value2) {
            addCriterion("shorttelnumber between", value1, value2, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andShorttelnumberNotBetween(String value1, String value2) {
            addCriterion("shorttelnumber not between", value1, value2, "shorttelnumber");
            return (Criteria) this;
        }

        public Criteria andDisplayurlIsNull() {
            addCriterion("displayurl is null");
            return (Criteria) this;
        }

        public Criteria andDisplayurlIsNotNull() {
            addCriterion("displayurl is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayurlEqualTo(String value) {
            addCriterion("displayurl =", value, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlNotEqualTo(String value) {
            addCriterion("displayurl <>", value, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlGreaterThan(String value) {
            addCriterion("displayurl >", value, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlGreaterThanOrEqualTo(String value) {
            addCriterion("displayurl >=", value, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlLessThan(String value) {
            addCriterion("displayurl <", value, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlLessThanOrEqualTo(String value) {
            addCriterion("displayurl <=", value, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlLike(String value) {
            addCriterion("displayurl like", value, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlNotLike(String value) {
            addCriterion("displayurl not like", value, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlIn(List<String> values) {
            addCriterion("displayurl in", values, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlNotIn(List<String> values) {
            addCriterion("displayurl not in", values, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlBetween(String value1, String value2) {
            addCriterion("displayurl between", value1, value2, "displayurl");
            return (Criteria) this;
        }

        public Criteria andDisplayurlNotBetween(String value1, String value2) {
            addCriterion("displayurl not between", value1, value2, "displayurl");
            return (Criteria) this;
        }

        public Criteria andLoginstatusIsNull() {
            addCriterion("loginstatus is null");
            return (Criteria) this;
        }

        public Criteria andLoginstatusIsNotNull() {
            addCriterion("loginstatus is not null");
            return (Criteria) this;
        }

        public Criteria andLoginstatusEqualTo(Boolean value) {
            addCriterion("loginstatus =", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusNotEqualTo(Boolean value) {
            addCriterion("loginstatus <>", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusGreaterThan(Boolean value) {
            addCriterion("loginstatus >", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("loginstatus >=", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusLessThan(Boolean value) {
            addCriterion("loginstatus <", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusLessThanOrEqualTo(Boolean value) {
            addCriterion("loginstatus <=", value, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusIn(List<Boolean> values) {
            addCriterion("loginstatus in", values, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusNotIn(List<Boolean> values) {
            addCriterion("loginstatus not in", values, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusBetween(Boolean value1, Boolean value2) {
            addCriterion("loginstatus between", value1, value2, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andLoginstatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("loginstatus not between", value1, value2, "loginstatus");
            return (Criteria) this;
        }

        public Criteria andIsleaveIsNull() {
            addCriterion("isleave is null");
            return (Criteria) this;
        }

        public Criteria andIsleaveIsNotNull() {
            addCriterion("isleave is not null");
            return (Criteria) this;
        }

        public Criteria andIsleaveEqualTo(Boolean value) {
            addCriterion("isleave =", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveNotEqualTo(Boolean value) {
            addCriterion("isleave <>", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveGreaterThan(Boolean value) {
            addCriterion("isleave >", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isleave >=", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveLessThan(Boolean value) {
            addCriterion("isleave <", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveLessThanOrEqualTo(Boolean value) {
            addCriterion("isleave <=", value, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveIn(List<Boolean> values) {
            addCriterion("isleave in", values, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveNotIn(List<Boolean> values) {
            addCriterion("isleave not in", values, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveBetween(Boolean value1, Boolean value2) {
            addCriterion("isleave between", value1, value2, "isleave");
            return (Criteria) this;
        }

        public Criteria andIsleaveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isleave not between", value1, value2, "isleave");
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