# Fancy Text

An advanced text formatter that understands multi-language stemming and lemmatization to aid in...

Just kidding.

This is a simple example repo for use in demonstrations and practical interviews. It exports the class `com.engflow.fancytext.FancyFormatter` which can be used to apply a whimsical formatting to a string.

This repo can be included in external projects using Bazel's [http_archive](https://bazel.build/rules/lib/repo/http#http_archive).

## Prerequisite

You must have [Bazel installed](https://bazel.build/install) to build and use this library. This library is already designed to be compatible with the Bazel build system.

## Testing

To run all the tests in this repo you can run the following command from the top level directory of this repository:
```
bazel test //...
```
