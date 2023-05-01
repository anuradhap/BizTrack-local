# Spring Crash Course

## Problem Statement

Let's create an extremely primitive Invoicing Platform. We will call it BizTrack.

BizTrack is an open API Platform to all it's developers (1st and 3rd party alike). That implies that all it's Invoicing APIs are publicly available. The idea of the platform is very simple. It provides API to track Invoices, Payments & Customers.

Invoices - 	`/invoices/*`

Payments - 	`/payments/*`

Customers - `/customers/*`

When an invoice gets created for a customer, Customer's open balance increases. When a payment is made towards that invoice, the customer's open balance drops by the amount paid. For simplicity, there are no partial payments and you can only have one full payment for an open invoice.

Let's take an example. Vaibhav is the proud owner of Spring Training Center and he uses BizTrack to track his business. This week, Vaibhav is training Ravi & Nitin. Vaibhav adds Ravi and Nitin to BizTrack as customers and creates a flat rate invoice of $100,000 for both. Once the training is done, Ravi and Nitin, being the nice guys they are, paid off their invoices at one go, all $100,000. Vaibhav would also like to track how much money he has made so far (so he can retire) and who owes him (so that he can remind them).

## Design Principles:

* Domain Driven Architecture is expected in the design this platform. Think about domains and how you'd scale each domain into their own teams/organizations (Payments, Invoices, Customers). Think about how you would organize the code accordingly.
* Layered Architecture is expected in the design. At the minimum a 3-tiered architecture should be in place.
* Business Analytics & Reporting becomes extremely important for users. Think about how you'd design that system.
* You are dog-fooding your own API platform. Think about how you'd design the platform such that it's publicly accessible from day one.

## Implementation Guidelines:

* Use Spring Native Technologies as much as possible (duh!)
* Simplify the problem. For example, you don't have to build Business Analytics on day one. You can start with simple CRUDs and open balance tracking. Matter of fact your business analytics could very well be just "how much money a user made" or "how much does X owe me" logged to a file.
* Build at least 2 services & 1 library. Example: Services - Customer Service, Invoicing Service. Library - Customer Service SDK.
* Resiliency should be built in.

# Lernings and References
Resources found useful during training.

## Tpoics covered
- [x] Spring Autoconfiguration + Design Patterns (Spring Autoconfigure)
- [x] Dynamic Bean Loading (Environment/Spring Profile based bean loading) through configuration
- [x] Build Tools - Maven/Gradle - Spring libraries versioning, release trains (specifically how Bill Of Materials (BOM) work).
- [x] Logging (Log4j2 / Logback & MDC)
- [x] Distributed Tracing
- [x] Unit/Component/Integration Testing with Embedded Datastore Martin Fowler's Microservice Testing Strategy, Spring Testing Documentation
- [x] Health Monitoring (Spring Actuator)
- [x] Scheduled background jobs
- [x] Circuit Breakers (Resillience4j, Hystrix)
- [x] Performance Instrumentation (via AOP etc.)
- [x] Kafka usage for clickstream (API call)
