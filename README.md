# Money Transfer [![Build Status](https://travis-ci.org/ahmad-alkhatib/money-transfer-assignment.svg?branch=master "Travis CI")](https://travis-ci.org/ahmad-alkhatib/money-transfer-assignment) 

An assignment for FinTech company for a simple money transfer service project, the challenge is not to use Spring Framework & Hibernate.

# What dependencies I have used ?

* `JOOQ`: a fluent API for typesafe SQL query construction and execution.

* `JavaLin`: a very lightweight web framework for Kotlin and Java which supports WebSockets, HTTP2 and async requests. Javalin’s main goals are simplicity, a great developer experience, and first class interoperability between Kotlin and Java.

* `HikariCP`: Fast, simple, reliable connection pool

* `h2database`: Embeddable RDBMS written in Java

* `flywaydb`: open-source database migration tool. It strongly favors simplicity and convention over configuration

* `mockito`: Tasty mocking framework for unit tests in Java

* `rest-assured`: Java library that provides a domain-specific language (DSL) for writing powerful, maintainable tests for RESTful APIs

* `codearte.catch-exception`: catches exceptions in a single line of code and makes them available for further analysis.

# API Endpoints
API end points are managed in a simple Java Constants file, ApiConstants.

_`/api/v1/accounts`_

By default anything under `/api/v1/accounts` is where your clients interact with your services.

1. _`/Transfer`_ :
returns 200 OK for successful transfer, 400 Bad Request otherwise.

_`Error Response Codes:`_

- `BR001`: _Unauthorized User To The Account_ 
- `BR002`: _Illegal transaction to same account_ 
- `BR003`: _Sender account is not active_ 
- `BR004`: _Receiver account is not active_ 
- `BR005`: _Funds Insufficient_ 


# Json Request
`acc_from`: Sender account

`acc_to`: Receiver Account

`amount`: Amount to send

`user_id`: Sender account user id
```json
{
  "acc_from" : 1000, 
  "acc_to" : 2000, 
  "amount" : 250, 
  "user_id" : 1 
}
```

# Json Response
```json
{
  "success" : false, 
  "error" : {
      "id" : "125ad45-cef122-237846-e1341234a",
      "code" : "BR001",
      "description" : "Unauthorized User To The Account"
  }
}
```
#
2 . _`/transactions/:trx_id`_ :
returns 200 OK with response body for successful get, _204 no content_ otherwise.

# Path Param
`trx_id`: Transaction Id.


# Json Response
```json
[
    {
        "id": "04250760-ec2e-11e9-81b4-2a2ae2dbcce4",
        "acc_from": "1000",
        "acc_to": "2000",
        "amount": "20.000",
        "date": "2019-10-11 17:55:38.237447",
        "status": "SUCCESS",
        "remarks": "Remarks here"
    }
]
```

# Testing
* **Unit Tests** - your typical mocked tests

* **Integration Tests** -  run with the JavaLin context initialised

