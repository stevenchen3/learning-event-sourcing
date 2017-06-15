name := """bank-alice"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  javaWs,
  javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "mysql"         % "mysql-connector-java"    % "5.1.32",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.8.Final"
)
