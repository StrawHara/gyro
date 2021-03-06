
# Gyro

[![gem version](https://img.shields.io/gem/v/gyro.svg?style=flat-square)](https://rubygems.org/gems/gyro)
[![build circle ci](https://img.shields.io/circleci/project/github/NijiDigital/gyro.svg?style=flat-square)](https://circleci.com/gh/NijiDigital/gyro)
[![Twitter](https://img.shields.io/badge/twitter-@Niji_Digital-blue.svg?style=flat-square)](http://twitter.com/Niji_Digital)

Gyro is a tool to generate [Realm](https://realm.io) model classes, for both Android (Java) and iOS/macOS (Swift), from an `.xcdatamodel` file.

---
<center><table><tr>
  <td><img src='logo.png' width='200' height='200' /></td>
  <td>
    <strong>G</strong> enerate<br/>
    <strong>Y</strong> our<br/>
    <strong>R</strong> ealm<br/>
    <strong>O</strong> bjects
  </td>
</tr></table></center>

## Introduction

The `.xcdatamodel` file is usually used to represent Core Data entities in Xcode in a graphical way. It can be created or edited with a graphical user interface in Xcode.

But with Gyro, you will now be able to **use an `xcdatamodel` to create a [Realm](https://realm.io) model files as well!**

This will allow you to design your model in a visual way (rather than by code), only once (rather than once for Android and once for iOS), and have the code generated for you.

![Simple Entity](documentation/simple_entity.png)

The `.xcdatamodel` file is the input of the script.

## Installation

Gyro is on RubyGems, so this means you can simply install it by using this command in your terminal:

```bash
gem install gyro
```

_Alternativly, you could also clone this repository anywhere you want on your machine, then build and install the local gem_

```bash
gem build gyro.gemspec
gem install gyro-1.0.0.gem
```

## Usage

Invoke it with the appropriate options like this:

```bash
gyro --model <model> --template <template-name> --output <output-dir> --param <key>:<value>
```
`<model>` is the path to the xcdatamodel file

`<output-dir>` is the path to the output directory file

`<template-name>` is the name of the template. Below you have the list of templates.

If you want additional information about templates you can go to the documentation for each :

- [android](lib/templates/android/README.md)
- [swift3](lib/templates/swift3/README.md)
- [decodable](lib/templates/decodable/README.md)
- [swift3-variant](lib/templates/swift3-variant/README.md)
- [object-mapper](lib/templates/object-mapper/README.md)

## Annotating your `xcdatamodel`

The `.xcdatamodel` Xcode editor allows you to add "user infos" to your entities, attributes or relationships. Each "user info" entry is an arbitrary key/value pair.

_To define a User Info key in Xcode's xcdatamodel editor, select the entity or attribute you want to add a User Info to, then select the 3rd tab in the inspector on the right ("Data Model Inspector", or Cmd-Alt-3), and fill the information you want in the "User Info" section there._

![enum_json](documentation/enum_json.png)

With the help of these "user infos", you will be able to give Gyro extra information about your model classes. For example, you can tell which attribute is the primary key, the attributes to ignore, the JSON mappings, …

**For more information about "user infos", you can see the dedicated documentation [here](UserInfoKeys.md).**

## License

This tool is under [the Apache 2 License](LICENSE).

It has been initially developed by [Niji](http://www.niji.fr) and is in no way affiliated to the [Realm](https://realm.io) company.
