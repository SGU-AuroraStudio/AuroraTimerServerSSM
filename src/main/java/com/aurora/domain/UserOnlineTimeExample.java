package com.aurora.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserOnlineTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserOnlineTimeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andTodaydateIsNull() {
            addCriterion("todaydate is null");
            return (Criteria) this;
        }

        public Criteria andTodaydateIsNotNull() {
            addCriterion("todaydate is not null");
            return (Criteria) this;
        }

        public Criteria andTodaydateEqualTo(Date value) {
            addCriterionForJDBCDate("todaydate =", value, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodaydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("todaydate <>", value, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodaydateGreaterThan(Date value) {
            addCriterionForJDBCDate("todaydate >", value, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodaydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("todaydate >=", value, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodaydateLessThan(Date value) {
            addCriterionForJDBCDate("todaydate <", value, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodaydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("todaydate <=", value, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodaydateIn(List<Date> values) {
            addCriterionForJDBCDate("todaydate in", values, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodaydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("todaydate not in", values, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodaydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("todaydate between", value1, value2, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodaydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("todaydate not between", value1, value2, "todaydate");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeIsNull() {
            addCriterion("todayonlinetime is null");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeIsNotNull() {
            addCriterion("todayonlinetime is not null");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeEqualTo(Long value) {
            addCriterion("todayonlinetime =", value, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeNotEqualTo(Long value) {
            addCriterion("todayonlinetime <>", value, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeGreaterThan(Long value) {
            addCriterion("todayonlinetime >", value, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("todayonlinetime >=", value, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeLessThan(Long value) {
            addCriterion("todayonlinetime <", value, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeLessThanOrEqualTo(Long value) {
            addCriterion("todayonlinetime <=", value, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeIn(List<Long> values) {
            addCriterion("todayonlinetime in", values, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeNotIn(List<Long> values) {
            addCriterion("todayonlinetime not in", values, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeBetween(Long value1, Long value2) {
            addCriterion("todayonlinetime between", value1, value2, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andTodayonlinetimeNotBetween(Long value1, Long value2) {
            addCriterion("todayonlinetime not between", value1, value2, "todayonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeIsNull() {
            addCriterion("lastonlinetime is null");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeIsNotNull() {
            addCriterion("lastonlinetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeEqualTo(Date value) {
            addCriterionForJDBCTime("lastonlinetime =", value, "lastonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("lastonlinetime <>", value, "lastonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeGreaterThan(Date value) {
            addCriterionForJDBCTime("lastonlinetime >", value, "lastonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lastonlinetime >=", value, "lastonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeLessThan(Date value) {
            addCriterionForJDBCTime("lastonlinetime <", value, "lastonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lastonlinetime <=", value, "lastonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeIn(List<Date> values) {
            addCriterionForJDBCTime("lastonlinetime in", values, "lastonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("lastonlinetime not in", values, "lastonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lastonlinetime between", value1, value2, "lastonlinetime");
            return (Criteria) this;
        }

        public Criteria andLastonlinetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lastonlinetime not between", value1, value2, "lastonlinetime");
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