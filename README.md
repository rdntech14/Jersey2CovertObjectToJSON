Convert Object to JSON using Jersey 2
=====
Jersey internally uses Jackon API

This example demonstrate how to convert java object into JSON.
1) JAVA Object (POJO) --> JSON.json ( in a file)
2) JAVA Object --> jsonToString.json ( in a string variable)


**add jersey-media-json-jackson in pom.xml**

```
<dependency>
			<groupId>org.glassfish.jersey.media</groupId>
			<artifactId>jersey-media-json-jackson</artifactId>
			<version>2.25.1</version>
</dependency>

```

**Program Output**
```
{
  "name" : "mike",
  "id" : 11,
  "roles" : [ "dev", "tester" ]
}

```
