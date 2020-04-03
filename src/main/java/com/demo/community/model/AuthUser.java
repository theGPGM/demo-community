package com.demo.community.model;

public class AuthUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_USER.id
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_USER.user_id
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_USER.identity_type
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    private Integer identityType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_USER.identifier
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    private String identifier;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AUTH_USER.credential
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    private String credential;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_USER.id
     *
     * @return the value of AUTH_USER.id
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_USER.id
     *
     * @param id the value for AUTH_USER.id
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_USER.user_id
     *
     * @return the value of AUTH_USER.user_id
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_USER.user_id
     *
     * @param userId the value for AUTH_USER.user_id
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_USER.identity_type
     *
     * @return the value of AUTH_USER.identity_type
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public Integer getIdentityType() {
        return identityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_USER.identity_type
     *
     * @param identityType the value for AUTH_USER.identity_type
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_USER.identifier
     *
     * @return the value of AUTH_USER.identifier
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_USER.identifier
     *
     * @param identifier the value for AUTH_USER.identifier
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier == null ? null : identifier.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AUTH_USER.credential
     *
     * @return the value of AUTH_USER.credential
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public String getCredential() {
        return credential;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AUTH_USER.credential
     *
     * @param credential the value for AUTH_USER.credential
     *
     * @mbg.generated Fri Apr 03 18:54:45 CST 2020
     */
    public void setCredential(String credential) {
        this.credential = credential == null ? null : credential.trim();
    }
}