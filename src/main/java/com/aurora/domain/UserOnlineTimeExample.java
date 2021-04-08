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

        public Criteria andTodayDateIsNull() {
            addCriterion("today_date is null");
            return (Criteria) this;
        }

        public Criteria andTodayDateIsNotNull() {
            addCriterion("today_date is not null");
            return (Criteria) this;
        }

        public Criteria andTodayDateEqualTo(Date value) {
            addCriterionForJDBCDate("today_date =", value, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("today_date <>", value, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayDateGreaterThan(Date value) {
            addCriterionForJDBCDate("today_date >", value, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("today_date >=", value, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayDateLessThan(Date value) {
            addCriterionForJDBCDate("today_date <", value, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("today_date <=", value, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayDateIn(List<Date> values) {
            addCriterionForJDBCDate("today_date in", values, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("today_date not in", values, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("today_date between", value1, value2, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("today_date not between", value1, value2, "todayDate");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeIsNull() {
            addCriterion("today_online_time is null");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeIsNotNull() {
            addCriterion("today_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeEqualTo(Long value) {
            addCriterion("today_online_time =", value, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeNotEqualTo(Long value) {
            addCriterion("today_online_time <>", value, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeGreaterThan(Long value) {
            addCriterion("today_online_time >", value, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("today_online_time >=", value, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeLessThan(Long value) {
            addCriterion("today_online_time <", value, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeLessThanOrEqualTo(Long value) {
            addCriterion("today_online_time <=", value, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeIn(List<Long> values) {
            addCriterion("today_online_time in", values, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeNotIn(List<Long> values) {
            addCriterion("today_online_time not in", values, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeBetween(Long value1, Long value2) {
            addCriterion("today_online_time between", value1, value2, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andTodayOnlineTimeNotBetween(Long value1, Long value2) {
            addCriterion("today_online_time not between", value1, value2, "todayOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeIsNull() {
            addCriterion("last_online_time is null");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeIsNotNull() {
            addCriterion("last_online_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeEqualTo(Date value) {
            addCriterionForJDBCTime("last_online_time =", value, "lastOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("last_online_time <>", value, "lastOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("last_online_time >", value, "lastOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("last_online_time >=", value, "lastOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeLessThan(Date value) {
            addCriterionForJDBCTime("last_online_time <", value, "lastOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("last_online_time <=", value, "lastOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeIn(List<Date> values) {
            addCriterionForJDBCTime("last_online_time in", values, "lastOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("last_online_time not in", values, "lastOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("last_online_time between", value1, value2, "lastOnlineTime");
            return (Criteria) this;
        }

        public Criteria andLastOnlineTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("last_online_time not between", value1, value2, "lastOnlineTime");
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