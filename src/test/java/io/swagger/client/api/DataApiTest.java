/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ContactResponse;
import io.swagger.client.model.ContactsResponse;
import io.swagger.client.model.CourseResponse;
import io.swagger.client.model.CoursesResponse;
import io.swagger.client.model.DistrictAdminResponse;
import io.swagger.client.model.DistrictAdminsResponse;
import io.swagger.client.model.DistrictResponse;
import io.swagger.client.model.DistrictsResponse;
import io.swagger.client.model.NotFound;
import io.swagger.client.model.SchoolAdminResponse;
import io.swagger.client.model.SchoolAdminsResponse;
import io.swagger.client.model.SchoolResponse;
import io.swagger.client.model.SchoolsResponse;
import io.swagger.client.model.SectionResponse;
import io.swagger.client.model.SectionsResponse;
import io.swagger.client.model.StudentResponse;
import io.swagger.client.model.StudentsResponse;
import io.swagger.client.model.TeacherResponse;
import io.swagger.client.model.TeachersResponse;
import io.swagger.client.model.TermResponse;
import io.swagger.client.model.TermsResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataApi
 */
@Ignore
public class DataApiTest {

    private final DataApi api = new DataApi();

    
    /**
     * 
     *
     * Returns a specific student contact
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactTest() throws ApiException {
        String id = null;
        ContactResponse response = api.getContact(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of student contacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactsTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        ContactsResponse response = api.getContacts(limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the contacts for a student
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getContactsForStudentTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        ContactsResponse response = api.getContactsForStudent(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a specific course
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCourseTest() throws ApiException {
        String id = null;
        CourseResponse response = api.getCourse(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the course for a section
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCourseForSectionTest() throws ApiException {
        String id = null;
        CourseResponse response = api.getCourseForSection(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of courses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCoursesTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        CoursesResponse response = api.getCourses(limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a specific district
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrict(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a specific district admin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictAdminTest() throws ApiException {
        String id = null;
        DistrictAdminResponse response = api.getDistrictAdmin(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of district admins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictAdminsTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        DistrictAdminsResponse response = api.getDistrictAdmins(limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the district for a student contact
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForContactTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForContact(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the district for a course
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForCourseTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForCourse(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the district for a district admin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForDistrictAdminTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForDistrictAdmin(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the district for a school
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForSchoolTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForSchool(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the district for a school admin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForSchoolAdminTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForSchoolAdmin(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the district for a section
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForSectionTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForSection(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the district for a student
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForStudentTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForStudent(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the district for a teacher
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForTeacherTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForTeacher(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the district for a term
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForTermTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForTerm(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of districts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictsTest() throws ApiException {
        DistrictsResponse response = api.getDistricts();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a specific school
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolTest() throws ApiException {
        String id = null;
        SchoolResponse response = api.getSchool(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a specific school admin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolAdminTest() throws ApiException {
        String id = null;
        SchoolAdminResponse response = api.getSchoolAdmin(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of school admins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolAdminsTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SchoolAdminsResponse response = api.getSchoolAdmins(limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the school for a section
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolForSectionTest() throws ApiException {
        String id = null;
        SchoolResponse response = api.getSchoolForSection(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the primary school for a student
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolForStudentTest() throws ApiException {
        String id = null;
        SchoolResponse response = api.getSchoolForStudent(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves school info for a teacher.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolForTeacherTest() throws ApiException {
        String id = null;
        SchoolResponse response = api.getSchoolForTeacher(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of schools
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolsTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SchoolsResponse response = api.getSchools(limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the schools for a school admin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolsForSchoolAdminTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SchoolsResponse response = api.getSchoolsForSchoolAdmin(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the schools for a student
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolsForStudentTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SchoolsResponse response = api.getSchoolsForStudent(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the schools for a teacher
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchoolsForTeacherTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SchoolsResponse response = api.getSchoolsForTeacher(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a specific section
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionTest() throws ApiException {
        String id = null;
        SectionResponse response = api.getSection(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of sections
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionsTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SectionsResponse response = api.getSections(limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the sections for a Courses
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionsForCourseTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SectionsResponse response = api.getSectionsForCourse(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the sections for a school
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionsForSchoolTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SectionsResponse response = api.getSectionsForSchool(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the sections for a student
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionsForStudentTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SectionsResponse response = api.getSectionsForStudent(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the sections for a teacher
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionsForTeacherTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SectionsResponse response = api.getSectionsForTeacher(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the sections for a term
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSectionsForTermTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        SectionsResponse response = api.getSectionsForTerm(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a specific student
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStudentTest() throws ApiException {
        String id = null;
        StudentResponse response = api.getStudent(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of students
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStudentsTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        StudentsResponse response = api.getStudents(limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the students for a student contact
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStudentsForContactTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        StudentsResponse response = api.getStudentsForContact(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the students for a school
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStudentsForSchoolTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        StudentsResponse response = api.getStudentsForSchool(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the students for a section
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStudentsForSectionTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        StudentsResponse response = api.getStudentsForSection(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the students for a teacher
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStudentsForTeacherTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        StudentsResponse response = api.getStudentsForTeacher(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a specific teacher
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeacherTest() throws ApiException {
        String id = null;
        TeacherResponse response = api.getTeacher(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the primary teacher for a section
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeacherForSectionTest() throws ApiException {
        String id = null;
        TeacherResponse response = api.getTeacherForSection(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of teachers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeachersTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        TeachersResponse response = api.getTeachers(limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the teachers for a school
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeachersForSchoolTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        TeachersResponse response = api.getTeachersForSchool(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the teachers for a section
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeachersForSectionTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        TeachersResponse response = api.getTeachersForSection(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the teachers for a student
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTeachersForStudentTest() throws ApiException {
        String id = null;
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        TeachersResponse response = api.getTeachersForStudent(id, limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a specific term
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTermTest() throws ApiException {
        String id = null;
        TermResponse response = api.getTerm(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the term for a section
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTermForSectionTest() throws ApiException {
        String id = null;
        TermResponse response = api.getTermForSection(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a list of terms
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTermsTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        TermsResponse response = api.getTerms(limit, startingAfter, endingBefore);

        // TODO: test validations
    }
    
}
