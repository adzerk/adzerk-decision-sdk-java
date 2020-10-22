

# DecisionRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**placements** | [**List&lt;Placement&gt;**](Placement.md) | One or more Placement objects | 
**user** | [**User**](User.md) |  |  [optional]
**keywords** | **List&lt;String&gt;** | Keywords for keyword Targeting. Such as &#x60;\&quot;keywords\&quot;: [\&quot;foo\&quot;, \&quot;bar\&quot;, \&quot;baz\&quot;]&#x60;. |  [optional]
**url** | **String** | The current page URL |  [optional]
**referrer** | **String** | The referrer URL |  [optional]
**ip** | **String** | The IP address. Required for [Geo-Targeting](https://dev.adzerk.com/docs/geo-location) |  [optional]
**blockedCreatives** | **List&lt;Integer&gt;** | Numeric creative ids to disregard for ad selection |  [optional]
**isMobile** | **Boolean** | If true, only ads containing a single image will be returned |  [optional]
**includePricingData** | **Boolean** | If true, return pricing data for the decision in the response |  [optional]
**notrack** | **Boolean** | If true, only return ads that are set to honor Do Not Track |  [optional]
**enableBotFiltering** | **Boolean** | If making a client-side request, set to true. Defaults to false to ensure a server isn&#39;t seen as a bot. See [here](https://dev.adzerk.com/docs/tracking-overview#section-bot-filtering) for more info |  [optional]
**enableUserDBIP** | **Boolean** | If true, override the IP address of the request with the IP address supplied on the UserKey. If no IP address is found on the UserKey, this will fall back to the IP address on the request. Requires UserDB |  [optional]
**consent** | [**Object**](.md) | Object that sets the data consent preferences. Other consent settings are available in the GDPR settings documentation. |  [optional]
**deviceID** | **String** | RTB requests only - sets an Identifier for Advertisers (IFA or IDFA) |  [optional]
**parallel** | **Boolean** |  |  [optional]
**intendedLatitude** | **String** |  |  [optional]
**intendedLongitude** | **String** |  |  [optional]
**includeMatchedPoints** | **Boolean** |  |  [optional]


## Implemented Interfaces

* Serializable


