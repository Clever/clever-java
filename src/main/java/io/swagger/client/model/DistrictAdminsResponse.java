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
import io.swagger.client.model.DistrictAdmin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DistrictAdminsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-04T15:10:30.801Z")
public class DistrictAdminsResponse {
  @SerializedName("data")
  private List<DistrictAdmin> data = null;

  public DistrictAdminsResponse data(List<DistrictAdmin> data) {
    this.data = data;
    return this;
  }

  public DistrictAdminsResponse addDataItem(DistrictAdmin dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<DistrictAdmin>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public List<DistrictAdmin> getData() {
    return data;
  }

  public void setData(List<DistrictAdmin> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistrictAdminsResponse districtAdminsResponse = (DistrictAdminsResponse) o;
    return Objects.equals(this.data, districtAdminsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistrictAdminsResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

