package org.azhang.weibo.model;

import java.util.ArrayList;
import java.util.List;

public class BlogRepostExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogRepostExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Long value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Long value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Long value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Long value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Long value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Long> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Long> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Long value1, Long value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Long value1, Long value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdIsNull() {
            addCriterion("source_blog_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdIsNotNull() {
            addCriterion("source_blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdEqualTo(Long value) {
            addCriterion("source_blog_id =", value, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdNotEqualTo(Long value) {
            addCriterion("source_blog_id <>", value, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdGreaterThan(Long value) {
            addCriterion("source_blog_id >", value, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_blog_id >=", value, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdLessThan(Long value) {
            addCriterion("source_blog_id <", value, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdLessThanOrEqualTo(Long value) {
            addCriterion("source_blog_id <=", value, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdIn(List<Long> values) {
            addCriterion("source_blog_id in", values, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdNotIn(List<Long> values) {
            addCriterion("source_blog_id not in", values, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdBetween(Long value1, Long value2) {
            addCriterion("source_blog_id between", value1, value2, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andSourceBlogIdNotBetween(Long value1, Long value2) {
            addCriterion("source_blog_id not between", value1, value2, "sourceBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdIsNull() {
            addCriterion("leaf_blog_id is null");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdIsNotNull() {
            addCriterion("leaf_blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdEqualTo(Long value) {
            addCriterion("leaf_blog_id =", value, "leafBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdNotEqualTo(Long value) {
            addCriterion("leaf_blog_id <>", value, "leafBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdGreaterThan(Long value) {
            addCriterion("leaf_blog_id >", value, "leafBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("leaf_blog_id >=", value, "leafBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdLessThan(Long value) {
            addCriterion("leaf_blog_id <", value, "leafBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdLessThanOrEqualTo(Long value) {
            addCriterion("leaf_blog_id <=", value, "leafBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdIn(List<Long> values) {
            addCriterion("leaf_blog_id in", values, "leafBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdNotIn(List<Long> values) {
            addCriterion("leaf_blog_id not in", values, "leafBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdBetween(Long value1, Long value2) {
            addCriterion("leaf_blog_id between", value1, value2, "leafBlogId");
            return (Criteria) this;
        }

        public Criteria andLeafBlogIdNotBetween(Long value1, Long value2) {
            addCriterion("leaf_blog_id not between", value1, value2, "leafBlogId");
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