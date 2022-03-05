# Microservices application  ()

We have created  a UserService and ContactService.
We are getting contact of all the user from the contactService.
These two service are communicating with the help of RestTemplate.
Then We have implemented as API Gateway. 
Using this gateway both application can be accessed with single endpoint(that is the api gateway port).

<Userservice>

port : 8082
GET api
1. /user/all
2. /user/all/{userId}

<ContactService>

port : 8083
GET api
1. /contacts/all
2. /contacts/{userId}

<EurekaServer>  (provide the gateway to access both the services i.e. UserService and ContactService)

port : 8761 (default port)

<API Gateway>

port : 999

<Hystrix-dashboard> (fault tolerance library)

port : 9995