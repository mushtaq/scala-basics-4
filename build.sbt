name := "sample"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-json" % "2.3.2",
  "org.specs2" %% "specs2" % "2.3.10" % "test"
)

transitiveClassifiers in Global := Seq(Artifact.SourceClassifier)
