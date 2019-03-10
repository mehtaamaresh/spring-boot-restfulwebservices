insert into user_bean values(1100, sysdate(), 'AlfaOne');
insert into user_bean values(1200, sysdate(), 'BetaOne');
insert into user_bean values(1300, sysdate(), 'DeltaOne');

insert into posts_bean values (1111, 'post one', 1100);
insert into posts_bean values (1112, 'post two', 1100);

insert into posts_bean values (1140, 'post one', 1200);
insert into posts_bean values (1141, 'post two', 1200);


insert into resume_bean values(1,'2-6 PM CST','1-2 PM & 4-6 PM CST','Wipro Limited','2nd Sep 1989','mehtaamaresh@gmail.com','100-120 USD pa','DFW','2 weeks','NA','Java, J2EE, Spring, Spring boot, Microservices, RESTful webservices, Cloud - PCF, AWS','**1602','H1B','https://www.linkedin.com/in/amaresh-chandra-5b986319/','H1B transfer','+1 469 986 9729','Amaresh Chandra','J9794545','Hike and GC','open to relocate','6328 N Macarthur blvd, Irving, TX-75039','Professional Senior Software Engineer with 8 years of experience in an IT industry, skilled in Requirements Gathering and Analysis, Research & Development for Microservices, Dashboard and Web Applications with Cloud Enablement having good knowledge in Java and Groovy based application design, development and maintenance following Agile Methodology.','mehtaamaresh@gmail.com',3);
insert into references_bean values(1,'Citi group','Team Lead','+1 214 228 1108','yazad.irani@wipro.com','Yazad Irani',1);
insert into references_bean values(2,'Citi group','Team Lead','+1 214 675 6197','sumeet11.bhatia@nttdata.com','Sumeet Bhatia',1);

insert into EDUCATION_BEAN values (1,'2015','Masters in Software Engineering (MS)','Computer Science','Bangalore, KA, India','Bits Pilani - Work Integrated Regular',1);
insert into EDUCATION_BEAN values (2,'2010','Bachelor in Computer Application (BCA)','Computer Science','Bangalore, KA, India','Bangalore University',1);
insert into EDUCATION_BEAN values (3,'2007','High School','Academic with Computer Science','Bokaro Steel City, JH, India','CBSE',1);

insert into EMPLOYMENT_BEAN values (1, 'Bangalore, KA, India', 'Wipro Limited', '27th Sep 2010', 1);

insert into SWOTANALYSIS_BEAN values (1, 'Building Good Client and Partner Relationships', 1,1);
insert into SWOTANALYSIS_BEAN values (2, 'Ability to learn quickly and efficiently', 1,1);
insert into SWOTANALYSIS_BEAN values (3, 'RnD and Analysis until I solve the tasks', 1,1);
insert into SWOTANALYSIS_BEAN values (4, 'Being up to date to the market', 1,1);
insert into SWOTANALYSIS_BEAN values (5, 'Ability to lead and be part of the Team', 1,1);
insert into SWOTANALYSIS_BEAN values (6, 'Always look for the solution, if I am struck in task, even in personal hours', 2,1);
insert into SWOTANALYSIS_BEAN values (7, 'Extend my working hours, if the solution is not perfect', 2,1);
insert into SWOTANALYSIS_BEAN values (8, 'Always looking for opportunity to learn whats new or the one I do not know', 3,1);
insert into SWOTANALYSIS_BEAN values (9, 'Going out of the market due to lack of knowledge', 4,1);

