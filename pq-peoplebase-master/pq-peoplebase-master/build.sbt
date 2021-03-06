import Cs1331Build._

lazy val filesToSubmit = settingKey[Seq[String]]("Files to submit, test, and grade.")

lazy val root = (project in file(".")).
  settings(
    com.etsy.sbt.Checkstyle.checkstyleSettings,
    com.etsy.sbt.Checkstyle.CheckstyleTasks.checkstyleConfig
      := file("cs1331-checkstyle.xml")).
  settings(
    name := "pq-peoplebase",
    // In a particular semester's fork of this repo, organization should be
    // changed to match the github.gatech.edu user name of the user under
    // whose name the repo will be forked.
    organization := "tshields3",
    // Must be a Seq of String
    filesToSubmit := Seq("src/main/java/Person.java", "src/main/java/Peoplebase.java"),
    version := "1.0",
    Keys.commands += org.cs1331.gitsubmitter.GitSubmitterPlugin.submitCommand,
    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test",
      "junit" % "junit" % "4.12"
    ),
    grade := gradeImpl.value
  )
