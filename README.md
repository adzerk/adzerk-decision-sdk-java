# Adzerk Java Decision SDK

Java Software Development Kit for Adzerk Decision & UserDB APIs

## Installation

Requires [Java SE 8](https://en.wikipedia.org/wiki/Java_version_history) or higher.

[Maven Package](https://search.maven.org/artifact/com.adzerk/adzerk-decision-sdk)

Add to your `pom.xml` file:

```xml
<dependency>
    <groupId>com.adzerk</groupId>
    <artifactId>adzerk-decision-sdk</artifactId>
    <version>1.0.0-beta.1</version>
</dependency>
```

Or `build.gradle` file:

```gradle
implementation 'com.adzerk:adzerk-decision-sdk:1.0.0-beta.1'
```

Or, if using Clojure, add to your `deps.edn` file:

```clojure
{:deps
  {com.adzerk/adzerk-decision-sdk {:mvn/version "1.0.0-beta.1"}}}
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

### Recording Impression & Clicks

Use with the fetch ad example above.

```java
// Impression pixel; fire when user sees the ad
String impUrl = decision.getImpressionUrl().toString();
client.pixels().fire(new PixelFireOptions().url(impUrl));

// Click pixel; fire when user clicks on the ad
// status: HTTP status code
// location: click target URL
String clickUrl = decision.getClickUrl().toString();
PixelFireResponse clickResponse = client.pixels().fire(new PixelFireOptions() .url(clickUrl));
System.out.println("Fired! " +
    "status: " + clickResponse.getStatusCode() + " " +
    "location: " + clickResponse.getLocation());
```

### UserDB: Reading User Record

```java
import com.adzerk.sdk.*;
import com.adzerk.sdk.generated.ApiException;
import com.adzerk.sdk.model.UserRecord;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FetchUserDb {
  public static void main(String[] argv) throws ApiException {
    // Demo network ID; find your own via the Adzerk UI!    
    Client client = new Client(new ClientOptions(23));
    UserRecord record = client.userDb().read("abc");
    System.out.println(ToStringBuilder.reflectionToString(record));
  }  
}
```

### UserDB: Setting Custom Properties

```java
import java.util.*;
import com.adzerk.sdk.*;
import com.adzerk.sdk.generated.ApiException;

public class SetUserDb {
  public static void main(String[] argv) throws ApiException {
    // Demo network ID; find your own via the Adzerk UI!
    Client client = new Client(new ClientOptions(23));

    Map props = Map.of(
      "favoriteColor", "blue",
      "favoriteNumber", 42,
      "favoriteFoods", new String[] {"strawberries", "chocolate"});

    client.userDb().setCustomProperties("abc", props);
  }
}
```

### UserDB: Forgetting User Record

```java
import com.adzerk.sdk.*;
import com.adzerk.sdk.generated.ApiException;

public class ForgetUserDb {
  public static void main(String[] argv) throws ApiException {
    // Demo network ID and API key; find your own via the Adzerk UI!
    Client client = new Client(new ClientOptions(23).apiKey("YOUR-API-KEY"));
    client.userDb().forget("abc");
  }
}
```

### Decision Explainer

The Decision Explainer is a feature that returns information on a Decision API request explaining why each candidate ad was or was not chosen. 


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

    AdditionalOptions options = new AdditionalOptions()
      .includeExplanation(true)
      .apiKey("API_KEY");

    DecisionResponse response = client.decisions().get(request, options);
    System.out.println(response.toString());
  }  
}
```

The response returns a decision object with placement, buckets, rtb logs, and result information.
``` json
{
  "div0": {
    "placement": {},
    "buckets": [],
    "rtb_log": [],
    "results": []
  }
}
```

The "placement" object represents a decision in which an ad may be served. A Explainer Request can have multiple placements in the request.
The "buckets" array contains channel and priority information.
The "rtb_logs" array contains information about Real Time Bidding.
The "results" array contains the list of candidate ads that did and did not serve, along with a brief explanation.

<!-- ### Logging Example

TBD: ....... -->

## Clojure Examples

### Fetching an Ad Decision

```clojure
(ns readme-ad-request
  (:import (com.adzerk.sdk Client ClientOptions)
           (com.adzerk.sdk.generated.model DecisionRequest Placement User)))

(defn -main []
  ; Demo network, site, and ad type IDs; find your own via the Adzerk UI!
  (let [client (Client. (doto (ClientOptions. (int 23)) (.siteId (int 667480))))
        request (doto (DecisionRequest.)
                      (.placements [(doto (Placement.) (.adTypes [5]))])
                      (.keywords ["keyword1" "keyword2"])
                      (.user (doto (User.) (.key "abc"))))]
    (print (-> client (.decisions) (.get request)))))
```

### Recording Impression & Clicks

Use with the fetch ad example above.

```clojure
; Impression pixel; fire when user sees the ad
(-> client (.pixels) (.fire (doto (PixelFireOptions.) (.url (.toString (.getImpressionUrl decision))))))

; Click pixel; fire when user clicks on the ad
; status: HTTP status code
; location: click target URL
(let [decision-url (.toString (.getClickUrl decision))
      pixel-results (-> client (.pixels) (.fire (doto (PixelFireOptions.) (.url decision-url))))]
  (println (str "Fired! status: " (.getStatusCode pixel-results)
                "; location: " (.getLocation pixel-results))))))
```

### UserDB: Reading User Record

```clojure
(ns readme-read-userdb
  (:use clojure.pprint)
  (:import (com.adzerk.sdk Client ClientOptions)))

(defn -main []
  ; Demo network ID; find your own via the Adzerk UI!
  (let [client (Client. (doto (ClientOptions. (int 23))))]
    (pprint (bean (-> client (.userDb) (.read "abc"))))))
```

### UserDB: Setting Custom Properties

```clojure
(ns readme-set-userdb
  (:import (com.adzerk.sdk Client ClientOptions)))

(defn -main []
  ; Demo network ID; find your own via the Adzerk UI!
  (let [client (Client. (doto (ClientOptions. (int 23))))
        props {"favoriteColor" "blue"
               "favoriteNumber" 42
               "favoriteFoods" ["strawberries", "chocolate"]}]
    (-> client (.userDb) (.setCustomProperties "abc" props))))
```

### UserDB: Forgetting User Record

```clojure
(ns readme-forget-userdb
  (:import (com.adzerk.sdk Client ClientOptions)))

(defn -main []
  ; Demo network ID and API key; find your own via the Adzerk UI!
  (let [client (Client. (doto (ClientOptions. (int 23)) (.apiKey "YOUR-API-KEY")))]
    (-> client (.userDb) (.forget "abc"))))
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