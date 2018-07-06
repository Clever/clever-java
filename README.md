# Clever Java Library

Client library for the Clever API

## Installation

Manually install the Clever JAR: https://github.com/Clever/clever-java/releases

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.clever</groupId>
    <artifactId>client</artifactId>
    <version>0.3.5</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.clever:client:0.3.5"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-0.3.5.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:
```
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.DefaultApi;
import io.swagger.client.auth.OAuth;
import io.swagger.client.model.*;

public class CleverAPI {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure OAuth2 access token for authorization: oauth
        // Note: This is hard coded for demo purposes only. Keep your access tokens secret!
        // https://dev.clever.com/docs/security#section-security-best-practices
        OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
        oauth.setAccessToken("TEST_TOKEN");

        DefaultApi api = new DefaultApi();
        try {
            StudentsResponse students = api.getStudents(10, null, null);
            for (StudentResponse student : students.getData()) {
                System.out.println("Student IDs: " + student.getData().getId());
            }
        } catch (ApiException e) {
            System.err.println("Exception:");
            e.printStackTrace();
        }
    }
}
```

### Events Usage
Since events are polymorphic, we use the type to determine how to cast them. For example:
```
public void processEvents(DefaultApi api) {
    EventsResponse eventsResponse = api.getEvents(10, null, null);

    for (EventResponse eventResp : eventsResponse.getData()) {
        if (eventResp.getData().getType() == "students.created") {
            StudentsCreated event = (StudentsCreated)eventResp.getData();
            // Process the event...
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.clever.com/v1.2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataApi* | [**getContact**](docs/DataApi.md#getContact) | **GET** /contacts/{id} |
*DataApi* | [**getContacts**](docs/DataApi.md#getContacts) | **GET** /contacts |
*DataApi* | [**getContactsForStudent**](docs/DataApi.md#getContactsForStudent) | **GET** /students/{id}/contacts |
*DataApi* | [**getDistrict**](docs/DataApi.md#getDistrict) | **GET** /districts/{id} |
*DataApi* | [**getDistrictAdmin**](docs/DataApi.md#getDistrictAdmin) | **GET** /district_admins/{id} |
*DataApi* | [**getDistrictAdmins**](docs/DataApi.md#getDistrictAdmins) | **GET** /district_admins |
*DataApi* | [**getDistrictForSchool**](docs/DataApi.md#getDistrictForSchool) | **GET** /schools/{id}/district |
*DataApi* | [**getDistrictForSection**](docs/DataApi.md#getDistrictForSection) | **GET** /sections/{id}/district |
*DataApi* | [**getDistrictForStudent**](docs/DataApi.md#getDistrictForStudent) | **GET** /students/{id}/district |
*DataApi* | [**getDistrictForStudentContact**](docs/DataApi.md#getDistrictForStudentContact) | **GET** /contacts/{id}/district |
*DataApi* | [**getDistrictForTeacher**](docs/DataApi.md#getDistrictForTeacher) | **GET** /teachers/{id}/district |
*DataApi* | [**getDistrictStatus**](docs/DataApi.md#getDistrictStatus) | **GET** /districts/{id}/status |
*DataApi* | [**getDistricts**](docs/DataApi.md#getDistricts) | **GET** /districts |
*DataApi* | [**getGradeLevelsForTeacher**](docs/DataApi.md#getGradeLevelsForTeacher) | **GET** /teachers/{id}/grade_levels |
*DataApi* | [**getSchool**](docs/DataApi.md#getSchool) | **GET** /schools/{id} |
*DataApi* | [**getSchoolAdmin**](docs/DataApi.md#getSchoolAdmin) | **GET** /school_admins/{id} |
*DataApi* | [**getSchoolAdmins**](docs/DataApi.md#getSchoolAdmins) | **GET** /school_admins |
*DataApi* | [**getSchoolForSection**](docs/DataApi.md#getSchoolForSection) | **GET** /sections/{id}/school |
*DataApi* | [**getSchoolForStudent**](docs/DataApi.md#getSchoolForStudent) | **GET** /students/{id}/school |
*DataApi* | [**getSchoolForTeacher**](docs/DataApi.md#getSchoolForTeacher) | **GET** /teachers/{id}/school |
*DataApi* | [**getSchools**](docs/DataApi.md#getSchools) | **GET** /schools |
*DataApi* | [**getSchoolsForSchoolAdmin**](docs/DataApi.md#getSchoolsForSchoolAdmin) | **GET** /school_admins/{id}/schools |
*DataApi* | [**getSection**](docs/DataApi.md#getSection) | **GET** /sections/{id} |
*DataApi* | [**getSections**](docs/DataApi.md#getSections) | **GET** /sections |
*DataApi* | [**getSectionsForSchool**](docs/DataApi.md#getSectionsForSchool) | **GET** /schools/{id}/sections |
*DataApi* | [**getSectionsForStudent**](docs/DataApi.md#getSectionsForStudent) | **GET** /students/{id}/sections |
*DataApi* | [**getSectionsForTeacher**](docs/DataApi.md#getSectionsForTeacher) | **GET** /teachers/{id}/sections |
*DataApi* | [**getStudent**](docs/DataApi.md#getStudent) | **GET** /students/{id} |
*DataApi* | [**getStudentForContact**](docs/DataApi.md#getStudentForContact) | **GET** /contacts/{id}/student |
*DataApi* | [**getStudents**](docs/DataApi.md#getStudents) | **GET** /students |
*DataApi* | [**getStudentsForSchool**](docs/DataApi.md#getStudentsForSchool) | **GET** /schools/{id}/students |
*DataApi* | [**getStudentsForSection**](docs/DataApi.md#getStudentsForSection) | **GET** /sections/{id}/students |
*DataApi* | [**getStudentsForTeacher**](docs/DataApi.md#getStudentsForTeacher) | **GET** /teachers/{id}/students |
*DataApi* | [**getTeacher**](docs/DataApi.md#getTeacher) | **GET** /teachers/{id} |
*DataApi* | [**getTeacherForSection**](docs/DataApi.md#getTeacherForSection) | **GET** /sections/{id}/teacher |
*DataApi* | [**getTeachers**](docs/DataApi.md#getTeachers) | **GET** /teachers |
*DataApi* | [**getTeachersForSchool**](docs/DataApi.md#getTeachersForSchool) | **GET** /schools/{id}/teachers |
*DataApi* | [**getTeachersForSection**](docs/DataApi.md#getTeachersForSection) | **GET** /sections/{id}/teachers |
*DataApi* | [**getTeachersForStudent**](docs/DataApi.md#getTeachersForStudent) | **GET** /students/{id}/teachers |
*EventsApi* | [**getEvent**](docs/EventsApi.md#getEvent) | **GET** /events/{id} |
*EventsApi* | [**getEvents**](docs/EventsApi.md#getEvents) | **GET** /events |
*EventsApi* | [**getEventsForSchool**](docs/EventsApi.md#getEventsForSchool) | **GET** /schools/{id}/events |
*EventsApi* | [**getEventsForSchoolAdmin**](docs/EventsApi.md#getEventsForSchoolAdmin) | **GET** /school_admins/{id}/events |
*EventsApi* | [**getEventsForSection**](docs/EventsApi.md#getEventsForSection) | **GET** /sections/{id}/events |
*EventsApi* | [**getEventsForStudent**](docs/EventsApi.md#getEventsForStudent) | **GET** /students/{id}/events |
*EventsApi* | [**getEventsForTeacher**](docs/EventsApi.md#getEventsForTeacher) | **GET** /teachers/{id}/events |


## Documentation for Models

 - [BadRequest](docs/BadRequest.md)
 - [Credentials](docs/Credentials.md)
 - [District](docs/District.md)
 - [DistrictAdmin](docs/DistrictAdmin.md)
 - [DistrictAdminResponse](docs/DistrictAdminResponse.md)
 - [DistrictAdminsResponse](docs/DistrictAdminsResponse.md)
 - [DistrictObject](docs/DistrictObject.md)
 - [DistrictResponse](docs/DistrictResponse.md)
 - [DistrictStatus](docs/DistrictStatus.md)
 - [DistrictStatusResponse](docs/DistrictStatusResponse.md)
 - [DistrictStatusResponses](docs/DistrictStatusResponses.md)
 - [DistrictsResponse](docs/DistrictsResponse.md)
 - [Event](docs/Event.md)
 - [EventResponse](docs/EventResponse.md)
 - [EventsResponse](docs/EventsResponse.md)
 - [GradeLevelsResponse](docs/GradeLevelsResponse.md)
 - [InternalError](docs/InternalError.md)
 - [Location](docs/Location.md)
 - [Name](docs/Name.md)
 - [NotFound](docs/NotFound.md)
 - [Principal](docs/Principal.md)
 - [School](docs/School.md)
 - [SchoolAdmin](docs/SchoolAdmin.md)
 - [SchoolAdminObject](docs/SchoolAdminObject.md)
 - [SchoolAdminResponse](docs/SchoolAdminResponse.md)
 - [SchoolAdminsResponse](docs/SchoolAdminsResponse.md)
 - [SchoolObject](docs/SchoolObject.md)
 - [SchoolResponse](docs/SchoolResponse.md)
 - [SchoolsResponse](docs/SchoolsResponse.md)
 - [Section](docs/Section.md)
 - [SectionObject](docs/SectionObject.md)
 - [SectionResponse](docs/SectionResponse.md)
 - [SectionsResponse](docs/SectionsResponse.md)
 - [Student](docs/Student.md)
 - [StudentContact](docs/StudentContact.md)
 - [StudentContactObject](docs/StudentContactObject.md)
 - [StudentContactResponse](docs/StudentContactResponse.md)
 - [StudentContactsForStudentResponse](docs/StudentContactsForStudentResponse.md)
 - [StudentContactsResponse](docs/StudentContactsResponse.md)
 - [StudentObject](docs/StudentObject.md)
 - [StudentResponse](docs/StudentResponse.md)
 - [StudentsResponse](docs/StudentsResponse.md)
 - [Teacher](docs/Teacher.md)
 - [TeacherObject](docs/TeacherObject.md)
 - [TeacherResponse](docs/TeacherResponse.md)
 - [TeachersResponse](docs/TeachersResponse.md)
 - [Term](docs/Term.md)
 - [DistrictsCreated](docs/DistrictsCreated.md)
 - [DistrictsDeleted](docs/DistrictsDeleted.md)
 - [DistrictsUpdated](docs/DistrictsUpdated.md)
 - [SchooladminsCreated](docs/SchooladminsCreated.md)
 - [SchooladminsDeleted](docs/SchooladminsDeleted.md)
 - [SchooladminsUpdated](docs/SchooladminsUpdated.md)
 - [SchoolsCreated](docs/SchoolsCreated.md)
 - [SchoolsDeleted](docs/SchoolsDeleted.md)
 - [SchoolsUpdated](docs/SchoolsUpdated.md)
 - [SectionsCreated](docs/SectionsCreated.md)
 - [SectionsDeleted](docs/SectionsDeleted.md)
 - [SectionsUpdated](docs/SectionsUpdated.md)
 - [StudentcontactsCreated](docs/StudentcontactsCreated.md)
 - [StudentcontactsDeleted](docs/StudentcontactsDeleted.md)
 - [StudentcontactsUpdated](docs/StudentcontactsUpdated.md)
 - [StudentsCreated](docs/StudentsCreated.md)
 - [StudentsDeleted](docs/StudentsDeleted.md)
 - [StudentsUpdated](docs/StudentsUpdated.md)
 - [TeachersCreated](docs/TeachersCreated.md)
 - [TeachersDeleted](docs/TeachersDeleted.md)
 - [TeachersUpdated](docs/TeachersUpdated.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://clever.com/oauth/authorize
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Generating the JAR
1. Git clone Clever's swagger-api repo (https://github.com/Clever/swagger-api)
2. Install Java 7 or 8, Maven 3.3.3+, and swagger-codegen 2.3.1 via `brew`
3. Update the `artifactVersion` version in `clever-java.properties`
4. Re-generate the files:
```
make generate
```
5. Package the JAR:
```
make build
```
That will put the jar in: `target/client-X.Y.Z.jar`


## Publishing

To publish this library first set up your settings.xml (~/.m2/settings.xml) as described here: http://central.sonatype.org/pages/apache-maven.html. In particular setting up the ossrh profile using the clever-eng username / password and setting up the GPG profile with the security@clever.com PGP key.

Then run:
```
make release
```

This will deploy to: https://oss.sonatype.org/content/groups/public/com/clever/client/

The jar will be synced over to the Maven central repository within the next few hours.

### Publishing Troubleshooting
If you get an `Inappropriate ioctl for device error` try the commands here: https://github.com/pstadler/keybase-gpg-github/pull/13/files

If you get an error about `repository element was not specified in the POM inside distributionManagement element`, you need to add the deployment configuration back into `pom.xml`, as follows:

Under the `<project>` element add:
```
    <distributionManagement>
        <snapshotRepository>
            <id>ossrh</id>
            <url>https://oss.sonatype.org/content/repositories/snapshots</url>
        </snapshotRepository>
    </distributionManagement>
```

Under `<plugins>` add:
```
            <plugin>
                <groupId>org.sonatype.plugins</groupId>
                <artifactId>nexus-staging-maven-plugin</artifactId>
                <version>1.6.7</version>
                <extensions>true</extensions>
                <configuration>
                    <serverId>ossrh</serverId>
                    <nexusUrl>https://oss.sonatype.org/</nexusUrl>
                    <autoReleaseAfterClose>true</autoReleaseAfterClose>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-gpg-plugin</artifactId>
                <version>1.5</version>
                <executions>
                    <execution>
                    <id>sign-artifacts</id>
                    <phase>verify</phase>
                    <goals>
                        <goal>sign</goal>
                    </goals>
                    </execution>
                </executions>
            </plugin>
```
