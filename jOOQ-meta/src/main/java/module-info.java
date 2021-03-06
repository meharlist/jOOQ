/* [java-9] */
/**
 * The jOOQ code generation meta model module.
 */
module org.jooq.meta {
    requires org.jooq;

    // There are a few JAXB dependencies:
    // - The XMLDatabase works with JAXB-annotated InformationSchema types
    // - The code generation configuration is also JAXB enabled
    requires java.xml.bind;

    exports org.jooq.meta;
    exports org.jooq.meta.jaxb;
    exports org.jooq.meta.jdbc;
    exports org.jooq.meta.xml;

















    exports org.jooq.meta.cubrid;
    exports org.jooq.meta.derby;
    exports org.jooq.meta.firebird;
    exports org.jooq.meta.h2;
    exports org.jooq.meta.hsqldb;
    exports org.jooq.meta.mariadb;
    exports org.jooq.meta.mysql;
    exports org.jooq.meta.postgres;
    exports org.jooq.meta.sqlite;
}
/* [/java-9] */