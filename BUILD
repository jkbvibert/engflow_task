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
	],
	deps = [":fancytext"],
)

java_library(
	name = "fancytext",
	srcs = [
		"@fancy-text//src/java/com/engflow/fancytext:FancyFormatter.java",
	],
	visibility = [
		"//src/main/java/com/example/cmdline:__pkg__",
	],
)