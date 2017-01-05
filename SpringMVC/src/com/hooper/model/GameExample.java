package com.hooper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GameExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andImgsrcIsNull() {
            addCriterion("imgSrc is null");
            return (Criteria) this;
        }

        public Criteria andImgsrcIsNotNull() {
            addCriterion("imgSrc is not null");
            return (Criteria) this;
        }

        public Criteria andImgsrcEqualTo(String value) {
            addCriterion("imgSrc =", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcNotEqualTo(String value) {
            addCriterion("imgSrc <>", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcGreaterThan(String value) {
            addCriterion("imgSrc >", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcGreaterThanOrEqualTo(String value) {
            addCriterion("imgSrc >=", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcLessThan(String value) {
            addCriterion("imgSrc <", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcLessThanOrEqualTo(String value) {
            addCriterion("imgSrc <=", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcLike(String value) {
            addCriterion("imgSrc like", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcNotLike(String value) {
            addCriterion("imgSrc not like", value, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcIn(List<String> values) {
            addCriterion("imgSrc in", values, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcNotIn(List<String> values) {
            addCriterion("imgSrc not in", values, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcBetween(String value1, String value2) {
            addCriterion("imgSrc between", value1, value2, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andImgsrcNotBetween(String value1, String value2) {
            addCriterion("imgSrc not between", value1, value2, "imgsrc");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlIsNull() {
            addCriterion("donwloadUrl is null");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlIsNotNull() {
            addCriterion("donwloadUrl is not null");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlEqualTo(String value) {
            addCriterion("donwloadUrl =", value, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlNotEqualTo(String value) {
            addCriterion("donwloadUrl <>", value, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlGreaterThan(String value) {
            addCriterion("donwloadUrl >", value, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlGreaterThanOrEqualTo(String value) {
            addCriterion("donwloadUrl >=", value, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlLessThan(String value) {
            addCriterion("donwloadUrl <", value, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlLessThanOrEqualTo(String value) {
            addCriterion("donwloadUrl <=", value, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlLike(String value) {
            addCriterion("donwloadUrl like", value, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlNotLike(String value) {
            addCriterion("donwloadUrl not like", value, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlIn(List<String> values) {
            addCriterion("donwloadUrl in", values, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlNotIn(List<String> values) {
            addCriterion("donwloadUrl not in", values, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlBetween(String value1, String value2) {
            addCriterion("donwloadUrl between", value1, value2, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andDonwloadurlNotBetween(String value1, String value2) {
            addCriterion("donwloadUrl not between", value1, value2, "donwloadurl");
            return (Criteria) this;
        }

        public Criteria andIntroIsNull() {
            addCriterion("intro is null");
            return (Criteria) this;
        }

        public Criteria andIntroIsNotNull() {
            addCriterion("intro is not null");
            return (Criteria) this;
        }

        public Criteria andIntroEqualTo(String value) {
            addCriterion("intro =", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotEqualTo(String value) {
            addCriterion("intro <>", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThan(String value) {
            addCriterion("intro >", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroGreaterThanOrEqualTo(String value) {
            addCriterion("intro >=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThan(String value) {
            addCriterion("intro <", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLessThanOrEqualTo(String value) {
            addCriterion("intro <=", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroLike(String value) {
            addCriterion("intro like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotLike(String value) {
            addCriterion("intro not like", value, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroIn(List<String> values) {
            addCriterion("intro in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotIn(List<String> values) {
            addCriterion("intro not in", values, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroBetween(String value1, String value2) {
            addCriterion("intro between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andIntroNotBetween(String value1, String value2) {
            addCriterion("intro not between", value1, value2, "intro");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNull() {
            addCriterion("viewCount is null");
            return (Criteria) this;
        }

        public Criteria andViewcountIsNotNull() {
            addCriterion("viewCount is not null");
            return (Criteria) this;
        }

        public Criteria andViewcountEqualTo(Integer value) {
            addCriterion("viewCount =", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotEqualTo(Integer value) {
            addCriterion("viewCount <>", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThan(Integer value) {
            addCriterion("viewCount >", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("viewCount >=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThan(Integer value) {
            addCriterion("viewCount <", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountLessThanOrEqualTo(Integer value) {
            addCriterion("viewCount <=", value, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountIn(List<Integer> values) {
            addCriterion("viewCount in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotIn(List<Integer> values) {
            addCriterion("viewCount not in", values, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountBetween(Integer value1, Integer value2) {
            addCriterion("viewCount between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andViewcountNotBetween(Integer value1, Integer value2) {
            addCriterion("viewCount not between", value1, value2, "viewcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountIsNull() {
            addCriterion("favourCount is null");
            return (Criteria) this;
        }

        public Criteria andFavourcountIsNotNull() {
            addCriterion("favourCount is not null");
            return (Criteria) this;
        }

        public Criteria andFavourcountEqualTo(Integer value) {
            addCriterion("favourCount =", value, "favourcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountNotEqualTo(Integer value) {
            addCriterion("favourCount <>", value, "favourcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountGreaterThan(Integer value) {
            addCriterion("favourCount >", value, "favourcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("favourCount >=", value, "favourcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountLessThan(Integer value) {
            addCriterion("favourCount <", value, "favourcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountLessThanOrEqualTo(Integer value) {
            addCriterion("favourCount <=", value, "favourcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountIn(List<Integer> values) {
            addCriterion("favourCount in", values, "favourcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountNotIn(List<Integer> values) {
            addCriterion("favourCount not in", values, "favourcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountBetween(Integer value1, Integer value2) {
            addCriterion("favourCount between", value1, value2, "favourcount");
            return (Criteria) this;
        }

        public Criteria andFavourcountNotBetween(Integer value1, Integer value2) {
            addCriterion("favourCount not between", value1, value2, "favourcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountIsNull() {
            addCriterion("donwloadCount is null");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountIsNotNull() {
            addCriterion("donwloadCount is not null");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountEqualTo(Integer value) {
            addCriterion("donwloadCount =", value, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountNotEqualTo(Integer value) {
            addCriterion("donwloadCount <>", value, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountGreaterThan(Integer value) {
            addCriterion("donwloadCount >", value, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("donwloadCount >=", value, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountLessThan(Integer value) {
            addCriterion("donwloadCount <", value, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountLessThanOrEqualTo(Integer value) {
            addCriterion("donwloadCount <=", value, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountIn(List<Integer> values) {
            addCriterion("donwloadCount in", values, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountNotIn(List<Integer> values) {
            addCriterion("donwloadCount not in", values, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountBetween(Integer value1, Integer value2) {
            addCriterion("donwloadCount between", value1, value2, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andDonwloadcountNotBetween(Integer value1, Integer value2) {
            addCriterion("donwloadCount not between", value1, value2, "donwloadcount");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNull() {
            addCriterion("utime is null");
            return (Criteria) this;
        }

        public Criteria andUtimeIsNotNull() {
            addCriterion("utime is not null");
            return (Criteria) this;
        }

        public Criteria andUtimeEqualTo(Date value) {
            addCriterion("utime =", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotEqualTo(Date value) {
            addCriterion("utime <>", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThan(Date value) {
            addCriterion("utime >", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("utime >=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThan(Date value) {
            addCriterion("utime <", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeLessThanOrEqualTo(Date value) {
            addCriterion("utime <=", value, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeIn(List<Date> values) {
            addCriterion("utime in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotIn(List<Date> values) {
            addCriterion("utime not in", values, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeBetween(Date value1, Date value2) {
            addCriterion("utime between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andUtimeNotBetween(Date value1, Date value2) {
            addCriterion("utime not between", value1, value2, "utime");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Boolean value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Boolean value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Boolean value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Boolean value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Boolean> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Boolean> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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