lazy val project1 = project in file("project1")
lazy val project2 = project in file("project2")

lazy val root = (project in file(".")).dependsOn(project1, project2)
