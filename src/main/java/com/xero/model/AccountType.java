//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.25 at 11:30:02 AM PDT 
//


package com.xero.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="accountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BANK"/>
 *     &lt;enumeration value="CURRENT"/>
 *     &lt;enumeration value="CURRLIAB"/>
 *     &lt;enumeration value="DEPRECIATN"/>
 *     &lt;enumeration value="DIRECTCOSTS"/>
 *     &lt;enumeration value="EQUITY"/>
 *     &lt;enumeration value="EXPENSE"/>
 *     &lt;enumeration value="FIXED"/>
 *     &lt;enumeration value="INVENTORY"/>
 *     &lt;enumeration value="LIABILITY"/>
 *     &lt;enumeration value="NONCURRENT"/>
 *     &lt;enumeration value="OTHERINCOME"/>
 *     &lt;enumeration value="OVERHEADS"/>
 *     &lt;enumeration value="PREPAYMENT"/>
 *     &lt;enumeration value="REVENUE"/>
 *     &lt;enumeration value="SALES"/>
 *     &lt;enumeration value="TERMLIAB"/>
 *     &lt;enumeration value="PAYGLIABILITY"/>
 *     &lt;enumeration value="SUPERANNUATIONEXPENSE"/>
 *     &lt;enumeration value="SUPERANNUATIONLIABILITY"/>
 *     &lt;enumeration value="WAGESEXPENSE"/>
 *     &lt;enumeration value="WAGESPAYABLELIABILITY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "accountType")
@XmlEnum
public enum AccountType {


    /**
     * Bank
     * 
     */
    BANK,

    /**
     * Current Assets
     * 
     */
    CURRENT,

    /**
     * Current Liabilities
     * 
     */
    CURRLIAB,

    /**
     * Depreciation
     * 
     */
    DEPRECIATN,

    /**
     * Direct Costs
     * 
     */
    DIRECTCOSTS,

    /**
     * Equity
     * 
     */
    EQUITY,

    /**
     * Expenses
     * 
     */
    EXPENSE,

    /**
     * Fixed Assets
     * 
     */
    FIXED,

    /**
     * Inventory
     * 
     */
    INVENTORY,

    /**
     * Liability
     * 
     */
    LIABILITY,

    /**
     * Non-Current Assets
     * 
     */
    NONCURRENT,

    /**
     * Other Income
     * 
     */
    OTHERINCOME,

    /**
     * Overheads
     * 
     */
    OVERHEADS,

    /**
     * Prepayment
     * 
     */
    PREPAYMENT,

    /**
     * Revenue
     * 
     */
    REVENUE,

    /**
     * Sales
     * 
     */
    SALES,

    /**
     * Non-Current Liabilities
     * 
     */
    TERMLIAB,

    /**
     * PAYG Liability
     * 
     */
    PAYGLIABILITY,

    /**
     * Superannuation Expense
     * 
     */
    SUPERANNUATIONEXPENSE,

    /**
     * Superannuation Liability
     * 
     */
    SUPERANNUATIONLIABILITY,

    /**
     * Wages Expense
     * 
     */
    WAGESEXPENSE,

    /**
     * Wages Payable Liability
     * 
     */
    WAGESPAYABLELIABILITY;

    public String value() {
        return name();
    }

    public static AccountType fromValue(String v) {
        return valueOf(v);
    }

}
