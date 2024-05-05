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

// Spring modules
// 1. Spring Core
// 2. Spring Context
// 3. Spring JDBC
// 4. Spring ORM
// 5. Spring AOP
// 6. Spring Web MVC
// 7. Spring Security
// 8. Spring Batch
// 9. Spring Data JPA
// 10. Spring REST
// 11. Spring Social
// 12. Spring Cloud

// Type of IOC
// 1. Bean Factory (outdated)
// 2. Application Context (recommended)

// How to create Spring Core App
// 1. Create a maven project
// 2. Add Spring Context dependency
// 3. Create Required class
// 4. Create Beans.xml
// 5. Create main (driver) to start IOC container