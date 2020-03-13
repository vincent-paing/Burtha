 [ ![Download](https://api.bintray.com/packages/vincent-paing/maven/burtha/images/download.svg) ](https://bintray.com/vincent-paing/maven/burtha/_latestVersion) [![Build Status](https://api.travis-ci.com/vincent-paing/burtha.svg?branch=master)](https://travis-ci.com/vincent-paing/burtha)

# Burtha

Burtha, stands for Burmese-Pyi-Thar (ဗမာပြည်သား) meaning, a member of Burma Country. Burtha is a Burmese National Registration Card(NRC) tool written in Kotlin.


```kotlin
val input = "၁၂/မရက(နိုင်)၁၂၃၄၅၆"
NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input) 

//Output: "12/MaRaKa(N)123456"
```

## Getting Started

### Add Dependency

#### Gradle

If you use gradle, add this repository first 

```groovy 
repositories {
	maven { url "https://dl.bintray.com/vincent-paing/maven" } 
} 
```

Then add the following dependencies:

```groovy
dependencies {
  implementation 'com.aungkyawpaing.burtha:burtha-kt:1.0.0'
}
```


## Features


### Validation

`NationalRegistrationCardFormatValidator.validateFormat` provides easy way to validate a format. It accepts `String` and returns `true` if it's a valid NRC format.

```kotlin
val validator = NationalRegistrationCardFormatValidator()
val input = "၁၂/မရက(နိုင်)၁၂၃၄၅၆
val result = NationalRegistrationCardFormatValidator.validate(input) //true
```

#### Configuration

By default, the validator try to match with both Burmese and English format. You can configure this to your liking. For burmese only check, you can use `NationalRegistrationCardFormatValidator.burmese()`, and for English use `NationalRegistrationCardFormatValidator.english()` respectively. For more advanced configuration, you can use `Rule` and `Validate Mode`

##### Rule

Validator is made out of multiple `ValidationRule`, where each rule confirm whether the format match its rule. 

##### Validate Mode

Validate Mode provides either you can check with `AND` mode or `OR` mode. 

- In `AND` mode, all rules have to pass for the `String` to be a valid format.
- In `OR` mode, passing any one of the rules provided will allow the `String` to be a valid format. By default, `OR` method is used to check either Burmese or English format.

With the combination of `Rule` and `Mode`, you can come up with any validation method you want, such as all caps English NRC, combination of both English and Burmese... etc.


### Conversion

Burtha also provide a Burmese <=> English Conversion.

```kotlin
val input = "12/MaRaKa(N)123456"
NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input) 

//Output: "၁၂/မရက(နိုင်)၁၂၃၄၅၆" 
```

Currently, Burtha doesn't provide configurations for Conversion **yet**.

## Contribution

You are more than welcomed to contribute to development of Burtha. If you're new to Open source software,s you can start by 

- Suggesting new issues, and feature requests
- Commenting your thoughts on existing issues
- Using the library yourself

## Licenese

```
Copyright 2020 Aung Kyaw Paing

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License.
```