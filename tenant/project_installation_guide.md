# *Creation of Project from [https://start.spring.io/](Spring Initializr)*

Step: 1

#### **Project Metadata**

Group: com.thoughts.tenant

Artifact: tenant

Name: tenant

Description: Tenant project using Spring Boot

Package name: com.thoughts.tenant.tenant

Packaging: Jar

Java: 8

Step 2: 

#### Dependencies

**Lombok** `DEVELOPER TOOLS` Java annotation library which helps to reduce boilerplate code.

**Spring Web** `WEB` Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

**Spring Data JPA** `SQL` Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.

**Spring Boot DevTools **`Developer Tools`Provides fast application restarts, LiveReload, and configurations for enhanced development experience.

Step 3:

Click on **Generate** button.

# *Import project into Eclipse*

Step 1: 

Extract the downloaded project tenant.zip

Step 1:

Right click Package explorer 

-> Select Import 

-> Maven -- Existing Maven Projects 

-> Root Directory Browse the project from Downloads folder 

-> Select tenant contains project files like .mvn and pom.xml etc., 

-> select pom.xml or Click `Select Tree` at right side.

-> Click `Finish`


# *Maven Configuration*
Step 1: 

-> Right click on project

-> Goto Debug As -> 5 Maven clean

-> Again right click Goto Debug As -> 3 Maven build

-> At Goals type `clean install -Dmaven.test.skip=true`

-> Click `Debug`

Step 2:

-> right click on project

-> goto Maven -> Update project

-> check `Force Update of Snapshots/Releases`

-> click `OK`

`Hurry All errors are gone`

# * Java Configuration*
Step 1:
-> right click on project
-> Build Path -> Configure Build Path
-> Select Libraries Tab -> Select `JRE System Library` from Panel

-> Click `Edit`

Step 1.1: 

`If JDK not found add by `

`-> Click on Installed JREs..`

`-> Click on Add..`

`-> Standard VM -> Next`

`-> Click on Directory -> Select Java installed folder like C:\Program Files\Java\jdk1.8.0_221`

`-> Click on Finish -> Apply and Close`

`End Step 1.1`

`Select any one from below options`

-> Execution environment -> Select `JavaSE-1.8(jdk1.8.x_xxx)` from dropdown 

`or`

-> Alternate JRE: Select jdk1.8.x_xxx from dropdown

`or`

-> Workspace default JRE (jdk1.8.x_xxx)

Note: Project should be run using `JDK` only.

-> `Finish -> Apply and Close`

# *MongoDB Configuration*

Step 1:
Create folder tenant under path `D:\Backup\data\4.2.0\`

#   1. Start / Run your MongoDB database.
      To start MongoDB, invoke mongod.exe.
`Open the Windows Command Interpreter(Win + R)` execute below line
> D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin\mongod.exe --dbpath="D:\Backup\data\4.2.0\tenant"

## After run the command you will see somewhere in executed lines `waiting for connections on port 27017`, it indicates `MongoDB server running successfully`.

Step 2:
	## Connect to MongoDB.
To connect to MongoDB through the mongo.exe shell, open another Command Interpreter(Win + R)` execute below line.
> D:\Backup\Softwares\mongodb-win32-x86_64-enterprise-windows-64-4.2.0\bin\mongo.exe

Step 3:
create a database in MongoDB. / Select Database to Work With
   The **use** Command
   `use <DATABASE_NAME>` is used to create database. The command will create a new database if it doesn't exist, otherwise it will return the existing database.

   Syntax:	Basic syntax of use DATABASE statement is as follows −

   >use DATABASE_NAME

   If you want to use a database with name <tenant>, then use DATABASE statement would be as follows
```
   >use tenant
```
O/P: switched to db tenant

#### 2.2 To check your currently selected database, use the command db
```
   >db
```
O/P: tenant

#### 2.3 If you want to check your databases list, use the command show dbs.
```
   >show dbs
```
O/P:
	admin   0.000GB
	config  0.000GB
	local   0.000GB

Step 4:
Connect and Authenticate as the user administrator
4.1 Add user to DB

   `>db.createUser({user:"admin", pwd:"admin",roles:["readWrite","dbAdmin"]})`

   
   