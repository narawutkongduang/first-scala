# first-scala-project

Learning Scala and its libraries (fs2, cats-effect, http4s) for a potential company opportunity through hands-on exercises with different examples. Focusing mainly on functional programming since I already have OOP experience from Java.

The `basics` package contains simple examples adapted and modified from the [Scala Tour](https://docs.scala-lang.org/tour/tour-of-scala.html). I did some unit tests for these examples with the ScalaTest framework and Matchers.

The `fs2AndCatsEffects` package contains simple examples/exercises to understand the concepts, using documentation from [fs2.io](https://fs2.io/#/guide).

Every file/class in `basics` and `fs2AndCatsEffects` can be executed by itself.


API server built following the [http4s quickstart guide](https://http4s.org/v1/docs/quickstart.html#giter8-template).

## Running

Starts an API server on port 8080:
```bash
sbt "runMain Main"
```

## Testing (simulation - no database)

```bash
curl -i http://localhost:8080/users
curl -i http://localhost:8080/users/123
curl -i -X POST http://localhost:8080/users
curl -i -X PUT http://localhost:8080/users/123
curl -i -X DELETE http://localhost:8080/users/123
```