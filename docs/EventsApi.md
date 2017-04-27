# EventsApi

All URIs are relative to *https://api.clever.com/v1.2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEvent**](EventsApi.md#getEvent) | **GET** /events/{id} | 
[**getEvents**](EventsApi.md#getEvents) | **GET** /events | 
[**getEventsForSchool**](EventsApi.md#getEventsForSchool) | **GET** /schools/{id}/events | 
[**getEventsForSchoolAdmin**](EventsApi.md#getEventsForSchoolAdmin) | **GET** /school_admins/{id}/events | 
[**getEventsForSection**](EventsApi.md#getEventsForSection) | **GET** /sections/{id}/events | 
[**getEventsForStudent**](EventsApi.md#getEventsForStudent) | **GET** /students/{id}/events | 
[**getEventsForTeacher**](EventsApi.md#getEventsForTeacher) | **GET** /teachers/{id}/events | 


<a name="getEvent"></a>
# **getEvent**
> EventResponse getEvent(id)



Returns the specific event

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
String id = "id_example"; // String | 
try {
    EventResponse result = apiInstance.getEvent(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEvents"></a>
# **getEvents**
> EventsResponse getEvents(limit, startingAfter, endingBefore)



Returns a list of events

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    EventsResponse result = apiInstance.getEvents(limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**EventsResponse**](EventsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventsForSchool"></a>
# **getEventsForSchool**
> EventsResponse getEventsForSchool(id, limit, startingAfter, endingBefore)



Returns a list of events for a school

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    EventsResponse result = apiInstance.getEventsForSchool(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventsForSchool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**EventsResponse**](EventsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventsForSchoolAdmin"></a>
# **getEventsForSchoolAdmin**
> EventsResponse getEventsForSchoolAdmin(id, limit, startingAfter, endingBefore)



Returns a list of events for a school admin

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    EventsResponse result = apiInstance.getEventsForSchoolAdmin(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventsForSchoolAdmin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**EventsResponse**](EventsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventsForSection"></a>
# **getEventsForSection**
> EventsResponse getEventsForSection(id, limit, startingAfter, endingBefore)



Returns a list of events for a section

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    EventsResponse result = apiInstance.getEventsForSection(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventsForSection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**EventsResponse**](EventsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventsForStudent"></a>
# **getEventsForStudent**
> EventsResponse getEventsForStudent(id, limit, startingAfter, endingBefore)



Returns a list of events for a student

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    EventsResponse result = apiInstance.getEventsForStudent(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventsForStudent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**EventsResponse**](EventsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEventsForTeacher"></a>
# **getEventsForTeacher**
> EventsResponse getEventsForTeacher(id, limit, startingAfter, endingBefore)



Returns a list of events for a teacher

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.EventsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
oauth.setAccessToken("YOUR ACCESS TOKEN");

EventsApi apiInstance = new EventsApi();
String id = "id_example"; // String | 
Integer limit = 56; // Integer | 
String startingAfter = "startingAfter_example"; // String | 
String endingBefore = "endingBefore_example"; // String | 
try {
    EventsResponse result = apiInstance.getEventsForTeacher(id, limit, startingAfter, endingBefore);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EventsApi#getEventsForTeacher");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **limit** | **Integer**|  | [optional]
 **startingAfter** | **String**|  | [optional]
 **endingBefore** | **String**|  | [optional]

### Return type

[**EventsResponse**](EventsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

