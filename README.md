# Adzerk Java Decision SDK

Java Software Development Kit for Adzerk Decision & UserDB APIs

## Installation

Requires [Java SE 8](https://en.wikipedia.org/wiki/Java_version_history) or higher.

Add to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.adzerk</groupId>
    <artifactId>adzerk-decision-sdk</artifactId>
    <version>1.0.0</version>
</dependency>
```

Or, if using Clojure, add to your `deps.edn` file:

```clojure
{:deps
  {com.adzerk/adzerk-decision-sdk {:mvn/version "1.0.0"}}}
```

## Examples

### API Credentials & Required IDs

- Network ID: Log into [Adzerk UI](https://app.adzerk.com/) & use the "circle-i" help menu in upper right corner to find Network ID. Required for all SDK operations.
- Site ID: Go to [Manage Sites page](https://app.adzerk.com/#!/sites/) to find site IDs. Required when fetching an ad decision.
- Ad Type ID: Go to [Ad Sizes page](https://app.adzerk.com/#!/ad-sizes/) to find Ad Type IDs. Required when fetching an ad decision.
- API Key: Go to [API Keys page](https://app.adzerk.com/#!/api-keys/) find active API keys. Required when writing to UserDB.
- User Key: UserDB IDs are [specified or generated for each user](https://dev.adzerk.com/reference/userdb#passing-the-userkey).

### Fetching an Ad Decision

```java
import java.util.*;
import com.adzerk.sdk.*;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.generated.model.*;
import com.adzerk.sdk.model.DecisionResponse;

public class FetchAds {
  public static void main(String[] args) throws ApiException {
    // Demo network, site, and ad type IDs; find your own via the Adzerk UI!
    Client client = new Client(new ClientOptions(23).siteId(667480));
    Placement placement = new Placement().adTypes(Arrays.asList(5));
    User user = new User().key("abc");

    DecisionRequest request = new DecisionRequest()
      .placements(Arrays.asList(placement))
      .keywords(Arrays.asList("keyword1", "keyword2"))
      .user(user);

    DecisionResponse response = client.decisions().get(request);
    System.out.println(response.toString());
  }  
}
```

### UserDB: Reading User Record

```java
// import adzerk_decision_sdk
//
// # Demo network ID; find your own via the Adzerk UI!
// client = adzerk_decision_sdk.Client(23)
// record = client.user_db.read("abc")
// print(record)
```

### UserDB: Setting Custom Properties

```java
// import adzerk_decision_sdk
// import os
//
// # Demo network ID and API key; find your own via the Adzerk UI!
// client = adzerk_decision_sdk.Client(23, api_key="YOUR_API_KEY")
//
// props = {
//   "favoriteColor": "blue",
//   "favoriteNumber": 42,
//   "favoriteFoods": ["strawberries", "chocolate"],
// }
//
// client.user_db.set_custom_properties("abc", props)
```

<!-- ### Logging Example

TBD: ....... -->

## Clojure Examples

### Fetching an Ad Decision

```clojure
// import adzerk_decision_sdk
//
// # Demo network, site, and ad type IDs; find your own via the Adzerk UI!
// client = adzerk_decision_sdk.Client(23, site_id=667480)
//
// request = {
//   "placements": [{"adTypes": [5]}],
//   "user": {"key": "abc"},
//   "keywords": ["keyword1", "keyword2"],
// }
//
// response = client.decisions.get(request)
// print(response)
```

### UserDB: Reading User Record

```clojure
// import adzerk_decision_sdk
//
// # Demo network ID; find your own via the Adzerk UI!
// client = adzerk_decision_sdk.Client(23)
// record = client.user_db.read("abc")
// print(record)
```

### UserDB: Setting Custom Properties

```clojure
// import adzerk_decision_sdk
// import os
//
// # Demo network ID and API key; find your own via the Adzerk UI!
// client = adzerk_decision_sdk.Client(23, api_key="YOUR_API_KEY")
//
// props = {
//   "favoriteColor": "blue",
//   "favoriteNumber": 42,
//   "favoriteFoods": ["strawberries", "chocolate"],
// }
//
// client.user_db.set_custom_properties("abc", props)
```

## Documentation

- [Adzerk API Documentation](https://dev.adzerk.com/reference)
- [Adzerk User & Developer Documentation](https://dev.adzerk.com/docs)

## Contributing

### Reporting Issues

- For bug fixes and improvements to this SDK please use Github to [open an issue](https://github.com/adzerk/adzerk-decision-sdk-java/issues) or send us a [pull request](https://github.com/adzerk/adzerk-decision-sdk-java/pulls).
- For questions or issues regarding Adzerk functionality, please [contact Adzerk support](https://adzerk.com/help/).

### Building

```
./gradlew build
```