/*
 * This file is generated by jOOQ.
 */
package com.slj.springplaymvn.codegen.tables.records;


import com.slj.springplaymvn.codegen.tables.User;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户信息表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends UpdatableRecordImpl<UserRecord> implements Record9<Integer, String, String, Long, String, LocalDateTime, Long, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>spring_play.user.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>spring_play.user.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>spring_play.user.account</code>. 用户账户名
     */
    public void setAccount(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>spring_play.user.account</code>. 用户账户名
     */
    public String getAccount() {
        return (String) get(1);
    }

    /**
     * Setter for <code>spring_play.user.password</code>. 用户密码
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>spring_play.user.password</code>. 用户密码
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>spring_play.user.creator_id</code>. 创建人id
     */
    public void setCreatorId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>spring_play.user.creator_id</code>. 创建人id
     */
    public Long getCreatorId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>spring_play.user.creator_name</code>. 创建人名称
     */
    public void setCreatorName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>spring_play.user.creator_name</code>. 创建人名称
     */
    public String getCreatorName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>spring_play.user.create_time</code>. 创建时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>spring_play.user.create_time</code>. 创建时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>spring_play.user.update_user_id</code>. 更新人id
     */
    public void setUpdateUserId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>spring_play.user.update_user_id</code>. 更新人id
     */
    public Long getUpdateUserId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>spring_play.user.update_user_name</code>. 更新人名称
     */
    public void setUpdateUserName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>spring_play.user.update_user_name</code>. 更新人名称
     */
    public String getUpdateUserName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>spring_play.user.update_time</code>. 更新时间
     */
    public void setUpdateTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>spring_play.user.update_time</code>. 更新时间
     */
    public LocalDateTime getUpdateTime() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, Long, String, LocalDateTime, Long, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, String, Long, String, LocalDateTime, Long, String, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return User.USER.ID;
    }

    @Override
    public Field<String> field2() {
        return User.USER.ACCOUNT;
    }

    @Override
    public Field<String> field3() {
        return User.USER.PASSWORD;
    }

    @Override
    public Field<Long> field4() {
        return User.USER.CREATOR_ID;
    }

    @Override
    public Field<String> field5() {
        return User.USER.CREATOR_NAME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return User.USER.CREATE_TIME;
    }

    @Override
    public Field<Long> field7() {
        return User.USER.UPDATE_USER_ID;
    }

    @Override
    public Field<String> field8() {
        return User.USER.UPDATE_USER_NAME;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return User.USER.UPDATE_TIME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAccount();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public Long component4() {
        return getCreatorId();
    }

    @Override
    public String component5() {
        return getCreatorName();
    }

    @Override
    public LocalDateTime component6() {
        return getCreateTime();
    }

    @Override
    public Long component7() {
        return getUpdateUserId();
    }

    @Override
    public String component8() {
        return getUpdateUserName();
    }

    @Override
    public LocalDateTime component9() {
        return getUpdateTime();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAccount();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public Long value4() {
        return getCreatorId();
    }

    @Override
    public String value5() {
        return getCreatorName();
    }

    @Override
    public LocalDateTime value6() {
        return getCreateTime();
    }

    @Override
    public Long value7() {
        return getUpdateUserId();
    }

    @Override
    public String value8() {
        return getUpdateUserName();
    }

    @Override
    public LocalDateTime value9() {
        return getUpdateTime();
    }

    @Override
    public UserRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public UserRecord value2(String value) {
        setAccount(value);
        return this;
    }

    @Override
    public UserRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserRecord value4(Long value) {
        setCreatorId(value);
        return this;
    }

    @Override
    public UserRecord value5(String value) {
        setCreatorName(value);
        return this;
    }

    @Override
    public UserRecord value6(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public UserRecord value7(Long value) {
        setUpdateUserId(value);
        return this;
    }

    @Override
    public UserRecord value8(String value) {
        setUpdateUserName(value);
        return this;
    }

    @Override
    public UserRecord value9(LocalDateTime value) {
        setUpdateTime(value);
        return this;
    }

    @Override
    public UserRecord values(Integer value1, String value2, String value3, Long value4, String value5, LocalDateTime value6, Long value7, String value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserRecord
     */
    public UserRecord() {
        super(User.USER);
    }

    /**
     * Create a detached, initialised UserRecord
     */
    public UserRecord(Integer id, String account, String password, Long creatorId, String creatorName, LocalDateTime createTime, Long updateUserId, String updateUserName, LocalDateTime updateTime) {
        super(User.USER);

        setId(id);
        setAccount(account);
        setPassword(password);
        setCreatorId(creatorId);
        setCreatorName(creatorName);
        setCreateTime(createTime);
        setUpdateUserId(updateUserId);
        setUpdateUserName(updateUserName);
        setUpdateTime(updateTime);
    }
}