insert into EXPERIENCE_HISTORY_BEAN  values (1, 'Citi group','Development:
As a developer my responsibilities were as follows but not limited to -
Requirements gathering and analysis based on the wireframes and copy deck shared by the
Client and helping to creating user stories and tasks sprint by sprint basis.
Designing the services and endpoints based on the Domain Driven Design approach and
Richardson’s Maturity model.
Creating the starter packs for the microservices implementing the design pattern and client
approved process and standards and making it available to the team.
Have implemented restful microservices following Spring, Spring boot and spring MVC
flavors under Maven dependency management structure.
Have implemented and used configuration management service that allows the sub/other
microservices to access the configuration of common information from properties stored in
Github repository as an SCM. This implements Spring cloud bus to handle dynamic
application properties refresh.
Have implemented and used MongoDB and Apache Cassandra to store and manage the data
and information in the project and also used JPA H2/MySql and Cache for temporary data
processing.
Have implemented Netflix Ribbon client to achieve client side load balancing.
Have also implemented Netflix Eureka as a register server for all related domain services.
Have implemented fault tolerance through Netflix Hystrix, to handle unexpected errors and
exceptions.
Have used Netflix Zuul as an internal API gateway and IBM’s APIManager as external
gateway for microservices authentication, validation, logging and token exchange.
Have utilized RabbitMQ and Zipkin Server for fault tracing and flow tracking.
Have used Pivotal Could Foundry (PCF) application PaaS and Docker container for
microservices deployment, management and continuous delivery with Jenkins.
Configured manifest.yml for PCF deployments for the microservices and Dockerization via
Dockerfile configuration. Utilized CF and Docker CLI’s for artifacts creation.
Enabled Auto Scaling for microservices instances depending on the hits to the service also
have set lower and higher limits whenever required.
Working on Amazon Web Services (AWS) as an RnD for migrating current setup from
PCF. Worked on S3 and EC2 for deployments and running of microservices.
Implementation of various functionality/enhancements and bug fixes based on the priority.
Major areas worked on - Accounts, Transactions, Rewards, Customer, etc.
Design - Domain Driven Design, Re-useability scope, Line of Business boundary,
Architecture - Domain, CRUD, Aggregator, Orchestrator, Presentation services. Creating
Swagger contracts for the API/EndPoints.
User Experience:
Research and development on the User Experience implementation and improvement based
on customer’s need.
Testing:
As a test driven development, my responsibilities were writing JUnit test cases and ensuring
the implementations are bug free and meet customer’s requirements.
Closing sprint with the demo and marking user stories and tasks as resolved.
Checking logs for the dashboards/applications/scripts proper health and execution.
Team Management:
As an acting lead my responsibilities were facilitating the stand-up and team meetings with
onsite and offshore team members, report generation for Backlog, Sprint, User Stories, Tasks
and Bugs.','Java J2EE 8, Maven, MVC, Spring, Spring Boot, Spring Cloud, Spring Cloud Bus,
RabbitMQ, Zipkin, Hibernate / JPA, H2, Web Service REST, Apache Tomcat, Domain
Driven Design Architecture, API Manager, Netflix Zuul, Netflix Ribbon, Netflix Eureka,
Hystrix, PCF, AWS, Docker, MongoDB, Cassandra, Agile / Scrum','Irving, TX','Fusion commercial is one of the initiative where-in Citi bank is building multiple web based
applications and re-usable microservices for the Citi Retail Cards customers/partners
including consumer and commercial cards, which fulfills their basic day-to-day banking
needs. This initiative is building multiple applications and microservices based on Citi bank
clients/partners - HomeDepo, BestBuy, Sears and many others.','Since Aug-2015 to current','Information Engineering / Fusion Commercial','Java Microservice Developer, Domain Driven Design and Architecture, Acting Team Lead', 1);


insert into EXPERIENCE_HISTORY_BEAN  values (2, 'Cisco','Development:
As a developer my responsibilities were gathering the requirements based on the copy deck
and wireframes. Creating user stories with tasks and scheduling them in sprints. Moreover,
pulling the bug reports and prioritizing them based on the release plan.
Implementation of various functionality/enhancements and bug fixes.
Have implemented High Charts and JQWidgets to project data from various sources for bug
report, test case execution and code coverage under each projects defined.
Have implemented role based view for the logged-in user to the dashboard.
Design - Wireframe design, Database Schema design, Python (Django) Environment setup,
Charts and Widgets creation.
User Experience:
Research and development on the User Experience implementation and improvement based
on customers need.
Testing:
As a test driven development my responsibilities were writing JUnit test cases and ensuring
the implementations are bug free and meet customer’s requirements.
Closing sprint with the demo and marking user stories and tasks as resolved.
Checking logs for the dashboards/applications/scripts proper health and execution.
Team Management:
As an acting lead my responsibilities were facilitating the stand-up and team meetings, report
generation for Backlog, Sprint, User Stories, Tasks and Bugs.','Java J2EE 8, JavaScript, JQuery, HTML, Python (Django), MVC, High Chart, Google Chart,
Apache Tomcat, Agile / Scrum','Bangalore, KA, India','Management dashboards for Projects, Engineers and Work items allocation, management
and reports. Execution Dashboard – Monitor and Control Continues Integration (Build),
Management Dashboard – Monitor Status and Health of Products w.r.t Executive,
Management and Engineer views.
Data-sources: Bug repository (CDETS), Test Case repository (TIMS), Code Coverage','Dec 2014 – June 2015','NCS Automation Dashboard','Java Application Developer, UI Designer and Developer',1);

insert into EXPERIENCE_HISTORY_BEAN values (3, 'Cisco','Development:
As a developer my responsibilities were gathering the requirements for the enhancements
and bug fixes. UI improvements to meet customer needs and improve customer experience.
Monitoring Rally Data Push job which runs every day for success and failure scenarios.
Providing fixes and support for modules, database errors and exceptions. Handling
exceptions/failures and re-execution of job. Reporting changes/status to the whole team.
Helping team members to understand the tool and execution cycle.
Testing:
As a test driven development my responsibilities were writing JUnit test cases and ensuring
the implementations are bug free and meet customer’s requirements.','Java J2EE 8, Apache Tomcat, JavaScript, HTML','Bangalore, KA, India','Rally Data Feed – Application which keeps Clarity/NVOT application and Rally tool in
sync. The tool runs once in a day pushing changes made to - projects, milestones, tasks, start
and end dates of the engineers to the common database.','Mar 2015 – Jun 2015','Rally Data Feed','Java Application Developer, UI Enhancements',1);

insert into EXPERIENCE_HISTORY_BEAN values (4,'Cisco','Development:
As a developer my responsibilities were gathering the requirements for the enhancements.
UI improvements to meet customer needs and improve customer experience.
Creating user stories with tasks and scheduling them in sprints. Moreover, pulling the bug
reports and prioritizing them based on the release plan.
Implementation of the functionality/enhancements and bug fixes.
Testing:
As a test driven development my responsibilities were writing JUnit test cases and ensuring
the implementations are bug free and meet customer’s requirements.
Closing sprint with the demo and marking user stories and tasks as resolved.
Checking logs for the dashboards/applications/scripts proper health and execution.','Java J2EE 8, Web Service, REST, Apache Tomcat, Spring, Oracle, JavaScript, HTML,
Agile / Scrum','Bangalore, KA, India','NVOT was the 3rd version of the dashboard for monitoring and managing various projects,
milestones, tasks and engineer’s information which are pulled via Clarity Web services. The
tool generates multiple reports with Static Project Id and Dynamic Releases fetching all
related data via web services and manipulates before projecting it to the users/customer.','Jun 2014 – Dec 2014','NVOT3 dashboard','Java Application Developer, UI Enhancements',1);

insert into EXPERIENCE_HISTORY_BEAN  values (5,'Cisco','Development:
As a developer my responsibilities were gathering the requirements based on customer
requirement deck or wireframes. Creating user stories with tasks and scheduling them in
sprints. Moreover, pulling the bug reports and prioritizing them based on the release plan.
Implementation of the functionality/enhancements and bug fixes.
Adding JUnit test cases and providing code coverage with critical sonar fixes.
User Experience:
Created FAQs and Help videos to help customers/users on the functionalities and application
related queries. This helped to save the turnaround time and accelerated the development and
management process.
Remedy tickets were automatically generated via application, if any issue is encountered by
a customer/user.
Testing:
As a test driven development my responsibilities were writing JUnit test cases and ensuring
the implementations are bug free and meet customer’s requirements.
Closing sprint with the demo and marking user stories and tasks as resolved.
Checking logs for the dashboards/applications/scripts proper health and execution.','Java J2EE 6, Groovy on Grails, Web Services, REST, Spring, Hibernate, MVC, Oracle,
JavaScript, HTML, Apache Tomcat, JellyFish, Agile / Scrum, Remedy Automation','Bangalore, KA, India','Source Control Information and Metadata Services for development and maintenance of
various Applications and Tools using clearcase configuration and datastore.
These applications maintains and implements all aspects of the clearcase (Software
Configuration Management).
Below are few applications - CTS – Monolith Component Tracking System. The application provides information on the
monolith components created in CISCO for all networking and engineering needs.
CARETS – Bug Component Management System. The application provides information on
the bugs and its lifecycle in CISCO. HoleLocator – Hole and Branch Tracking System. The
application provides information on the all branches created from the component and tracks
the bugs which were fixed or not fixed. FACT and Fixes Integrated – Fixed Bug Tracking
System. The application provides reports on fixes that were incorporated and details on
them. FileOwnership – The application for authentication of clearcase users with respect to
their roles i.e. component owner, committer, codereviewer, branch owner and owner/
manager.','Aug 2012 – July 2014','SCIaM','Java Application Developer, UI Designer and Developer',1);

insert into EXPERIENCE_HISTORY_BEAN  values (6,'Cisco','Development:
As a developer my responsibilities were gathering the requirements based on the copy deck
and wireframes. Creating user stories with tasks and scheduling them in sprints. Moreover,
pulling the bug reports and prioritizing them based on the release plan.
Implementation of the functionality/enhancements and bug fixes.
Adding JUnit test cases and providing code coverage with critical sonar fixes. Testing:
As a test driven development and QA my responsibilities were writing JUnit test cases and
ensuring the implementations are bug free and meet customer’s requirements.
Closing sprint with the demo and marking user stories and tasks as resolved.
Checking logs for the dashboards/applications/scripts proper health and execution.
As an acting scrum master facilitating the stand-up and team meetings with report generation
for Backlog, Sprint and Bugs.
Developed a project SharePoint website to track various information related to project.','Java J2EE 6, Apache Tomcat, MVC, JDBC, Oracle, JavaScript, HTML, Agile / Scrum','Bangalore, KA, India','A femtocell CPE (Client Premise Equipment) is a small cellular base station designed for use
in residential or small business environments. It connects to the service provider’s network
via broadband (such as DSL or cable). A femtocell allows service providers to extend service
coverage inside of your home - especially where access would otherwise be limited or
unavailable - without the need for expensive cellular towers. The Dashboards and
Applications help to run and maintain the CPEs.','Jan 2011 – Jun 2012','FemToCell','Java Application Developer, UI Enhancements, Scrum Master',1);

