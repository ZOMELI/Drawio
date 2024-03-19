# business-accounting-transfer-execution

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at http://localhost:8080/q/dev/.

## Packaging and running the application

The application can be packaged using:
```shell script
./mvnw package
```
It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:
```shell script
./mvnw package -Dquarkus.package.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/business-accounting-transfer-execution-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/maven-tooling.

## Provided Code

### RESTEasy Reactive

```shell script
http://localhost:8080/temporal/transfer
```

```shell script
Request-ID:2f132e5f-0da1-4696-bcf3-b7088e59aa4f
request-date:2024-03-18T18:02:03.987-0700
opn-number:0000008451
//opn-reverse-number:0000008450
```


```json
{
  "amount": 12.83,
  "currency": {
    "code": "USD"
  },
  "chargeInformation": {
    "chargeType": {
      "code": "CTAD"
    },
    "chargeAccount": {
      "referenceId": "1948412121022",
      "currency": {
        "code": "PEN"
      },
      "ChargeAccountDescription": "CARGO A CUENTA  1948412121022"
    }
  },
  "depositInformation": {
    "depositType": {
      "code": "CTAD"
    },
    "depositAccount": {
      "referenceId": "1947875121022",
      "currency": {
        "code": "PEN"
      },
      "DepositAccountDescription": "ABONO A CUENTA 1947875121022"
    }
  }
}

