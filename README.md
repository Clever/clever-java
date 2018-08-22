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
    <version>1.0.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.clever:client:1.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-1.0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.DataApi;
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

        DataApi api = new DataApi();

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
public void processEvents(EventsApi api) {
    EventsResponse eventsResponse = api.getEvents(10, null, null, null, null);

    for (EventResponse eventResp : eventsResponse.getData()) {
        if (eventResp.getData().getType() == "students.created") {
            StudentsCreated event = (StudentsCreated)eventResp.getData();
            // Process the event...
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.clever.com/v2.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataApi* | [**getContact**](docs/DataApi.md#getContact) | **GET** /contacts/{id} |
*DataApi* | [**getContacts**](docs/DataApi.md#getContacts) | **GET** /contacts |
*DataApi* | [**getContactsForStudent**](docs/DataApi.md#getContactsForStudent) | **GET** /students/{id}/contacts |
*DataApi* | [**getCourse**](docs/DataApi.md#getCourse) | **GET** /courses/{id} |
*DataApi* | [**getCourseForSection**](docs/DataApi.md#getCourseForSection) | **GET** /sections/{id}/course |
*DataApi* | [**getCourses**](docs/DataApi.md#getCourses) | **GET** /courses |
*DataApi* | [**getDistrict**](docs/DataApi.md#getDistrict) | **GET** /districts/{id} |
*DataApi* | [**getDistrictAdmin**](docs/DataApi.md#getDistrictAdmin) | **GET** /district_admins/{id} |
*DataApi* | [**getDistrictAdmins**](docs/DataApi.md#getDistrictAdmins) | **GET** /district_admins |
*DataApi* | [**getDistrictForContact**](docs/DataApi.md#getDistrictForContact) | **GET** /contacts/{id}/district |
*DataApi* | [**getDistrictForCourse**](docs/DataApi.md#getDistrictForCourse) | **GET** /courses/{id}/district |
*DataApi* | [**getDistrictForDistrictAdmin**](docs/DataApi.md#getDistrictForDistrictAdmin) | **GET** /district_admins/{id}/district |
*DataApi* | [**getDistrictForSchool**](docs/DataApi.md#getDistrictForSchool) | **GET** /schools/{id}/district |
*DataApi* | [**getDistrictForSchoolAdmin**](docs/DataApi.md#getDistrictForSchoolAdmin) | **GET** /school_admins/{id}/district |
*DataApi* | [**getDistrictForSection**](docs/DataApi.md#getDistrictForSection) | **GET** /sections/{id}/district |
*DataApi* | [**getDistrictForStudent**](docs/DataApi.md#getDistrictForStudent) | **GET** /students/{id}/district |
*DataApi* | [**getDistrictForTeacher**](docs/DataApi.md#getDistrictForTeacher) | **GET** /teachers/{id}/district |
*DataApi* | [**getDistrictForTerm**](docs/DataApi.md#getDistrictForTerm) | **GET** /terms/{id}/district |
*DataApi* | [**getDistricts**](docs/DataApi.md#getDistricts) | **GET** /districts |
*DataApi* | [**getSchool**](docs/DataApi.md#getSchool) | **GET** /schools/{id} |
*DataApi* | [**getSchoolAdmin**](docs/DataApi.md#getSchoolAdmin) | **GET** /school_admins/{id} |
*DataApi* | [**getSchoolAdmins**](docs/DataApi.md#getSchoolAdmins) | **GET** /school_admins |
*DataApi* | [**getSchoolForSection**](docs/DataApi.md#getSchoolForSection) | **GET** /sections/{id}/school |
*DataApi* | [**getSchoolForStudent**](docs/DataApi.md#getSchoolForStudent) | **GET** /students/{id}/school |
*DataApi* | [**getSchoolForTeacher**](docs/DataApi.md#getSchoolForTeacher) | **GET** /teachers/{id}/school |
*DataApi* | [**getSchools**](docs/DataApi.md#getSchools) | **GET** /schools |
*DataApi* | [**getSchoolsForSchoolAdmin**](docs/DataApi.md#getSchoolsForSchoolAdmin) | **GET** /school_admins/{id}/schools |
*DataApi* | [**getSchoolsForStudent**](docs/DataApi.md#getSchoolsForStudent) | **GET** /students/{id}/schools |
*DataApi* | [**getSchoolsForTeacher**](docs/DataApi.md#getSchoolsForTeacher) | **GET** /teachers/{id}/schools |
*DataApi* | [**getSection**](docs/DataApi.md#getSection) | **GET** /sections/{id} |
*DataApi* | [**getSections**](docs/DataApi.md#getSections) | **GET** /sections |
*DataApi* | [**getSectionsForCourse**](docs/DataApi.md#getSectionsForCourse) | **GET** /courses/{id}/sections |
*DataApi* | [**getSectionsForSchool**](docs/DataApi.md#getSectionsForSchool) | **GET** /schools/{id}/sections |
*DataApi* | [**getSectionsForStudent**](docs/DataApi.md#getSectionsForStudent) | **GET** /students/{id}/sections |
*DataApi* | [**getSectionsForTeacher**](docs/DataApi.md#getSectionsForTeacher) | **GET** /teachers/{id}/sections |
*DataApi* | [**getSectionsForTerm**](docs/DataApi.md#getSectionsForTerm) | **GET** /terms/{id}/sections |
*DataApi* | [**getStudent**](docs/DataApi.md#getStudent) | **GET** /students/{id} |
*DataApi* | [**getStudents**](docs/DataApi.md#getStudents) | **GET** /students |
*DataApi* | [**getStudentsForContact**](docs/DataApi.md#getStudentsForContact) | **GET** /contacts/{id}/students |
*DataApi* | [**getStudentsForSchool**](docs/DataApi.md#getStudentsForSchool) | **GET** /schools/{id}/students |
*DataApi* | [**getStudentsForSection**](docs/DataApi.md#getStudentsForSection) | **GET** /sections/{id}/students |
*DataApi* | [**getStudentsForTeacher**](docs/DataApi.md#getStudentsForTeacher) | **GET** /teachers/{id}/students |
*DataApi* | [**getTeacher**](docs/DataApi.md#getTeacher) | **GET** /teachers/{id} |
*DataApi* | [**getTeacherForSection**](docs/DataApi.md#getTeacherForSection) | **GET** /sections/{id}/teacher |
*DataApi* | [**getTeachers**](docs/DataApi.md#getTeachers) | **GET** /teachers |
*DataApi* | [**getTeachersForSchool**](docs/DataApi.md#getTeachersForSchool) | **GET** /schools/{id}/teachers |
*DataApi* | [**getTeachersForSection**](docs/DataApi.md#getTeachersForSection) | **GET** /sections/{id}/teachers |
*DataApi* | [**getTeachersForStudent**](docs/DataApi.md#getTeachersForStudent) | **GET** /students/{id}/teachers |
*DataApi* | [**getTerm**](docs/DataApi.md#getTerm) | **GET** /terms/{id} |
*DataApi* | [**getTermForSection**](docs/DataApi.md#getTermForSection) | **GET** /sections/{id}/term |
*DataApi* | [**getTerms**](docs/DataApi.md#getTerms) | **GET** /terms |
*EventsApi* | [**getEvent**](docs/EventsApi.md#getEvent) | **GET** /events/{id} |
*EventsApi* | [**getEvents**](docs/EventsApi.md#getEvents) | **GET** /events |


## Documentation for Models

 - [BadRequest](docs/BadRequest.md)
 - [Contact](docs/Contact.md)
 - [ContactObject](docs/ContactObject.md)
 - [ContactResponse](docs/ContactResponse.md)
 - [ContactsResponse](docs/ContactsResponse.md)
 - [Course](docs/Course.md)
 - [CourseObject](docs/CourseObject.md)
 - [CourseResponse](docs/CourseResponse.md)
 - [CoursesResponse](docs/CoursesResponse.md)
 - [Credentials](docs/Credentials.md)
 - [District](docs/District.md)
 - [DistrictAdmin](docs/DistrictAdmin.md)
 - [DistrictAdminObject](docs/DistrictAdminObject.md)
 - [DistrictAdminResponse](docs/DistrictAdminResponse.md)
 - [DistrictAdminsResponse](docs/DistrictAdminsResponse.md)
 - [DistrictObject](docs/DistrictObject.md)
 - [DistrictResponse](docs/DistrictResponse.md)
 - [DistrictsResponse](docs/DistrictsResponse.md)
 - [Event](docs/Event.md)
 - [EventResponse](docs/EventResponse.md)
 - [EventsResponse](docs/EventsResponse.md)
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
 - [StudentObject](docs/StudentObject.md)
 - [StudentResponse](docs/StudentResponse.md)
 - [StudentsResponse](docs/StudentsResponse.md)
 - [Teacher](docs/Teacher.md)
 - [TeacherObject](docs/TeacherObject.md)
 - [TeacherResponse](docs/TeacherResponse.md)
 - [TeachersResponse](docs/TeachersResponse.md)
 - [Term](docs/Term.md)
 - [TermObject](docs/TermObject.md)
 - [TermResponse](docs/TermResponse.md)
 - [TermsResponse](docs/TermsResponse.md)
 - [ContactsCreated](docs/ContactsCreated.md)
 - [ContactsDeleted](docs/ContactsDeleted.md)
 - [ContactsUpdated](docs/ContactsUpdated.md)
 - [CoursesCreated](docs/CoursesCreated.md)
 - [CoursesDeleted](docs/CoursesDeleted.md)
 - [CoursesUpdated](docs/CoursesUpdated.md)
 - [DistrictadminsCreated](docs/DistrictadminsCreated.md)
 - [DistrictadminsDeleted](docs/DistrictadminsDeleted.md)
 - [DistrictadminsUpdated](docs/DistrictadminsUpdated.md)
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
 - [StudentsCreated](docs/StudentsCreated.md)
 - [StudentsDeleted](docs/StudentsDeleted.md)
 - [StudentsUpdated](docs/StudentsUpdated.md)
 - [TeachersCreated](docs/TeachersCreated.md)
 - [TeachersDeleted](docs/TeachersDeleted.md)
 - [TeachersUpdated](docs/TeachersUpdated.md)
 - [TermsCreated](docs/TermsCreated.md)
 - [TermsDeleted](docs/TermsDeleted.md)
 - [TermsUpdated](docs/TermsUpdated.md)


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

To publish this library you need to have a `~/.m2/settings.xml` file that looks like this:
```
<settings>
  <servers>
    <server>
      <id>ossrh</id>
      <username>clever-eng</username>
      <password>SEE-1PASSWORD-FOR-TEAMS</password>
    </server>
  </servers>
</settings>
```
You can get the password from 1PFT under `Sonatype - Maven Repository`.

You will also need the PGP private key and passphrase for security@clever.com (ask the Security team for this!). Download the private key and set up as follows:
```
gpg --import private.security.key
```

Then run:
```
make release
```

You will need to enter the PGP passphrase 5 times during the process.

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
