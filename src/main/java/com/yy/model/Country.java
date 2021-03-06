package com.yy.model;

import javax.persistence.*;

@Table(name = "`country`")
public class Country {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.id
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.country_name
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    private String countryName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.country_code
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    private String countryCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.version
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.id
     *
     * @return the value of country.id
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.id
     *
     * @param id the value for country.id
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.country_name
     *
     * @return the value of country.country_name
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.country_name
     *
     * @param countryName the value for country.country_name
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.country_code
     *
     * @return the value of country.country_code
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.country_code
     *
     * @param countryCode the value for country.country_code
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.version
     *
     * @return the value of country.version
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.version
     *
     * @param version the value for country.version
     *
     * @mbg.generated Wed Oct 31 11:59:01 CST 2018
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}