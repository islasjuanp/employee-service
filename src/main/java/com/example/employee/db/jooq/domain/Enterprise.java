/**
 * This class is generated by jOOQ
 */
package com.example.employee.db.jooq.domain;


import com.example.employee.db.jooq.domain.tables.Employee;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.4"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Enterprise extends SchemaImpl {

    private static final long serialVersionUID = -946507531;

    /**
     * The reference instance of <code>enterprise</code>
     */
    public static final Enterprise ENTERPRISE = new Enterprise();

    /**
     * The table <code>enterprise.employee</code>.
     */
    public final Employee EMPLOYEE = com.example.employee.db.jooq.domain.tables.Employee.EMPLOYEE;

    /**
     * No further instances allowed
     */
    private Enterprise() {
        super("enterprise", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
                Employee.EMPLOYEE);
    }
}
