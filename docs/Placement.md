

# Placement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**divName** | **String** | A unique name for the placement defined by you |  [optional]
**networkId** | **Integer** | The numeric network id |  [optional]
**siteId** | **Integer** | The numeric site id |  [optional]
**adTypes** | **List&lt;Integer&gt;** | One or more integer ad types. More info [here](https://dev.adzerk.com/docs/ad-sizes) |  [optional]
**zoneIds** | **List&lt;Integer&gt;** | Zone IDs to use |  [optional]
**campaignId** | **Integer** | A numeric campaign id; if specified, only consider ads in that campaign |  [optional]
**flightId** | **Integer** | A numeric ad (flight-creative map) id; if specified, only serve that ad if possible |  [optional]
**adId** | **Integer** | A numeric ad (flight-creative map) id; if specified, only serve that ad if possible |  [optional]
**clickUrl** | **String** | The ad&#39;s click-through URL |  [optional]
**properties** | [**Object**](.md) | A map of key/value pairs used for [Custom Targeting](https://dev.adzerk.com/docs/custom-targeting) |  [optional]
**eventIds** | **List&lt;Integer&gt;** | An array of numeric event types. Requests tracking URLs for custom events. See here for [Event Tracking IDs](https://dev.adzerk.com/v1.0/docs/custom-event-tracking) |  [optional]
**overrides** | [**Object**](.md) | An object that overrides values for an advertiser, campaign, flight or ad. Used especially for header bidding |  [optional]
**contentKeys** | **Map&lt;String, Integer&gt;** | A map of key/value pairs used with [ContentDB](https://dev.adzerk.com/docs/contentdb-1). The format is &#x60;\&quot;contentKeys\&quot;: {\&quot;schema\&quot;: \&quot;contentKey\&quot;}&#x60; |  [optional]
**count** | **Integer** | (BETA) The number of ads to return per placement. Integer between 1 and 20 |  [optional]
**proportionality** | **Boolean** | (BETA) If true, fills ads in a multi-winner placement in proportion to the flight&#39;s goals |  [optional]
**ecpmPartition** | **String** | (BETA) The name of the eCPM Partition that should be used to source eCPM data for auctions |  [optional]


## Implemented Interfaces

* Serializable


