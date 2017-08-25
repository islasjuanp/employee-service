/**
 * This class is generated by jOOQ
 */
package com.example.employee.db.jooq.domain;


import com.example.employee.db.jooq.domain.tables.Employee;
import com.example.employee.db.jooq.domain.tables.records.EmployeeRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>enterprise</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<EmployeeRecord, Integer> IDENTITY_EMPLOYEE = Identities0.IDENTITY_EMPLOYEE;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<EmployeeRecord> KEY_EMPLOYEE_PRIMARY = UniqueKeys0.KEY_EMPLOYEE_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<EmployeeRecord, Integer> IDENTITY_EMPLOYEE = createIdentity(Employee.EMPLOYEE, Employee.EMPLOYEE.EMPLOYEE_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<EmployeeRecord> KEY_EMPLOYEE_PRIMARY = createUniqueKey(Employee.EMPLOYEE, "KEY_employee_PRIMARY", Employee.EMPLOYEE.EMPLOYEE_ID);
    }
}
