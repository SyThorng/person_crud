//package com.g3.person_api.model;
//
//import org.springframework.beans.factory.ObjectProvider;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
//import org.springframework.scheduling.config.Task;
//import org.springframework.transaction.jta.JtaTransactionManager;
//
//import javax.sql.DataSource;
//import java.util.Map;
//
//public class TaskRepository extends JpaBaseConfiguration<Task, Long> {
//    protected TaskRepository(DataSource dataSource, JpaProperties properties, ObjectProvider<JtaTransactionManager> jtaTransactionManager) {
//        super(dataSource, properties, jtaTransactionManager);
//    }
//
//    @Override
//    protected org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter createJpaVendorAdapter() {
//        return null;
//    }
//
//    @Override
//    protected Map<String, Object> getVendorProperties() {
//        return null;
//    }
//}
