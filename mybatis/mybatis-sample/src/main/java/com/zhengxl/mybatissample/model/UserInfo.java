package com.zhengxl.mybatissample.model;

import java.io.Serializable;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table user_info
 */
public class UserInfo implements Serializable {
    /**
     * Database Column Remarks:
     *   自增主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   用户名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   哈希密码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.hashed_password
     *
     * @mbg.generated
     */
    private String hashedPassword;

    /**
     * Database Column Remarks:
     *   手机号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.phone_number
     *
     * @mbg.generated
     */
    private String phoneNumber;

    /**
     * Database Column Remarks:
     *   账号状态：1-启用，0-禁用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_info.account_status
     *
     * @mbg.generated
     */
    private Integer accountStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.id
     *
     * @return the value of user_info.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.id
     *
     * @param id the value for user_info.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.user_name
     *
     * @return the value of user_info.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.user_name
     *
     * @param userName the value for user_info.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.hashed_password
     *
     * @return the value of user_info.hashed_password
     *
     * @mbg.generated
     */
    public String getHashedPassword() {
        return hashedPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.hashed_password
     *
     * @param hashedPassword the value for user_info.hashed_password
     *
     * @mbg.generated
     */
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.phone_number
     *
     * @return the value of user_info.phone_number
     *
     * @mbg.generated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.phone_number
     *
     * @param phoneNumber the value for user_info.phone_number
     *
     * @mbg.generated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_info.account_status
     *
     * @return the value of user_info.account_status
     *
     * @mbg.generated
     */
    public Integer getAccountStatus() {
        return accountStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_info.account_status
     *
     * @param accountStatus the value for user_info.account_status
     *
     * @mbg.generated
     */
    public void setAccountStatus(Integer accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", hashedPassword=").append(hashedPassword);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", accountStatus=").append(accountStatus);
        sb.append("]");
        return sb.toString();
    }
}