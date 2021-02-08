# Evolent Health Project- Contact Module

Evolent Health - Contact Module for manage contact list.
Implement ContactManager using Spring Framework 4.0, Spring MVC 4.0, Java 1.7, Maven, Spring JDBC 4.0, Tomcat 8.5, Java Servlet 3.1, JSP 2.3, JSTL, MySql (MySQL Workbench 8.0) and HTML/CSS/JS.


# About the Project

Project Description:
Design and implement a production ready application for maintaining
contact information. 

Minimum expected functionality:
- List contacts
- Add a contact
- Edit contact
- Delete/Inactivate a contact

Minimum Contact model fields:
- First Name
- Last Name
- Email
- Phone Number
- Status (Possible values: Active/Inactive)


# How to use-

1. Clone this project into your eclipse/STS.
- git clone https://github.com/shri06surbhi/Evolent-Project.git
2. You need to change database details in below files according to your db to connect to your database.
 - "MvcConfiguration.java" file-   /SpringMvcJdbcTemplate/src/main/java/com/spring/contact/config/MvcConfiguration.java 
 - and update the respective dependency in "pom.xml" file-  /SpringMvcJdbcTemplate/pom.xml
3. Create a table "contact" by using mysql script attached in sql folder.
 - /SpringMvcJdbcTemplate/sql/MySQL_script.sql
4. Build the project through maven build.
5. Run the project on Tomcat server. 
