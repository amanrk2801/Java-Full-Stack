//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

// Course Context :
// Pre-Requisite => Core Java + Adv. Java + SQL
// Note : Adv. Java => Servlet + JDBC
/*
1. Spring Core
2. Spring Boot
3. Spring Data JPA
4. Spring Web MVC
5. REST-ful Services
6. Microservices
7. Spring Security
8. Spring Cloud
9. Cache
10. Cloud deployment
11. Docker
12. Kafka
13. K8
14. Unit testing
 */

// Project = Business Logic + Common Logic
// Frameworks:
// Java : Hibernate, Structs, Spring
// Python : Django, flask
// Salesforce: Lightning
// .net : WCF

// Tools:
/*
1. Maven -> build tool
2. Jira -> track
3. Jen-king -> CI/CD (flow: Job->Quality Assurance->System integration testing->PreProduction->Production)
4. J-Meter -> load test functional behavior and measure performance
5. Postman -> API testing
6. SonarQube -> detecting and removing secrets in code
 */

// Application Architecture:
// UI(presentation logic) => Backend((web layer(restApi)+(business layer)+(Integration logic+DAO)) => Database(persistence store)
// (html,css,React...) => (Java, J2EE, Spring Boot, JPA, REST, JSON, Micro., Security, cache) => (Oracle, MySQL, Mongodb, Postgres)

// Architecture Types:
// 1. Monolithic -> Monolithic applications are built as a single unit
// 2. Microservices -> Microservices are made up of smaller, independently deployable services.

// Types of framework
// 1. Frontend: Angular, React(library)
// 2. Web-Framework: Spring Framework to overcome struct framework
// 3. ORM: To develop persistence layer(DB) eg: Hibernate

/*
// Spring modules
1. Spring Core
It is the base module
Provide fundamental concept of Spring framework
    1. IOC container
    2. Dependency Injection
    3. Bean Life cycle
    4. Bean Scope
    5. Autowiring
Spring core is all about Managing dependencies
among the classes with loosely coupling
Spring core classes:
    1. POJO
    2. Java Beans
    3. Component

    1. POJO(Plain old Java Object)
    Any java class that can be complied by using JDK

    2. Java Beans
    Any java class which follow specific rules
        1. class should implement serializable interface
        2. class should have private variable
        3. private variable should have public get & set
        4. class should have zero-arg constructor

    3. Component
    Contains business logic
    ex: Controller -> deal with req & res
        service -> Business logic
        DAO classes -> DB logic

Dependency Injection
It is the process of injecting one class object into another class
is called DI
    DI: Setter DI, Constructor DI, Field DI

2. Spring Context
Deal with configurations

3. Spring JDBC
Simplify Database connection logic

4. Spring ORM
Object Relational Mapping

5. Spring AOP
Aspect oriented programming
    eg: Login, Auditing, exception handling

6. Spring Web MVC
Web App & Distributed App

7. Spring Security
Authentication & Authorization
JWT
OAuth2.0

8. Spring Batch

9. Spring Data JPA

10. Spring REST

11. Spring Social

12. Spring Cloud
Provide common tool to build distributed system
    Discovery Service
    Gateway
    Load Balancer
 */

// Type of IOC
// 1. Bean Factory (outdated)
// -> follow Lazy loading concept that means when we request then only it will create Bean object
// 2. Application Context (recommended)
// -> follow Eager Loading (Beans.xml is a config file)

// Questions
// 1. Spring Bean
// 2. IOC container
// 3. DI types
// 4. How to start IOC
// 5. Bean config file

// Bean Scope
// 1. Singleton (default)
// 2. Proto type
// 3. request
// 4. session

// Autowiring
// 1. Inject dependent bean into target in 2 ways
// -> Manual wiring, Autowiring
// Autowiring means IOC container will identify dependent bean and it will inject into target bean
// Note : We, no need to use ref attribute in bean config file
// Auto wiring will work based on
// byName, byType, byConstructor, no

// How to create Spring Core App
// 1. Create a maven project
// 2. Add Spring Context dependency
// 3. Create Required class
// 4. Create Beans.xml
// 5. Create main (driver) to start IOC container

// Spring Annotations provide a way to configure your Spring application without needing XML configuration files.
/*
1. @Configuration
2. @ComponentScan
3. @Component
4. @Service
5. @Repository
6. @Scope
7. @Autowired
8. @Qualifier
9. @Controller/@RestController
10. @Primary
11. @Bean
12. @Entity
13. @Table
14. @ID
15. @Column
 */

// Spring Boot = Spring Framework - XML config
// Approach to develop Spring Based App with less config
// Spring Boot is not replacement for spring core, Spring boot developed on top of Spring Core.

// Spring Advantages
/*
1. Less config & No xml config
2. Embedded Server
3. Starter dependency -> JPA-starter, web-starter, spring-boot-starter
4. Auto Config
5. Actuator [Production ready feature]
 */

// App Creation
/*
1. Initializer (start.spring.io)
2. STS
 */
