module persistence {
    requires jakarta.persistence;
    requires spring.beans;
    requires spring.context;
    requires spring.data.jpa;
    requires spring.data.commons;

    exports com.example.model;
    exports com.example.service;
    exports com.example.repository;
}