load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "ProjectRunner",
    srcs = ["src/main/java/com/example/ProjectRunner.java"],
    main_class = "com.example.ProjectRunner",
    deps = [":greeter"],
)

java_library(
    name = "greeter",
    srcs = [
		"src/main/java/com/example/Greeting.java",
	],
	visibility = [
		"//src/main/java/com/example/cmdline:__pkg__",
		"//fancytextmain/src/java/com/engflow/fancytext:__pkg__" // Could be something like "@fancytextmain//:__pkg__" or "@fancytextmain//:fancytext__pkg__" if I go back on the workspace path one level?
	],
)