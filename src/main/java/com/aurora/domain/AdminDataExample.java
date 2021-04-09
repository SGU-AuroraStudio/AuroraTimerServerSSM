package com.aurora.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdminDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminDataExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIsNull() {
            addCriterion("announcement is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIsNotNull() {
            addCriterion("announcement is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncementEqualTo(String value) {
            addCriterion("announcement =", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotEqualTo(String value) {
            addCriterion("announcement <>", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementGreaterThan(String value) {
            addCriterion("announcement >", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementGreaterThanOrEqualTo(String value) {
            addCriterion("announcement >=", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLessThan(String value) {
            addCriterion("announcement <", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLessThanOrEqualTo(String value) {
            addCriterion("announcement <=", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementLike(String value) {
            addCriterion("announcement like", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotLike(String value) {
            addCriterion("announcement not like", value, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementIn(List<String> values) {
            addCriterion("announcement in", values, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotIn(List<String> values) {
            addCriterion("announcement not in", values, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementBetween(String value1, String value2) {
            addCriterion("announcement between", value1, value2, "announcement");
            return (Criteria) this;
        }

        public Criteria andAnnouncementNotBetween(String value1, String value2) {
            addCriterion("announcement not between", value1, value2, "announcement");
            return (Criteria) this;
        }

        public Criteria andDutylistIsNull() {
            addCriterion("dutyList is null");
            return (Criteria) this;
        }

        public Criteria andDutylistIsNotNull() {
            addCriterion("dutyList is not null");
            return (Criteria) this;
        }

        public Criteria andDutylistEqualTo(String value) {
            addCriterion("dutyList =", value, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistNotEqualTo(String value) {
            addCriterion("dutyList <>", value, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistGreaterThan(String value) {
            addCriterion("dutyList >", value, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistGreaterThanOrEqualTo(String value) {
            addCriterion("dutyList >=", value, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistLessThan(String value) {
            addCriterion("dutyList <", value, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistLessThanOrEqualTo(String value) {
            addCriterion("dutyList <=", value, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistLike(String value) {
            addCriterion("dutyList like", value, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistNotLike(String value) {
            addCriterion("dutyList not like", value, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistIn(List<String> values) {
            addCriterion("dutyList in", values, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistNotIn(List<String> values) {
            addCriterion("dutyList not in", values, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistBetween(String value1, String value2) {
            addCriterion("dutyList between", value1, value2, "dutylist");
            return (Criteria) this;
        }

        public Criteria andDutylistNotBetween(String value1, String value2) {
            addCriterion("dutyList not between", value1, value2, "dutylist");
            return (Criteria) this;
        }

        public Criteria andFreetimestartIsNull() {
            addCriterion("freeTimeStart is null");
            return (Criteria) this;
        }

        public Criteria andFreetimestartIsNotNull() {
            addCriterion("freeTimeStart is not null");
            return (Criteria) this;
        }

        public Criteria andFreetimestartEqualTo(Date value) {
            addCriterionForJDBCTime("freeTimeStart =", value, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimestartNotEqualTo(Date value) {
            addCriterionForJDBCTime("freeTimeStart <>", value, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimestartGreaterThan(Date value) {
            addCriterionForJDBCTime("freeTimeStart >", value, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimestartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("freeTimeStart >=", value, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimestartLessThan(Date value) {
            addCriterionForJDBCTime("freeTimeStart <", value, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimestartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("freeTimeStart <=", value, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimestartIn(List<Date> values) {
            addCriterionForJDBCTime("freeTimeStart in", values, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimestartNotIn(List<Date> values) {
            addCriterionForJDBCTime("freeTimeStart not in", values, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimestartBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("freeTimeStart between", value1, value2, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimestartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("freeTimeStart not between", value1, value2, "freetimestart");
            return (Criteria) this;
        }

        public Criteria andFreetimeendIsNull() {
            addCriterion("freeTimeEnd is null");
            return (Criteria) this;
        }

        public Criteria andFreetimeendIsNotNull() {
            addCriterion("freeTimeEnd is not null");
            return (Criteria) this;
        }

        public Criteria andFreetimeendEqualTo(Date value) {
            addCriterionForJDBCTime("freeTimeEnd =", value, "freetimeend");
            return (Criteria) this;
        }

        public Criteria andFreetimeendNotEqualTo(Date value) {
            addCriterionForJDBCTime("freeTimeEnd <>", value, "freetimeend");
            return (Criteria) this;
        }

        public Criteria andFreetimeendGreaterThan(Date value) {
            addCriterionForJDBCTime("freeTimeEnd >", value, "freetimeend");
            return (Criteria) this;
        }

        public Criteria andFreetimeendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("freeTimeEnd >=", value, "freetimeend");
            return (Criteria) this;
        }

        public Criteria andFreetimeendLessThan(Date value) {
            addCriterionForJDBCTime("freeTimeEnd <", value, "freetimeend");
            return (Criteria) this;
        }

        public Criteria andFreetimeendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("freeTimeEnd <=", value, "freetimeend");
            return (Criteria) this;
        }

        public Criteria andFreetimeendIn(List<Date> values) {
            addCriterionForJDBCTime("freeTimeEnd in", values, "freetimeend");
            return (Criteria) this;
        }

        public Criteria andFreetimeendNotIn(List<Date> values) {
            addCriterionForJDBCTime("freeTimeEnd not in", values, "freetimeend");
            return (Criteria) this;
        }

        public Criteria andFreetimeendBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("freeTimeEnd between", value1, value2, "freetimeend");
            return (Criteria) this;
        }

        public Criteria andFreetimeendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("freeTimeEnd not between", value1, value2, "freetimeend");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private final String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private final String typeHandler;

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