# kTesla
A Kotlin client for the Tesla Owner API. The Tesla API allows you to
gather a variety of information about your car, its whereabouts,
charging data, speed, and more.

This client allows you to access the API and easily read its responses.

### Setup

First, you'll need to set up the API with a client id and secret. You can
find the current ones [here](https://pastebin.com/pS7Z6yyP).

```kotlin
TeslaApi.setup("client_id", "client_secret")
```

### Creating an API instance

You can log in and obtain an instance of TeslaApi using either an access
token directly, or using an email/pass combination

```kotlin
// with an access token
var api = TeslaApi(accessToken)

// with username and password without refresh handling
api = TeslaApi(TeslaApi.authenticate(email, password))

// with username and password with
// automatic token refreshing
api = TeslaApi.login(email, password)
```
