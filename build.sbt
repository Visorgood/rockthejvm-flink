name := "flink-essentials"

version := "0.1"

scalaVersion := "2.12.17"

val flinkVersion = "1.16.2"
val postgresVersion = "42.6.0"
val logbackVersion = "1.3.7"

val flinkDependencies = Seq(
  "org.apache.flink" % "flink-clients" % flinkVersion,
  "org.apache.flink" %% "flink-scala" % flinkVersion,
  "org.apache.flink" %% "flink-streaming-scala" % flinkVersion,
)

val flinkConnectors = Seq(
  "org.apache.flink" % "flink-connector-kafka" % flinkVersion,
  "org.apache.flink" %% "flink-connector-cassandra" % flinkVersion,
  "org.apache.flink" % "flink-connector-jdbc" % flinkVersion,
  "org.postgresql" % "postgresql" % postgresVersion
)

val logging = Seq(
  "ch.qos.logback" % "logback-core" % logbackVersion,
  "ch.qos.logback" % "logback-classic" % logbackVersion
)

libraryDependencies ++= flinkDependencies ++ flinkConnectors ++ logging