```








Easily start your Reactive RESTful Web Services

[Related guide section...](https://quarkus.io/guides/getting-started-reactive#reactive-jax-rs-resources)



```cURL
curl --location 'http://localhost:8080/temporal/transfer' \
--header 'Request-ID: 2f132e5f-0da1-4696-bcf3-b7088e59aa4f' \
--header 'request-date: 2024-03-18T18:02:03.987-0700' \
--header 'opn-number: 0000008451' \
--header 'Content-Type: application/json' \
--header 'Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsIm9yZy5hcGVyZW8uY2FzLnNlcnZpY2VzLlJlZ2lzdGVyZWRTZXJ2aWNlIjoiMTAwMDA1MDQiLCJraWQiOiJPQXV0aENsaWVudENyZWRlbnRpYWxDYXMifQ.eyJzdWIiOiJcdDhhY2M1ZGM4LTE4MTQtNDIxOS04NGMwLTRiZTU5MTNiNDZkNCIsInJvbGVzIjpbXSwiaXNzIjoiQ0FTX0FVVEgiLCJhcHBDb2RlIjoiUU8iLCJ1c2VyQXBwIjoiQVBRT0RFUyIsIm5vbmNlIjoiIiwiY2xpZW50X2lkIjoiXHQ4YWNjNWRjOC0xODE0LTQyMTktODRjMC00YmU1OTEzYjQ2ZDQiLCJhdWQiOiJcdDhhY2M1ZGM4LTE4MTQtNDIxOS04NGMwLTRiZTU5MTNiNDZkNCIsImdyYW50X3R5cGUiOiJDTElFTlRfQ1JFREVOVElBTFMiLCJwZXJtaXNzaW9ucyI6W10sInNjb3BlIjpbImJzLWFjY291bnQtdHJhbnNmZXItdjIiLCJicy1wcm9kdWN0LXY0IiwiYnMtc2VydmljZS12MiIsImJzLWJhbmstZHJhZnQtdjEiLCJicy1jYXNoLWFkdmFuY2UtdjEiLCJicy1kZWZlcnJlZC1pbnRlcmJhbmstdHJhbnNmZXItdjIiLCJicy1vbmxpbmUtaW50ZXJiYW5rLWNyZWRpdC1jYXJkLXBheW1lbnQtdjIiLCJicy1vbmxpbmUtaW50ZXJiYW5rLWNyZWRpdC1jYXJkLXBheW1lbnQtdjMiLCJicy1vbmxpbmUtaW50ZXJiYW5rLXRyYW5zZmVyLXYyIiwiYnMtY3JlZGl0LWNhcmQtcGF5bWVudC12MiIsImJzLWN1c3RvbWVyLXByb2R1Y3QtYW5kLXNlcnZpY2UtdjEiLCJjci1jdXN0b21lci1wcm9kdWN0LXYxIiwiY3ItY29uc3VtZXItbG9hbi12MSIsImNyLWN1cnJlbnQtYWNjb3VudC12MSIsImNyLWV4Y2hhbmdlLXJhdGUtdjEiLCJjci1maW5hbmNpYWwtYWNjb3VudGluZy10cmFuc2FjdGlvbi12MSIsImNyLWZpbmFudGlhbC1wb3NpdGlvbi12MSIsImNyLW1vbmV5LXRyYW5zZmVyLXRyYW5zYWN0aW9uLXYxIiwiY3ItcGF5bWVudC10cmFuc2FjdGlvbi12MSIsImNyLXNhdmluZy1hY2NvdW50LXYxIiwiYnMtY29sbGFib3JhdG9yLWhpZXJhcmNoeS12MSIsImJzLWFwb3EtYWNjb3VudC10cmFuc2Zlci1zYWdhLXYyIiwiYnMtZnJhdWQtZXZhbHVhdGlvbi12MSIsImJzLW1vbmV0YXJ5LW9wZXJhdGlvbi12MSIsImJzLW1vbmV0YXJ5LW9wZXJhdGlvbi1ub3RpZmljYXRpb24tdjEiLCJicy1jcmVkaXQtbGV0dGVyLXBheW1lbnQtdjIiLCJicy1jcmVkaXQtbGV0dGVyLXBheW1lbnQtZXhlY3V0aW9uLXYyIiwiYnMtYWNjb3VudGluZy10cmFuc2Zlci12MSIsImJzLWFjY291bnRpbmctdHJhbnNmZXItZXhlY3V0aW9uLXYxIiwiYnMtbmVnb3RpYWJsZS1pbnN0cnVtZW50LXBheW1lbnQtdjEiLCJicy1sb2FuLXBheW1lbnQtdjIiLCJicy1sb2FuLXBheW1lbnQtb2ZmbG9hZGluZy12MiIsInBvY3pvc2NlZSJdLCJjbGFpbXMiOltdLCJzY29wZXMiOiJicy1hY2NvdW50LXRyYW5zZmVyLXYyIGJzLXByb2R1Y3QtdjQgYnMtc2VydmljZS12MiBicy1iYW5rLWRyYWZ0LXYxIGJzLWNhc2gtYWR2YW5jZS12MSBicy1kZWZlcnJlZC1pbnRlcmJhbmstdHJhbnNmZXItdjIgYnMtb25saW5lLWludGVyYmFuay1jcmVkaXQtY2FyZC1wYXltZW50LXYyIGJzLW9ubGluZS1pbnRlcmJhbmstY3JlZGl0LWNhcmQtcGF5bWVudC12MyBicy1vbmxpbmUtaW50ZXJiYW5rLXRyYW5zZmVyLXYyIGJzLWNyZWRpdC1jYXJkLXBheW1lbnQtdjIgYnMtY3VzdG9tZXItcHJvZHVjdC1hbmQtc2VydmljZS12MSBjci1jdXN0b21lci1wcm9kdWN0LXYxIGNyLWNvbnN1bWVyLWxvYW4tdjEgY3ItY3VycmVudC1hY2NvdW50LXYxIGNyLWV4Y2hhbmdlLXJhdGUtdjEgY3ItZmluYW5jaWFsLWFjY291bnRpbmctdHJhbnNhY3Rpb24tdjEgY3ItZmluYW50aWFsLXBvc2l0aW9uLXYxIGNyLW1vbmV5LXRyYW5zZmVyLXRyYW5zYWN0aW9uLXYxIGNyLXBheW1lbnQtdHJhbnNhY3Rpb24tdjEgY3Itc2F2aW5nLWFjY291bnQtdjEgYnMtY29sbGFib3JhdG9yLWhpZXJhcmNoeS12MSBicy1hcG9xLWFjY291bnQtdHJhbnNmZXItc2FnYS12MiBicy1mcmF1ZC1ldmFsdWF0aW9uLXYxIGJzLW1vbmV0YXJ5LW9wZXJhdGlvbi12MSBicy1tb25ldGFyeS1vcGVyYXRpb24tbm90aWZpY2F0aW9uLXYxIGJzLWNyZWRpdC1sZXR0ZXItcGF5bWVudC12MiBicy1jcmVkaXQtbGV0dGVyLXBheW1lbnQtZXhlY3V0aW9uLXYyIGJzLWFjY291bnRpbmctdHJhbnNmZXItdjEgYnMtYWNjb3VudGluZy10cmFuc2Zlci1leGVjdXRpb24tdjEgYnMtbmVnb3RpYWJsZS1pbnN0cnVtZW50LXBheW1lbnQtdjEgYnMtbG9hbi1wYXltZW50LXYyIGJzLWxvYW4tcGF5bWVudC1vZmZsb2FkaW5nLXYyIHBvY3pvc2NlZSIsInN0YXRlIjoiIiwiZXhwIjoxNzEwNzI3NzY1LCJpYXQiOjE3MTA3Mjc0NjUsImp0aSI6IkFULTQxMjE2LTZGUGNrWEFwMXZJVUNYMFRNLWREUGs5T2FnZDJQMkMxIn0.Nok62uNssoDKwU3YhRED-5K21f-QPcOJuvb3LkVed4fX6VMW2vyWP05g6Dzg0O91ZOX8uTOH0JepvRwyw2iTjpjsIEtir1wcNpWfCqyxe2xheNGzlx_UwZUVUmW7PKEpcC6lHYdy4hNGMczX09_oSD6Bdh7WZ2F5TFOmYKL2Qdv5j2sc_QG5nSiPbXWA8Sib_0y3JFDtICFHQ1b0BnawdLBEiD6tKIeDSRNggmyj3Q4oAbW2keb_ctoQybDy9J1cbBGUN1KjZ2n1d-9PaK1azX_NClFLdDrbswNPbbVG15jI7ASTkzh1pAuaPRZW-KG5F-WcInTDma31ajJtVmfgEQ' \
--data '{
  "amount": 12.83,
  "currency": {
    "code": "USD"
  },
  "chargeInformation": {
    "chargeType": {
      "code": "CTAD"
    },
    "chargeAccount": {
      "referenceId": "1948412121022",
      "currency": {
        "code": "PEN"
      },
      "ChargeAccountDescription": "CARGO A CUENTA  1948412121022"
    }
  },
  "depositInformation": {
    "depositType": {
      "code": "CTAD"
    },
    "depositAccount": {
      "referenceId": "1947875121022",
      "currency": {
        "code": "PEN"
      },
      "DepositAccountDescription": "ABONO A CUENTA 1947875121022"
    }
  }
}'
```
