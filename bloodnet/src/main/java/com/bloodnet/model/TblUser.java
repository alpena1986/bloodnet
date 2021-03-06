package com.bloodnet.model;

public class TblUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.user_id
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.profile_id
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    private String profileId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.password
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.email
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.account_status
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    private String accountStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.delflg
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    private Boolean delflg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.create_dt
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    private String createDt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_user.update_dt
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    private String updateDt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.user_id
     *
     * @return the value of tbl_user.user_id
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.user_id
     *
     * @param userId the value for tbl_user.user_id
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.profile_id
     *
     * @return the value of tbl_user.profile_id
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public String getProfileId() {
        return profileId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.profile_id
     *
     * @param profileId the value for tbl_user.profile_id
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public void setProfileId(String profileId) {
        this.profileId = profileId == null ? null : profileId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.password
     *
     * @return the value of tbl_user.password
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.password
     *
     * @param password the value for tbl_user.password
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.email
     *
     * @return the value of tbl_user.email
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.email
     *
     * @param email the value for tbl_user.email
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.account_status
     *
     * @return the value of tbl_user.account_status
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public String getAccountStatus() {
        return accountStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.account_status
     *
     * @param accountStatus the value for tbl_user.account_status
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus == null ? null : accountStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.delflg
     *
     * @return the value of tbl_user.delflg
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public Boolean getDelflg() {
        return delflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.delflg
     *
     * @param delflg the value for tbl_user.delflg
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public void setDelflg(Boolean delflg) {
        this.delflg = delflg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.create_dt
     *
     * @return the value of tbl_user.create_dt
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public String getCreateDt() {
        return createDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.create_dt
     *
     * @param createDt the value for tbl_user.create_dt
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public void setCreateDt(String createDt) {
        this.createDt = createDt == null ? null : createDt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_user.update_dt
     *
     * @return the value of tbl_user.update_dt
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public String getUpdateDt() {
        return updateDt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_user.update_dt
     *
     * @param updateDt the value for tbl_user.update_dt
     *
     * @mbggenerated Thu Apr 13 22:20:43 JST 2017
     */
    public void setUpdateDt(String updateDt) {
        this.updateDt = updateDt == null ? null : updateDt.trim();
    }
}