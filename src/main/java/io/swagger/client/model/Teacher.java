/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Credentials;
import io.swagger.client.model.Name;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Teacher
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-17T20:00:26.398Z")
public class Teacher {
  @SerializedName("created")
  private String created = null;

  @SerializedName("credentials")
  private Credentials credentials = null;

  @SerializedName("district")
  private String district = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("last_modified")
  private String lastModified = null;

  @SerializedName("name")
  private Name name = null;

  @SerializedName("school")
  private String school = null;

  @SerializedName("schools")
  private List<String> schools = null;

  @SerializedName("sis_id")
  private String sisId = null;

  @SerializedName("state_id")
  private String stateId = null;

  @SerializedName("teacher_number")
  private String teacherNumber = null;

  @SerializedName("title")
  private String title = null;

  public Teacher created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Teacher credentials(Credentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public Credentials getCredentials() {
    return credentials;
  }

  public void setCredentials(Credentials credentials) {
    this.credentials = credentials;
  }

  public Teacher district(String district) {
    this.district = district;
    return this;
  }

   /**
   * Get district
   * @return district
  **/
  @ApiModelProperty(value = "")
  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }

  public Teacher email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Teacher id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Teacher lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public Teacher name(Name name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Teacher school(String school) {
    this.school = school;
    return this;
  }

   /**
   * Get school
   * @return school
  **/
  @ApiModelProperty(value = "")
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public Teacher schools(List<String> schools) {
    this.schools = schools;
    return this;
  }

  public Teacher addSchoolsItem(String schoolsItem) {
    if (this.schools == null) {
      this.schools = new ArrayList<String>();
    }
    this.schools.add(schoolsItem);
    return this;
  }

   /**
   * Get schools
   * @return schools
  **/
  @ApiModelProperty(value = "")
  public List<String> getSchools() {
    return schools;
  }

  public void setSchools(List<String> schools) {
    this.schools = schools;
  }

  public Teacher sisId(String sisId) {
    this.sisId = sisId;
    return this;
  }

   /**
   * Get sisId
   * @return sisId
  **/
  @ApiModelProperty(value = "")
  public String getSisId() {
    return sisId;
  }

  public void setSisId(String sisId) {
    this.sisId = sisId;
  }

  public Teacher stateId(String stateId) {
    this.stateId = stateId;
    return this;
  }

   /**
   * Get stateId
   * @return stateId
  **/
  @ApiModelProperty(value = "")
  public String getStateId() {
    return stateId;
  }

  public void setStateId(String stateId) {
    this.stateId = stateId;
  }

  public Teacher teacherNumber(String teacherNumber) {
    this.teacherNumber = teacherNumber;
    return this;
  }

   /**
   * Get teacherNumber
   * @return teacherNumber
  **/
  @ApiModelProperty(value = "")
  public String getTeacherNumber() {
    return teacherNumber;
  }

  public void setTeacherNumber(String teacherNumber) {
    this.teacherNumber = teacherNumber;
  }

  public Teacher title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Teacher teacher = (Teacher) o;
    return Objects.equals(this.created, teacher.created) &&
        Objects.equals(this.credentials, teacher.credentials) &&
        Objects.equals(this.district, teacher.district) &&
        Objects.equals(this.email, teacher.email) &&
        Objects.equals(this.id, teacher.id) &&
        Objects.equals(this.lastModified, teacher.lastModified) &&
        Objects.equals(this.name, teacher.name) &&
        Objects.equals(this.school, teacher.school) &&
        Objects.equals(this.schools, teacher.schools) &&
        Objects.equals(this.sisId, teacher.sisId) &&
        Objects.equals(this.stateId, teacher.stateId) &&
        Objects.equals(this.teacherNumber, teacher.teacherNumber) &&
        Objects.equals(this.title, teacher.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, credentials, district, email, id, lastModified, name, school, schools, sisId, stateId, teacherNumber, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Teacher {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    district: ").append(toIndentedString(district)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    schools: ").append(toIndentedString(schools)).append("\n");
    sb.append("    sisId: ").append(toIndentedString(sisId)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    teacherNumber: ").append(toIndentedString(teacherNumber)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

