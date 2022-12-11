# DefaultApi

All URIs are relative to *https://official-joke-api.appspot.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**randomJokeGet**](DefaultApi.md#randomJokeGet) | **GET** /random_joke | Returns a joke |



## randomJokeGet

> InlineResponse200 randomJokeGet()

Returns a joke

This end poin returns an random joke out of a list of jokes.

### Example

```java
// Import classes:
import com.alig.joke.ApiClient;
import com.alig.joke.ApiException;
import com.alig.joke.Configuration;
import com.alig.joke.models.*;
import com.alig.joke.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://official-joke-api.appspot.com");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            InlineResponse200 result = apiInstance.randomJokeGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#randomJokeGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A Joke Object |  -  |

